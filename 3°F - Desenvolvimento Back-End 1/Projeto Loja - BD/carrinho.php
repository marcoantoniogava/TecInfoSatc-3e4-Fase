<?php
session_start();

// Verificar se o carrinho existe
if(!isset($_SESSION['carrinho'])) {
    $_SESSION['carrinho'] = array();
}

// Remover produto
if(isset($_GET['remover'])) {
    $codigo = $_GET['remover'];
    if(isset($_SESSION['carrinho'][$codigo])) {
        unset($_SESSION['carrinho'][$codigo]);
        $_SESSION['msg_sucesso'] = "Produto removido do carrinho com sucesso!";
    }
    header("Location: carrinho.php");
    exit;
}

// Alterar quantidade
if(isset($_POST['atualizar'])) {
    foreach($_POST['quantidade'] as $codigo => $qtd) {
        if(is_numeric($qtd) && $qtd > 0) {
            $_SESSION['carrinho'][$codigo]['quantidade'] = $qtd;
        }
    }
    $_SESSION['msg_sucesso'] = "Carrinho atualizado com sucesso!";
    header("Location: carrinho.php");
    exit;
}

// Calcular total
$total = 0;
if(isset($_SESSION['carrinho'])) {
    foreach($_SESSION['carrinho'] as $item) {
        $total += $item['preco'] * $item['quantidade'];
    }
}
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Carrinho de Compras - Dr3aming Clothing</title>
    <link rel="stylesheet" href="stylehome.css">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500;600;700&display=swap" rel="stylesheet">
    <style>
        .carrinho-container {
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0,0,0,0.08);
            padding: 25px;
            margin-top: 30px;
        }
        
        .carrinho-vazio {
            text-align: center;
            padding: 40px;
            font-size: 18px;
            color: #666;
        }
        
        .carrinho-tabela {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        
        .carrinho-tabela th {
            text-align: left;
            padding: 12px;
            background-color: #f2f2f2;
            border-bottom: 2px solid #ddd;
        }
        
        .carrinho-tabela td {
            padding: 15px 12px;
            border-bottom: 1px solid #eee;
            vertical-align: middle;
        }
        
        .carrinho-tabela img {
            max-width: 80px;
            border-radius: 5px;
        }
        
        .qtd-input {
            width: 60px;
            padding: 8px;
            border: 1px solid #ddd;
            border-radius: 4px;
            text-align: center;
        }
        
        .btn-remover {
            background-color: #e63946;
            color: white;
            border: none;
            padding: 8px 12px;
            border-radius: 4px;
            cursor: pointer;
            font-size: 14px;
            transition: all 0.3s ease;
        }
        
        .btn-remover:hover {
            background-color: #c1121f; 
        }
        
        .btn-continuar {
            background-color: #333;
            color: white;
            border: none;
            padding: 12px 25px;
            border-radius: 6px;
            cursor: pointer;
            font-size: 15px;
            font-weight: 600;
            transition: all 0.3s ease;
            text-decoration: none;
            display: inline-block;
            margin-right: 15px;
        }
        
        .btn-continuar:hover {
            background-color: #555;
            transform: translateY(-2px);
        }
        
        .btn-atualizar {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 12px 25px;
            border-radius: 6px;
            cursor: pointer;
            font-size: 15px;
            font-weight: 600;
            transition: all 0.3s ease;
        }
        
        .btn-atualizar:hover {
            background-color: #45a049;
            transform: translateY(-2px);
        }
        
        .btn-finalizar {
            background-color: #1e88e5;
            color: white;
            border: none;
            padding: 12px 25px;
            border-radius: 6px;
            cursor: pointer;
            font-size: 15px;
            font-weight: 600;
            transition: all 0.3s ease;
            text-decoration: none;
            display: inline-block;
        }
        
        .btn-finalizar:hover {
            background-color: #1976d2;
            transform: translateY(-2px);
        }
        
        .total-carrinho {
            text-align: right;
            padding: 20px 0;
            font-size: 22px;
            font-weight: bold;
            border-top: 2px solid #ddd;
            margin-top: 20px;
        }
        
        .acoes-carrinho {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-top: 30px;
        }
    </style>
</head>

<body>
    <?php
    // Exibir mensagem de sucesso se existir
    if(isset($_SESSION['msg_sucesso'])) {
        echo '<div class="mensagem-sucesso">'.$_SESSION['msg_sucesso'].'</div>';
        // Limpar a mensagem após exibir
        unset($_SESSION['msg_sucesso']);
    }
    ?>

    <div class="header">
        <div class="logo">
            <img src="logodr3aming.jpg" width="200" height="150" alt="Logo Dr3aming Clothing">
        </div>
        <div class="nav-links">
            <a href="carrinho.php" class="carrinho-link">
                Carrinho:
                <?php
                // Mostrar quantidade de itens no carrinho
                if(isset($_SESSION['carrinho'])) {
                    $total_itens = 0;
                    foreach($_SESSION['carrinho'] as $item) {
                        $total_itens += $item['quantidade'];
                    }
                    echo '<span class="carrinho-contador">'.$total_itens.'</span>';
                }
                ?>
            </a>
            <a href="loginusuario.html" class="login-link">
                <img src="loginboneco.png" width="105" height="60" alt="Login">
            </a>
        </div>
    </div>
    
    <h1 class="main-title">Carrinho de Compras</h1>
    
    <div class="carrinho-container">
        <?php if(empty($_SESSION['carrinho'])): ?>
            <div class="carrinho-vazio">
                <h2>Seu carrinho está vazio</h2>
                <p>Volte para o site e adicione produtos ao seu carrinho.</p>
                <a href="index.php" class="btn-continuar">Continuar Comprando</a>
            </div>
        <?php else: ?>
            <form method="post" action="carrinho.php">
                <table class="carrinho-tabela">
                    <thead>
                        <tr>
                            <th>Imagem</th>
                            <th>Produto</th>
                            <th>Cor</th>
                            <th>Tamanho</th>
                            <th>Preço</th>
                            <th>Quantidade</th>
                            <th>Subtotal</th>
                            <th>Ações</th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php foreach($_SESSION['carrinho'] as $codigo => $item): ?>
                            <tr>
                                <td>
                                    <?php if(!empty($item['foto1'])): ?>
                                        <img src="fotos/<?php echo $item['foto1']; ?>" alt="<?php echo $item['descricao']; ?>">
                                    <?php else: ?>
                                        <img src="sem-imagem.jpg" alt="Sem imagem">
                                    <?php endif; ?>
                                </td>
                                <td><?php echo $item['descricao']; ?></td>
                                <td><?php echo $item['cor']; ?></td>
                                <td><?php echo $item['tamanho']; ?></td>
                                <td>R$ <?php echo number_format($item['preco'], 2, ',', '.'); ?></td>
                                <td>
                                    <input type="number" name="quantidade[<?php echo $codigo; ?>]" value="<?php echo $item['quantidade']; ?>" min="1" class="qtd-input">
                                </td>
                                <td>R$ <?php echo number_format($item['preco'] * $item['quantidade'], 2, ',', '.'); ?></td>
                                <td>
                                    <a href="carrinho.php?remover=<?php echo $codigo; ?>" class="btn-remover">Remover</a>
                                </td>
                            </tr>
                        <?php endforeach; ?>
                    </tbody>
                </table>
                
                <div class="total-carrinho">
                    Total: R$ <?php echo number_format($total, 2, ',', '.'); ?>
                </div>
                
                <div class="acoes-carrinho">
                    <div>
                        <a href="home.php" class="btn-continuar">Continuar Comprando</a>
                    </div>
                    <div>
                        <button type="submit" name="atualizar" class="btn-atualizar">Atualizar Carrinho</button>
                        <a href="finalizarcompra.php" class="btn-finalizar">Finalizar Compra</a>
                    </div>
                </div>
            </form>
        <?php endif; ?>
    </div>
</body>
</html>