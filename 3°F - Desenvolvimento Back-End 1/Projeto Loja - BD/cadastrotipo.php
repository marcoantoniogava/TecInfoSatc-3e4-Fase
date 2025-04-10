<?php
//conectar com banco de dados
$conectar = mysql_connect('localhost','root','');
$banco = mysql_select_db('loja');

if (isset($_POST['Gravar']))
{
//receber as variaveis do HTML
    $nome = $_POST['nome'];
    $codtipo = $_POST['codtipo'];

    $sql = "SELECT * FROM tipo WHERE codtipo = '$codtipo'";
    
    $resultado = mysql_query($sql, $conectar);

    if (mysql_num_rows($resultado) > 0)
    {
        echo "Este nome ja esta cadastrado!";
    }
    else 
    {
        $sql = "INSERT INTO tipo (codtipo, nome) VALUES ('$codtipo', '$nome')";
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
    $codtipo = $_POST['codtipo'];

    $sql_verifica = "SELECT codtipo FROM tipo WHERE codtipo = '$codtipo'";
    $resultado_verifica = mysql_query($sql_verifica, $conectar);

    if (mysql_num_rows($resultado_verifica) == 0) {
        echo "Erro ao alterar dados, o codigo nao existe!";
    } 
    
    else {
            $sql = "UPDATE tipo SET nome = '$nome' WHERE codtipo = '$codtipo'";
            
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
    $codtipo = $_POST['codtipo'];

    $sql_verifica = "SELECT codtipo FROM tipo WHERE codtipo = '$codtipo'";
    $resultado_verifica = mysql_query($sql_verifica, $conectar);

    if (mysql_num_rows($resultado_verifica) == 0) {
        echo "Erro ao excluir dados, o codigo nao existe!";
    }

    else {
        $sql = "DELETE FROM tipo WHERE codtipo = '$codtipo'";
        
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
    $sql = "SELECT * FROM tipo";

    $resultado = mysql_query($sql);

    if (mysql_num_rows($resultado) == 0)
    {
        echo "Erro ao encontrar dados! (Provavelmente não existem)";
    }
    else
    {
        echo "<b>"."Resultado da Pesquisa por tipo: "."</b><br><br>";
        while ($dados = mysql_fetch_array($resultado))
        {
            echo "//////////////////////////////<br>";
            echo "Codigo do tipo: $dados[codtipo]<br>";
            echo "Nome: $dados[nome]<br>";
        }
    }
}

?>

