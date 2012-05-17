-- phpMyAdmin SQL Dump
-- version 3.4.10.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 18, 2012 at 12:51 AM
-- Server version: 5.5.22
-- PHP Version: 5.3.10-1ubuntu3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `havayolu`
--

-- --------------------------------------------------------

--
-- Table structure for table `havalimani`
--

CREATE TABLE IF NOT EXISTS `havalimani` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ad` varchar(30) NOT NULL,
  `sehir` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `hostes`
--

CREATE TABLE IF NOT EXISTS `hostes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ad` varchar(30) NOT NULL,
  `soyad` varchar(30) NOT NULL,
  `dogumtarihi` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `musteri`
--

CREATE TABLE IF NOT EXISTS `musteri` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ad` varchar(30) NOT NULL,
  `soyad` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `pilot`
--

CREATE TABLE IF NOT EXISTS `pilot` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ad` int(30) NOT NULL,
  `soyad` int(30) NOT NULL,
  `dogumtarihi` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `sefer`
--

CREATE TABLE IF NOT EXISTS `sefer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kalkisLimaniId` int(11) NOT NULL,
  `varisLimaniId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `kalkisLimaniId` (`kalkisLimaniId`),
  KEY `varisLimaniId` (`varisLimaniId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `ucus`
--

CREATE TABLE IF NOT EXISTS `ucus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yolcuucak` int(11) NOT NULL,
  `sefer` int(11) NOT NULL,
  `pilot` int(11) NOT NULL,
  `hostes` int(11) NOT NULL,
  `tarih` date NOT NULL,
  `saat` time NOT NULL,
  `businesskoltukfiyatı` float NOT NULL,
  `ekonomikkoltukfiyati` float NOT NULL,
  PRIMARY KEY (`id`),
  KEY `yolcuucak` (`yolcuucak`),
  KEY `sefer` (`sefer`),
  KEY `pilot` (`pilot`),
  KEY `hostes` (`hostes`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `yolcuucak`
--

CREATE TABLE IF NOT EXISTS `yolcuucak` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ad` varchar(30) NOT NULL,
  `agirlik` float NOT NULL,
  `businesskoltuksayisi` int(11) NOT NULL,
  `ekonomikkoltuksayisi` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `sefer`
--
ALTER TABLE `sefer`
  ADD CONSTRAINT `sefer_ibfk_2` FOREIGN KEY (`varisLimaniId`) REFERENCES `havalimani` (`id`),
  ADD CONSTRAINT `sefer_ibfk_1` FOREIGN KEY (`kalkisLimaniId`) REFERENCES `havalimani` (`id`);

--
-- Constraints for table `ucus`
--
ALTER TABLE `ucus`
  ADD CONSTRAINT `ucus_ibfk_1` FOREIGN KEY (`yolcuucak`) REFERENCES `yolcuucak` (`id`),
  ADD CONSTRAINT `ucus_ibfk_2` FOREIGN KEY (`sefer`) REFERENCES `sefer` (`id`),
  ADD CONSTRAINT `ucus_ibfk_3` FOREIGN KEY (`pilot`) REFERENCES `pilot` (`id`),
  ADD CONSTRAINT `ucus_ibfk_4` FOREIGN KEY (`hostes`) REFERENCES `hostes` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
