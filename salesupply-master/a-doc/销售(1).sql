/*
Navicat MySQL Data Transfer

Source Server         : wanqi
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : order

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2021-07-10 16:22:19
*/

SET FOREIGN_KEY_CHECKS=0;

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
  `remark_1` int(20) DEFAULT NULL,
  `remark_2` int(20) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sa_order
-- ----------------------------

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
  `order_money` decimal(10,2) DEFAULT NULL COMMENT '总金额',
  `remark_1` int(20) DEFAULT NULL,
  `remark_2` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sa_orderproduct
-- ----------------------------

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
  `order_payment` varchar(50) DEFAULT NULL COMMENT '支付方式（货到付款，款到发货）',
  `order_tothetime` datetime DEFAULT NULL COMMENT '自提时间',
  `order_remarks` varchar(50) DEFAULT NULL COMMENT '备注',
  `payment_if` varchar(50) DEFAULT NULL COMMENT '是否付款',
  `returned_if` varchar(50) DEFAULT NULL COMMENT '是否退货',
  `order_remitter` varchar(50) DEFAULT NULL COMMENT '汇款人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `updata_user` varchar(50) DEFAULT NULL COMMENT '修改人',
  `updata_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `remark_1` int(20) DEFAULT NULL,
  `remark_2` int(20) DEFAULT NULL,
  PRIMARY KEY (`returned_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sa_returned
-- ----------------------------
