<?php
//conectar com banco de dados
$conectar = mysql_connect('localhost','root','');
$banco = mysql_select_db('loja');

if (isset($_POST['Gravar']))
{
//receber as variaveis do HTML
    $nome = $_POST['nome'];
    $codmarca = $_POST['codmarca'];

    $sql = "SELECT * FROM marca WHERE codmarca = '$codmarca'";
    
    $resultado = mysql_query($sql, $conectar);

    if (mysql_num_rows($resultado) > 0)
    {
        echo "Este nome ja esta cadastrado!";
    }
    else 
    {
        $sql = "INSERT INTO marca (codmarca, nome) VALUES ('$codmarca', '$nome')";
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
    $codmarca = $_POST['codmarca'];

    $sql_verifica = "SELECT codmarca FROM marca WHERE codmarca = '$codmarca'";
    $resultado_verifica = mysql_query($sql_verifica, $conectar);

    if (mysql_num_rows($resultado_verifica) == 0) {
        echo "Erro ao alterar dados, o codigo nao existe!";
    } 
    
    else {
            $sql = "UPDATE marca SET nome = '$nome' WHERE codmarca = '$codmarca'";
            
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
    $codmarca = $_POST['codmarca'];

    $sql_verifica = "SELECT codmarca FROM marca WHERE codmarca = '$codmarca'";
    $resultado_verifica = mysql_query($sql_verifica, $conectar);

    if (mysql_num_rows($resultado_verifica) == 0) {
        echo "Erro ao excluir dados, o codigo nao existe!";
    }

    else {
        $sql = "DELETE FROM marca WHERE codmarca = '$codmarca'";
        
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
    $sql = "SELECT * FROM marca";

    $resultado = mysql_query($sql);

    if (mysql_num_rows($resultado) == 0)
    {
        echo "Erro ao encontrar dados! (Provavelmente não existem)";
    }
    else
    {
        echo "<b>"."Resultado da Pesquisa por Marca: "."</b><br><br>";
        while ($dados = mysql_fetch_array($resultado))
        {
            echo "//////////////////////////////<br>";
            echo "Codigo da marca: $dados[codmarca]<br>";
            echo "Nome: $dados[nome]<br>";
        }
    }
}

?>

