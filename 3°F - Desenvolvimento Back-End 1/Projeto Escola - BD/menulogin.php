<?php
//conectar com banco de dados
$conectar = mysql_connect('localhost','root','');
$banco = mysql_select_db('satc');

if (isset($_POST['Conectar']))
{
//receber as variaveis do HTML
    $login = $_POST['login'];
    $senha = $_POST['senha'];

    $sql = "SELECT login, senha FROM usuario
    WHERE login = '$login' and senha = '$senha'";

$resultado = mysql_query($sql);

if (mysql_num_rows($resultado) <= 0 )
{
echo "<script language='javascript' type='text/javascript'>
    alert('Login e/ou senha incorretos');
    window.location.href='menulogin.html';
    </script>";
}
else
{
    setcookie('login',$login);
    header('Location:menu.html');
}
}

?>

