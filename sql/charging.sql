/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.5-10.3.7-MariaDB : Database - ruoyitest
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

/*Table structure for table `charging_bill_fail` */

DROP TABLE IF EXISTS `charging_bill_fail`;

CREATE TABLE `charging_bill_fail` (
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  `bill_number` varchar(10) NOT NULL COMMENT '订单号',
  `user_id` int(10) DEFAULT NULL COMMENT '用户ID',
  `operator_id` int(10) DEFAULT NULL COMMENT '运营商ID',
  `station_id` int(10) DEFAULT NULL COMMENT '场站ID',
  `device_id` int(10) DEFAULT NULL COMMENT '设备ID',
  `order_create_time` datetime DEFAULT NULL COMMENT '订单创建时间',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `charging_bill_fail` */

/*Table structure for table `charging_bill_process` */

DROP TABLE IF EXISTS `charging_bill_process`;

CREATE TABLE `charging_bill_process` (
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  `bill_number` varchar(10) NOT NULL COMMENT '订单号',
  `charging_capacity` int(3) DEFAULT NULL COMMENT '充电量（kwh）',
  `electric_money` decimal(8,3) DEFAULT NULL COMMENT '电费',
  `service_money` decimal(8,3) DEFAULT NULL COMMENT '服务费',
  `charging_duration` int(11) DEFAULT NULL COMMENT '充电时长',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `operator_id` int(11) DEFAULT NULL COMMENT '运营商ID',
  `station_id` int(11) DEFAULT NULL COMMENT '场站ID',
  `device_id` int(11) DEFAULT NULL COMMENT '设备ID',
  `charging_start_time` datetime DEFAULT NULL COMMENT '充电开始时间',
  `charging_end_time` datetime DEFAULT NULL COMMENT '充电结束时间',
  `bill_status` tinyint(4) DEFAULT NULL COMMENT '订单状态',
  `pay_amount` decimal(8,3) DEFAULT NULL COMMENT '支付金额',
  `pay_time` datetime DEFAULT NULL COMMENT '支付时间',
  `pay_channel` tinyint(4) DEFAULT NULL COMMENT '支付渠道',
  `create_time` datetime DEFAULT NULL COMMENT '订单创建时间',
  `rate_capacity` int(3) DEFAULT NULL COMMENT '电量比例',
  `total_capacity` int(3) DEFAULT NULL COMMENT '总电量',
  PRIMARY KEY (`Id`,`bill_number`),
  UNIQUE KEY `Id` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

/*Data for the table `charging_bill_process` */

insert  into `charging_bill_process`(`Id`,`bill_number`,`charging_capacity`,`electric_money`,`service_money`,`charging_duration`,`user_id`,`operator_id`,`station_id`,`device_id`,`charging_start_time`,`charging_end_time`,`bill_status`,`pay_amount`,`pay_time`,`pay_channel`,`create_time`,`rate_capacity`,`total_capacity`) values (1,'001',78,'544.000','136.000',8211,1,1,1,1,'2022-11-03 00:00:00','2022-11-08 16:51:53',1,'413.000','2022-11-08 16:51:53',1,'2022-11-03 00:00:00',78,100);

/*Table structure for table `charging_bill_succes` */

DROP TABLE IF EXISTS `charging_bill_succes`;

CREATE TABLE `charging_bill_succes` (
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  `bill_number` varchar(10) NOT NULL COMMENT '订单号',
  `charging_capacity` int(3) DEFAULT NULL COMMENT '充电量（kwh）',
  `electric_money` decimal(8,3) DEFAULT NULL COMMENT '电费',
  `service_money` decimal(8,3) DEFAULT NULL COMMENT '服务费',
  `charging_duration` int(11) DEFAULT NULL COMMENT '充电时长',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `operator_id` int(11) DEFAULT NULL COMMENT '运营商ID',
  `station_id` int(11) DEFAULT NULL COMMENT '场站ID',
  `device_id` int(11) DEFAULT NULL COMMENT '设备ID',
  `charging_start_time` datetime DEFAULT NULL COMMENT '充电开始时间',
  `charging_end_time` datetime DEFAULT NULL COMMENT '充电结束时间',
  `bill_status` tinyint(4) DEFAULT NULL COMMENT '订单状态',
  `pay_amount` decimal(8,3) DEFAULT NULL COMMENT '支付金额',
  `pay_time` datetime DEFAULT NULL COMMENT '支付时间',
  `pay_channel` tinyint(4) DEFAULT NULL COMMENT '支付渠道',
  `create_time` datetime DEFAULT NULL COMMENT '订单创建时间',
  PRIMARY KEY (`Id`,`bill_number`),
  UNIQUE KEY `Id` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

/*Data for the table `charging_bill_succes` */

insert  into `charging_bill_succes`(`Id`,`bill_number`,`charging_capacity`,`electric_money`,`service_money`,`charging_duration`,`user_id`,`operator_id`,`station_id`,`device_id`,`charging_start_time`,`charging_end_time`,`bill_status`,`pay_amount`,`pay_time`,`pay_channel`,`create_time`) values (1,'001',50,'15.680','3.600',60,1,1,1,1,'2022-11-03 12:00:00','2022-11-03 13:00:00',1,'19.280','2022-11-03 13:01:00',1,'2022-11-03 13:01:03');

/*Table structure for table `charging_gun_info` */

DROP TABLE IF EXISTS `charging_gun_info`;

CREATE TABLE `charging_gun_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gun_number` char(1) NOT NULL,
  `gun_name` varchar(10) DEFAULT NULL,
  `power` decimal(9,4) DEFAULT NULL,
  `electricity` decimal(9,4) DEFAULT NULL,
  `voltage_upper_limits` decimal(9,4) DEFAULT NULL,
  `voltage_lower_limits` decimal(9,4) DEFAULT NULL,
  `gun_type` tinyint(1) DEFAULT NULL,
  `pile_id` tinyint(1) DEFAULT NULL,
  `gun_status` tinyint(1) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4;

/*Data for the table `charging_gun_info` */

insert  into `charging_gun_info`(`id`,`gun_number`,`gun_name`,`power`,`electricity`,`voltage_upper_limits`,`voltage_lower_limits`,`gun_type`,`pile_id`,`gun_status`,`create_time`) values (1,'0','特来电充电桩','1.6000','112.0000','600.0000','380.0000',1,1,1,'2018-08-09 00:00:00'),(2,'0','特来电充电桩','1.6000','112.0000','600.0000','380.0000',1,1,1,'2018-08-09 00:00:00'),(3,'0','特来电充电桩','1.6000','112.0000','600.0000','380.0000',1,2,1,'2018-08-09 00:00:00'),(4,'0','特来电充电桩','1.6000','112.0000','600.0000','380.0000',1,2,1,'2018-08-09 00:00:00'),(5,'0','特来电充电桩','1.6000','112.0000','600.0000','380.0000',2,3,1,'2018-08-09 00:00:00'),(6,'0','特来电充电桩','1.6000','112.0000','600.0000','380.0000',2,3,1,'2018-08-09 00:00:00'),(7,'0','特来电充电桩','1.6000','112.0000','600.0000','380.0000',2,4,1,'2018-08-09 00:00:00'),(8,'0','星星充电','1.6000','112.0000','600.0000','380.0000',2,4,1,'2018-08-09 00:00:00'),(9,'0','星星充电','1.6000','112.0000','600.0000','380.0000',1,5,1,'2018-08-09 00:00:00'),(10,'1','星星充电','1.6000','112.0000','600.0000','380.0000',2,5,1,'2018-08-09 00:00:00'),(11,'1','星星充电','1.6000','112.0000','600.0000','380.0000',2,6,1,'2018-08-09 00:00:00'),(12,'1','星星充电','1.6000','112.0000','600.0000','380.0000',1,6,1,'2018-08-09 00:00:00'),(13,'1','星星充电','1.6000','112.0000','600.0000','380.0000',1,7,1,'2018-08-09 00:00:00'),(14,'1','星星充电','1.6000','112.0000','600.0000','380.0000',1,9,1,'2018-08-09 00:00:00'),(15,'0','特来电充电桩','1.6000','112.0000','600.0000','380.0000',1,10,1,'2018-08-09 00:00:00'),(16,'0','特来电充电桩','1.6000','112.0000','600.0000','380.0000',1,10,1,'2018-08-09 00:00:00'),(17,'0','特来电充电桩','1.6000','112.0000','600.0000','380.0000',2,11,1,'2018-08-09 00:00:00'),(18,'0','特来电充电桩','1.6000','112.0000','600.0000','380.0000',2,11,1,'2018-08-09 00:00:00'),(19,'1','星星充电','1.6000','112.0000','600.0000','380.0000',1,12,1,'2018-08-09 00:00:00'),(20,'1','星星充电','1.6000','112.0000','600.0000','380.0000',1,12,1,'2018-08-09 00:00:00'),(21,'1','星星充电','1.6000','112.0000','600.0000','380.0000',1,13,1,'2018-08-09 00:00:00'),(22,'1','星星充电','1.6000','112.0000','600.0000','380.0000',1,13,1,'2018-08-09 00:00:00');

/*Table structure for table `charging_operator_info` */

DROP TABLE IF EXISTS `charging_operator_info`;

CREATE TABLE `charging_operator_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `operator_number` varchar(10) NOT NULL COMMENT '运营商编号',
  `operator_name` varchar(10) DEFAULT NULL COMMENT '运营商名称',
  `business` varchar(50) DEFAULT NULL COMMENT '经营业务',
  `phone` char(11) DEFAULT NULL COMMENT '联系方式',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `power_rate` decimal(10,0) DEFAULT NULL COMMENT '电费',
  `service_fee` decimal(10,0) DEFAULT NULL COMMENT '服务费',
  `pay_type` tinyint(4) DEFAULT NULL COMMENT '支付方式',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

/*Data for the table `charging_operator_info` */

insert  into `charging_operator_info`(`id`,`operator_number`,`operator_name`,`business`,`phone`,`address`,`power_rate`,`service_fee`,`pay_type`) values (1,'001','星星充电','新能源车云快充','010-7654231','北京市海淀区中关村中鼎大厦','4','1',0),(2,'002','特来电','能链智电云快充','021-8542132','上海市浦东新区世纪广场','3','1',0);

/*Table structure for table `charging_pile_info` */

DROP TABLE IF EXISTS `charging_pile_info`;

CREATE TABLE `charging_pile_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `pile_number` char(10) NOT NULL COMMENT '桩编号',
  `pile_name` varchar(10) DEFAULT NULL COMMENT '桩名称',
  `gun_infos` varchar(10) DEFAULT NULL COMMENT '枪编号[]',
  `power` decimal(9,4) DEFAULT NULL COMMENT '额定总功率',
  `pile_type` tinyint(1) DEFAULT NULL COMMENT '设备类型(直/交流、交直一体、其它)',
  `pile_model` tinyint(1) DEFAULT NULL COMMENT '设备型号',
  `protocol` tinyint(1) DEFAULT NULL COMMENT '协议',
  `network` tinyint(1) DEFAULT NULL COMMENT '网络',
  `pile_lng` decimal(12,6) DEFAULT NULL COMMENT '经度',
  `pile_lat` decimal(12,6) DEFAULT NULL COMMENT '纬度',
  `station_id` int(10) DEFAULT NULL COMMENT '场站ID',
  `create_time` datetime DEFAULT NULL COMMENT '建档时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;

/*Data for the table `charging_pile_info` */

insert  into `charging_pile_info`(`id`,`pile_number`,`pile_name`,`gun_infos`,`power`,`pile_type`,`pile_model`,`protocol`,`network`,`pile_lng`,`pile_lat`,`station_id`,`create_time`) values (1,'01','特来电充电桩','1','60.0000',1,0,0,0,'116.355636','39.953941',4,'2018-08-09 00:00:00'),(2,'02','特来电充电桩','2','150.0000',1,0,0,0,'116.358102','39.952402',4,'2018-09-10 00:00:00'),(3,'03','特来电充电桩','3','60.0000',2,0,0,0,'116.339283','39.968656',1,'2017-08-09 00:00:00'),(4,'04','特来电充电桩','4','60.0000',2,0,0,0,'116.343601','39.967985',1,'2018-08-12 00:00:00'),(5,'05','特来电充电桩','5','150.0000',2,0,0,0,'116.342095','39.968489',2,'2018-08-15 00:00:00'),(6,'06','星星充电','1','60.0000',2,0,0,0,'116.355988','39.954361',2,'2018-08-09 00:00:00'),(7,'07','星星充电','2','60.0000',1,0,0,0,'116.404317','39.989974',3,'2018-08-09 00:00:00'),(8,'08','星星充电','3','150.0000',2,0,0,0,'116.401988','39.966458',3,'2018-08-09 00:00:00'),(9,'09','星星充电','4','70.0000',2,0,0,0,'116.363514','39.959671',4,'2018-08-09 00:00:00'),(13,'10','特来电充电桩','6','60.0000',1,0,0,0,'116.388399','39.906451',5,'2018-08-09 00:00:00'),(14,'11','特来电充电桩','7','150.0000',2,0,0,0,'116.391037','39.906495',5,'2018-08-09 00:00:00'),(15,'12','星星充电','5','60.0000',1,0,0,0,'116.380800','39.907755',5,'2018-08-09 00:00:00'),(16,'13','星星充电','6','150.0000',2,0,0,0,'116.377819','39.908148',5,'2018-08-09 00:00:00');

/*Table structure for table `charging_station` */

DROP TABLE IF EXISTS `charging_station`;

CREATE TABLE `charging_station` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主ID',
  `station_code` char(10) NOT NULL COMMENT '站场编码',
  `station_name` varchar(10) DEFAULT NULL COMMENT '场站名称',
  `device_number` int(10) DEFAULT NULL COMMENT '充电桩数',
  `ac_gun_number` int(5) DEFAULT NULL COMMENT '交流充电枪数',
  `dc_gun_number` int(5) DEFAULT NULL COMMENT '直流充电枪数',
  `ac_rate_power` int(5) DEFAULT NULL COMMENT '交流额定功率',
  `dc_rate_power` int(5) DEFAULT NULL COMMENT '直流额定功率',
  `province` varchar(8) DEFAULT NULL COMMENT '省份编码',
  `city` varchar(8) DEFAULT NULL COMMENT '城市编码',
  `address` varchar(50) DEFAULT NULL COMMENT '详细地址',
  `station_lng` decimal(12,6) DEFAULT NULL COMMENT '经度',
  `station_lat` decimal(12,6) DEFAULT NULL COMMENT '纬度',
  `device_power` int(10) DEFAULT NULL COMMENT '设备功率',
  `station_model` tinyint(1) DEFAULT NULL COMMENT '场站模式（1自营、2联营、3专用）',
  `station_status` tinyint(1) DEFAULT NULL COMMENT '场站状态',
  `station_type` tinyint(1) DEFAULT NULL COMMENT '场站类型（公共、个人、专用、其它）',
  `station_modified` datetime DEFAULT NULL COMMENT '记录调整时间',
  `station_create` datetime DEFAULT NULL COMMENT '记录创建时间',
  `operator_id` int(10) DEFAULT NULL COMMENT '运营商ID',
  `park_fee` decimal(10,0) DEFAULT NULL COMMENT '停车费',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

/*Data for the table `charging_station` */

insert  into `charging_station`(`id`,`station_code`,`station_name`,`device_number`,`ac_gun_number`,`dc_gun_number`,`ac_rate_power`,`dc_rate_power`,`province`,`city`,`address`,`station_lng`,`station_lat`,`device_power`,`station_model`,`station_status`,`station_type`,`station_modified`,`station_create`,`operator_id`,`park_fee`) values (1,'001','方恒时尚中心充电站',2,2,2,70,60,'01010000','01010000','北京市海淀区北三环西辅路方恒时尚中心方恒','116.342130','39.968092',150,3,0,1,'2018-08-09 00:00:00','2018-08-09 00:00:00',1,'3'),(2,'002','双安商场充电站',1,1,1,70,60,'01010000','01010000','北京市海淀区北三环西路辅路双安商场','116.325106','39.966458',150,1,0,1,'2018-08-09 00:00:00','2018-08-09 00:00:00',1,'3'),(3,'003','北京国际会议中心站',2,2,2,70,60,'01010000','01010000','北京市朝阳区北辰东路北京国际会议中心','116.401502','39.988949',150,1,0,1,'2018-08-09 00:00:00','2018-08-09 00:00:00',2,'2'),(4,'004','枫蓝国际充电站',2,2,2,70,60,'01010000','01010000','北京市海淀区西直门北大街枫蓝国际购物中心','116.355631','39.953957',150,2,0,1,'2018-08-09 00:00:00','2018-08-09 00:00:00',2,'2'),(5,'005','国家大剧院站',2,2,2,70,60,'01010000','01010000','北京市西城区石碑胡同4号国家大剧院','116.388379','39.906445',150,2,0,1,'2022-01-06 00:00:00','2022-01-06 00:00:00',1,'3'),(6,'006','中共中央宣传部',2,2,2,70,60,'01010000','01010000','北京市西城区西长安街7号','116.380812','39.907765',150,2,0,1,'2022-01-06 00:00:00','2022-01-06 00:00:00',1,'3');

/*Table structure for table `charging_user_info` */

DROP TABLE IF EXISTS `charging_user_info`;

CREATE TABLE `charging_user_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(5) DEFAULT NULL COMMENT '用户姓名',
  `gender` enum('男','女') DEFAULT NULL COMMENT '性别',
  `age` int(2) DEFAULT NULL COMMENT '年龄',
  `occupation` varchar(10) DEFAULT NULL COMMENT '职业',
  `user_account` varchar(10) DEFAULT NULL COMMENT '登录账号（外键）',
  `pasword` varchar(10) DEFAULT NULL COMMENT '登录密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

/*Data for the table `charging_user_info` */

insert  into `charging_user_info`(`id`,`user_name`,`gender`,`age`,`occupation`,`user_account`,`pasword`) values (1,'admin','男',32,'开发工程师','123456','123456'),(2,'root','女',30,'前端开发工程师','123456','123456');