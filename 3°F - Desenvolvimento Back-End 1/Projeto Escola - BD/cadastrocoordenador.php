<?php
//conectar com banco de dados
$conectar = mysql_connect('localhost','root','');
$banco = mysql_select_db('satc');

if (isset($_POST['Gravar']))
{
//receber as variaveis do HTML
    $codcoordenador = $_POST['codigo'];
    $nome = $_POST['nome'];

    $sql = "INSERT INTO coordenador (codigo, nome) VALUES ('$codcoordenador', '$nome')";
    
    
    $resultado = mysql_query($sql);

    if ($resultado == TRUE)
    {
        echo "Dados gravados com sucesso!";
    }
    else 
    {
        echo "Erro ao gravar dados!";
    }
}

else if (isset($_POST['Alterar']))
{
//receber as variaveis do HTML
    $codcoordenador = $_POST['codigo'];
    $nome = $_POST['nome'];

    $sql = "UPDATE coordenador SET nome = '$nome' WHERE codigo = '$codcoordenador'";

    $resultado = mysql_query($sql);

    if ($resultado == TRUE)
    {
        echo "Dados alterados com sucesso!";
    }
    else
    {
        echo "Erro ao alterar dados!";
    }
}

else if (isset($_POST['Excluir']))
{
//receber as variaveis do HTML
    $codcoordenador = $_POST['codigo'];

    $sql = "DELETE FROM coordenador WHERE codigo = '$codcoordenador'";

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

else if (isset($_POST['Pesquisar']))
{
    $sql = "SELECT * FROM coordenador";

    $resultado = mysql_query($sql);

    if (mysql_num_rows($resultado) == 0)
    {
        echo "Erro ao encontrar dados! (Provavelmente não existem)";
    }
    else
    {
        echo "<b>"."Resultado da Pesquisa por Coordendador: "."</b><br><br>";
        while ($dados = mysql_fetch_array($resultado))
        {
            echo "Codigo: $dados[codigo]<br>";
            echo "Nome: $dados[nome]<br>";
        }
    }
}

?>


