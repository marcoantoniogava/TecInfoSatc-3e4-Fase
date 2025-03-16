<?php
//conectar com banco de dados
$conectar = mysql_connect('localhost','root','');
$banco = mysql_select_db('satc');

if (isset($_POST['Gravar']))
{
//receber as variaveis do HTML
    $codcurso = $_POST['codcurso'];
    $nome = $_POST['nome'];
    $codcoord = $_POST['codcoord'];

    $sql = "INSERT INTO curso (codcurso, nome, codcoord) VALUES ('$codcurso', '$nome', '$codcoord')";
    
    
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
    $codcurso = $_POST['codcurso'];
    $nome = $_POST['nome'];
    $codcoord = $_POST['codcoord'];

    $sql = "UPDATE curso SET nome = '$nome', codcoord = '$codcoord' WHERE codcurso = '$codcurso'";

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
    $codcurso = $_POST['codcurso'];

    $sql = "DELETE FROM curso WHERE codcurso = '$codcurso'";

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
    $sql = "SELECT * FROM curso";

    $resultado = mysql_query($sql);

    if (mysql_num_rows($resultado) == 0)
    {
        echo "Erro ao encontrar dados! (Provavelmente não existem)";
    }
    else
    {
        echo "<b>"."Resultado da Pesquisa por Curso: "."</b><br><br>";
        while ($dados = mysql_fetch_array($resultado))
        {
            echo "Codigo do curso: $dados[codcurso]<br>";
            echo "Nome: $dados[nome]<br>";
            echo "Codigo do coordenador: $dados[codcoord]<br>";
        }
    }
}

?>


