<?php
//conectar com banco de dados
$conectar = mysql_connect('localhost','root','');
$banco = mysql_select_db('loja');

if (isset($_POST['Gravar']))
{
//receber as variaveis do HTML
    $nome = $_POST['nome'];
    $codcategoria = $_POST['codcategoria'];

    $sql = "SELECT * FROM categoria WHERE codcategoria = '$codcategoria'";
    
    $resultado = mysql_query($sql, $conectar);

    if (mysql_num_rows($resultado) > 0)
    {
        echo "Este nome ja esta cadastrado!";
    }
    else 
    {
        $sql = "INSERT INTO categoria (codcategoria, nome) VALUES ('$codcategoria', '$nome')";
        if (mysql_query($sql, $conectar)) {
            echo "Dados cadastrados com sucesso!";
        }
        else {
            echo "Erro ao gravar os dados!";
        }
    }
}

else if (isset($_POST['Alterar']))
{
//receber as variaveis do HTML
    $nome = $_POST['nome'];
    $codcategoria = $_POST['codcategoria'];

    $sql_verifica = "SELECT codcategoria FROM categoria WHERE codcategoria = '$codcategoria'";
    $resultado_verifica = mysql_query($sql_verifica, $conectar);

    if (mysql_num_rows($resultado_verifica) == 0) {
        echo "Erro ao alterar dados, o codigo nao existe!";
    } 
    
    else {
            $sql = "UPDATE categoria SET nome = '$nome' WHERE codcategoria = '$codcategoria'";
            
            $resultado = mysql_query($sql, $conectar);
            
            if ($resultado == TRUE)
            {
                echo "Dados alterados com sucesso!";
            }
            
            else
            {
                echo "Erro ao alterar dados!";
            }
        }
}

else if (isset($_POST['Excluir']))
{
//receber as variaveis do HTML
    $codcategoria = $_POST['codcategoria'];

    $sql_verifica = "SELECT codcategoria FROM categoria WHERE codcategoria = '$codcategoria'";
    $resultado_verifica = mysql_query($sql_verifica, $conectar);

    if (mysql_num_rows($resultado_verifica) == 0) {
        echo "Erro ao excluir dados, o codigo nao existe!";
    }

    else {
        $sql = "DELETE FROM categoria WHERE codcategoria = '$codcategoria'";
        
        $resultado = mysql_query($sql);

        if ($resultado == TRUE)
        {
            echo "Dados excluidos com sucesso!";
        }
        else
        {
            echo "Erro ao excluir dados!";
        }
    }
}

else if (isset($_POST['Pesquisar']))
{
    $sql = "SELECT * FROM categoria";

    $resultado = mysql_query($sql);

    if (mysql_num_rows($resultado) == 0)
    {
        echo "Erro ao encontrar dados! (Provavelmente não existem)";
    }
    else
    {
        echo "<b>"."Resultado da Pesquisa por categoria: "."</b><br><br>";
        while ($dados = mysql_fetch_array($resultado))
        {
            echo "//////////////////////////////<br>";
            echo "Codigo da categoria: $dados[codcategoria]<br>";
            echo "Nome: $dados[nome]<br>";
        }
    }
}

?>

