-- phpMyAdmin SQL Dump
-- version 3.4.9
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tempo de Geração: 13/03/2025 às 19h36min
-- Versão do Servidor: 5.5.20
-- Versão do PHP: 5.3.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `satc`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE IF NOT EXISTS `aluno` (
  `codaluno` int(5) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `codcurso` int(5) NOT NULL,
  PRIMARY KEY (`codaluno`),
  KEY `codcurso` (`codcurso`),
  KEY `codcurso_2` (`codcurso`),
  KEY `codcurso_3` (`codcurso`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`codaluno`, `nome`, `telefone`, `codcurso`) VALUES
(1, 'pedro', '40028922', 1),
(2, 'maria', '40028923', 2),
(3, 'manoel', '40028924', 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `coordenador`
--

CREATE TABLE IF NOT EXISTS `coordenador` (
  `codigo` int(5) NOT NULL,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `coordenador`
--

INSERT INTO `coordenador` (`codigo`, `nome`) VALUES
(1, 'cris'),
(2, 'mari'),
(3, 'adelor');

-- --------------------------------------------------------

--
-- Estrutura da tabela `curso`
--

CREATE TABLE IF NOT EXISTS `curso` (
  `codcurso` int(5) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `codcoord` int(5) NOT NULL,
  PRIMARY KEY (`codcurso`),
  KEY `codcoord` (`codcoord`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `curso`
--

INSERT INTO `curso` (`codcurso`, `nome`, `codcoord`) VALUES
(1, 'info', 1),
(2, 'cyber', 2),
(3, 'mecanica', 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `codigo` int(5) NOT NULL,
  `login` varchar(10) NOT NULL,
  `senha` varchar(10) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`codigo`, `login`, `senha`) VALUES
(1, 'marco', '23042008');

--
-- Restrições para as tabelas dumpadas
--

--
-- Restrições para a tabela `aluno`
--
ALTER TABLE `aluno`
  ADD CONSTRAINT `aluno_ibfk_1` FOREIGN KEY (`codcurso`) REFERENCES `curso` (`codcurso`);

--
-- Restrições para a tabela `curso`
--
ALTER TABLE `curso`
  ADD CONSTRAINT `curso_ibfk_1` FOREIGN KEY (`codcoord`) REFERENCES `coordenador` (`codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
