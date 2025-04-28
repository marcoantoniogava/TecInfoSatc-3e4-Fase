<?php
session_start();
$connect = mysql_connect('localhost','root','');
$db      = mysql_select_db('loja');
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dr3aming Clothing</title>
    <link rel="stylesheet" href="stylehome.css">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500;600;700&display=swap" rel="stylesheet">
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
    
    <h1 class="main-title">Dr3aming Clothing</h1>
    
    <h1 class="search-title">Pesquisas</h1>
    
    <form name="formulario" method="post" action="" class="search-form">
        <div class="form-group">
            <!------ pesquisar Categorias -------------->
            <div class="form-control">
                <label for="categoria">Categorias</label>
                <select name="categoria" id="categoria">
                    <option value="" selected="selected">Selecione...</option>
                    <?php
                    $query = mysql_query("SELECT codcategoria, nome FROM categoria");
                    while($categorias = mysql_fetch_array($query)) {
                    ?>
                    <option value="<?php echo $categorias['codcategoria']?>">
                        <?php echo $categorias['nome'] ?>
                    </option>
                    <?php } ?>
                </select>
            </div>
            
            <!------ pesquisar tipo -------------->
            <div class="form-control">
                <label for="tipo">Tipo</label>
                <select name="tipo" id="tipo">
                    <option value="" selected="selected">Selecione...</option>
                    <?php
                    $query = mysql_query("SELECT codtipo, nome FROM tipo");
                    while($tipo = mysql_fetch_array($query)) {
                    ?>
                    <option value="<?php echo $tipo['codtipo']?>">
                        <?php echo $tipo['nome'] ?>
                    </option>
                    <?php } ?>
                </select>
            </div>
            
            <!------ pesquisar marcas -------------->
            <div class="form-control">
                <label for="marca">Marcas</label>
                <select name="marca" id="marca">
                    <option value="" selected="selected">Selecione...</option>
                    <?php
                    $query = mysql_query("SELECT codmarca, nome FROM marca");
                    while($marcas = mysql_fetch_array($query)) {
                    ?>
                    <option value="<?php echo $marcas['codmarca']?>">
                        <?php echo $marcas['nome'] ?>
                    </option>
                    <?php } ?>
                </select>
            </div>
        </div>

        <div style="text-align: center;">
            <input type="submit" name="pesquisar" value="Pesquisar" class="btn-search">
        </div>
    </form>

    <?php
    if (isset($_POST['pesquisar'])) {
        // Verifica que a opcao marca, categoria e tipo foi selecionada ou nao
        $marca = (empty($_POST['marca']))? 'null' : $_POST['marca'];
        $categoria = (empty($_POST['categoria']))? 'null' : $_POST['categoria'];
        $tipo = (empty($_POST['tipo']))? 'null' : $_POST['tipo'];

        $sql_produtos = "SELECT produto.codproduto, produto.descricao, produto.cor, produto.tamanho, produto.preco, produto.foto1, produto.foto2
                         FROM produto
                         WHERE 1=1";
        
        // Adiciona condições de filtro quando necessário
        if ($marca != 'null') {
            $sql_produtos .= " AND produto.codmarca = $marca";
        }
        
        if ($categoria != 'null') {
            $sql_produtos .= " AND produto.codcategoria = $categoria";
        }
        
        if ($tipo != 'null') {
            $sql_produtos .= " AND produto.codtipo = $tipo";
        }
        
        $seleciona_produtos = mysql_query($sql_produtos);

        // Mostrar as informações dos produtos
        if(mysql_num_rows($seleciona_produtos) == 0) {
            echo '<div class="no-results"><h2>Desculpe, mas sua busca não retornou resultados...</h2></div>';
        } else {
            echo "<h2 class='search-title'>Resultado da pesquisa de Produtos</h2>";
            echo "<div class='produtos'>";
            
            while ($dados = mysql_fetch_object($seleciona_produtos)) {
                echo "<div class='produto'>";
                echo "<p><strong>Descrição:</strong> ".$dados->descricao."</p>";
                echo "<p><strong>Cor:</strong> ".$dados->cor."</p>";
                echo "<p><strong>Tamanho:</strong> ".$dados->tamanho."</p>";
                echo "<p class='preco'><strong>Preço:</strong> R$ ".number_format($dados->preco, 2, ',', '.')."</p>";
                
                echo "<div class='fotos'>";
                if (!empty($dados->foto1)) {
                    echo '<img src="fotos/'.$dados->foto1.'" height="120" width="160" alt="Imagem 1 do produto" />';
                }
                
                if (!empty($dados->foto2)) {
                    echo '<img src="fotos/'.$dados->foto2.'" height="120" width="160" alt="Imagem 2 do produto" />';
                }
                echo "</div>";
                
                // Adicionando o botão de adicionar ao carrinho
                echo "<div class='produto-acoes'>";
                echo "<form method='post' action='addcarrinho.php'>";
                echo "<input type='hidden' name='codproduto' value='".$dados->codproduto."'>";
                echo "<input type='hidden' name='descricao' value='".$dados->descricao."'>";
                echo "<input type='hidden' name='cor' value='".$dados->cor."'>";
                echo "<input type='hidden' name='tamanho' value='".$dados->tamanho."'>";
                echo "<input type='hidden' name='preco' value='".$dados->preco."'>";
                echo "<input type='hidden' name='foto1' value='".$dados->foto1."'>";
                echo "<button type='submit' name='adicionar' class='btn-carrinho'>Adicionar ao Carrinho</button>";
                echo "</form>";
                echo "</div>";
                
                echo "</div>";
            }
            
            echo "</div>";
        }
    }
    ?>
</body>
</html>