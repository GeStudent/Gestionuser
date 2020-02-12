-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mer. 12 fév. 2020 à 18:27
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestudent`
--

-- --------------------------------------------------------

--
-- Structure de la table `behaviour`
--

DROP TABLE IF EXISTS `behaviour`;
CREATE TABLE IF NOT EXISTS `behaviour` (
  `idbeh` int(11) NOT NULL AUTO_INCREMENT,
  `attendance` int(11) NOT NULL,
  `award` int(11) NOT NULL,
  PRIMARY KEY (`idbeh`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `behaviour`
--

INSERT INTO `behaviour` (`idbeh`, `attendance`, `award`) VALUES
(5, 3, 2);

-- --------------------------------------------------------

--
-- Structure de la table `exams`
--

DROP TABLE IF EXISTS `exams`;
CREATE TABLE IF NOT EXISTS `exams` (
  `idexa` int(11) NOT NULL AUTO_INCREMENT,
  `nomex` varchar(255) NOT NULL,
  `dateex` date NOT NULL,
  `duree` int(11) NOT NULL,
  PRIMARY KEY (`idexa`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;






--structure de la classe Club
DROP TABLE IF EXISTS `club`;
CREATE TABLE IF NOT EXISTS `club` (
  `id_club` int(30) NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) NOT NULL,
  `date` date NOT NULL,
  `email` varchar(30) NOT NULL,
  `numero` int(30) NOT NULL,
  `description` varchar(100) NOT NULL,
  `etat` int(10) NOT NULL,
  `id_president` int(30) NOT NULL,
  PRIMARY KEY (`id_club`),
  UNIQUE KEY `nom` (`nom`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;





--structure de la classe evenement
DROP TABLE IF EXISTS `evenement`;
CREATE TABLE IF NOT EXISTS `evenement` (
  `id_event` int(30) NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) NOT NULL,
  `description` varchar(30) NOT NULL,
  `date` date NOT NULL,
  `place` varchar(30) NOT NULL,
  `id_club` int(30) NOT NULL,
  PRIMARY KEY (`id_event`)
) ENGINE=MyISAM AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
