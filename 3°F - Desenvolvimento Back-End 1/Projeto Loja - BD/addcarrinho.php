<?php
session_start();

// Verificar se produto foi enviado
if(isset($_POST['adicionar']) && isset($_POST['codproduto'])) {
    
    // Obter dados do produto enviado pelo formulário
    $codproduto = $_POST['codproduto'];
    $descricao = $_POST['descricao'];
    $cor = $_POST['cor'];
    $tamanho = $_POST['tamanho'];
    $preco = $_POST['preco'];
    $foto1 = $_POST['foto1'];
    
    // Inicializar o carrinho se não existir
    if(!isset($_SESSION['carrinho'])) {
        $_SESSION['carrinho'] = array();
    }
    
    // Verificar se o produto já está no carrinho
    if(isset($_SESSION['carrinho'][$codproduto])) {
        // Se já existe, apenas incrementa a quantidade
        $_SESSION['carrinho'][$codproduto]['quantidade']++;
    } else {
        // Se não existe, adiciona ao carrinho com quantidade 1
        $_SESSION['carrinho'][$codproduto] = array(
            'codproduto' => $codproduto,
            'descricao' => $descricao,
            'cor' => $cor,
            'tamanho' => $tamanho,
            'preco' => $preco,
            'foto1' => $foto1,
            'quantidade' => 1
        );
    }
    
    // Definir mensagem de sucesso
    $_SESSION['msg_sucesso'] = "Produto adicionado ao carrinho com sucesso!";
}

// Redirecionar de volta para a página anterior
header("Location: {$_SERVER['HTTP_REFERER']}");
exit;
?>