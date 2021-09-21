/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : srm

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2021-07-10 17:17:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for st_aftersale_instore
-- ----------------------------
DROP TABLE IF EXISTS `st_aftersale_instore`;
CREATE TABLE `st_aftersale_instore` (
  `id` int(20) NOT NULL COMMENT '售后入库编号',
  `order_id` int(20) NOT NULL COMMENT '订单编号',
  `business_type` varchar(50) NOT NULL COMMENT '业务类型',
  `after_sale_order_id` int(20) DEFAULT NULL COMMENT '售后订单编号',
  `order_type` varchar(20) DEFAULT NULL COMMENT '订单类型',
  `proposer` varchar(20) DEFAULT NULL COMMENT '申请人',
  `proposer_phone` varchar(20) DEFAULT NULL COMMENT '申请人联系电话',
  `proposer_email` varchar(20) DEFAULT NULL COMMENT '申请人联系邮箱',
  `apply_time` datetime DEFAULT NULL COMMENT '申请时间',
  `mobile_model` varchar(20) DEFAULT NULL COMMENT '售后机型',
  `mobile_model_no` varchar(20) DEFAULT NULL COMMENT '售后机型串号',
  `receivable_count` int(20) DEFAULT NULL COMMENT '应收数量',
  `actual_count` int(20) DEFAULT NULL COMMENT '实收数量',
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
-- Records of st_aftersale_instore
-- ----------------------------

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
  `id` int(20) NOT NULL COMMENT '入库单编号',
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
  `customer_order_id` int(20) NOT NULL COMMENT '原用户订单号',
  `customer_address` varchar(20) NOT NULL COMMENT '顾客地址',
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
-- Records of st_salereturn_instore
-- ----------------------------

-- ----------------------------
-- Table structure for st_sale_outstore
-- ----------------------------
DROP TABLE IF EXISTS `st_sale_outstore`;
CREATE TABLE `st_sale_outstore` (
  `id` int(20) NOT NULL COMMENT '销售出库单编号',
  `business_type` varchar(50) NOT NULL COMMENT '业务类型',
  `product_id` int(20) DEFAULT NULL COMMENT '商品编号',
  `product_brand` varchar(20) DEFAULT NULL COMMENT '商品品牌',
  `product_model` int(20) DEFAULT NULL COMMENT '商品型号',
  `outstore_count` int(20) DEFAULT NULL COMMENT '出库数量',
  `outstore_price` decimal(10,2) DEFAULT NULL COMMENT '出库价格',
  `outstore_name` varchar(20) DEFAULT NULL COMMENT '出库仓库',
  `order_type` varchar(20) DEFAULT NULL COMMENT '订单类型',
  `orderflow_log` varchar(20) DEFAULT NULL COMMENT '订单流程日志',
  `order_details` varchar(20) DEFAULT NULL COMMENT '订单详情(需包含销售订单号)',
  `service_comment` varchar(20) DEFAULT NULL COMMENT '客服备注信息',
  `process_time` datetime NOT NULL COMMENT '处理时间',
  `supplier_information` datetime NOT NULL COMMENT '供货商信息(根据机型串码及仓库自动带出供应商信息)',
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
-- Records of st_sale_outstore
-- ----------------------------
