/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : supplymarketing

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2021-07-20 20:27:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
                         `id` int(4) NOT NULL AUTO_INCREMENT,
                         `username` varchar(20) DEFAULT NULL,
                         `pwd` varchar(20) DEFAULT NULL,
                         `power` varchar(20) DEFAULT NULL,
                         `remark1` varchar(20) DEFAULT NULL,
                         `remark2` varchar(20) DEFAULT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for gd_brand
-- ----------------------------
DROP TABLE IF EXISTS `gd_brand`;
CREATE TABLE `gd_brand` (
                            `brand_id` int(11) NOT NULL AUTO_INCREMENT,
                            `brand_name` varchar(100) DEFAULT NULL COMMENT '品牌名',
                            `brand_url` varchar(100) DEFAULT NULL,
                            `brand_des` text COMMENT '品牌描述',
                            `create_by` int(11) DEFAULT NULL COMMENT '创建者',
                            `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                            `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                            `remark1` varchar(50) DEFAULT NULL COMMENT '预留字段1',
                            `remark2` varchar(20) DEFAULT NULL COMMENT '预留字段2',
                            PRIMARY KEY (`brand_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gd_brand
-- ----------------------------
INSERT INTO `gd_brand` VALUES ('1', '三星', 'http://localhost:9000/swagger-ui.html#/', 'test', null, null, '2021-07-12 18:59:43', '2021-07-12 18:59:47', '', '');
INSERT INTO `gd_brand` VALUES ('2', '酷派', 'http://localhost:9000/swagger-ui.html#/', 'tetetetet', null, null, '2021-07-12 22:23:16', '2021-07-12 22:23:19', '', '');
INSERT INTO `gd_brand` VALUES ('3', '摩托罗拉', 'http://localhost:9000/swagger-ui.html#/', null, null, null, '2021-07-12 22:23:27', '2021-07-12 22:23:29', '', '');
INSERT INTO `gd_brand` VALUES ('4', '海信', 'http://localhost:9000/swagger-ui.html#/', null, null, null, '2021-07-12 22:23:48', '2021-07-12 22:23:51', '', '');
INSERT INTO `gd_brand` VALUES ('5', 'LG', 'http://localhost:9000/swagger-ui.html#/', 'string', '0', 'string', '2021-07-13 23:31:02', '2021-07-13 23:31:12', '', '');
INSERT INTO `gd_brand` VALUES ('6', '洛基亚', 'http://localhost:9000/swagger-ui.html#/', null, null, null, '2021-07-12 22:24:09', '2021-07-12 22:24:11', '', '');
INSERT INTO `gd_brand` VALUES ('7', '天宇', 'http://localhost:9000/swagger-ui.html#/', null, null, null, '2021-07-13 16:50:08', '2021-07-13 16:50:11', null, null);
INSERT INTO `gd_brand` VALUES ('8', '华为', 'https://www.baidu.com', null, null, null, null, null, null, null);
INSERT INTO `gd_brand` VALUES ('9', '中兴', 'www.baidu.com', 'asdwerwerwer', null, null, null, null, null, null);
INSERT INTO `gd_brand` VALUES ('10', '飞利浦', '123', '123', null, null, '2021-07-14 16:49:06', null, null, null);

-- ----------------------------
-- Table structure for gd_classify
-- ----------------------------
DROP TABLE IF EXISTS `gd_classify`;
CREATE TABLE `gd_classify` (
                               `classify_id` int(11) NOT NULL AUTO_INCREMENT,
                               `classify_name` varchar(50) DEFAULT NULL COMMENT '商品类型名称',
                               `classify_des` text COMMENT '品牌类型描述',
                               `classify_isparent` int(11) DEFAULT NULL COMMENT 'parentId  0-父类 其他-子类 ',
                               `create_by` int(11) DEFAULT NULL COMMENT '创建者',
                               `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                               `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                               `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                               `remark1` varchar(50) DEFAULT NULL COMMENT '预留字段1 标记分类类别',
                               `remark2` varchar(20) DEFAULT NULL COMMENT '预留字段2',
                               PRIMARY KEY (`classify_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gd_classify
-- ----------------------------
INSERT INTO `gd_classify` VALUES ('1', '手机', null, '0', null, null, null, null, '0', '手机一类目录');
INSERT INTO `gd_classify` VALUES ('2', '手机配件配饰', null, '0', null, null, null, null, '0', '手机配件一类目录');
INSERT INTO `gd_classify` VALUES ('3', '3G手机', null, '1', null, null, null, null, '1', '二类目录');
INSERT INTO `gd_classify` VALUES ('4', '双网双待手机', null, '1', null, null, null, null, '1', '二类目录');
INSERT INTO `gd_classify` VALUES ('5', '手机配件', null, '2', null, null, null, null, '1', '二类目录');
INSERT INTO `gd_classify` VALUES ('6', '手机配饰', null, '2', null, null, null, null, '1', '二类目录');
INSERT INTO `gd_classify` VALUES ('7', '直板', null, '3', null, null, null, null, '2', '三类目录');
INSERT INTO `gd_classify` VALUES ('8', '滑盖', null, '3', null, null, null, null, '2', '三类目录');
INSERT INTO `gd_classify` VALUES ('9', '翻盖', null, '3', null, null, null, null, '2', '三类目录');
INSERT INTO `gd_classify` VALUES ('10', '直板', null, '4', null, null, null, null, '2', '三类目录');
INSERT INTO `gd_classify` VALUES ('11', '滑盖', null, '4', null, null, null, null, '2', '三类目录');
INSERT INTO `gd_classify` VALUES ('12', '翻盖', null, '4', null, null, null, null, '2', '三类目录');
INSERT INTO `gd_classify` VALUES ('15', '电池', null, '5', null, null, null, null, '2', '三类目录');

-- ----------------------------
-- Table structure for gd_gift2good
-- ----------------------------
DROP TABLE IF EXISTS `gd_gift2good`;
CREATE TABLE `gd_gift2good` (
                                `remark_1` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键id',
                                `gift_id` int(11) DEFAULT NULL COMMENT '赠品ID',
                                `gift_switch_putwarehouse` varchar(50) DEFAULT NULL COMMENT '入库数量',
                                `gift_swich_typrice` varchar(50) DEFAULT NULL COMMENT '调整后的价格',
                                `gift_approvaid` int(11) DEFAULT NULL COMMENT '审核表id',
                                `create_by` int(11) DEFAULT NULL COMMENT '创建者',
                                `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                                `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                `remark_2` varchar(20) DEFAULT NULL COMMENT '预留字段2',
                                PRIMARY KEY (`remark_1`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gd_gift2good
-- ----------------------------
INSERT INTO `gd_gift2good` VALUES ('1', '1', '1', '100111', '1', null, null, null, null, null);
INSERT INTO `gd_gift2good` VALUES ('30', '2', '1', '1', '2', null, null, null, null, null);
INSERT INTO `gd_gift2good` VALUES ('31', '2', '1', '1', '2', null, null, null, null, null);
INSERT INTO `gd_gift2good` VALUES ('32', '3', '1', '1', '3', null, null, null, null, null);
INSERT INTO `gd_gift2good` VALUES ('33', '9', '1', '1', '9', null, null, null, null, null);
INSERT INTO `gd_gift2good` VALUES ('34', '11', '1', '1', '11', null, null, null, null, null);
INSERT INTO `gd_gift2good` VALUES ('35', '2', '111', '1', '2', null, null, null, null, null);

-- ----------------------------
-- Table structure for gd_good2gift
-- ----------------------------
DROP TABLE IF EXISTS `gd_good2gift`;
CREATE TABLE `gd_good2gift` (
                                `id` int(11) NOT NULL AUTO_INCREMENT,
                                `good_id` int(11) DEFAULT NULL COMMENT '商品Id',
                                `good_inventory_quantity` int(11) DEFAULT NULL COMMENT '入库数量',
                                `approval_user_id` int(11) DEFAULT NULL COMMENT '审批人id',
                                `approval_user_name` varchar(50) DEFAULT NULL COMMENT '审批人姓名',
                                `approval_time` datetime DEFAULT NULL,
                                `approval_status` int(11) DEFAULT NULL COMMENT '审核状态  0-未审核 1-已审核 2-审核未通过',
                                `approval_comment` text COMMENT '审核评语',
                                `create_by` int(11) DEFAULT NULL COMMENT '创建者',
                                `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                                `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                `remark1` varchar(50) DEFAULT NULL COMMENT '预留字段1 赠品状态 1-有效  0-无效 ',
                                `remark2` varchar(20) DEFAULT NULL COMMENT '预留字段2',
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gd_good2gift
-- ----------------------------
INSERT INTO `gd_good2gift` VALUES ('6', '15', '10', null, null, null, '1', null, null, null, null, null, null, null);
INSERT INTO `gd_good2gift` VALUES ('7', '12', '1', null, null, null, '0', null, null, null, null, null, null, null);
INSERT INTO `gd_good2gift` VALUES ('8', '5', '3', null, null, null, '0', null, null, null, null, null, null, null);
INSERT INTO `gd_good2gift` VALUES ('9', '5', '4', null, null, null, '0', null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for gd_goods
-- ----------------------------
DROP TABLE IF EXISTS `gd_goods`;
CREATE TABLE `gd_goods` (
                            `goods_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品管理',
                            `goods_name` varchar(50) DEFAULT NULL COMMENT '商品名称',
                            `goods_encode` varchar(50) DEFAULT NULL COMMENT '存货档案编码',
                            `goods_category` varchar(50) DEFAULT NULL COMMENT '分类',
                            `goods_model` varchar(50) DEFAULT NULL COMMENT '型号  ALFA D81',
                            `goods_brand` varchar(50) DEFAULT NULL COMMENT '品牌',
                            `goods_color` varchar(50) DEFAULT NULL COMMENT '颜色',
                            `goods_classify` varchar(50) DEFAULT NULL COMMENT '分类',
                            `goods_buytype` varchar(50) DEFAULT NULL COMMENT '采购模式',
                            `goods_distribution` varchar(50) DEFAULT NULL COMMENT '铺货 1-铺货 0-非铺货',
                            `goods_standby` varchar(50) DEFAULT NULL COMMENT '备机 1-备机 0-非备机',
                            `goods_marketprice` varchar(100) DEFAULT NULL COMMENT '市场价',
                            `goods_shoprice` varchar(100) DEFAULT NULL COMMENT '商场价',
                            `goods_type` varchar(50) DEFAULT NULL COMMENT '型号 1X手机-翻盖',
                            `goods_lowstock` int(11) DEFAULT NULL COMMENT '最低库存量',
                            `goods_isbuy` int(11) DEFAULT NULL COMMENT '是否可采购 1-可采购 0-不可采购',
                            `create_by` int(11) DEFAULT NULL COMMENT '创建者',
                            `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                            `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                            `remark1` varchar(50) DEFAULT NULL COMMENT '预留字段1 业务模式',
                            `remark2` varchar(20) DEFAULT NULL COMMENT '预留字段2',
                            PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gd_goods
-- ----------------------------
INSERT INTO `gd_goods` VALUES ('2', 'ALFA D81 白色', '13001091298606000100001009', '3G手机-翻盖', '222', '1', '白色', '3', null, null, null, '1000', '900', 'ALFA D81', '10', '1', null, null, null, null, null, null);
INSERT INTO `gd_goods` VALUES ('3', 'ALFA D81 黑色', '13001091298606000100001010', '3G手机-翻盖', null, '1', '黑色', '3', null, null, null, '1000', '900', 'ALFA D81', '5', '1', null, null, null, null, null, null);
INSERT INTO `gd_goods` VALUES ('4', 'ALFA D81 珍珠白', '13001091298606000100001011', '3G手机-翻盖', null, '1', '珍珠白', '3', null, null, null, '1000', '900', 'ALFA D81', '5', '0', null, null, null, null, null, null);
INSERT INTO `gd_goods` VALUES ('5', 'ALFA D81 绚丽紫', '13001091298606000100001012', '3G手机-翻盖', null, '1', '绚丽紫', '3', null, null, null, '1000', '900', 'ALFA D81', '5', '0', null, null, null, null, null, null);
INSERT INTO `gd_goods` VALUES ('12', 'Test  One', '13001091298606000100001002', 'Test classify', null, '3', '珍珠白', '4', null, null, null, '2345', '2222', 'ALFA D81', '2', '1', null, null, null, null, null, null);
INSERT INTO `gd_goods` VALUES ('15', 'Ts-黑色', '1626357405148d09c5a839f3e', 'Test', null, '3', '黑色', '6', null, null, null, '45', '14', 'TS', '20', '1', null, null, null, null, null, null);
INSERT INTO `gd_goods` VALUES ('16', null, '13001091298606000100001001', null, null, '2', '黑色', '3', null, null, null, '12', '12', 'ALFA D81', null, '0', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for gd_imei
-- ----------------------------
DROP TABLE IF EXISTS `gd_imei`;
CREATE TABLE `gd_imei` (
                           `IMEI_id` int(11) NOT NULL AUTO_INCREMENT,
                           `IMEI_number` int(11) DEFAULT NULL COMMENT '串码',
                           `IMEI_status` int(11) DEFAULT NULL COMMENT '状态  0- 已销售 1-未销售',
                           `gdgt_id` int(11) DEFAULT NULL COMMENT '商品或赠品的id',
                           `flag` int(11) DEFAULT NULL COMMENT '1-赠品 0-商品',
                           `create_by` int(11) DEFAULT NULL COMMENT '创建者',
                           `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                           `create_time` datetime NOT NULL COMMENT '创建时间',
                           `update_time` datetime NOT NULL COMMENT '更新时间',
                           `remark_1` varchar(50) DEFAULT NULL COMMENT '预留字段1',
                           `remark_2` varchar(20) DEFAULT NULL COMMENT '预留字段2',
                           PRIMARY KEY (`IMEI_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gd_imei
-- ----------------------------
INSERT INTO `gd_imei` VALUES ('1', '1231231412', '1', '1', '1', '1', '1', '2021-07-12 21:48:38', '2021-07-12 21:48:40', null, null);
INSERT INTO `gd_imei` VALUES ('2', '9999', '1', '2', '0', '2', '2', '2021-07-16 19:30:49', '2021-07-16 19:30:53', null, null);

-- ----------------------------
-- Table structure for gd_product
-- ----------------------------
DROP TABLE IF EXISTS `gd_product`;
CREATE TABLE `gd_product` (
                              `product_id` int(11) NOT NULL AUTO_INCREMENT,
                              `product_encode` varchar(50) NOT NULL COMMENT '产品编码（存货档案编码）',
                              `product_brand` varchar(50) DEFAULT NULL COMMENT '品牌',
                              `product_type` varchar(50) DEFAULT NULL COMMENT '型号',
                              `product_businessmode` varchar(100) DEFAULT NULL COMMENT '业务模式',
                              `product_color` varchar(50) DEFAULT NULL COMMENT '颜色',
                              `product_classify` varchar(50) DEFAULT NULL COMMENT '分类',
                              `create_by` int(11) DEFAULT NULL COMMENT '创建者',
                              `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                              `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                              `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                              `remark1` varchar(50) DEFAULT NULL COMMENT '预留字段1',
                              `remark2` varchar(20) DEFAULT NULL COMMENT '预留字段2',
                              PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gd_product
-- ----------------------------
INSERT INTO `gd_product` VALUES ('1', '13001091298606000100001000', '1', 'ALE', null, '白色', '3', null, null, null, null, null, null);
INSERT INTO `gd_product` VALUES ('2', '13001091298606000100001001', '2', 'ALFA D81', null, '黑色', '3', null, null, null, null, null, null);
INSERT INTO `gd_product` VALUES ('3', '13001091298606000100001002', '3', 'ALFA D81', null, '珍珠白', '4', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for gt_adjust
-- ----------------------------
DROP TABLE IF EXISTS `gt_adjust`;
CREATE TABLE `gt_adjust` (
                             `adjust_id` int(11) NOT NULL AUTO_INCREMENT,
                             `adjust_goodid` int(11) DEFAULT NULL COMMENT '商品id',
                             `adjust_mk_adjustpricetype` int(11) DEFAULT NULL COMMENT '百分比,绝对值',
                             `adjust_mk_adjustnum` double DEFAULT NULL COMMENT '调价的数字',
                             `adjust_mk_proprice` double DEFAULT NULL COMMENT '市场促销价',
                             `adjust_shop_adjustpricetype` int(11) DEFAULT NULL COMMENT '百分比,绝对值',
                             `adjust_shop_adjustnum` double DEFAULT NULL COMMENT '调价的数字',
                             `adjust_shop_proprice` double DEFAULT NULL COMMENT '市场促销价',
                             `start_time` datetime DEFAULT NULL COMMENT '开始时间',
                             `end_time` datetime DEFAULT NULL COMMENT '结束时间',
                             `reason` varchar(200) DEFAULT NULL COMMENT '调价原因',
                             `COMMENT` varchar(200) DEFAULT NULL COMMENT '备注',
                             `adjust_approvaid` int(11) DEFAULT NULL COMMENT 'approval表id',
                             `create_by` int(11) DEFAULT NULL COMMENT '创建者',
                             `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                             `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                             `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                             `remark_1` varchar(50) DEFAULT NULL COMMENT '预留字段1',
                             `remark_2` varchar(20) DEFAULT NULL COMMENT '预留字段2',
                             PRIMARY KEY (`adjust_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gt_adjust
-- ----------------------------
INSERT INTO `gt_adjust` VALUES ('2', '2', '1', '10', '900', '1', '9', '800', '2021-07-06 16:00:00', '2021-08-10 16:00:00', '滞销 ', null, '3', null, null, null, null, null, null);
INSERT INTO `gt_adjust` VALUES ('3', '3', '1', '10', '900', null, '8', '800', '2021-07-26 16:00:00', '2021-08-24 16:00:00', '滞销', null, '4', null, null, null, null, null, null);
INSERT INTO `gt_adjust` VALUES ('4', '4', null, '1', '123', null, '1', '123', '2021-07-16 16:00:00', '2021-08-10 16:00:00', 'asd', null, '5', null, null, null, null, null, null);
INSERT INTO `gt_adjust` VALUES ('5', '2', '1', null, '123', '1', null, '123', '2021-07-03 16:00:00', '2021-08-09 16:00:00', '123', null, '14', null, null, null, null, null, null);
INSERT INTO `gt_adjust` VALUES ('6', '2', '2', '50', '500', '2', '50', '450', '2021-07-27 16:00:00', '2021-08-23 16:00:00', 'asd', null, '26', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for gt_approval
-- ----------------------------
DROP TABLE IF EXISTS `gt_approval`;
CREATE TABLE `gt_approval` (
                               `approval_id` int(11) NOT NULL,
                               `approval_user_id` int(11) DEFAULT NULL COMMENT '审批人id',
                               `approval_user_name` varchar(255) DEFAULT NULL COMMENT '审批人姓名',
                               `approval_time` datetime DEFAULT NULL,
                               `approval_status` int(11) DEFAULT NULL COMMENT '审核状态 1-通过 0 - 未通过',
                               `approval_comment` text COMMENT '审核评语',
                               `create_by` int(11) DEFAULT NULL COMMENT '创建者',
                               `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                               `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                               `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                               `remark_1` varchar(50) DEFAULT NULL COMMENT '预留字段1',
                               `remark_2` varchar(20) DEFAULT NULL COMMENT '预留字段2',
                               PRIMARY KEY (`approval_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gt_approval
-- ----------------------------
INSERT INTO `gt_approval` VALUES ('1', null, null, null, '1', null, null, null, null, null, null, null);
INSERT INTO `gt_approval` VALUES ('30', null, null, null, '0', null, null, null, null, null, null, null);
INSERT INTO `gt_approval` VALUES ('31', null, null, null, '0', null, null, null, null, null, null, null);
INSERT INTO `gt_approval` VALUES ('32', null, null, null, '0', null, null, null, null, null, null, null);
INSERT INTO `gt_approval` VALUES ('33', null, null, null, '0', null, null, null, null, null, null, null);
INSERT INTO `gt_approval` VALUES ('34', null, null, null, '0', null, null, null, null, null, null, null);
INSERT INTO `gt_approval` VALUES ('35', null, null, null, '0', null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for gt_gift
-- ----------------------------
DROP TABLE IF EXISTS `gt_gift`;
CREATE TABLE `gt_gift` (
                           `gift_id` int(11) NOT NULL AUTO_INCREMENT,
                           `gift_name` varchar(100) DEFAULT NULL COMMENT '赠品名称',
                           `gift_model` varchar(50) DEFAULT NULL COMMENT '赠品型号 ',
                           `gift_classify` varchar(100) DEFAULT NULL COMMENT '赠品类型',
                           `gift_lowstock` int(11) DEFAULT NULL COMMENT '最低库存量',
                           `gift_price` int(11) DEFAULT NULL COMMENT '赠品单价',
                           `gift_cost` int(11) DEFAULT NULL COMMENT '赠品成本',
                           `gift_status` int(11) DEFAULT NULL COMMENT '赠品状态 1-有效  0-无效 ',
                           `gift_brand` varchar(10) DEFAULT NULL COMMENT '赠品品牌',
                           `gift_color` varchar(10) DEFAULT NULL COMMENT '赠品颜色',
                           `create_by` int(11) DEFAULT NULL COMMENT '创建者',
                           `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                           `create_time` datetime NOT NULL COMMENT '创建时间',
                           `update_time` datetime NOT NULL COMMENT '更新时间',
                           `remark_1` varchar(50) DEFAULT NULL COMMENT '预留字段1',
                           `remark_2` varchar(20) DEFAULT NULL COMMENT '预留字段2',
                           PRIMARY KEY (`gift_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gt_gift
-- ----------------------------
INSERT INTO `gt_gift` VALUES ('1', 'test31', '测试模型', '测试产品类型', '12', '12', '12', '1', '测试品牌', '珍珠白', '12', 'asd', '2021-07-12 19:43:15', '2021-07-12 19:43:17', '', '');
INSERT INTO `gt_gift` VALUES ('2', '赠品测试12', '型号1', '赠品类型1', '100', '1', '1', '1', '测试品牌1', '红色', '1', null, '2021-07-12 21:06:28', '2021-07-12 21:06:28', null, null);
INSERT INTO `gt_gift` VALUES ('3', '赠品测试2', '型号1', '赠品类型2', '100', '1', '1', '1', '测试品牌2', '黄色', '1', null, '2021-07-12 21:06:58', '2021-07-12 21:06:58', null, null);
INSERT INTO `gt_gift` VALUES ('4', '赠品测试3', '型号1', '赠品类型2', '100', '1', '1', '1', '测试品牌3', '蓝色', '1', null, '2021-07-12 21:07:02', '2021-07-12 21:07:02', null, null);
INSERT INTO `gt_gift` VALUES ('5', '赠品测试4', '型号1', '赠品类型2', '100', '1', '1', '1', '测试品牌4', '绿色', '1', null, '2021-07-12 21:07:04', '2021-07-12 21:07:04', null, null);
INSERT INTO `gt_gift` VALUES ('6', '赠品测试5', '型号1', '赠品类型2', '100', '1', '1', '1', '测试品牌5', '土豪金', '1', null, '2021-07-12 21:16:20', '2021-07-12 21:16:20', null, null);
INSERT INTO `gt_gift` VALUES ('7', '赠品测试6', '型号1', '赠品类型2', '100', '1', '1', '1', '测试品牌6', '少女粉', '1', null, '2021-07-12 21:16:24', '2021-07-12 21:16:24', null, null);
INSERT INTO `gt_gift` VALUES ('8', '赠品测试7', '型号1', '赠品类型2', '100', '1', '1', '1', '测试品牌7', '青春蓝', '1', null, '2021-07-12 21:16:26', '2021-07-12 21:16:26', null, null);
INSERT INTO `gt_gift` VALUES ('9', '赠品测试8', '型号1', '赠品类型2', '100', '1', '1', '1', '测试品牌8', '红色', '1', null, '2021-07-12 21:16:29', '2021-07-12 21:16:29', null, null);
INSERT INTO `gt_gift` VALUES ('10', '赠品测试9', '型号1', '赠品类型2', '100', '1', '1', '1', '测试品牌9', '粉色', '1', null, '2021-07-12 21:16:32', '2021-07-12 21:16:32', null, null);
INSERT INTO `gt_gift` VALUES ('11', '赠品测试10', '型号1', '赠品类型2', '100', '1', '1', '1', '测试品牌10', '红色', '1', null, '2021-07-12 21:16:35', '2021-07-12 21:16:35', null, null);

-- ----------------------------
-- Table structure for gt_promote
-- ----------------------------
DROP TABLE IF EXISTS `gt_promote`;
CREATE TABLE `gt_promote` (
                              `promote_id` int(11) NOT NULL AUTO_INCREMENT,
                              `promote_startime` date DEFAULT NULL COMMENT '活动开始时间  ',
                              `promote_endtime` date DEFAULT NULL COMMENT '活动结束时间 ',
                              `promote_name` varchar(50) DEFAULT NULL COMMENT '活动名称',
                              `promote_type` varchar(50) DEFAULT NULL COMMENT '促销类型 ',
                              `promote_goodid` int(11) DEFAULT NULL COMMENT '促销商品id',
                              `promote_mk_adjustpricetype` int(11) DEFAULT NULL COMMENT '百分比,绝对值',
                              `promote_mk_adjustnum` varchar(50) DEFAULT NULL COMMENT '调价的数字',
                              `promote_mk_proprice` varchar(50) DEFAULT NULL COMMENT '市场促销价',
                              `promote_shop_adjustpricetype` int(11) DEFAULT NULL COMMENT '百分比,绝对值',
                              `promote_shop_adjustnum` varchar(50) DEFAULT NULL COMMENT '调价的数字',
                              `promote_shop_proprice` varchar(50) DEFAULT NULL COMMENT '市场促销价',
                              `promote_pricestartime` date DEFAULT NULL COMMENT '希望价格生效时间',
                              `promote_pricendtime` date DEFAULT NULL COMMENT '希望价格失效时间  ',
                              `promote_reason` varchar(255) DEFAULT NULL COMMENT '活动情况或原因',
                              `promote_file` varchar(50) DEFAULT NULL COMMENT '活动策划问价',
                              `promote_comment` varchar(50) DEFAULT NULL COMMENT '备注  ',
                              `promote_approvaid` int(11) DEFAULT NULL COMMENT '审批',
                              `create_by` int(11) DEFAULT NULL COMMENT '创建者',
                              `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                              `create_time` date DEFAULT NULL COMMENT '创建时间',
                              `update_time` date DEFAULT NULL COMMENT '更新时间',
                              `remark_1` varchar(50) DEFAULT NULL COMMENT '预留字段1',
                              `remark_2` varchar(20) DEFAULT NULL COMMENT '预留字段2',
                              PRIMARY KEY (`promote_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gt_promote
-- ----------------------------
INSERT INTO `gt_promote` VALUES ('1', '2021-07-16', '2021-07-08', '促销测试', '1', '2', '1', '1', '1', '1', '1', '100', '2021-07-16', '2021-07-01', '1', '1', '11111', '1', null, null, null, null, '1', null);
INSERT INTO `gt_promote` VALUES ('2', '2021-07-16', null, '促销测试2', null, '3', null, null, null, null, null, '111', '2021-07-16', null, null, null, null, '2', null, null, null, null, '1', null);
INSERT INTO `gt_promote` VALUES ('3', '2021-07-15', '2021-06-30', '测试yyy', '测试yyy', null, '2', '50', '123', '2', '50', '123', '2021-07-17', '2021-07-24', '测试yyy', '测试yyy', '测试yyy', '21', null, null, null, null, '`', null);
INSERT INTO `gt_promote` VALUES ('4', '2021-07-09', '2021-07-23', '测试yyyy', '测试yyyy', '2', '2', '50', '1', '2', '50', '1', '2021-07-17', '2021-07-16', '测试yyyy', '测试yyyy', '测试yyyy', '22', null, null, null, null, null, null);
INSERT INTO `gt_promote` VALUES ('5', '2021-06-30', '2021-07-14', '测试数据yyy', '测试数据yyy', '2', '2', '50', '1', '2', '50', '1', '2021-06-29', '2021-07-27', '测试数据yyy', '测试数据yyy', '测试数据yyy', '23', null, null, null, null, null, null);
INSERT INTO `gt_promote` VALUES ('6', '2021-06-29', '2021-07-06', '11', '11', '2', '2', '50', '1', '2', '60', '1', '2021-07-07', '2021-07-14', '1', '1', '1', '24', null, null, null, null, null, null);
INSERT INTO `gt_promote` VALUES ('7', '2021-07-06', '2021-07-16', '测试yyy1', '测试yyy1', '3', '2', '50', '1', null, '50', '1', '2021-06-29', '2021-07-20', '测试yyy1', '测试yyy1', '测试yyy1', '25', null, null, null, null, '1', null);
INSERT INTO `gt_promote` VALUES ('8', '2021-07-08', '2021-07-07', '11', '11', '2', '1', '15', null, null, null, null, '2021-07-12', null, null, null, null, '27', null, null, null, null, '10', null);
INSERT INTO `gt_promote` VALUES ('9', null, null, null, null, '2', null, null, null, null, null, null, null, null, null, null, null, '28', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for promote_approval
-- ----------------------------
DROP TABLE IF EXISTS `promote_approval`;
CREATE TABLE `promote_approval` (
                                    `approval_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '审批表ID',
                                    `approval_user_id` int(11) DEFAULT NULL COMMENT '审批人id',
                                    `approval_user_name` varchar(255) DEFAULT NULL COMMENT '审批人姓名',
                                    `approval_time` datetime DEFAULT NULL,
                                    `approval_status` int(11) DEFAULT NULL COMMENT '审核状态 1-通过 0 - 未通过',
                                    `approval_comment` text COMMENT '审核评语',
                                    `approval_level` varchar(50) DEFAULT NULL COMMENT '审批等级',
                                    `create_by` int(11) DEFAULT NULL COMMENT '创建者',
                                    `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                                    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                    `remark1` varchar(20) DEFAULT NULL COMMENT '预留字段1',
                                    `remark2` varchar(20) DEFAULT NULL COMMENT '预留字段2',
                                    `remark3` varchar(20) DEFAULT NULL COMMENT '预留字段3',
                                    `remark4` varchar(20) DEFAULT NULL COMMENT '预留字段4',
                                    PRIMARY KEY (`approval_id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of promote_approval
-- ----------------------------
INSERT INTO `promote_approval` VALUES ('1', null, null, null, '0', null, '1', null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('2', null, null, null, '0', null, '1', null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('3', null, null, null, '0', null, '1', null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('4', null, null, null, '0', null, '1', null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('5', null, null, null, '1', null, '1', null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('14', null, null, null, '0', null, '2', null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('15', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('16', null, null, null, '0', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('17', null, null, null, '0', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('18', null, null, null, '0', null, '2', null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('19', null, null, null, '0', null, '2', null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('20', null, null, null, '0', null, '2', null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('21', null, null, null, '0', null, '2', null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('22', null, null, null, '0', null, '2', null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('23', null, null, null, '0', null, '2', null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('24', null, null, null, '0', null, '2', null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('25', null, null, null, '0', null, '2', null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('26', null, null, null, '0', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('27', null, null, null, '0', null, '0', null, null, null, null, null, null, null, null);
INSERT INTO `promote_approval` VALUES ('28', null, null, null, '0', null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for sa_order
-- ----------------------------
DROP TABLE IF EXISTS `sa_order`;
CREATE TABLE `sa_order` (
                            `order_id` int(22) NOT NULL COMMENT '订单编号',
                            `order_classify` varchar(50) DEFAULT NULL COMMENT '订单分类B2C',
                            `order_type` varchar(50) DEFAULT NULL COMMENT '订单类型（1电话订单，2网络订单，3其它）',
                            `order_time` datetime DEFAULT NULL COMMENT '下单日期',
                            `order_action` varchar(50) DEFAULT NULL COMMENT '订单动作（1订购、2换购、3支付）',
                            `order_businesstype` varchar(50) DEFAULT NULL COMMENT '业务类型（1普通业务，2号卡套餐）',
                            `product_id` int(20) DEFAULT NULL COMMENT '商品编号',
                            `product_name` varchar(50) DEFAULT NULL COMMENT '商品名称',
                            `product_price` decimal(10,2) DEFAULT NULL,
                            `order_number` int(20) DEFAULT NULL COMMENT '数量',
                            `order_money` decimal(10,2) DEFAULT NULL COMMENT '总金额',
                            `order_status` varchar(50) DEFAULT NULL COMMENT '订单状态（审核通过，已付款，已出库，已发货，已到货，已归档）',
                            `user_id` int(20) DEFAULT NULL COMMENT '会员帐号',
                            `delivery_mode` varchar(50) DEFAULT NULL COMMENT '配送方式（ems，其它）',
                            `delivery_price` decimal(10,2) DEFAULT NULL COMMENT '配送费用',
                            `delivery_area` varchar(50) DEFAULT NULL COMMENT '配送地区',
                            `delivery_username` varchar(50) DEFAULT NULL COMMENT '收货人名称',
                            `delivery_mailcode` int(50) DEFAULT NULL COMMENT '邮政编码',
                            `delivery_address` varchar(50) DEFAULT NULL COMMENT '收货人地址',
                            `user_email` varchar(50) DEFAULT NULL COMMENT '电子邮箱',
                            `user_phone` int(20) DEFAULT NULL COMMENT '联系手机',
                            `order_payment` varchar(50) DEFAULT NULL COMMENT '支付方式（货到付款，款到发货）',
                            `order_tothetime` datetime DEFAULT NULL COMMENT '自提时间',
                            `order_remarks` varchar(50) DEFAULT NULL COMMENT '备注',
                            `order_remitter` varchar(50) DEFAULT NULL COMMENT '汇款人',
                            `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                            `updata_user` varchar(50) DEFAULT NULL COMMENT '修改人',
                            `updata_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                            `remark1` int(20) DEFAULT NULL,
                            `remark2` int(20) DEFAULT NULL,
                            PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sa_order
-- ----------------------------
INSERT INTO `sa_order` VALUES ('1', 'B2C', '电话订单', '2021-06-18 10:32:44', '订购', '普通业务', '2', '小米', '2000.00', '2', '30.00', '已出库', '11', 'ems', '10.00', '湖北襄阳', '小王', '441200', '湖北襄阳', '1312299495@qq.com', '111111', '货到付款', '2021-07-14 10:35:15', '无', '小王', '2021-07-14 10:35:48', '小吴', '2021-07-18 15:32:06', null, null);
INSERT INTO `sa_order` VALUES ('2', 'B2C', '淘宝网店', '2021-07-23 10:32:44', '订购', '号卡套餐', '2', '联想', '3100.00', '2', '30.00', '已出库', '11', 'ems', '10.00', '湖南长沙', '小王', '441200', '湖南长沙', '1312299495@qq.com', '111111', '货到付款', '2021-07-14 10:35:15', '无', '小王', '2021-07-14 10:35:48', '小吴', '2021-07-18 15:32:23', null, null);
INSERT INTO `sa_order` VALUES ('3', 'B2C', '淘宝网店', '2021-07-03 10:32:44', '订购', '普通业务', '2', '联想', '3100.00', '2', '30.00', '已出库', '11', 'ems', '10.00', '湖北襄阳', '小王', '441200', '湖北襄阳', '1312299495@qq.com', '111111', '货到付款', '2021-07-14 10:35:15', '无', '小王', '2021-07-14 10:35:48', '小吴', '2021-07-18 11:16:27', null, null);
INSERT INTO `sa_order` VALUES ('4', 'B2C', '电话订单', '2021-07-01 10:32:44', '订购', '号卡套餐', '2', '华为', '3000.00', '2', '30.00', '已出库', '11', 'ems', '10.00', '湖北襄阳', '小王', '441200', '湖北襄阳', '1312299495@qq.com', '111111', '货到付款', '2021-07-14 10:35:15', '无', '小王', '2021-07-14 10:35:48', '小吴', '2021-07-18 15:44:31', null, null);
INSERT INTO `sa_order` VALUES ('5', 'B2C', '淘宝网店', '2021-07-14 10:32:44', '订购', '普通业务', '2', '小米', '2000.00', '2', '30.00', '待出库', '11', 'ems', '10.00', '湖北襄阳', '小王', '441200', '湖北襄阳', '1312299495@qq.com', '111111', '货到付款', '2021-07-14 10:35:15', '无', '小王', '2021-07-14 10:35:48', '小吴', '2021-07-18 15:33:42', null, null);
INSERT INTO `sa_order` VALUES ('6', 'B2C', '电话订单', '2021-07-14 10:32:44', '订购', '号卡套餐', '2', '华为', '3000.00', '2', '30.00', '待出库', '11', 'ems', '10.00', '湖北襄阳', '小王', '441200', '湖北襄阳', '1312299495@qq.com', '111111', '货到付款', '2021-07-14 10:35:15', '无', '小王', '2021-07-14 10:35:48', '小吴', '2021-07-18 15:33:45', null, null);
INSERT INTO `sa_order` VALUES ('7', 'B2C', '当当网店', '2021-07-14 10:32:44', '订购', '普通业务', '2', '华为', '3000.00', '2', '30.00', '已出库', '11', 'ems', '10.00', '湖北襄阳', '小王', '441200', '湖北襄阳', '1312299495@qq.com', '111111', '货到付款', '2021-07-14 10:35:15', '无', '小王', '2021-07-14 10:35:48', '小吴', '2021-07-18 10:27:11', null, null);

-- ----------------------------
-- Table structure for sa_orderproduct
-- ----------------------------
DROP TABLE IF EXISTS `sa_orderproduct`;
CREATE TABLE `sa_orderproduct` (
                                   `id` int(20) NOT NULL COMMENT '订单商品信息表编号',
                                   `order_id` int(20) DEFAULT NULL COMMENT '订单编号',
                                   `product_id` int(20) DEFAULT NULL COMMENT '商品编号',
                                   `product_name` varchar(50) DEFAULT NULL COMMENT '商品名称',
                                   `product_price` decimal(10,2) DEFAULT NULL,
                                   `order_number` int(20) DEFAULT NULL COMMENT '数量',
                                   `order_supplier_name` varchar(50) DEFAULT NULL COMMENT '供应商名称',
                                   `order_supplier_id` int(20) DEFAULT NULL COMMENT '供应商编号',
                                   `order_imei` int(20) DEFAULT NULL COMMENT '商品串码',
                                   `order_money` decimal(10,2) DEFAULT NULL COMMENT '总金额',
                                   `remark1` int(20) DEFAULT NULL,
                                   `remark2` int(20) DEFAULT NULL,
                                   `order_factoryname` varchar(30) DEFAULT NULL COMMENT '商品生产厂商名',
                                   `order_fatoryid` varchar(30) DEFAULT NULL COMMENT '商品生产厂id',
                                   `order_goodscolor` varchar(30) DEFAULT NULL COMMENT '商品颜色',
                                   `order_goodsbrand` varchar(30) DEFAULT NULL COMMENT '商品品牌',
                                   `order_goodstype` varchar(30) DEFAULT NULL COMMENT '商品类型',
                                   `order_create_by` varchar(30) DEFAULT NULL COMMENT '方案创建人',
                                   `order_create_time` datetime DEFAULT NULL COMMENT '创建日期',
                                   `order_update_by` int(11) DEFAULT NULL COMMENT '修改人',
                                   `order_update_time` datetime DEFAULT NULL COMMENT '修改日期',
                                   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sa_orderproduct
-- ----------------------------
INSERT INTO `sa_orderproduct` VALUES ('1', '1', '17871', '小米', '2000.00', '2', '25', '8', '9', '4000.00', '11', '12', '13', '14', '15', '16', '17', null, '2021-07-07 15:03:08', null, '2021-07-21 15:03:05');
INSERT INTO `sa_orderproduct` VALUES ('2', '1', '22778', '华为', '3500.00', '1', '54', '8', '10', '3500.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-08 23:06:01', null, '2021-06-09 23:05:48');
INSERT INTO `sa_orderproduct` VALUES ('3', '2', '55564', '联想', '3100.00', '3', '50', '8', '11', '9300.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-08 23:06:01', null, '2021-06-09 23:05:48');
INSERT INTO `sa_orderproduct` VALUES ('4', '2', '44654', '小米', '2000.00', '2', '39', '8', '12', '4000.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-08 23:06:01', null, '2021-06-09 23:05:48');
INSERT INTO `sa_orderproduct` VALUES ('5', '3', '66548', '华为', '3500.00', '2', '12', '8', '13', '7000.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-08 23:06:01', null, '2021-06-09 23:05:48');
INSERT INTO `sa_orderproduct` VALUES ('6', '3', '34455', '联想', '3100.00', '2', '48', '8', '14', '6200.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-08 23:06:01', null, '2021-06-09 23:05:48');
INSERT INTO `sa_orderproduct` VALUES ('7', '5', '1555', '小米', '2000.00', '5', '25', '8', '15', '10000.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-01 15:02:57', null, '2021-07-07 15:03:01');
INSERT INTO `sa_orderproduct` VALUES ('8', '11', '22556', '华为', '3500.00', '2', '54', '8', '16', '7000.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-08 23:06:01', null, '2021-06-09 23:05:48');
INSERT INTO `sa_orderproduct` VALUES ('9', '12', '55354', '联想', '3100.00', '3', '50', '8', '17', '9300.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-08 23:06:01', null, '2021-06-09 23:05:48');
INSERT INTO `sa_orderproduct` VALUES ('10', '13', '44', '小米', '2000.00', '3', '39', '8', '18', '6000.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-08 23:06:01', null, '2021-06-09 23:05:48');
INSERT INTO `sa_orderproduct` VALUES ('11', '14', '66', '华为', '3500.00', '2', '12', '8', '19', '7000.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-08 23:06:01', null, '2021-06-09 23:05:48');
INSERT INTO `sa_orderproduct` VALUES ('12', '11', '344', '联想', '3100.00', '3', '48', '8', '20', '9300.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-08 23:06:01', null, '2021-06-09 23:05:48');
INSERT INTO `sa_orderproduct` VALUES ('13', '6', '664556', '华为', '3500.00', '2', '12', '8', '19', '7000.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-08 23:06:01', null, '2021-06-09 23:05:48');
INSERT INTO `sa_orderproduct` VALUES ('14', '6', '66', '小米', '2000.00', '2', '12', '8', '19', '4000.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-08 23:06:01', null, '2021-06-09 23:05:48');
INSERT INTO `sa_orderproduct` VALUES ('15', '7', '66546', '华为', '3500.00', '2', '12', '8', '19', '7000.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-08 23:06:01', null, '2021-06-09 23:05:48');
INSERT INTO `sa_orderproduct` VALUES ('16', '7', '6634', '小米', '2000.00', '2', '12', '8', '19', '4000.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-08 23:06:01', null, '2021-06-09 23:05:48');
INSERT INTO `sa_orderproduct` VALUES ('17', '2', '55545', '华为', '3100.00', '3', '50', '8', '11', '9300.00', '11', '12', '13', '14', '15', '16', '17', '', '2021-07-08 23:06:01', null, '2021-06-09 23:05:48');

-- ----------------------------
-- Table structure for sa_returned
-- ----------------------------
DROP TABLE IF EXISTS `sa_returned`;
CREATE TABLE `sa_returned` (
                               `returned_id` int(20) NOT NULL COMMENT '退货单编号',
                               `order_id` int(22) DEFAULT NULL COMMENT '订单编号',
                               `order_classify` varchar(50) DEFAULT NULL COMMENT '订单分类B2C',
                               `order_type` varchar(50) DEFAULT NULL COMMENT '订单类型（1电话订单，2网络订单，3其它）',
                               `order_time` datetime DEFAULT NULL COMMENT '下单日期',
                               `order_action` varchar(50) DEFAULT NULL COMMENT '订单动作（1订购、2换购、3支付）',
                               `order_businesstype` varchar(50) DEFAULT NULL COMMENT '业务类型（1普通业务，2号卡套餐）',
                               `product_id` int(20) DEFAULT NULL COMMENT '商品编号',
                               `product_name` varchar(50) DEFAULT NULL COMMENT '商品名称',
                               `product_price` decimal(10,2) DEFAULT NULL,
                               `order_number` int(20) DEFAULT NULL COMMENT '数量',
                               `order_money` decimal(10,2) DEFAULT NULL COMMENT '总金额',
                               `order_status` varchar(50) DEFAULT NULL COMMENT '订单状态（审核通过，已付款，已出库，已发货，已到货，已归档）',
                               `user_id` int(20) DEFAULT NULL COMMENT '会员帐号',
                               `delivery_mode` varchar(50) DEFAULT NULL COMMENT '配送方式（ems，其它）',
                               `delivery_price` decimal(10,2) DEFAULT NULL COMMENT '配送费用',
                               `delivery_area` varchar(50) DEFAULT NULL COMMENT '配送地区',
                               `delivery_username` varchar(50) DEFAULT NULL COMMENT '收货人名称',
                               `delivery_mailcode` int(50) DEFAULT NULL COMMENT '邮政编码',
                               `delivery_address` varchar(50) DEFAULT NULL COMMENT '收货人地址',
                               `user_email` varchar(50) DEFAULT NULL COMMENT '电子邮箱',
                               `user_phone` int(20) DEFAULT NULL COMMENT '联系手机',
                               `order_payment` varchar(50) NOT NULL COMMENT '支付方式（货到付款，款到发货）',
                               `order_tothetime` datetime DEFAULT NULL COMMENT '自提时间',
                               `order_remarks` varchar(50) DEFAULT NULL COMMENT '备注',
                               `payment_if` varchar(50) DEFAULT NULL COMMENT '是否付款',
                               `returned_if` varchar(50) DEFAULT NULL COMMENT '是否退货',
                               `order_remitter` varchar(50) DEFAULT NULL COMMENT '汇款人',
                               `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                               `updata_user` varchar(50) DEFAULT NULL COMMENT '修改人',
                               `updata_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                               `remark1` int(20) DEFAULT NULL,
                               `remark2` int(20) DEFAULT NULL,
                               `order_supplier_name` varchar(50) DEFAULT NULL COMMENT '供应商名称',
                               `order_supplier_code` varchar(255) DEFAULT NULL,
                               `order_imei` int(11) DEFAULT NULL,
                               `instore_status` varchar(50) DEFAULT NULL,
                               `reject_cause` varchar(50) DEFAULT NULL COMMENT '拒收原因',
                               `reject_time` datetime DEFAULT NULL COMMENT '拒收时间',
                               `deliver_time` datetime DEFAULT NULL COMMENT '发货时间',
                               `signfo_time` datetime DEFAULT NULL COMMENT '签收时间',
                               `tracking_number` int(20) DEFAULT NULL COMMENT '物流单号',
                               `create_person` varchar(50) DEFAULT NULL COMMENT '创建人',
                               PRIMARY KEY (`returned_id`,`order_payment`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sa_returned
-- ----------------------------
INSERT INTO `sa_returned` VALUES ('1', '11', 'B2C', '电话订单', '2021-07-16 17:06:27', '订购', '普通业务', '1', '可乐', '6.00', '9', '54.00', '已拒收', '1', 'EMS', '1.00', '武汉', '小吴', '110211', '投创大夏', '546465@qq.com', '1771354456', '货到付款1', '2021-07-13 17:09:36', '无', '否', '否', '王宝宝', '2021-07-13 17:10:04', 'xld1', '2021-07-18 10:14:26', null, null, '华东1', '1101', '646416541', '已退货入库', '不想要', '2021-07-15 15:16:47', '2021-06-03 15:16:58', '2021-07-15 15:17:52', '115425544', '小万');
INSERT INTO `sa_returned` VALUES ('2', '12', 'B2C', '电话订单', '2021-07-16 17:06:27', '订购', '普通业务', '1', '爆米花', '10.00', '5', '50.00', '已拒收', '1', 'EMS', '1.00', '武汉', '王强', '110211', '投创大夏', '546465@qq.com', '1771354456', '货到付款1', '2021-07-13 17:09:36', '无', '否', '否', '阿里', '2021-07-13 17:10:04', 'xld1', '2021-07-17 17:10:02', null, null, '华东1', '1101', '646416541', '已退货入库', '未在家', '2021-07-01 15:16:50', '2021-06-03 15:16:54', '2021-07-15 15:17:56', '441244554', '小万');
INSERT INTO `sa_returned` VALUES ('3', '13', 'B2C', '淘宝网店', '2021-07-16 17:06:27', '订购', '普通业务', '1', '奶茶', '13.00', '3', '39.00', '已拒收', '1', 'EMS', '1.00', '武汉', '王强', '110211', '投创大夏', '546465@qq.com', '1771354456', '货到付款1', '2021-07-13 17:09:36', '无', '否', '否', '王强', '2021-07-13 17:10:04', 'xld1', '2021-07-18 10:13:32', null, null, '华东1', '1101', '646416541', '待退货入库', '不想要', '2021-07-23 15:17:42', '2021-06-17 15:17:22', '2021-07-15 15:17:59', '248454554', '小万');
INSERT INTO `sa_returned` VALUES ('4', '14', 'B2C', '电话订单', '2021-07-16 17:06:27', '订购', '普通业务', '1', '鸡腿', '6.00', '2', '12.00', '已拒收', '1', 'EMS', '1.00', '武汉', '小万', '110211', '投创大夏', '546465@qq.com', '1771354456', '货到付款1', '2021-07-13 17:09:36', '无', '否', '否', '七七', '2021-07-13 17:10:04', 'xld1', '2021-07-18 10:14:32', null, null, '华东1', '1101', '646416541', '待退货入库', '不想要', '2021-07-31 15:17:47', '2021-06-10 15:55:27', '2021-07-15 15:18:02', '345341543', '小万');
INSERT INTO `sa_returned` VALUES ('5', '15', 'B2C', '电话订单', '2021-07-16 17:06:27', '订购', '普通业务', '1', '牛肉面', '13.00', '6', '48.00', '已拒收', '1', 'EMS', '1.00', '武汉', '王强', '110211', '投创大夏', '546465@qq.com', '1771354456', '货到付款1', '2021-07-13 17:09:36', '无', '否', '否', '小龙', '2021-07-13 17:10:04', 'xld1', '2021-07-17 17:10:07', null, null, '华东1', '1101', '646416541', '待退货入库', '未在家', '2021-07-03 15:17:49', '2021-06-09 15:17:34', '2021-07-15 15:18:05', '343245342', '小万');
INSERT INTO `sa_returned` VALUES ('6', '17', 'B2C', '淘宝网店', '2021-07-16 17:06:27', '订购', '普通业务', '1', '爆米花', '10.00', '5', '50.00', '已拒收', '1', 'EMS', '1.00', '武汉', '王五', '110211', '投创大夏', '546465@qq.com', '1771354456', '货到付款1', '2021-07-13 17:09:36', '无', '否', '否', '阿里', '2021-07-13 17:10:04', 'xld1', '2021-07-18 10:14:39', null, null, '华东1', '1101', '646416541', '待退货入库', '未在家', '2021-07-01 15:16:50', '2021-06-03 15:16:54', '2021-07-15 15:17:56', '441244554', '小万');
INSERT INTO `sa_returned` VALUES ('7', '16', 'B2C', '电话订单', '2021-07-16 17:06:27', '订购', '普通业务', '1', '奶茶', '13.00', '3', '39.00', '已拒收', '1', 'EMS', '1.00', '武汉', '王强', '110211', '投创大夏', '546465@qq.com', '1771354456', '货到付款1', '2021-07-13 17:09:36', '无', '否', '否', '王强', '2021-07-13 17:10:04', 'xld1', '2021-07-16 15:31:58', null, null, '华东1', '1101', '646416541', '退货已入库', '不想要', '2021-07-23 15:17:42', '2021-06-17 15:17:22', '2021-07-15 15:17:59', '556658450', '小万');
INSERT INTO `sa_returned` VALUES ('8', '18', 'B2C', '电话订单', '2021-07-16 17:06:27', '订购', '普通业务', '1', '鸡腿', '6.00', '2', '12.00', '已拒收', '1', 'EMS', '1.00', '武汉', '李四', '110211', '投创大夏', '546465@qq.com', '1771354456', '货到付款1', '2021-07-13 17:09:36', '无', '否', '否', '七七', '2021-07-13 17:10:04', 'xld1', '2021-07-18 10:14:42', null, null, '华东1', '1101', '646416541', '退货已入库', '不想要', '2021-07-31 15:17:47', '2021-06-10 15:55:27', '2021-07-15 15:18:02', '345341511', '小万');
INSERT INTO `sa_returned` VALUES ('9', '19', 'B2C', '电话订单', '2021-07-16 17:06:27', '订购', '普通业务', '1', '牛肉面', '13.00', '6', '48.00', '已拒收', '1', 'EMS', '1.00', '武汉', '王强', '110211', '投创大夏', '546465@qq.com', '1771354456', '货到付款1', '2021-07-13 17:09:36', '无', '否', '否', '小龙', '2021-07-13 17:10:04', 'xld1', '2021-07-16 15:32:12', null, null, '华东1', '1101', '646416541', '退货已入库', '未在家', '2021-07-03 15:17:49', '2021-06-09 15:17:34', '2021-07-15 15:18:05', '111140000', '小万');

-- ----------------------------
-- Table structure for sp_abnormalcomplaint
-- ----------------------------
DROP TABLE IF EXISTS `sp_abnormalcomplaint`;
CREATE TABLE `sp_abnormalcomplaint` (
                                        `sp_orderid` int(11) NOT NULL AUTO_INCREMENT COMMENT '特殊申诉单编号',
                                        `sp_casename` varchar(30) DEFAULT NULL COMMENT '方案名称',
                                        `sp_keyword` varchar(30) DEFAULT NULL COMMENT '方案关键字',
                                        `sp_create_by` varchar(30) DEFAULT NULL COMMENT '方案创建人',
                                        `sp_create_time` datetime DEFAULT NULL COMMENT '创建日期',
                                        `sp_checker` varchar(30) DEFAULT NULL COMMENT '审批人',
                                        `sp_checke_time` datetime DEFAULT NULL COMMENT '审批时间 更新审批状态的时间',
                                        `sp_view_time` datetime DEFAULT NULL COMMENT '审核时间 开始查看方案的时间',
                                        `sp_checkstatus` int(3) DEFAULT NULL COMMENT '审批状态 审核通过:1 审核未通过：2 待审查：3',
                                        `sp_remark1` varchar(30) DEFAULT NULL COMMENT '预留字段1',
                                        `sp_remark2` varchar(30) DEFAULT NULL COMMENT '预留字段2',
                                        `sp_remark3` varchar(30) DEFAULT NULL COMMENT '预留字段3',
                                        `sp_remark4` varchar(30) DEFAULT NULL COMMENT '预留字段4',
                                        `sp_update_by` int(11) DEFAULT NULL COMMENT '修改人',
                                        `sp_update_time` datetime DEFAULT NULL COMMENT '修改日期',
                                        `sp_addtion` varchar(255) DEFAULT NULL COMMENT '备注',
                                        PRIMARY KEY (`sp_orderid`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COMMENT='特殊申诉表';

-- ----------------------------
-- Records of sp_abnormalcomplaint
-- ----------------------------
INSERT INTO `sp_abnormalcomplaint` VALUES ('1', 'iphone888', 'iphone888', '888', '2021-05-31 00:00:00', '马老板', '2021-06-30 00:00:00', '2021-06-30 00:00:00', '1', '', '1', '1', '1', '4396', '2021-05-28 00:00:00', '888');
INSERT INTO `sp_abnormalcomplaint` VALUES ('2', '三星电池', 'SUmsang', '德勤', '2021-07-13 00:00:00', '林老板', '2021-07-13 00:00:00', '2021-07-13 00:00:00', '1', '', '1', '1', '1', '4396', '2021-07-13 00:00:00', '1');
INSERT INTO `sp_abnormalcomplaint` VALUES ('4', '三星电池', 'SUmsang', '德勤', '2021-07-13 00:00:00', '林老板', '2021-07-13 00:00:00', '2021-07-13 00:00:00', '1', '', '1', '1', '1', '4396', '2021-07-13 00:00:00', '1');
INSERT INTO `sp_abnormalcomplaint` VALUES ('5', '三星电池', 'SUmsang', '德勤', '2021-07-13 00:00:00', '林老板', '2021-07-13 00:00:00', '2021-07-13 00:00:00', '1', '', '1', '1', '1', '4396', '2021-07-13 00:00:00', '1');
INSERT INTO `sp_abnormalcomplaint` VALUES ('6', '三星电池', 'SUmsang', '德勤', '2021-07-13 00:00:00', '林老板', '2021-07-13 00:00:00', '2021-07-13 00:00:00', '1', '', '1', '1', '1', '4396', '2021-07-13 00:00:00', '1');
INSERT INTO `sp_abnormalcomplaint` VALUES ('22', '1', '1', '1', '2021-06-30 00:00:00', '1', '2021-07-19 00:00:00', '2021-07-26 00:00:00', null, null, null, null, null, null, '2021-07-05 00:00:00', '1');
INSERT INTO `sp_abnormalcomplaint` VALUES ('23', '1', '1', '1', '2021-06-30 00:00:00', '1', '2021-07-19 00:00:00', '2021-07-26 00:00:00', null, null, null, null, null, null, '2021-07-05 00:00:00', '1');
INSERT INTO `sp_abnormalcomplaint` VALUES ('24', '1', '2', '3', '2021-07-04 00:00:00', '1', '2021-07-05 00:00:00', '2021-07-27 00:00:00', null, null, null, null, null, null, '2021-07-28 00:00:00', '5');
INSERT INTO `sp_abnormalcomplaint` VALUES ('25', '4396', '2', '3', '2021-07-04 00:00:00', '1', '2021-07-26 00:00:00', '2021-07-28 00:00:00', null, null, null, null, null, null, '2021-07-28 00:00:00', '5');
INSERT INTO `sp_abnormalcomplaint` VALUES ('26', 'iphone13电池', 'iphone13', '龙乾', '2021-07-13 00:00:00', '华老板', null, null, '1', null, null, null, null, null, '2021-07-13 00:00:00', null);
INSERT INTO `sp_abnormalcomplaint` VALUES ('27', 'iphone13电池', 'iphone13', '龙乾', '2021-07-13 00:00:00', '华老板', null, null, '1', null, null, null, null, null, '2021-07-13 00:00:00', null);
INSERT INTO `sp_abnormalcomplaint` VALUES ('29', 'iphone999', 'iphone999', '999', '2021-05-26 00:00:00', '任老板', '2021-07-26 00:00:00', '2021-07-26 00:00:00', '1', null, null, null, null, null, '2021-05-26 00:00:00', '2222');

-- ----------------------------
-- Table structure for sp_changegoods
-- ----------------------------
DROP TABLE IF EXISTS `sp_changegoods`;
CREATE TABLE `sp_changegoods` (
                                  `sp_orderid` int(11) NOT NULL AUTO_INCREMENT COMMENT '退换货申请单编号',
                                  `sp_salesid` varchar(30) DEFAULT NULL COMMENT '销售订单编号',
                                  `sp_complaintsid` varchar(30) DEFAULT NULL COMMENT '投诉工单号',
                                  `sp_create_by` varchar(30) DEFAULT NULL COMMENT '制单人',
                                  `sp_create_date` datetime DEFAULT NULL COMMENT '制单日期',
                                  `sp_orderdepartment` int(30) DEFAULT NULL COMMENT '制单部门',
                                  `sp_handletype` int(3) DEFAULT NULL COMMENT '退换货类型 换货:1',
                                  `sp_goodsid` varchar(30) DEFAULT NULL COMMENT '原商品编码',
                                  `sp_goodsname` varchar(30) DEFAULT NULL COMMENT '商品名称',
                                  `sp_goodsiemi` varchar(30) DEFAULT NULL COMMENT '原商品串码',
                                  `sp_goodstype` varchar(30) DEFAULT NULL COMMENT '原商品型号',
                                  `sp_goodscolor` varchar(30) DEFAULT NULL COMMENT '原商品颜色 ',
                                  `sp_newgoodsid` varchar(30) DEFAULT NULL COMMENT '新商品编码',
                                  `sp_newgoodsname` varchar(30) DEFAULT NULL COMMENT '新商品名称',
                                  `sp_newgoodsiemi` varchar(30) DEFAULT NULL COMMENT '新商品串码',
                                  `sp_newgoodstype` varchar(30) DEFAULT NULL COMMENT '新商品型号',
                                  `sp_newgoodscolor` varchar(30) DEFAULT NULL COMMENT '新商品颜色',
                                  `sp_newfactoryid` varchar(30) DEFAULT NULL COMMENT '新供货商编码',
                                  `sp_newfactoryname` varchar(30) DEFAULT NULL COMMENT '新供货商名称',
                                  `sp_maintenancestatus` int(3) DEFAULT NULL COMMENT '售后换货入库状态 已入库：1 未入库：0',
                                  `sp_maintenanceid` varchar(30) DEFAULT NULL COMMENT '售后换货入库单号',
                                  `sp_checker` varchar(30) DEFAULT NULL COMMENT '审批人',
                                  `sp_checkcomment` varchar(255) DEFAULT NULL COMMENT '审批意见',
                                  `sp_checkstatus` int(3) DEFAULT NULL COMMENT '审批状态[初始:1 审批通过:2  不通过:3]',
                                  `sp_orderstatus` int(3) DEFAULT NULL COMMENT '单据状态[有效:1 无效:0] ',
                                  `sp_addtion` varchar(255) DEFAULT NULL COMMENT '备注',
                                  `sp_remark1` varchar(30) DEFAULT NULL COMMENT '预留字段1',
                                  `sp_remark2` varchar(30) DEFAULT NULL COMMENT '预留字段2',
                                  `sp_remark3` varchar(30) DEFAULT NULL COMMENT '预留字段3',
                                  `sp_remark4` varchar(30) DEFAULT NULL COMMENT '预留字段4',
                                  `sp_update_by` int(11) DEFAULT NULL COMMENT '修改人',
                                  `sp_update_time` date DEFAULT NULL COMMENT '修改日期',
                                  `sp_factoryid` varchar(30) DEFAULT NULL COMMENT '原返厂供货商编码',
                                  `sp_factoryname` varchar(30) DEFAULT NULL COMMENT '原返厂供货商名称',
                                  PRIMARY KEY (`sp_orderid`)
) ENGINE=InnoDB AUTO_INCREMENT=10005 DEFAULT CHARSET=utf8 COMMENT='换货申请表';

-- ----------------------------
-- Records of sp_changegoods
-- ----------------------------
INSERT INTO `sp_changegoods` VALUES ('10001', '10086', '10010', '4396', '2021-06-30 00:00:00', '4396', '1', '50', '苹果12', '411100', '智能手机', '绿', '10000', '三星', '4666', '5500', '白', '6000', '精立', '5566', '4396', '3', '好', '2', '4396', '4396', '1', '1', '1', null, '4396', '2021-07-13', null, null);
INSERT INTO `sp_changegoods` VALUES ('10002', '10086', '10010', '4396', '2021-07-13 00:00:00', '10000', '1', '50', '苹果12', '4399', '智能手机', '绿', '10000', '三星', '4666', '5500', '白', '6000', '精立', '1', '2', '3', '好', '1', null, '1', '1', '1', '1', null, '4396', '2021-07-13', null, null);
INSERT INTO `sp_changegoods` VALUES ('10003', '10086', '10010', '4396', '2021-07-13 00:00:00', '10000', '1', '50', '苹果12', '4399', '智能手机', '绿', '10000', '三星', '4666', '5500', '白', '6000', '精立', '1', '2', '3', '好', '1', null, '1', '1', '1', '1', '', '4396', '2021-07-13', '', '');
INSERT INTO `sp_changegoods` VALUES ('10004', '10086', '10010', '4396', '2021-07-13 00:00:00', '10000', '1', '50', '苹果12', '4399', '智能手机', '绿', '10000', '三星', '4666', '5500', '白', '6000', '精立', '1', '2', '3', '好', '1', null, '1', '1', '1', '1', '', '4396', '2021-07-13', '', '');

-- ----------------------------
-- Table structure for sp_complaintsrecord
-- ----------------------------
DROP TABLE IF EXISTS `sp_complaintsrecord`;
CREATE TABLE `sp_complaintsrecord` (
                                       `sp_complaintsid` int(11) NOT NULL AUTO_INCREMENT COMMENT '申诉记录编号',
                                       `sp_complaintsname` varchar(30) DEFAULT NULL COMMENT '单据状态',
                                       `sp_complaintsdescribe` varchar(30) DEFAULT NULL COMMENT '申诉记录描述',
                                       `sp_complaintsource` varchar(30) DEFAULT NULL COMMENT '申诉来源',
                                       `sp_complaintstatus` int(3) DEFAULT NULL COMMENT '申诉记录状态[已答复:1 二次答复:2 收货核实:3]',
                                       `sp_complainter` varchar(30) DEFAULT NULL COMMENT '申诉人',
                                       `sp_complaintstime` date DEFAULT NULL COMMENT '申诉日期',
                                       `sp_complaintstele` varchar(30) DEFAULT NULL COMMENT '申诉人联系方式',
                                       `sp_complaintsgoodsid` varchar(30) DEFAULT NULL COMMENT '申诉商品编码',
                                       `sp_complaintsgoodsname` varchar(30) DEFAULT NULL COMMENT '申诉商品名称',
                                       `sp_complaintsgoodstype` varchar(30) DEFAULT NULL COMMENT '申诉商品型号',
                                       `sp_complaintsgoodscolor` varchar(30) DEFAULT NULL COMMENT '申诉商品颜色 ',
                                       `sp_complaintsgoodsiemi` varchar(30) DEFAULT NULL COMMENT '申诉商品串码',
                                       `sp_complaintsorderid` varchar(30) DEFAULT NULL COMMENT '投诉工单号',
                                       `sp_salesorderid` varchar(30) DEFAULT NULL COMMENT '申诉商品销售订单编号',
                                       `sp_create_by` varchar(30) DEFAULT NULL COMMENT '记录人',
                                       `sp_create_time` datetime DEFAULT NULL COMMENT '记录日期',
                                       `sp_checker` varchar(30) DEFAULT NULL COMMENT '审批人',
                                       `sp_checktime` date DEFAULT NULL COMMENT '审批日期',
                                       `sp_replies` varchar(255) DEFAULT NULL COMMENT '客服答复意见',
                                       `sp_repliestime` date DEFAULT NULL COMMENT '客服答复日期',
                                       `sp_secondreplies` varchar(30) DEFAULT NULL COMMENT '二次客服答复意见',
                                       `sp_secondrepliestime` date DEFAULT NULL COMMENT '二次客服答复日期',
                                       `sp_supporterid` varchar(30) DEFAULT NULL COMMENT '二次客服人员工号',
                                       `sp_goodschecker` varchar(30) DEFAULT NULL COMMENT '收货核实人',
                                       `sp_checkcomment` varchar(30) DEFAULT NULL COMMENT '收货核实意见',
                                       `sp_checkcommenttime` date DEFAULT NULL COMMENT '收货核实意见日期',
                                       `sp_addtion` varchar(30) DEFAULT NULL COMMENT '备注',
                                       `sp_remark1` varchar(30) DEFAULT NULL COMMENT '预留字段1',
                                       `sp_remark2` varchar(30) DEFAULT NULL COMMENT '预留字段2',
                                       `sp_remark3` varchar(30) DEFAULT NULL COMMENT '预留字段3',
                                       `sp_remark4` varchar(30) DEFAULT NULL COMMENT '预留字段4',
                                       `sp_update_by` int(11) DEFAULT NULL COMMENT '修改人',
                                       `sp_update_time` date DEFAULT NULL COMMENT '修改日期',
                                       PRIMARY KEY (`sp_complaintsid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='普通投诉记录表';

-- ----------------------------
-- Records of sp_complaintsrecord
-- ----------------------------
INSERT INTO `sp_complaintsrecord` VALUES ('1', '999', '999', '999', '999', '1', '2021-07-13', '1', '1', '1', '1', '1', '1', '1', null, '999', '2021-07-30 00:00:00', '1', '2021-07-13', '999', '2021-07-30', '999', '2021-07-30', '999', '999', '999', '2021-07-30', '999', '1', '1', '1', '1', '1', '2021-07-13');
INSERT INTO `sp_complaintsrecord` VALUES ('2', '显示屏漏液', '1', '1', '1', '1', '2021-07-13', '1', '1', '1', '1', '1', '1', '1', null, '1', '2021-07-13 00:00:00', '1', '2021-07-13', '1', '2021-07-13', '1', '2021-07-13', '1', '1', '1', '2021-07-13', '1', '1', '1', '1', '1', '1', '2021-07-13');
INSERT INTO `sp_complaintsrecord` VALUES ('3', '显示屏漏液', '1', '1', '1', '1', '2021-07-13', '1', '1', '1', '1', '1', '1', '1', null, '1', '2021-07-13 00:00:00', '1', '2021-07-13', '1', '2021-07-13', '1', '2021-07-13', '1', '1', '1', '2021-07-13', '1', '1', '1', '1', '1', '1', '2021-07-13');
INSERT INTO `sp_complaintsrecord` VALUES ('12', '33', '33', '33', '33', null, null, null, '66', '鸡腿', '17', '15', '13', '222', '3', '333', '2021-07-13 00:00:00', null, null, '33', '2021-07-05', '33', '2021-07-12', '33', '33', '2222', '2021-07-11', '333', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for sp_outwarehouse
-- ----------------------------
DROP TABLE IF EXISTS `sp_outwarehouse`;
CREATE TABLE `sp_outwarehouse` (
                                   `sp_applicationId` int(11) NOT NULL AUTO_INCREMENT COMMENT '申请单编号',
                                   `sp_handletype` int(11) DEFAULT NULL COMMENT '申请类型（返厂出库）4',
                                   `sp_create_by` varchar(30) DEFAULT NULL COMMENT '制单人',
                                   `sp_creat_time` datetime DEFAULT NULL COMMENT '制单日期',
                                   `sp_createdepartment` varchar(30) DEFAULT NULL COMMENT '制单部门',
                                   `sp_goodsid` varchar(30) DEFAULT NULL COMMENT '返厂商品编码',
                                   `sp_goodsimei` varchar(100) DEFAULT NULL COMMENT '返厂商品串码',
                                   `sp_goodstype` varchar(30) DEFAULT NULL COMMENT '返厂商品型号',
                                   `sp_goodscolor` varchar(30) DEFAULT NULL COMMENT '返厂商品颜色',
                                   `sp_factoryid` varchar(30) DEFAULT NULL COMMENT '返厂供货商编码',
                                   `sp_factoryname` varchar(30) DEFAULT NULL COMMENT '返厂供货商名称',
                                   `sp_config` varchar(30) DEFAULT NULL,
                                   `sp_causes` varchar(30) DEFAULT NULL COMMENT '返厂原因',
                                   `sp_sites` varchar(30) DEFAULT NULL COMMENT '返厂地点',
                                   `sp_outstatus` int(3) DEFAULT NULL COMMENT '返厂出库标志 已出库:1 未出库:0） ',
                                   `sp_outorderid` varchar(30) DEFAULT NULL COMMENT '返厂出库单号',
                                   `sp_outlookstatus` int(3) DEFAULT NULL COMMENT '外观状态',
                                   `sp_checker` varchar(30) DEFAULT NULL COMMENT '审批人',
                                   `sp_checkcomment` varchar(255) DEFAULT NULL COMMENT '审批意见',
                                   `sp_checkstatus` int(3) DEFAULT NULL COMMENT '审批状态',
                                   `sp_checkdate` date DEFAULT NULL COMMENT '审批时间',
                                   `sp_orderstatus` int(3) DEFAULT NULL COMMENT '单据状态',
                                   `sp_addition` varchar(255) DEFAULT NULL COMMENT '备注',
                                   `sp_remark1` varchar(30) DEFAULT NULL COMMENT '预留字段1',
                                   `sp_remark2` varchar(30) DEFAULT NULL COMMENT '预留字段2',
                                   `sp_remark3` varchar(30) DEFAULT NULL COMMENT '预留字段3',
                                   `sp_remark4` varchar(30) DEFAULT NULL COMMENT '预留字段4',
                                   `sp_update_by` int(11) DEFAULT NULL COMMENT '修改人',
                                   `sp_update_time` date DEFAULT NULL COMMENT '修改日期',
                                   `sp_goodsname` varchar(30) DEFAULT NULL COMMENT '原商品名称',
                                   `sp_sellsid` varchar(30) DEFAULT NULL COMMENT '销售订单编号',
                                   PRIMARY KEY (`sp_applicationId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='返厂出库表';

-- ----------------------------
-- Records of sp_outwarehouse
-- ----------------------------
INSERT INTO `sp_outwarehouse` VALUES ('1', '4', '1', '2021-07-13 00:00:00', '1', '1', '9', '1', '1', '1', '1', null, '1', '22', '1', '4666', '11', '1', '1', '2', '2021-07-13', '1', '1', '1', '1', '1', '1', '1', '2021-07-13', '苹果', null);

-- ----------------------------
-- Table structure for sp_returngoods
-- ----------------------------
DROP TABLE IF EXISTS `sp_returngoods`;
CREATE TABLE `sp_returngoods` (
                                  `sp_orderid` int(11) NOT NULL AUTO_INCREMENT COMMENT '退货申请单编号',
                                  `sp_sellsid` varchar(30) DEFAULT NULL COMMENT '销售订单编号',
                                  `sp_applicationid` varchar(30) DEFAULT NULL COMMENT '申请工单号',
                                  `sp_create_by` varchar(30) DEFAULT NULL COMMENT '制单人',
                                  `sp_create_date` datetime DEFAULT NULL COMMENT '制单日期',
                                  `sp_orderdepartment` int(30) DEFAULT NULL COMMENT '制单部门',
                                  `sp_handletype` int(3) DEFAULT NULL COMMENT '退换货类型（退货:2）',
                                  `sp_goodsid` varchar(30) DEFAULT NULL COMMENT '商品编码',
                                  `sp_goodsname` varchar(30) DEFAULT NULL COMMENT '商品名称',
                                  `sp_goodsiemi` varchar(30) DEFAULT NULL COMMENT '商品串码',
                                  `sp_goodstype` varchar(30) DEFAULT NULL COMMENT '商品类型',
                                  `sp_goodscolor` varchar(30) DEFAULT NULL COMMENT '商品颜色',
                                  `sp_goodsprice` varchar(30) DEFAULT NULL COMMENT '商品价格',
                                  `sp_goodscost` varchar(30) DEFAULT NULL COMMENT '商品成本',
                                  `sp_maintenancestatus` int(3) DEFAULT NULL COMMENT '售后换货入库状态 入库：1  未入库：0 ',
                                  `sp_maintenanceid` varchar(30) DEFAULT NULL COMMENT '售后换货入库单号',
                                  `sp_causes` varchar(255) DEFAULT NULL COMMENT '退货原因',
                                  `sp_checker` varchar(30) DEFAULT NULL COMMENT '审批人',
                                  `sp_checkcomment` varchar(255) DEFAULT NULL COMMENT '审批意见',
                                  `sp_checkstatus` int(3) DEFAULT NULL COMMENT '审批状态[初始:1 审批通过:2  不通过:3]',
                                  `sp_orderstatus` int(3) DEFAULT NULL COMMENT '单据状态[有效:1 无效:0] ',
                                  `sp_addtion` varchar(255) DEFAULT NULL COMMENT '备注',
                                  `sp_remark1` varchar(30) DEFAULT NULL COMMENT '预留字段1',
                                  `sp_remark2` varchar(30) DEFAULT NULL COMMENT '预留字段2',
                                  `sp_remark3` varchar(30) DEFAULT NULL COMMENT '预留字段3',
                                  `sp_remark4` varchar(30) DEFAULT NULL COMMENT '预留字段4',
                                  `sp_update_by` int(11) DEFAULT NULL COMMENT '修改人',
                                  `sp_update_time` date DEFAULT NULL COMMENT '修改日期',
                                  `sp_fatoryid` varchar(30) DEFAULT NULL COMMENT '供货商编码',
                                  `sp_factoryname` varchar(30) DEFAULT NULL COMMENT '供货商名称',
                                  PRIMARY KEY (`sp_orderid`)
) ENGINE=InnoDB AUTO_INCREMENT=20007 DEFAULT CHARSET=utf8 COMMENT='退货申请表';

-- ----------------------------
-- Records of sp_returngoods
-- ----------------------------
INSERT INTO `sp_returngoods` VALUES ('14', '2', '1', '1', '2021-07-30 00:00:00', '2', '1', '3', '4', '9', '17', '15', '5', '1', '1', '1', '1', null, null, null, '1', '1', null, null, null, null, null, null, null, null);
INSERT INTO `sp_returngoods` VALUES ('20001', '1', '1', '1', '2021-07-13 00:00:00', '1', '2', '1', '1', '1', '1', '1', '1', '1', '1', '', '1', '', '', null, '1', '1', '1', '1', '1', '1', '1', '2021-07-13', null, null);
INSERT INTO `sp_returngoods` VALUES ('20002', '1', '1', '1', '2021-07-13 00:00:00', '1', '2', '1', '1', '1', '1', '1', '1', '1', '1', '', '1', '', '', null, '1', '1', '1', '1', '1', '1', '1', '2021-07-13', null, null);
INSERT INTO `sp_returngoods` VALUES ('20003', '1', '1', '1', '2021-07-13 00:00:00', '1', '2', '1', '1', '1', '1', '1', '1', '1', '1', '', '1', '', '', null, '1', '1', '1', '1', '1', '1', '1', '2021-07-13', null, null);
INSERT INTO `sp_returngoods` VALUES ('20004', '1', '222', '333', '2021-07-19 00:00:00', '333', '2', '1', '香肠', '9', '17', '15', '5', '222', '222', '222', '222', null, null, null, '222', '22', null, null, null, null, null, null, null, null);
INSERT INTO `sp_returngoods` VALUES ('20006', '1', '111', '1', null, null, '2', '17871', '小米', '9', '17', '15', '2000', '11', '2', '11', '1', null, null, null, '1', '1', null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for sp_returnwarehouse
-- ----------------------------
DROP TABLE IF EXISTS `sp_returnwarehouse`;
CREATE TABLE `sp_returnwarehouse` (
                                      `sp_orderid` int(11) NOT NULL AUTO_INCREMENT COMMENT '申请单编号',
                                      `sp_handletype` int(3) DEFAULT NULL COMMENT '申请类型（返厂入库 3）',
                                      `sp_create_by` varchar(30) DEFAULT NULL COMMENT '制单人',
                                      `sp_create_time` datetime DEFAULT NULL COMMENT '制单日期',
                                      `sp_createdepartment` varchar(30) DEFAULT NULL COMMENT '制单部门',
                                      `sp_goodsid` varchar(30) DEFAULT NULL COMMENT '返厂商品编码',
                                      `sp_goodsimei` varchar(100) DEFAULT NULL COMMENT '返厂商品串码',
                                      `sp_goodstype` varchar(30) DEFAULT NULL COMMENT '返厂商品型号',
                                      `sp_goodscolor` varchar(30) DEFAULT NULL COMMENT '返厂商品颜色',
                                      `sp_factoryid` varchar(30) DEFAULT NULL COMMENT '返厂供货商编码',
                                      `sp_factoryname` varchar(30) DEFAULT NULL COMMENT '返厂供货商名称',
                                      `sp_config` varchar(30) DEFAULT NULL COMMENT '返厂配置',
                                      `sp_causes` varchar(30) DEFAULT NULL COMMENT '返厂原因',
                                      `sp_sites` varchar(30) DEFAULT NULL COMMENT '返厂地点',
                                      `sp_instatus` int(3) DEFAULT NULL COMMENT '返厂入库标志 已入库:1 未入库:0） ',
                                      `sp_inorderid` varchar(30) DEFAULT NULL COMMENT '返厂入库单号',
                                      `sp_outlookstatus` int(3) DEFAULT NULL COMMENT '外观状态',
                                      `sp_checker` varchar(30) DEFAULT NULL COMMENT '审批人',
                                      `sp_checkcomment` varchar(255) DEFAULT NULL COMMENT '审批意见',
                                      `sp_checkstatus` int(3) DEFAULT NULL COMMENT '审批状态',
                                      `sp_checkdate` datetime DEFAULT NULL COMMENT '审批时间',
                                      `sp_orderstatus` int(3) DEFAULT NULL COMMENT '单据状态',
                                      `sp_addition` varchar(255) DEFAULT NULL COMMENT '备注',
                                      `sp_remark1` int(11) DEFAULT NULL COMMENT '预留字段1',
                                      `sp_remark2` int(11) DEFAULT NULL COMMENT '预留字段2',
                                      `sp_remark3` int(11) DEFAULT NULL COMMENT '预留字段3',
                                      `sp_remark4` int(11) DEFAULT NULL COMMENT '预留字段4',
                                      `sp_updateby` int(11) DEFAULT NULL COMMENT '修改人',
                                      `sp_update_time` datetime DEFAULT NULL COMMENT '修改日期',
                                      `sp_goodsname` varchar(30) DEFAULT NULL COMMENT '商品名称',
                                      `sp_sellsid` varchar(30) DEFAULT NULL COMMENT '销售订单编号',
                                      PRIMARY KEY (`sp_orderid`)
) ENGINE=InnoDB AUTO_INCREMENT=30004 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sp_returnwarehouse
-- ----------------------------
INSERT INTO `sp_returnwarehouse` VALUES ('30002', '3', '华老板', '2021-07-22 10:40:31', '信息部', '10000', '999', '手机', '蓝', '100010', '富士康', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2021-07-23 10:41:31', '1', '1', '1', '1', '1', null, '1', '2021-07-15 10:41:38', '华为', null);
INSERT INTO `sp_returnwarehouse` VALUES ('30003', '3', '华老板', '2021-07-22 10:40:31', '信息部', '10000', '999', '手机', '蓝', '100010', '富士康', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2021-07-23 10:41:31', '1', '1', '1', '1', '1', null, '1', '2021-07-15 10:41:38', '华为', '');

-- ----------------------------
-- Table structure for st-store
-- ----------------------------
DROP TABLE IF EXISTS `st-store`;
CREATE TABLE `st-store` (
                            `id` int(11) NOT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of st-store
-- ----------------------------

-- ----------------------------
-- Table structure for st_aftersale_instore
-- ----------------------------
DROP TABLE IF EXISTS `st_aftersale_instore`;
CREATE TABLE `st_aftersale_instore` (
                                        `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '售后入库编号',
                                        `order_id` int(20) NOT NULL COMMENT '订单编号',
                                        `business_type` varchar(50) NOT NULL COMMENT '业务类型 ',
                                        `after_sale_order_id` int(20) DEFAULT NULL COMMENT '售后订单编号',
                                        `order_type` varchar(20) DEFAULT NULL COMMENT '订单类型 1、换货单 2、退货单 3、返厂入库单',
                                        `proposer` varchar(20) DEFAULT NULL COMMENT '申请人',
                                        `proposer_phone` varchar(20) DEFAULT NULL COMMENT '申请人联系电话',
                                        `proposer_email` varchar(20) DEFAULT NULL COMMENT '申请人联系邮箱',
                                        `apply_time` datetime DEFAULT NULL COMMENT '申请时间',
                                        `mobile_model` varchar(20) DEFAULT NULL COMMENT '售后机型',
                                        `mobile_model_no` varchar(20) DEFAULT NULL COMMENT '售后机型串号',
                                        `receivable_count` int(20) DEFAULT NULL COMMENT '应收数量',
                                        `actual_count` int(20) DEFAULT NULL COMMENT '实收数量',
                                        `status` varchar(20) NOT NULL COMMENT '状态 1.待入库 2.录入完毕 3.入库完毕 4.退回待入库',
                                        `create_by` int(20) DEFAULT NULL COMMENT '创建者',
                                        `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                                        `create_time` datetime NOT NULL COMMENT '创建时间',
                                        `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                        `remark1` int(20) DEFAULT NULL COMMENT '预留字段1',
                                        `remark2` int(20) DEFAULT NULL COMMENT '预留字段2',
                                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000037 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of st_aftersale_instore
-- ----------------------------
INSERT INTO `st_aftersale_instore` VALUES ('1000033', '10001', '换货单', '87', '售后换货入库', '1', '', '', '2021-07-17 22:15:55', '苹果12', '411100', null, null, '录入完毕', '1', null, '2021-07-17 22:15:55', null, null, null);
INSERT INTO `st_aftersale_instore` VALUES ('1000034', '14', '退货单', '86', '售后退货入库', '1', '', '', '2021-07-18 10:02:18', '4', '9', null, null, '录入完毕', '1', null, '2021-07-18 10:02:18', null, null, null);
INSERT INTO `st_aftersale_instore` VALUES ('1000035', '14', '退货单', '91', '售后退货入库', '1', '', '', '2021-07-18 15:56:20', '4', '9', null, null, '待入库', '1', null, '2021-07-18 15:56:20', null, null, null);
INSERT INTO `st_aftersale_instore` VALUES ('1000036', '20001', '退货单', '92', '售后退货入库', '1', '', '', '2021-07-18 15:58:00', '1', '1', null, null, '待入库', '1', null, '2021-07-18 15:58:00', null, null, null);

-- ----------------------------
-- Table structure for st_aftersale_outstore
-- ----------------------------
DROP TABLE IF EXISTS `st_aftersale_outstore`;
CREATE TABLE `st_aftersale_outstore` (
                                         `id` int(20) NOT NULL COMMENT '售后出库单编号',
                                         `aftersale_type` varchar(50) NOT NULL COMMENT '售后类型',
                                         `aftersale_order_info` varchar(50) DEFAULT NULL COMMENT '售后销售订单信息',
                                         `aftersale_product_id` int(20) DEFAULT NULL COMMENT '售后商品编号',
                                         `aftersale_brand` varchar(20) DEFAULT NULL COMMENT '售后品牌',
                                         `aftersale_mobile_model` varchar(20) DEFAULT NULL COMMENT '售后型号',
                                         `aftersale_product_name` varchar(20) DEFAULT NULL COMMENT '售后商品名称',
                                         `proposer` varchar(20) DEFAULT NULL COMMENT '申请人',
                                         `mobile_model` datetime DEFAULT NULL COMMENT '申请时间',
                                         `aftersale_no` varchar(20) DEFAULT NULL COMMENT '售后串码信息',
                                         `prepared_by` varchar(20) DEFAULT NULL COMMENT '制单人',
                                         `operation_time` datetime DEFAULT NULL COMMENT '操作时间',
                                         `aftersale_count` varchar(20) DEFAULT NULL COMMENT '售后数量',
                                         `supplier_information` varchar(20) DEFAULT NULL COMMENT '供货商信息',
                                         `status` varchar(20) NOT NULL COMMENT '状态',
                                         `create_by` int(20) DEFAULT NULL COMMENT '创建者',
                                         `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                                         `create_time` datetime NOT NULL COMMENT '创建时间',
                                         `update_time` datetime NOT NULL COMMENT '更新时间',
                                         `remark_1` int(20) DEFAULT NULL COMMENT '预留字段1',
                                         `remark_2` int(20) DEFAULT NULL COMMENT '预留字段2',
                                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of st_aftersale_outstore
-- ----------------------------

-- ----------------------------
-- Table structure for st_gifttoproduct_move
-- ----------------------------
DROP TABLE IF EXISTS `st_gifttoproduct_move`;
CREATE TABLE `st_gifttoproduct_move` (
                                         `id` int(20) NOT NULL COMMENT '移库单编号',
                                         `move_applyid` int(20) NOT NULL COMMENT '移库申请单编号',
                                         `business_type` varchar(50) DEFAULT NULL COMMENT '业务类型',
                                         `gift_id` int(20) DEFAULT NULL COMMENT '移库商品/赠品编号',
                                         `gift_property` varchar(20) DEFAULT NULL COMMENT '移库商品/赠品原始属性',
                                         `source_store` varchar(20) DEFAULT NULL COMMENT '源头仓库',
                                         `target_store` varchar(20) DEFAULT NULL COMMENT '目地仓库',
                                         `order_id` int(20) DEFAULT NULL COMMENT '订单编号',
                                         `prepared_by` varchar(20) DEFAULT NULL COMMENT '制单人',
                                         `verifier` varchar(20) DEFAULT NULL COMMENT '审核人',
                                         `process_time` datetime DEFAULT NULL COMMENT '处理时间',
                                         `supplier_information` varchar(20) DEFAULT NULL COMMENT '供应商信息',
                                         `move_count` int(20) NOT NULL COMMENT '移库数量',
                                         `status` varchar(20) NOT NULL COMMENT '状态',
                                         `create_by` int(20) DEFAULT NULL COMMENT '创建者',
                                         `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                                         `create_time` datetime NOT NULL COMMENT '创建时间',
                                         `update_time` datetime NOT NULL COMMENT '更新时间',
                                         `remark_1` int(20) DEFAULT NULL COMMENT '预留字段1',
                                         `remark_2` int(20) DEFAULT NULL COMMENT '预留字段2',
                                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of st_gifttoproduct_move
-- ----------------------------

-- ----------------------------
-- Table structure for st_gifttoproduct_move_apply
-- ----------------------------
DROP TABLE IF EXISTS `st_gifttoproduct_move_apply`;
CREATE TABLE `st_gifttoproduct_move_apply` (
                                               `id` int(20) NOT NULL COMMENT '移库单编号',
                                               `gift_id` int(20) DEFAULT NULL COMMENT '赠品编号',
                                               `gift_brand` varchar(20) DEFAULT NULL COMMENT '赠品品牌',
                                               `gift_model` varchar(20) DEFAULT NULL COMMENT '赠品型号',
                                               `move_count` int(20) NOT NULL COMMENT '移库数量',
                                               `product_id` int(20) DEFAULT NULL COMMENT '商品编号',
                                               `product_brand` varchar(20) DEFAULT NULL COMMENT '商品品牌',
                                               `product_model` int(20) DEFAULT NULL COMMENT '商品型号',
                                               `source_store` varchar(20) DEFAULT NULL COMMENT '源头仓库',
                                               `target_store` varchar(20) DEFAULT NULL COMMENT '目地仓库',
                                               `proposer` varchar(20) DEFAULT NULL COMMENT '申请人',
                                               `mobile_model` datetime DEFAULT NULL COMMENT '申请时间',
                                               `pass_log` varchar(20) DEFAULT NULL COMMENT '审核日志',
                                               `supplier_information` varchar(20) DEFAULT NULL COMMENT '供应商信息',
                                               `status` varchar(20) NOT NULL COMMENT '状态',
                                               `create_by` int(20) DEFAULT NULL COMMENT '创建者',
                                               `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                                               `create_time` datetime NOT NULL COMMENT '创建时间',
                                               `update_time` datetime NOT NULL COMMENT '更新时间',
                                               `remark_1` int(20) DEFAULT NULL COMMENT '预留字段1',
                                               `remark_2` int(20) DEFAULT NULL COMMENT '预留字段2',
                                               PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of st_gifttoproduct_move_apply
-- ----------------------------

-- ----------------------------
-- Table structure for st_godown
-- ----------------------------
DROP TABLE IF EXISTS `st_godown`;
CREATE TABLE `st_godown` (
                             `st_godownid` int(11) NOT NULL AUTO_INCREMENT COMMENT '申请表id',
                             `st_orderid` int(11) DEFAULT NULL COMMENT '订单id',
                             `st_outorderid` int(11) DEFAULT NULL COMMENT '出库单Id',
                             `st_checkstatus` int(11) DEFAULT NULL COMMENT '状态 1.待审核 2.待入库 3.已入库',
                             `sp_handletype` int(11) DEFAULT NULL COMMENT '订单类型：1、换货单 2、退货单 3、返厂入库单',
                             `st_create_by` varchar(255) DEFAULT NULL,
                             `st_create_date` datetime DEFAULT NULL,
                             `st_update_by` varchar(255) DEFAULT NULL,
                             `st_update_time` datetime DEFAULT NULL,
                             PRIMARY KEY (`st_godownid`)
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of st_godown
-- ----------------------------
INSERT INTO `st_godown` VALUES ('84', '30001', null, '2', '3', '222', '2021-07-28 16:00:00', null, null);
INSERT INTO `st_godown` VALUES ('86', '14', null, '3', '2', '12121', '2021-06-30 16:00:00', null, null);
INSERT INTO `st_godown` VALUES ('87', '10001', null, '3', '1', '3', '2021-07-20 16:00:00', null, null);
INSERT INTO `st_godown` VALUES ('90', '10001', null, '1', '1', '3', '2021-07-05 16:00:00', null, null);
INSERT INTO `st_godown` VALUES ('91', '14', null, '3', '2', '11', '2021-06-30 16:00:00', null, null);
INSERT INTO `st_godown` VALUES ('92', '20001', null, '3', '2', '11', '2021-07-07 16:00:00', null, null);

-- ----------------------------
-- Table structure for st_producttogift_move_apply
-- ----------------------------
DROP TABLE IF EXISTS `st_producttogift_move_apply`;
CREATE TABLE `st_producttogift_move_apply` (
                                               `id` int(20) NOT NULL COMMENT '移库单编号',
                                               `product_id` int(20) DEFAULT NULL COMMENT '商品编号',
                                               `product_brand` varchar(20) DEFAULT NULL COMMENT '商品品牌',
                                               `product_model` int(20) DEFAULT NULL COMMENT '商品型号',
                                               `move_count` int(20) NOT NULL COMMENT '移库数量',
                                               `gift_id` int(20) DEFAULT NULL COMMENT '赠品编号',
                                               `gift_brand` varchar(20) DEFAULT NULL COMMENT '赠品品牌',
                                               `gift_model` varchar(20) DEFAULT NULL COMMENT '赠品型号',
                                               `source_store` varchar(20) DEFAULT NULL COMMENT '源头仓库',
                                               `target_store` varchar(20) DEFAULT NULL COMMENT '目地仓库',
                                               `proposer` varchar(20) DEFAULT NULL COMMENT '申请人',
                                               `mobile_model` datetime DEFAULT NULL COMMENT '申请时间',
                                               `pass_log` varchar(20) DEFAULT NULL COMMENT '审核日志',
                                               `supplier_information` varchar(20) DEFAULT NULL COMMENT '供应商信息',
                                               `status` varchar(20) NOT NULL COMMENT '状态',
                                               `create_by` int(20) DEFAULT NULL COMMENT '创建者',
                                               `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                                               `create_time` datetime NOT NULL COMMENT '创建时间',
                                               `update_time` datetime NOT NULL COMMENT '更新时间',
                                               `remark_1` int(20) DEFAULT NULL COMMENT '预留字段1',
                                               `remark_2` int(20) DEFAULT NULL COMMENT '预留字段2',
                                               PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of st_producttogift_move_apply
-- ----------------------------

-- ----------------------------
-- Table structure for st_salereturn_instore
-- ----------------------------
DROP TABLE IF EXISTS `st_salereturn_instore`;
CREATE TABLE `st_salereturn_instore` (
                                         `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '入库单编号',
                                         `aftersale_order_id` varchar(50) NOT NULL COMMENT '销售入库订单',
                                         `aftersale_orderinfo` varchar(50) DEFAULT NULL COMMENT '销售订单',
                                         `order_type` varchar(50) DEFAULT NULL COMMENT '订单类型',
                                         `business_type` varchar(20) DEFAULT NULL COMMENT '业务类型',
                                         `proposer` varchar(20) DEFAULT NULL COMMENT '申请人',
                                         `proposer_phone` varchar(20) DEFAULT NULL COMMENT '申请人联系电话',
                                         `proposer_email` varchar(20) DEFAULT NULL COMMENT '申请人联系邮箱',
                                         `apply_time` datetime DEFAULT NULL COMMENT '申请时间',
                                         `moblie_model` varchar(20) DEFAULT NULL COMMENT '销售入库机型',
                                         `mobile_model_no` varchar(20) DEFAULT NULL COMMENT '销售入库机型串号',
                                         `count` int(20) DEFAULT NULL COMMENT '数量',
                                         `supplier_information` varchar(20) DEFAULT NULL COMMENT '供货商',
                                         `instore_time` datetime DEFAULT NULL COMMENT '入库时间',
                                         `waybil` int(20) DEFAULT NULL COMMENT '原发货运单号',
                                         `customer_order_id` int(20) DEFAULT NULL COMMENT '原用户订单号',
                                         `customer_address` varchar(20) DEFAULT NULL COMMENT '顾客地址',
                                         `status` varchar(20) DEFAULT NULL COMMENT '状态',
                                         `create_by` varchar(20) DEFAULT NULL COMMENT '创建者',
                                         `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                                         `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                         `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                         `remark1` int(20) DEFAULT NULL COMMENT '预留字段1',
                                         `remark2` int(20) DEFAULT NULL COMMENT '预留字段2',
                                         `product_id` varchar(50) DEFAULT '' COMMENT '商品编号',
                                         `product_name` varchar(50) DEFAULT NULL COMMENT '商品名称',
                                         `supplier_code` varchar(50) DEFAULT NULL,
                                         `supplier_name` varchar(50) DEFAULT NULL,
                                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of st_salereturn_instore
-- ----------------------------
INSERT INTO `st_salereturn_instore` VALUES ('1', '1', null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, '录入完毕', '库管1', null, '2021-07-13 17:10:04', null, null, null, '1', '杜蕾斯11', '1101', '华东1');
INSERT INTO `st_salereturn_instore` VALUES ('2', '1', null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, '录入完毕', '库管1', null, '2021-07-13 17:10:04', null, null, null, '1', '杜蕾斯11', '1101', '华东1');
INSERT INTO `st_salereturn_instore` VALUES ('3', '1', null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, '录入完毕', '库管1', null, '2021-07-13 17:10:04', null, null, null, '1', '杜蕾斯11', '1101', '华东1');
INSERT INTO `st_salereturn_instore` VALUES ('4', '1', null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, '录入完毕', '库管1', null, '2021-07-13 17:10:04', null, null, null, '1', '杜蕾斯11', '1101', '华东1');
INSERT INTO `st_salereturn_instore` VALUES ('5', '1', null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, '录入完毕', '库管1', null, '2021-07-13 17:10:04', null, null, null, '1', '杜蕾斯11', '1101', '华东1');
INSERT INTO `st_salereturn_instore` VALUES ('6', '1', null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, '录入完毕', '库管1', null, '2021-07-13 17:10:04', null, null, null, '1', '杜蕾斯11', '1101', '华东1');
INSERT INTO `st_salereturn_instore` VALUES ('7', '1', null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, '录入完毕', '库管1', null, '2021-07-13 17:10:04', null, null, null, '1', '杜蕾斯11', '1101', '华东1');
INSERT INTO `st_salereturn_instore` VALUES ('8', '1', null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, '录入完毕', '库管1', null, '2021-07-13 17:10:04', null, null, null, '1', '杜蕾斯11', '1101', '华东1');
INSERT INTO `st_salereturn_instore` VALUES ('9', '1', null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, '录入完毕', '库管1', null, '2021-07-13 17:10:04', null, null, null, '1', '杜蕾斯11', '1101', '华东1');
INSERT INTO `st_salereturn_instore` VALUES ('10', '1', null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, '录入完毕', '库管1', null, '2021-07-13 17:10:04', null, null, null, '1', '杜蕾斯11', '1101', '华东1');
INSERT INTO `st_salereturn_instore` VALUES ('11', '1', null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, '录入完毕', '库管1', null, '2021-07-13 17:10:04', null, null, null, '1', '杜蕾斯11', '1101', '华东1');
INSERT INTO `st_salereturn_instore` VALUES ('12', '1', null, null, null, null, null, null, null, null, null, '1', null, null, null, null, null, '录入完毕', '库管1', null, '2021-07-13 17:10:04', null, null, null, '1', '杜蕾斯11', '1101', '华东1');
INSERT INTO `st_salereturn_instore` VALUES ('13', '11', null, null, null, null, null, null, null, null, null, '9', null, null, null, null, null, '录入完毕', null, null, '2021-07-13 17:10:04', null, null, null, '1', '可乐', '1101', '华东1');
INSERT INTO `st_salereturn_instore` VALUES ('14', '12', null, null, null, null, null, null, null, null, null, '5', null, null, null, null, null, '待入库', null, null, '2021-07-13 17:10:04', null, null, null, '1', '爆米花', '1101', '华东1');

-- ----------------------------
-- Table structure for st_sale_outstore
-- ----------------------------
DROP TABLE IF EXISTS `st_sale_outstore`;
CREATE TABLE `st_sale_outstore` (
                                    `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '销售出库单编号',
                                    `business_type` varchar(50) DEFAULT NULL COMMENT '业务类型',
                                    `product_id` int(20) DEFAULT NULL COMMENT '商品编号',
                                    `product_brand` varchar(20) DEFAULT NULL COMMENT '商品品牌',
                                    `product_model` int(20) DEFAULT NULL COMMENT '商品型号',
                                    `outstore_count` int(20) DEFAULT NULL COMMENT '出库数量',
                                    `outstore_price` decimal(10,2) DEFAULT NULL COMMENT '出库价格',
                                    `outstore_name` varchar(20) DEFAULT NULL COMMENT '出库仓库',
                                    `order_type` varchar(20) DEFAULT NULL COMMENT '订单类型',
                                    `orderflow_log` varchar(20) DEFAULT NULL COMMENT '订单流程日志',
                                    `order_id` varchar(20) DEFAULT NULL COMMENT '订单详情(需包含销售订单号)',
                                    `service_comment` varchar(20) DEFAULT NULL COMMENT '客服备注信息',
                                    `process_time` datetime DEFAULT NULL COMMENT '处理时间',
                                    `supplier_information` datetime DEFAULT NULL COMMENT '供货商信息(根据机型串码及仓库自动带出供应商信息)',
                                    `status` varchar(20) DEFAULT NULL COMMENT '状态',
                                    `create_by` int(20) DEFAULT NULL COMMENT '创建者',
                                    `update_by` varchar(20) DEFAULT NULL COMMENT '更新者',
                                    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                    `remark_1` int(20) DEFAULT NULL COMMENT '预留字段1',
                                    `remark_2` int(20) DEFAULT NULL COMMENT '预留字段2',
                                    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of st_sale_outstore
-- ----------------------------
INSERT INTO `st_sale_outstore` VALUES ('1', null, null, null, null, null, null, null, '淘宝网店', null, '3', null, null, null, '待出库', null, null, '2021-07-14 10:35:48', null, null, null);
INSERT INTO `st_sale_outstore` VALUES ('2', null, null, null, null, null, null, null, '电话订单', null, '4', null, null, null, '待出库', null, null, '2021-07-14 10:35:48', null, null, null);
INSERT INTO `st_sale_outstore` VALUES ('3', null, null, null, null, null, null, null, '淘宝网店', null, '5', null, null, null, '待出库', null, null, '2021-07-14 10:35:48', null, null, null);
INSERT INTO `st_sale_outstore` VALUES ('4', null, null, null, null, null, null, null, '淘宝网店', null, '2', null, null, null, '待出库', null, null, '2021-07-14 10:35:48', null, null, null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
                        `id` int(11) DEFAULT NULL,
                        `username` varchar(255) DEFAULT NULL,
                        `pwd` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'root', 'root');
