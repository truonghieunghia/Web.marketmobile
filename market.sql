CREATE DATABASE  IF NOT EXISTS `market` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `market`;
-- MySQL dump 10.13  Distrib 5.7.9, for osx10.9 (x86_64)
--
-- Host: localhost    Database: market
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.13-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `brand`
--

DROP TABLE IF EXISTS `brand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `brand` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brand`
--

LOCK TABLES `brand` WRITE;
/*!40000 ALTER TABLE `brand` DISABLE KEYS */;
INSERT INTO `brand` VALUES (1,'Apple'),(2,'SamSung'),(3,'HTC'),(4,'Google'),(5,'Sony'),(6,'Nokia'),(7,'LG'),(8,'Oppo'),(9,'Lenovo'),(10,'Microsoft Lumia'),(11,'Asus'),(12,'Motorola'),(13,'Huawei'),(14,'BlackBerry'),(15,'Mobell'),(16,'FPT'),(17,'Philips'),(18,'Coolpad'),(19,'Obi'),(20,'Archos'),(21,'Wing'),(22,'ZTE'),(23,'Masstel');
/*!40000 ALTER TABLE `brand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `pathID` varchar(45) NOT NULL,
  `pathName` mediumtext NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location` (
  `id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (1,'An Giang'),(2,'Bà Rịa - Vũng Tàu'),(3,'Bắc Giang'),(4,'Bắc Kạn'),(5,'Bạc Liêu'),(6,'Bắc Ninh'),(7,'Bến Tre'),(8,'Bình Định'),(9,'Bình Dương'),(10,'Bình Phước'),(11,'Bình Thuận'),(12,'Cà Mau'),(13,'Cao Bằng'),(14,'Đắk Lắk'),(15,'Đắk Nông'),(16,'Điện Biên'),(17,'Đồng Nai'),(18,'Đồng Tháp'),(19,'Gia Lai'),(20,'Hà Giang'),(21,'Hà Nam'),(22,'Hà Tĩnh'),(23,'Hải Dương'),(24,'Hậu Giang'),(25,'Hòa Bình'),(26,'Hưng Yên'),(27,'Khánh Hòa'),(28,'Kiên Giang'),(29,'Kon Tum'),(30,'Lai Châu'),(31,'Lâm Đồng'),(32,'Lạng Sơn'),(33,'Lào Cai'),(34,'Long An'),(35,'Nam Định'),(36,'Nghệ An'),(37,'Ninh Bình'),(38,'Ninh Thuận'),(39,'Phú Thọ'),(40,'Quảng Bình'),(41,'Quảng Nam'),(42,'Quảng Ngãi'),(43,'Quảng Ninh'),(44,'Quảng Trị'),(45,'Sóc Trăng'),(46,'Sơn La'),(47,'Tây Ninh'),(48,'Thái Bình'),(49,'Thái Nguyên'),(50,'Thanh Hóa'),(51,'Thừa Thiên Huế'),(52,'Tiền Giang'),(53,'Trà Vinh'),(54,'Tuyên Quang'),(55,'Vĩnh Long'),(56,'Vĩnh Phúc'),(57,'Yên Bái'),(58,'Phú Yên'),(59,'Cần Thơ'),(60,'Đà Nẵng'),(61,'Hải Phòng'),(62,'Hà Nội'),(63,'TP HCM');
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `origin`
--

DROP TABLE IF EXISTS `origin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `origin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `origin`
--

LOCK TABLES `origin` WRITE;
/*!40000 ALTER TABLE `origin` DISABLE KEYS */;
/*!40000 ALTER TABLE `origin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_export`
--

DROP TABLE IF EXISTS `product_export`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_export` (
  `no` int(11) NOT NULL,
  `userID` varchar(45) NOT NULL,
  `exportDate` varchar(8) NOT NULL,
  `totalMoney` double NOT NULL DEFAULT '0',
  `comment` varchar(45) NOT NULL,
  `userOrderName` varchar(45) DEFAULT NULL,
  `userOrderAddress` varchar(45) DEFAULT NULL,
  `userOrderID` int(11) DEFAULT NULL,
  `userOrderPhone` varchar(45) DEFAULT NULL,
  `userOrderEmail` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`no`,`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_export`
--

LOCK TABLES `product_export` WRITE;
/*!40000 ALTER TABLE `product_export` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_export` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_export_detail`
--

DROP TABLE IF EXISTS `product_export_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_export_detail` (
  `no` int(11) NOT NULL,
  `userID` varchar(45) NOT NULL,
  `productID` varchar(45) NOT NULL,
  `ProductName` varchar(45) NOT NULL,
  `number` varchar(45) NOT NULL DEFAULT '0',
  `stt` int(11) NOT NULL,
  `price` double NOT NULL DEFAULT '0',
  `priceVAT` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`no`,`productID`,`userID`,`stt`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_export_detail`
--

LOCK TABLES `product_export_detail` WRITE;
/*!40000 ALTER TABLE `product_export_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_export_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_import`
--

DROP TABLE IF EXISTS `product_import`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_import` (
  `no` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `importDate` varchar(8) NOT NULL,
  `totalMoney` varchar(45) NOT NULL,
  `comment` tinytext NOT NULL,
  PRIMARY KEY (`no`,`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_import`
--

LOCK TABLES `product_import` WRITE;
/*!40000 ALTER TABLE `product_import` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_import` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_import_detail`
--

DROP TABLE IF EXISTS `product_import_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_import_detail` (
  `no` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `productID` varchar(45) NOT NULL,
  `productName` varchar(45) NOT NULL,
  `stt` int(11) NOT NULL DEFAULT '1',
  `number` float NOT NULL,
  `price` int(11) NOT NULL DEFAULT '0',
  `priceVAT` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`no`,`userID`,`productID`,`stt`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_import_detail`
--

LOCK TABLES `product_import_detail` WRITE;
/*!40000 ALTER TABLE `product_import_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_import_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_inventory`
--

DROP TABLE IF EXISTS `product_inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_inventory` (
  `userID` int(11) NOT NULL,
  `productID` varchar(45) NOT NULL,
  `productName` varchar(45) NOT NULL,
  `totalImport` int(11) NOT NULL DEFAULT '0',
  `totalExport` int(11) NOT NULL DEFAULT '0',
  `totalExisting` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`userID`,`productID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_inventory`
--

LOCK TABLES `product_inventory` WRITE;
/*!40000 ALTER TABLE `product_inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_master`
--

DROP TABLE IF EXISTS `product_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_master` (
  `productID` varchar(45) NOT NULL,
  `productName` varchar(45) NOT NULL,
  `originID` int(11) NOT NULL,
  `originName` varchar(45) NOT NULL,
  `brandID` int(11) NOT NULL DEFAULT '0',
  `brandName` varchar(45) NOT NULL,
  `categoryID` varchar(45) NOT NULL DEFAULT '0',
  `categoryName` varchar(45) NOT NULL,
  `detail` mediumtext NOT NULL,
  `extID` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`productID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_master`
--

LOCK TABLES `product_master` WRITE;
/*!40000 ALTER TABLE `product_master` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_order`
--

DROP TABLE IF EXISTS `product_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_order` (
  `no` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `orderDate` varchar(8) NOT NULL,
  `totalMoney` double NOT NULL DEFAULT '0',
  `comment` tinytext NOT NULL,
  `product_ordercol` varchar(45) NOT NULL,
  `userOrderName` varchar(45) NOT NULL,
  `userOrderAddress` varchar(45) NOT NULL,
  `userOrderID` int(11) NOT NULL DEFAULT '0',
  `userOrderPhone` varchar(45) NOT NULL,
  `userOrderEmail` varchar(45) NOT NULL,
  PRIMARY KEY (`no`,`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_order`
--

LOCK TABLES `product_order` WRITE;
/*!40000 ALTER TABLE `product_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_order_detail`
--

DROP TABLE IF EXISTS `product_order_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_order_detail` (
  `no` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `productID` varchar(45) NOT NULL,
  `productName` varchar(45) NOT NULL,
  `stt` int(11) NOT NULL,
  `price` double NOT NULL,
  `number` double NOT NULL,
  `priceVAT` double NOT NULL,
  PRIMARY KEY (`no`,`userID`,`productID`,`stt`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_order_detail`
--

LOCK TABLES `product_order_detail` WRITE;
/*!40000 ALTER TABLE `product_order_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_order_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_price`
--

DROP TABLE IF EXISTS `product_price`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_price` (
  `userID` int(11) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `productID` varchar(45) NOT NULL,
  `productName` varchar(45) NOT NULL,
  `price` int(11) NOT NULL,
  `priceVAT` int(11) NOT NULL,
  `priceDate` varchar(8) NOT NULL,
  `discount` int(11) NOT NULL,
  `datediscountstart` varchar(8) NOT NULL,
  `datediscountend` varchar(8) NOT NULL,
  PRIMARY KEY (`userID`,`productID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_price`
--

LOCK TABLES `product_price` WRITE;
/*!40000 ALTER TABLE `product_price` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_price` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_state`
--

DROP TABLE IF EXISTS `product_state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_state` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_state`
--

LOCK TABLES `product_state` WRITE;
/*!40000 ALTER TABLE `product_state` DISABLE KEYS */;
INSERT INTO `product_state` VALUES (1,'new'),(2,'like new'),(3,'old');
/*!40000 ALTER TABLE `product_state` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_user`
--

DROP TABLE IF EXISTS `product_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_user` (
  `userID` int(11) NOT NULL,
  `userBranchID` int(11) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `productID` varchar(45) NOT NULL,
  `productName` varchar(45) NOT NULL,
  `originID` int(11) NOT NULL,
  `originName` varchar(45) NOT NULL,
  `brandID` int(11) NOT NULL DEFAULT '0',
  `brandName` varchar(45) NOT NULL,
  `categoryID` varchar(45) NOT NULL DEFAULT '0',
  `categoryName` varchar(45) NOT NULL,
  `detail` mediumtext NOT NULL,
  `extID` int(11) NOT NULL DEFAULT '0',
  `stateID` int(11) NOT NULL,
  `stateName` varchar(45) NOT NULL,
  PRIMARY KEY (`userID`,`productID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_user`
--

LOCK TABLES `product_user` WRITE;
/*!40000 ALTER TABLE `product_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `system_no`
--

DROP TABLE IF EXISTS `system_no`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `system_no` (
  `userID` int(11) NOT NULL,
  `importNo` int(11) NOT NULL DEFAULT '0',
  `exportNo` int(11) NOT NULL DEFAULT '0',
  `orderNo` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `system_no`
--

LOCK TABLES `system_no` WRITE;
/*!40000 ALTER TABLE `system_no` DISABLE KEYS */;
/*!40000 ALTER TABLE `system_no` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(45) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `fullName` varchar(45) NOT NULL,
  `birthDate` varchar(8) NOT NULL,
  `sex` int(11) NOT NULL,
  `sexName` varchar(45) NOT NULL,
  `passWord` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `deviceID` varchar(45) NOT NULL,
  `locationID` int(11) NOT NULL,
  `locationName` varchar(45) NOT NULL,
  `roleID` int(11) NOT NULL,
  `roleName` varchar(45) NOT NULL,
  `stateID` int(11) NOT NULL,
  `stateName` varchar(45) NOT NULL,
  `branchID` int(11) NOT NULL,
  `latitude` varchar(45) NOT NULL,
  `longitude` varchar(45) NOT NULL,
  `logo` tinytext NOT NULL,
  `type` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'truonghieunghia84@gmail.com','acnovn','Truong Hieu Nghiag','',0,'','','','',0,'',0,'',0,'',0,'','','',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_branch`
--

DROP TABLE IF EXISTS `user_branch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_branch` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `userName` varchar(45) NOT NULL,
  PRIMARY KEY (`id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_branch`
--

LOCK TABLES `user_branch` WRITE;
/*!40000 ALTER TABLE `user_branch` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_branch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (1,'Quản trị'),(2,'Người dùng'),(3,'Cửa hàng'),(4,'Cửa hàng chi nhánh');
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_state`
--

DROP TABLE IF EXISTS `user_state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_state` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_state`
--

LOCK TABLES `user_state` WRITE;
/*!40000 ALTER TABLE `user_state` DISABLE KEYS */;
INSERT INTO `user_state` VALUES (1,'Đang hoạt động'),(2,'Đăng ký mới'),(3,'Ngưng sử dụng');
/*!40000 ALTER TABLE `user_state` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-08 17:14:43
