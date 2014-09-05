/*
SQLyog Ultimate v11.32 (32 bit)
MySQL - 5.5.30 : Database - stock
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`stock` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `stock`;

/*Table structure for table `_detail` */

DROP TABLE IF EXISTS `_detail`;

CREATE TABLE `_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `volume` int(20) DEFAULT NULL,
  `open` decimal(20,3) DEFAULT NULL,
  `high` decimal(20,3) DEFAULT NULL,
  `close` decimal(20,3) DEFAULT NULL,
  `low` decimal(20,3) DEFAULT NULL,
  `chg` decimal(20,3) DEFAULT NULL,
  `percent` decimal(20,3) DEFAULT NULL,
  `turnrate` decimal(20,3) DEFAULT NULL,
  `ma5` decimal(20,3) DEFAULT NULL,
  `ma10` decimal(20,3) DEFAULT NULL,
  `ma20` decimal(20,3) DEFAULT NULL,
  `ma30` decimal(20,3) DEFAULT NULL,
  `dif` decimal(20,3) DEFAULT NULL,
  `dea` decimal(20,3) DEFAULT NULL,
  `macd` decimal(20,3) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `stock_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*Table structure for table `_stock` */

DROP TABLE IF EXISTS `_stock`;

CREATE TABLE `_stock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `symbol` varchar(255) DEFAULT NULL,
  `exchange` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `current` decimal(20,3) DEFAULT NULL,
  `percentage` decimal(20,3) DEFAULT NULL,
  `change` decimal(20,3) DEFAULT NULL,
  `open` decimal(20,3) DEFAULT NULL,
  `high` decimal(20,3) DEFAULT NULL,
  `low` decimal(20,3) DEFAULT NULL,
  `close` decimal(20,3) DEFAULT NULL,
  `last_close` decimal(20,3) DEFAULT NULL,
  `high52week` decimal(20,3) DEFAULT NULL,
  `low52week` decimal(20,3) DEFAULT NULL,
  `volume` decimal(20,3) DEFAULT NULL,
  `volume_average` decimal(20,3) DEFAULT NULL,
  `market_capital` decimal(20,3) DEFAULT NULL,
  `eps` decimal(20,3) DEFAULT NULL,
  `pe_ttm` decimal(20,3) DEFAULT NULL,
  `pe_lyr` decimal(20,3) DEFAULT NULL,
  `currency_unit` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
