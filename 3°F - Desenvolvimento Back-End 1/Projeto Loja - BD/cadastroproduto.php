<?php
//conectar com o servidor e banco
$conectar = mysql_connect('localhost','root','');
$banco    = mysql_select_db("loja");

if (isset($_POST['Gravar']))
{
    $codproduto        = $_POST['codproduto'];
    $descricao         = $_POST['descricao'];
    $cor               = $_POST['cor'];
    $tamanho           = $_POST['tamanho'];
    $preco             = $_POST['preco'];
    $codmarca          = $_POST['codmarca'];
    $codcategoria      = $_POST['codcategoria'];
    $codtipo           = $_POST['codtipo'];
    $foto1             = $_FILES['foto1'];
    $foto2             = $_FILES['foto2'];

//PARA CONHECIMENTO, CRIPTOGRAFIA DE classificacao
//$classificacao = md5 ($_POST['classificacao']);

    //criar pasta e mover arquivos img
    $diretorio = "fotos/";

    $extensao1 = strtolower(substr($_FILES['foto1']['name'], -4));
    $novo_nome1 = md5(time().$extensao1);
    move_uploaded_file($_FILES['foto1']['tmp_name'], $diretorio.$novo_nome1);

    $extensao2 = strtolower(substr($_FILES['foto2']['name'], -6));
    $novo_nome2 = md5(time().$extensao2);
    move_uploaded_file($_FILES['foto2']['tmp_name'], $diretorio.$novo_nome2);

   $sql = mysql_query("INSERT INTO produto (codproduto,descricao,cor,tamanho,preco,codmarca,codcategoria,codtipo,foto1,foto2)
                values ('$codproduto','$descricao','$cor','$tamanho','$preco','$codmarca','$codcategoria','$codtipo','$novo_nome1','$novo_nome2')");

   $resultado = mysql_query($sql);

   if ($resultado == TRUE)
        {echo " Dados gravados";}
   else
        {echo " Erro dados";}
}

if (isset($_POST['Excluir']))
{
    $codproduto        = $_POST['codproduto'];
    $descricao         = $_POST['descricao'];
    $cor               = $_POST['cor'];
    $tamanho           = $_POST['tamanho'];
    $preco             = $_POST['preco'];
    $codmarca          = $_POST['codmarca'];
    $codcategoria      = $_POST['codcategoria'];
    $codtipo           = $_POST['codtipo'];
    $foto1             = $_FILES['foto1'];
    $foto2             = $_FILES['foto2'];

  $sql = "DELETE FROM produto WHERE codproduto = '$codproduto'";

  $resultado = mysql_query($sql);

  if ($resultado === TRUE)
  {
     echo 'Exclusao realizada com Sucesso';
  }
  else
  {
     echo 'Erro ao excluir dados.';
  }
}

if (isset($_POST['Alterar']))
{
    $codproduto        = $_POST['codproduto'];
    $descricao         = $_POST['descricao'];
    $cor               = $_POST['cor'];
    $tamanho           = $_POST['tamanho'];
    $preco             = $_POST['preco'];
    $codmarca          = $_POST['codmarca'];
    $codcategoria      = $_POST['codcategoria'];
    $codtipo           = $_POST['codtipo'];
    $foto1             = $_FILES['foto1'];
    $foto2             = $_FILES['foto2'];

  $sql = "UPDATE produto SET descricao='$descricao',codtipo='$codtipo',preco='$preco'
          WHERE codproduto = '$codproduto'";
  $resultado = mysql_query($sql);

  if ($resultado === TRUE)
  {
     echo 'Dados alterados com Sucesso';
  }
  else
  {
     echo 'Erro ao alterar dados.';
  }
}

if (isset($_POST['Pesquisar']))
{
   $sql = mysql_query("SELECT codproduto,descricao,cor,tamanho,preco,codmarca,codcategoria,codtipo,foto1,foto2 FROM produto");
   
   if (mysql_num_rows($sql) == 0)
         {echo "Desculpe, mas sua pesquisa não retornou resultados.";}
   else
        {
        echo "<b>Produtos Cadastrados:</b><br><br>";
        while ($dados = mysql_fetch_array($sql))
 	        {
                echo "codproduto     : ".$dados->codproduto." ";
                echo "Descricao      : ".$dados->descricao."<br>";
                echo "Categoria      : ".$dados->codcategoria." ";
                echo "Classificacao  : ".$dados->codtipo." ";
                echo "Marca          : ".$dados->codmarca."";  
                echo "Cor            : ".$dados->cor."<br>";
                echo "Tamanho        : ".$dados->tamanho." ";
                echo "Preco          : ".$dados->preco."<br>";
                echo '<img src="fotos/'.$dados->foto1.'"height="200" width="200" />'."  ";
                echo '<img src="fotos/'.$dados->foto2.'"height="200" width="200" />'."<br><br>  ";
            }
        }
}
?>
