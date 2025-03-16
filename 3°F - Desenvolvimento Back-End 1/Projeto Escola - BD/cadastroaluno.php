<?php
//conectar com banco de dados
$conectar = mysql_connect('localhost','root','');
$banco = mysql_select_db('satc');

if (isset($_POST['Gravar']))
{
//receber as variaveis do HTML
    $codaluno = $_POST['codaluno'];
    $nome = $_POST['nome'];
    $telefone = $_POST['telefone'];
    $codcurso = $_POST['codcurso'];

    $sql = "INSERT INTO aluno (codaluno, nome, telefone, codcurso) VALUES ('$codaluno', '$nome', '$telefone', '$codcurso')";
    
    
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
    $codaluno = $_POST['codaluno'];
    $nome = $_POST['nome'];
    $telefone = $_POST['telefone'];
    $codcurso = $_POST['codcurso'];

    $sql = "UPDATE aluno SET nome = '$nome', telefone = '$telefone', codcurso = '$codcurso' WHERE codaluno = '$codaluno'";

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
    $codaluno = $_POST['codaluno'];

    $sql = "DELETE FROM aluno WHERE codaluno = '$codaluno'";

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
    $sql = "SELECT * FROM aluno";

    $resultado = mysql_query($sql);

    if (mysql_num_rows($resultado) == 0)
    {
        echo "Erro ao encontrar dados! (Provavelmente não existem)";
    }
    else
    {
        echo "<b>"."Resultado da Pesquisa por Aluno: "."</b><br><br>";
        while ($dados = mysql_fetch_array($resultado))
        {
            echo "Codigo do aluno: $dados[codaluno]<br>";
            echo "Nome: $dados[nome]<br>";
            echo "Telefone: $dados[telefone]<br>";
            echo "Codigo do curso: $dados[codcurso]<br>";
        }
    }
}

?>


