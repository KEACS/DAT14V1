CREATE DATABASE  IF NOT EXISTS `dreamhome` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `dreamhome`;
-- MySQL dump 10.13  Distrib 5.6.17, for osx10.6 (i386)
--
-- Host: localhost    Database: dreamhome
-- ------------------------------------------------------
-- Server version	5.6.19

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
-- Table structure for table `Branch`
--

DROP TABLE IF EXISTS `Branch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Branch` (
  `branchNo` varchar(5) NOT NULL,
  `street` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `postcode` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`branchNo`),
  KEY `postcode` (`postcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Branch`
--

LOCK TABLES `Branch` WRITE;
/*!40000 ALTER TABLE `Branch` DISABLE KEYS */;
INSERT INTO `Branch` VALUES ('B002','56 Cover Drive','London','NW10 6EU'),('B003','163 Main street','Glasgow','G11 9QX'),('B004','32 Manse Road','Bristol','BS99 1NZ'),('B005','22 Deer Road','London','SW1 4EH');
/*!40000 ALTER TABLE `Branch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Client`
--

DROP TABLE IF EXISTS `Client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Client` (
  `clientNo` varchar(5) NOT NULL,
  `fName` varchar(50) DEFAULT NULL,
  `lName` varchar(50) DEFAULT NULL,
  `telNo` varchar(20) DEFAULT NULL,
  `street` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `postCode` varchar(10) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `joinedOn` datetime DEFAULT NULL,
  `region` varchar(30) DEFAULT NULL,
  `preType` varchar(10) DEFAULT NULL,
  `maxRent` int(11) DEFAULT NULL,
  PRIMARY KEY (`clientNo`),
  KEY `postCode` (`postCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Client`
--

LOCK TABLES `Client` WRITE;
/*!40000 ALTER TABLE `Client` DISABLE KEYS */;
INSERT INTO `Client` VALUES ('C0001','John','Smith','3153122001','23 Oneida street','Oswego','13126','john.smith@google.com','2012-11-01 00:00:00','Central London','Single',1000),('C0002','Jane','Doe','3153122002','5 N 18th street','Oswego','13126','jane.doe@google.com','2012-11-02 00:00:00','Scotland','Condo',1000),('C0003','Janet','Scott','3153122003','57 Central street','Oswego','13126','janet.scott@google.com','2012-11-03 00:00:00','suburb','Single',2000),('C0004','David','Blank','3153122004','45 SW 3rd street','Oswego','13126','david.blank@google.com','2012-11-04 00:00:00','airport','Single',5000),('CR56','Fred','Flintstone','555 1234','12 Rock Way','Bedrock','BD3 8RK','fred@flintyrock.com','2004-05-09 00:00:00',NULL,'House',450),('CR62','Wilma','Flintstone','555 1234','12 Rock Way','Bedrock','BD3 8RK','wilma@flintyrock.com','2004-05-09 00:00:00',NULL,'Flat',350),('CR74','Albert','Johnstone','555 6677','1 Way St.','Chicago','PO34 5FB','albie@johnstone.com','2004-05-09 00:00:00','(N/A)','Flat',450),('CR77','Clark','Kent','555 9999','1 Super Way','Smallville','SM4 2ME','clark@supersite.com','2004-05-09 00:00:00','(N/A)','Flat',400),('CR79','Joe','Bloggs','123 4567','5 High St','Paisley','PA2 2BB','joe@paisley.com','2004-05-10 00:00:00','London (North West)','House',450),('CR83','Edward','Scissorhands','123 4567','1 Snip St.','Scissorland','SC1 2XX','eddie@scix.com','2004-05-21 00:00:00','(N/A)','House',300),('CR84','Albert','Enistein','555 6789','12 Long Island Way','New Jersey','NJ44 2RD','bert@nuclearintent.com','2004-05-21 00:00:00','London (North West)',NULL,450),('CR85','Snorrie','Sturrluson','333 4567','1 Vik Way','Rekjavik','RK22 3RD','snorrie@iceland.com','2004-05-21 00:00:00','(N/A)',NULL,400),('CR86','Ferdinand','Oblogiotta','123 5555','12 Strumpetwise Street','Lagrange Orage','PP2 1BB','ferdy@orage.com','2004-05-31 00:00:00','(N/A)','House',450),('CR87','Joe','Schmoe','123 45678','1 High St','Largs','KA30 9DD','joes@largy.com','2004-05-31 00:00:00','(N/A)','House',550),('CR88','Bill','Gates','123 5555','1 Rich Street','Seattle','SE2 TTL','bill@gatesland.com','2004-06-01 00:00:00','London (South)','House',1000),('CR89','Bruce','Wayne','555 6789','1 Wayne Manor','Gotham','BA01 TT0','wayne@batty.com','2004-11-22 00:00:00','Glasgow','House',900);
/*!40000 ALTER TABLE `Client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PrivateOwner`
--

DROP TABLE IF EXISTS `PrivateOwner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PrivateOwner` (
  `ownerNo` varchar(5) NOT NULL,
  `fName` varchar(45) NOT NULL,
  `lName` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `telNo` varchar(45) NOT NULL,
  `eMail` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`ownerNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PrivateOwner`
--

LOCK TABLES `PrivateOwner` WRITE;
/*!40000 ALTER TABLE `PrivateOwner` DISABLE KEYS */;
INSERT INTO `PrivateOwner` VALUES ('CO40','Tina','Murphy','63 Well St, Glasgow G42','0141-943-1728','tinam@hotmail.com','********'),('CO46','Joe','Keogh','2 Fergus Dr, Aberdeen AB2 7SX','01224-861212','jkeogh@lhh.com','********'),('CO87','Carol','Farrel','6 Achray St, Glasgow G32 9DX','0141-537-7419','cfarrel@gmail.com','********'),('CO93','Tony','Shaw','12 Park Pl, Glasgow G4 0QR','0141-225-7025','tony.shaw@ark.com','********');
/*!40000 ALTER TABLE `PrivateOwner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PropertyForRent`
--

DROP TABLE IF EXISTS `PropertyForRent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PropertyForRent` (
  `propertyNo` varchar(5) NOT NULL,
  `street` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  `postcode` varchar(10) NOT NULL,
  `type` varchar(10) NOT NULL,
  `rooms` int(11) NOT NULL,
  `rent` int(11) NOT NULL,
  `ownerNo` varchar(5) NOT NULL,
  `staffNo` varchar(5) NOT NULL,
  `branchNo` varchar(5) NOT NULL,
  `picture` varchar(50) NOT NULL,
  `floorPlan` varchar(50) NOT NULL,
  PRIMARY KEY (`propertyNo`),
  KEY `postcode` (`postcode`),
  KEY `profore_branch` (`branchNo`),
  KEY `profore_staff` (`staffNo`),
  KEY `profore_private_idx` (`ownerNo`),
  CONSTRAINT `profore_branch` FOREIGN KEY (`branchNo`) REFERENCES `Branch` (`branchNo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `profore_private` FOREIGN KEY (`ownerNo`) REFERENCES `PrivateOwner` (`ownerNo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `profore_staff` FOREIGN KEY (`staffNo`) REFERENCES `Staff` (`staffNo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PropertyForRent`
--

LOCK TABLES `PropertyForRent` WRITE;
/*!40000 ALTER TABLE `PropertyForRent` DISABLE KEYS */;
INSERT INTO `PropertyForRent` VALUES ('PA14','16 Holhead','Aberdeen','AB7 5SU','Single',6,650,'CO46','SA9','B005','images/house2.jpg','images/plan1.jpg'),('PG16','5 Novar Drive','Glasgow','G12 9AX','Condo',4,450,'CO93','SG14','B003','images/house3.jpg','images/plan1.jpg'),('PG21','18 Dale Road','Glasgow','G12','Single',5,600,'CO87','SG37','B003','images/house4.jpg','images/plan1.jpg'),('PG36','2 Manor Road','Glasgow','G32 4QX','Condo',3,375,'CO93','SG37','B003','images/house5.jpg','images/plan1.jpg'),('PG4','6 Lawrence Street','Glasgow','G11 9QX','Condo',3,350,'CO40','SA9','B003','images/house2.jpg','images/plan1.jpg'),('PG97','Muir Drive','Aberdeen','AB42 1DD','Single',3,380,'CO46','SA9','B003','images/house1.jpg','images/plan1.jpg'),('PL94','6 Argyll Street','London','NW2','Condo',4,400,'CO87','SL41','B005','images/house3.jpg','images/plan1.jpg');
/*!40000 ALTER TABLE `PropertyForRent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Staff`
--

DROP TABLE IF EXISTS `Staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Staff` (
  `staffNo` varchar(5) NOT NULL,
  `fName` varchar(50) DEFAULT NULL,
  `lName` varchar(50) DEFAULT NULL,
  `position` varchar(50) DEFAULT NULL,
  `sex` tinyint(1) DEFAULT '0',
  `DOB` datetime DEFAULT NULL,
  `salary` float DEFAULT NULL,
  `branchNo` varchar(5) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`staffNo`),
  KEY `position` (`position`),
  KEY `staff_branch` (`branchNo`),
  CONSTRAINT `staff_branch` FOREIGN KEY (`branchNo`) REFERENCES `Branch` (`branchNo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Staff`
--

LOCK TABLES `Staff` WRITE;
/*!40000 ALTER TABLE `Staff` DISABLE KEYS */;
INSERT INTO `Staff` VALUES ('SA9','Marie','Howe','Assistant',0,'1970-02-19 00:00:00',9000,'B005','079912345','07995674','MaryHowe@dream'),('SG14','David','Ford','Supervisor',0,'1958-03-24 00:00:00',18000,'B003','07998888','078888888','DavidFord@dream'),('SG37','Ann','Beech','Assistant',0,'1967-02-15 00:00:00',9500,'B003','07877777','0788999','AnnBeech@dream'),('SG5','Susan','Brand','Manager',0,'1940-06-03 00:00:00',30000,'B004','089999','08899999','Susanbrand@dream'),('SL21','John','White','Manager',0,'1945-10-01 00:00:00',30000,'B005','1512345','090555','Johnwhite@dreamHome'),('SL41','Julie','Lee','Assistant',0,'1965-06-13 00:00:00',9000,'B005','1514','09055512346','JulieLee@dream');
/*!40000 ALTER TABLE `Staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Viewing`
--

DROP TABLE IF EXISTS `Viewing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Viewing` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `clientID` varchar(5) DEFAULT NULL,
  `propertyNo` varchar(5) DEFAULT NULL,
  `viewDate` datetime DEFAULT NULL,
  `viewHour` varchar(5) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `wishToRent` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`ID`),
  KEY `clientID` (`clientID`),
  KEY `ID` (`ID`),
  KEY `viewing_profore` (`propertyNo`),
  CONSTRAINT `viewing_profore` FOREIGN KEY (`propertyNo`) REFERENCES `PropertyForRent` (`propertyNo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `viewing_client` FOREIGN KEY (`clientID`) REFERENCES `Client` (`clientNo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Viewing`
--

LOCK TABLES `Viewing` WRITE;
/*!40000 ALTER TABLE `Viewing` DISABLE KEYS */;
INSERT INTO `Viewing` VALUES (1,'CR83','PA14','2004-07-01 00:00:00','11',NULL,0),(2,'CR56','PG36','2004-07-01 00:00:00','12',NULL,0),(3,'CR85','PG4','2004-07-01 00:00:00','12','Tidy but too small',0),(4,'CR56','PA14','2004-07-02 00:00:00','10',NULL,0),(5,'CR77','PG4','2004-07-02 00:00:00','14',NULL,0),(6,'CR85','PA14','2004-06-20 00:00:00','12',NULL,0),(7,'CR85','PG21','2004-06-21 00:00:00','13',NULL,0),(8,'CR85','PA14','2004-06-20 00:00:00','12',NULL,0),(9,'CR88','PG21','2004-11-22 00:00:00','9','Not bad at all.',0),(10,'CR88','PG36','2004-11-23 00:00:00','9','Kitchen too small.',0),(11,'CR88','PG16','2004-11-23 00:00:00','9',NULL,0),(12,'CR77','PG21','2004-11-25 00:00:00','11',NULL,0);
/*!40000 ALTER TABLE `Viewing` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-09-21 13:55:41
