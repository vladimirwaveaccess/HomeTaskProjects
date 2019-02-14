-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.46-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for internetshop
CREATE DATABASE IF NOT EXISTS `internetshop` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `internetshop`;

-- Dumping structure for table internetshop.category
CREATE TABLE IF NOT EXISTS `category` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Dumping data for table internetshop.category: ~5 rows (approximately)
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` (`id`, `category_name`) VALUES
	(1, 'chemistry'),
	(2, 'mobile_device'),
	(3, 'device_for_laptop'),
	(4, 'device_for_PC'),
	(5, 'printers');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;

-- Dumping structure for table internetshop.category_product
CREATE TABLE IF NOT EXISTS `category_product` (
  `category_id` int(5) NOT NULL,
  `product_id` int(5) NOT NULL,
  KEY `category_idFK1` (`category_id`),
  KEY `product_idFK2` (`product_id`),
  CONSTRAINT `category_idFK1` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`),
  CONSTRAINT `product_idFK2` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table internetshop.category_product: ~20 rows (approximately)
/*!40000 ALTER TABLE `category_product` DISABLE KEYS */;
INSERT INTO `category_product` (`category_id`, `product_id`) VALUES
	(1, 4),
	(1, 3),
	(1, 2),
	(1, 1),
	(2, 7),
	(2, 6),
	(2, 5),
	(2, 8),
	(3, 12),
	(3, 9),
	(3, 10),
	(3, 11),
	(4, 13),
	(4, 15),
	(4, 14),
	(4, 16),
	(5, 17),
	(5, 18),
	(5, 19),
	(5, 20);
/*!40000 ALTER TABLE `category_product` ENABLE KEYS */;

-- Dumping structure for table internetshop.history
CREATE TABLE IF NOT EXISTS `history` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `user_id` int(5) NOT NULL,
  `create_date` datetime NOT NULL,
  `product_id` int(5) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_idFK1` (`user_id`),
  KEY `product_id_in_historyFK2` (`product_id`),
  CONSTRAINT `user_idFK1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `product_id_in_historyFK2` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table internetshop.history: ~2 rows (approximately)
/*!40000 ALTER TABLE `history` DISABLE KEYS */;
INSERT INTO `history` (`id`, `user_id`, `create_date`, `product_id`) VALUES
	(1, 1, '2019-02-14 00:00:00', 13),
	(2, 1, '2019-02-14 00:00:00', 14);
/*!40000 ALTER TABLE `history` ENABLE KEYS */;

-- Dumping structure for table internetshop.product
CREATE TABLE IF NOT EXISTS `product` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `productname` varchar(50) NOT NULL,
  `price` double(7,2) DEFAULT NULL,
  `rating` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- Dumping data for table internetshop.product: ~20 rows (approximately)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`id`, `productname`, `price`, `rating`) VALUES
	(1, 'productChemistry4', 111.00, 1),
	(2, 'productChemistry3', 222.00, 4),
	(3, 'productChemistry2', 333.00, 3),
	(4, 'productChemistry1', 444.00, 2),
	(5, 'productMobileDevice3', 10555.00, 4),
	(6, 'productMobileDevice2', 10444.00, 5),
	(7, 'productMobileDevice1', 10333.00, 2),
	(8, 'productMobileDevice4', 12222.00, 1),
	(9, 'productsDeviceForLaptop2', 2222.00, 2),
	(10, 'productsDeviceForLaptop3', 3234.00, 2),
	(11, 'productsDeviceForLaptop4', 1234.00, 3),
	(12, 'productsDeviceForLaptop1', 1212.00, 1),
	(13, 'productsDeviceForPC1', 3652.00, 2),
	(14, 'productsDeviceForPC3', 4521.00, 3),
	(15, 'productsDeviceForPC2', 852.00, 1),
	(16, 'productsDeviceForPC4', 9517.00, 4),
	(17, 'printer1', 2365.00, 1),
	(18, 'printer2', 4125.00, 2),
	(19, 'printer3', 6325.00, 3),
	(20, 'printer4', 2541.00, 4);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

-- Dumping structure for table internetshop.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `user_login` varchar(20) NOT NULL,
  `user_password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table internetshop.users: ~3 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `user_login`, `user_password`) VALUES
	(1, 'login1', 'password1'),
	(2, 'login2', 'password2'),
	(3, 'login3', 'password3');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
