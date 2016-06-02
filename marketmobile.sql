CREATE DATABASE  IF NOT EXISTS `marketmobile` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `marketmobile`;
-- MySQL dump 10.13  Distrib 5.7.9, for osx10.9 (x86_64)
--
-- Host: localhost    Database: marketmobile
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
  `brandID` int(11) NOT NULL AUTO_INCREMENT,
  `brandName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`brandID`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
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
  `categoryID` int(11) NOT NULL AUTO_INCREMENT,
  `categoryName` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`categoryID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Điện thoại'),(2,'Máy tính bảng');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `import_product`
--

DROP TABLE IF EXISTS `import_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `import_product` (
  `import_productID` int(11) NOT NULL,
  `import_productDate` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `import_productTotalMoney` bigint(15) DEFAULT NULL,
  `import_productTotalNumber` int(11) DEFAULT NULL,
  `product_shopUserID` int(11) NOT NULL,
  `comment` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`import_productID`,`product_shopUserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `import_product`
--

LOCK TABLES `import_product` WRITE;
/*!40000 ALTER TABLE `import_product` DISABLE KEYS */;
/*!40000 ALTER TABLE `import_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `import_product_detail`
--

DROP TABLE IF EXISTS `import_product_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `import_product_detail` (
  `import_productID` int(11) NOT NULL,
  `product_shopID` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `product_shopName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `STT` int(11) NOT NULL,
  `number` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` bigint(15) DEFAULT NULL,
  PRIMARY KEY (`import_productID`,`STT`,`product_shopID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `import_product_detail`
--

LOCK TABLES `import_product_detail` WRITE;
/*!40000 ALTER TABLE `import_product_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `import_product_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location` (
  `locationID` int(11) NOT NULL AUTO_INCREMENT,
  `locationName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`locationID`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
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
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `productID` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `productName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `productColor` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `productColorName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `productTypeID` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `productTypeName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `productStateID` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `productStateName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `productImage` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `productBrandID` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `productBrandName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `productStorageID` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `productStorageName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `productInfoID` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`productID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_color`
--

DROP TABLE IF EXISTS `product_color`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_color` (
  `product_colorID` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `product_colorName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`product_colorID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_color`
--

LOCK TABLES `product_color` WRITE;
/*!40000 ALTER TABLE `product_color` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_color` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_export`
--

DROP TABLE IF EXISTS `product_export`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_export` (
  `exportNO` int(11) NOT NULL AUTO_INCREMENT,
  `orderNO` int(11) DEFAULT NULL,
  `userID` int(11) DEFAULT NULL,
  `userName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `totalPrice` int(11) DEFAULT NULL,
  `totalNumber` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`exportNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
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
  `exportNo` int(11) NOT NULL,
  `STT` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `product_shopID` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `product_shopName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`exportNo`,`STT`,`product_shopID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_export_detail`
--

LOCK TABLES `product_export_detail` WRITE;
/*!40000 ALTER TABLE `product_export_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_export_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_info`
--

DROP TABLE IF EXISTS `product_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_info` (
  `tempID` int(11) NOT NULL,
  `htmlData` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`tempID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_info`
--

LOCK TABLES `product_info` WRITE;
/*!40000 ALTER TABLE `product_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_info_shop`
--

DROP TABLE IF EXISTS `product_info_shop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_info_shop` (
  `tempID` int(11) NOT NULL,
  `htmlData` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `shopID` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`tempID`,`shopID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_info_shop`
--

LOCK TABLES `product_info_shop` WRITE;
/*!40000 ALTER TABLE `product_info_shop` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_info_shop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_inventory`
--

DROP TABLE IF EXISTS `product_inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_inventory` (
  `product_shopID` int(11) NOT NULL,
  `product_shopName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `numberInport` int(11) DEFAULT NULL,
  `numberExport` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `shopID` int(11) NOT NULL,
  `numberExisting` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_shopID`,`shopID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_inventory`
--

LOCK TABLES `product_inventory` WRITE;
/*!40000 ALTER TABLE `product_inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_order`
--

DROP TABLE IF EXISTS `product_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_order` (
  `product_orderNO` int(11) NOT NULL AUTO_INCREMENT,
  `userID` int(11) DEFAULT NULL,
  `product_TotalPrice` int(11) DEFAULT NULL,
  `product_totalNumber` int(11) DEFAULT NULL,
  `product_orderDate` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`product_orderNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
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
  `product_orderNO` int(11) NOT NULL,
  `STT` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `product_shopID` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `product_shopName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_orderNO`,`STT`,`product_shopID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
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
  `product_shopUserID` varchar(45) CHARACTER SET utf8 NOT NULL,
  `product_shopID` int(11) NOT NULL,
  `product_shopName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` bigint(10) DEFAULT NULL,
  `priceDate` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`product_shopUserID`,`product_shopID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_price`
--

LOCK TABLES `product_price` WRITE;
/*!40000 ALTER TABLE `product_price` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_price` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_shop`
--

DROP TABLE IF EXISTS `product_shop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_shop` (
  `product_shopUserID` int(11) NOT NULL,
  `product_shopID` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `product_shopName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_shopColor` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_shopColorName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_shopTypeID` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_shopTypeName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_shopStateID` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_shopStateName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_shopImage` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_shopBrandID` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_shopBrandName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_shopStorageID` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_shopStorageName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_shopInfoID` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`product_shopUserID`,`product_shopID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_shop`
--

LOCK TABLES `product_shop` WRITE;
/*!40000 ALTER TABLE `product_shop` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_shop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_state`
--

DROP TABLE IF EXISTS `product_state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_state` (
  `product_stateID` int(11) NOT NULL AUTO_INCREMENT,
  `product_stateName` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`product_stateID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
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
-- Table structure for table `product_storage`
--

DROP TABLE IF EXISTS `product_storage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_storage` (
  `product_storageID` int(11) NOT NULL AUTO_INCREMENT,
  `product_storageName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`product_storageID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_storage`
--

LOCK TABLES `product_storage` WRITE;
/*!40000 ALTER TABLE `product_storage` DISABLE KEYS */;
INSERT INTO `product_storage` VALUES (1,'8GB'),(2,'16GB'),(3,'32GB'),(4,'128GB'),(5,'256GB');
/*!40000 ALTER TABLE `product_storage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_type`
--

DROP TABLE IF EXISTS `product_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_type` (
  `product_typeID` int(11) NOT NULL AUTO_INCREMENT,
  `product_typeName` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`product_typeID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_type`
--

LOCK TABLES `product_type` WRITE;
/*!40000 ALTER TABLE `product_type` DISABLE KEYS */;
INSERT INTO `product_type` VALUES (1,'Chính hãng'),(2,'Hàn Quốc '),(3,'Nhật Bản'),(4,'Mỹ'),(5,'Trung Quốc'),(6,'Đài Loan'),(7,'Anh'),(8,'Canada');
/*!40000 ALTER TABLE `product_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `roleID` int(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`roleID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'Người dùng'),(2,'Cửa hàng'),(3,'Quản trị');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `systemNo`
--

DROP TABLE IF EXISTS `systemNo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `systemNo` (
  `shopID` int(11) NOT NULL,
  `importNo` int(11) DEFAULT NULL,
  `orderNo` int(11) DEFAULT NULL,
  `exportNo` int(11) DEFAULT NULL,
  `shopName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`shopID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `systemNo`
--

LOCK TABLES `systemNo` WRITE;
/*!40000 ALTER TABLE `systemNo` DISABLE KEYS */;
/*!40000 ALTER TABLE `systemNo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `userEmail` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `userName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userPhoneNumber` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userAddress` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userLatitude` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userLongitude` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userPassWord` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userDeviceID` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userLocationID` varchar(3) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userLocationName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userRoleID` varchar(3) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userRoleName` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userState` int(11) DEFAULT NULL,
  PRIMARY KEY (`userID`,`userEmail`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'','acnovn',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'','nghiath',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-02 16:08:25
