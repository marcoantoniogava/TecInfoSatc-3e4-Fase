
<?php
//conectar com banco de dados
$conectar = mysql_connect('localhost','root','');
$banco = mysql_select_db('loja');

if (isset($_POST['Conectar']))
{
//receber as variaveis do HTML
    $email = $_POST['email'];
    $senha = $_POST['senha'];

    $sql = "SELECT email, senha FROM usuario WHERE email = '$email' and senha = '$senha'";

$resultado = mysql_query($sql);

if (mysql_num_rows($resultado) <= 0 )
{
echo "<script language='javascript' type='text/javascript'>
    alert('email e/ou senha incorretos');
    window.location.href='loginusuario.html';
    </script>";
}
else
{
    setcookie('email',$email);
    header('Location:menu.html');
}
}

?>
