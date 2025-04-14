-- phpMyAdmin SQL Dump
-- version 3.4.9
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tempo de Geração: 14/04/2025 às 18h44min
-- Versão do Servidor: 5.5.20
-- Versão do PHP: 5.3.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `loja`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `categoria`
--

CREATE TABLE IF NOT EXISTS `categoria` (
  `codcategoria` int(5) NOT NULL,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`codcategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `categoria`
--

INSERT INTO `categoria` (`codcategoria`, `nome`) VALUES
(1, 'masculino'),
(2, 'feminino'),
(3, 'infantil');

-- --------------------------------------------------------

--
-- Estrutura da tabela `marca`
--

CREATE TABLE IF NOT EXISTS `marca` (
  `codmarca` int(5) NOT NULL,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`codmarca`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `marca`
--

INSERT INTO `marca` (`codmarca`, `nome`) VALUES
(1, 'nike'),
(2, 'adiddas'),
(3, 'puma');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
  `codproduto` int(5) NOT NULL,
  `descricao` varchar(100) NOT NULL,
  `cor` varchar(50) NOT NULL,
  `tamanho` varchar(10) NOT NULL,
  `preco` float(10,2) NOT NULL,
  `codmarca` int(5) NOT NULL,
  `codcategoria` int(5) NOT NULL,
  `codtipo` int(5) NOT NULL,
  `foto1` varchar(100) NOT NULL,
  `foto2` varchar(100) NOT NULL,
  PRIMARY KEY (`codproduto`),
  KEY `codtipo` (`codtipo`),
  KEY `codcategoria` (`codcategoria`),
  KEY `codmarca` (`codmarca`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`codproduto`, `descricao`, `cor`, `tamanho`, `preco`, `codmarca`, `codcategoria`, `codtipo`, `foto1`, `foto2`) VALUES
(1, 'Camiseta Nike', 'Preto', 'M', 89.00, 1, 1, 1, 'd7e8b6e37c7ff6baed9c2b9fdce58376', '64b066c00c50acbdd2497b93f1be2913'),
(2, 'Camiseta Adidas', 'Verde', 'G', 99.90, 2, 1, 1, '953a86af1dfe4271b8c06c02877006dc', '673176849a0aa93661d3506dfb54d03e'),
(3, 'Bermuda Nike', 'Preto', 'G', 79.90, 1, 1, 3, '118d7474c099609b1b0713b472d4e4f1', '183d4bdaf1006f4b129d34dd646e62bc'),
(4, 'Bermuda Adidas', 'Preto', 'P', 69.90, 2, 3, 3, 'da6c06946812da383d81d08db46ff363', 'dc3de9d8a3ff84e362b9b987d718f301'),
(5, 'Camiseta Puma', 'Preto', 'M', 109.90, 3, 2, 1, '96558eefc07e3de4a4350a79100ba99b', 'a027c702fadc28814ce883fe1d93ce4f'),
(6, 'Bermuda Puma', 'Branco', 'G', 49.90, 3, 1, 3, 'b78c8791ce9028c2d50a85429ecbf2a8', '0d9b87f109c944dae7502e199756b436'),
(7, 'Calça Nike', 'Cinza', 'G', 199.90, 1, 2, 2, '62ff38ccf2b9eb5cb7cb668c5a395948', '7591896c67e73d3d0be706140128bf5b'),
(8, 'Moletom Adidas', 'Cinza', 'G', 199.90, 2, 3, 4, '391a34cdc9e77d34341e1b94cce23ff6', '971a0b1539a6567657c470dd9c6b5e2f');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipo`
--

CREATE TABLE IF NOT EXISTS `tipo` (
  `codtipo` int(5) NOT NULL,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`codtipo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tipo`
--

INSERT INTO `tipo` (`codtipo`, `nome`) VALUES
(1, 'camisetas'),
(2, 'calças'),
(3, 'bermudas'),
(4, 'moletom');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `codusuario` int(5) NOT NULL,
  `email` varchar(50) NOT NULL,
  `senha` varchar(20) NOT NULL,
  PRIMARY KEY (`codusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`codusuario`, `email`, `senha`) VALUES
(1, 'marco@gmail.com', '23042008');

--
-- Restrições para as tabelas dumpadas
--

--
-- Restrições para a tabela `produto`
--
ALTER TABLE `produto`
  ADD CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`codmarca`) REFERENCES `marca` (`codmarca`),
  ADD CONSTRAINT `produto_ibfk_2` FOREIGN KEY (`codcategoria`) REFERENCES `categoria` (`codcategoria`),
  ADD CONSTRAINT `produto_ibfk_3` FOREIGN KEY (`codtipo`) REFERENCES `tipo` (`codtipo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
