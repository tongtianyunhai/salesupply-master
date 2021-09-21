/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : stage3test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2021-07-10 17:19:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sp_abnormalcomplaint
-- ----------------------------
DROP TABLE IF EXISTS `sp_abnormalcomplaint`;
CREATE TABLE `sp_abnormalcomplaint` (
  `sp_orderid` int(11) NOT NULL AUTO_INCREMENT COMMENT '特殊申诉单编号',
  `sp_casename` varchar(30) DEFAULT NULL COMMENT '方案名称',
  `sp_keyword` varchar(30) DEFAULT NULL COMMENT '方案关键字',
  `sp_create_by` varchar(30) DEFAULT NULL COMMENT '方案创建人',
  `sp_create_time` date DEFAULT NULL COMMENT '创建日期',
  `sp_checker` varchar(30) DEFAULT NULL COMMENT '审批人',
  `sp_checketime` varchar(30) DEFAULT NULL COMMENT '审批时间 更新审批状态的时间',
  `sp_viewtime` varchar(30) DEFAULT NULL COMMENT '审核时间 开始查看方案的时间',
  `sp_checkstatus` int(3) DEFAULT NULL COMMENT '审批状态 审核通过:1 审核未通过：2 待审查：3',
  `sp_remark_1` varchar(30) DEFAULT NULL COMMENT '预留字段1',
  `sp_remark_2` varchar(30) DEFAULT NULL COMMENT '预留字段2',
  `sp_remark_3` varchar(30) DEFAULT NULL COMMENT '预留字段3',
  `sp_remark_4` varchar(30) DEFAULT NULL COMMENT '预留字段4',
  `sp_update_by` int(11) DEFAULT NULL COMMENT '修改人',
  `sp_update_time` date DEFAULT NULL COMMENT '修改日期',
  `sp_addtion` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`sp_orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='特殊申诉表';

-- ----------------------------
-- Table structure for sp_changegoods
-- ----------------------------
DROP TABLE IF EXISTS `sp_changegoods`;
CREATE TABLE `sp_changegoods` (
  `sp_orderid` int(11) NOT NULL AUTO_INCREMENT COMMENT '换货申请单编号',
  `sp_salesid` varchar(30) DEFAULT NULL COMMENT '销售订单编号',
  `sp_complaintsid` varchar(30) DEFAULT NULL COMMENT '投诉工单号',
  `sp_create_by` varchar(30) DEFAULT NULL COMMENT '制单人',
  `sp_create_date` date DEFAULT NULL COMMENT '制单日期',
  `sp_orderdepartment` int(30) DEFAULT NULL COMMENT '制单部门',
  `sp_handletype` int(3) DEFAULT NULL COMMENT '退换货类型（同机型换货:1 不同机型换货:0）',
  `sp_formergoodsid` varchar(30) DEFAULT NULL COMMENT '原商品编码',
  `sp_formergoodsname` varchar(30) DEFAULT NULL COMMENT '原商品名称',
  `sp_formergoodsiemi` varchar(30) DEFAULT NULL COMMENT '原商品串码',
  `sp_formergoodstype` varchar(30) DEFAULT NULL COMMENT '原商品型号',
  `sp_formergoodscolor` varchar(30) DEFAULT NULL COMMENT '原商品颜色 ',
  `sp_formerfatoryid` varchar(30) DEFAULT NULL COMMENT '原供货商编码',
  `sp_formerfactoryname` varchar(30) DEFAULT NULL COMMENT '原供货商名称',
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
  `sp_remark_1` varchar(30) DEFAULT NULL COMMENT '预留字段1',
  `sp_remark_2` varchar(30) DEFAULT NULL COMMENT '预留字段2',
  `sp_remark_3` varchar(30) DEFAULT NULL COMMENT '预留字段3',
  `sp_remark_4` varchar(30) DEFAULT NULL COMMENT '预留字段4',
  `sp_update_by` int(11) DEFAULT NULL COMMENT '修改人',
  `sp_update_time` date DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`sp_orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='换货申请表';

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
  `sp_salesorderid` varchar(30) DEFAULT NULL COMMENT '申诉商品编码销售订单编号',
  `sp_create_by` varchar(30) DEFAULT NULL COMMENT '记录人',
  `sp_create_time` date DEFAULT NULL COMMENT '记录日期',
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
  `sp_remark_1` varchar(30) DEFAULT NULL COMMENT '预留字段1',
  `sp_remark_2` varchar(30) DEFAULT NULL COMMENT '预留字段2',
  `sp_remark_3` varchar(30) DEFAULT NULL COMMENT '预留字段3',
  `sp_remark_4` varchar(30) DEFAULT NULL COMMENT '预留字段4',
  `sp_update_by` int(11) DEFAULT NULL COMMENT '修改人',
  `sp_update_time` date DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`sp_complaintsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='普通投诉记录表';

-- ----------------------------
-- Table structure for sp_outwarehouse
-- ----------------------------
DROP TABLE IF EXISTS `sp_outwarehouse`;
CREATE TABLE `sp_outwarehouse` (
  `sp_applicationId` int(11) NOT NULL AUTO_INCREMENT COMMENT '申请单编号',
  `sp_applicationtype` int(3) DEFAULT NULL COMMENT '申请类型（返厂出库）出库:1 未出库:0',
  `sp_create_by` varchar(30) DEFAULT NULL COMMENT '制单人',
  `sp_creat_time` date DEFAULT NULL COMMENT '制单日期',
  `sp_createdepartment` varchar(30) DEFAULT NULL COMMENT '制单部门',
  `sp_goodsid` varchar(30) DEFAULT NULL COMMENT '返厂商品编码',
  `sp_goodsbrand` varchar(30) DEFAULT NULL COMMENT '返厂商品品牌',
  `sp_goodsimei` varchar(100) DEFAULT NULL COMMENT '返厂商品串码',
  `sp_goodstype` varchar(30) DEFAULT NULL COMMENT '返厂商品型号',
  `sp_goodscolor` varchar(30) DEFAULT NULL COMMENT '返厂商品颜色',
  `sp_factoryid` varchar(30) DEFAULT NULL COMMENT '返厂供货商编码',
  `sp_factoryname` varchar(30) DEFAULT NULL COMMENT '返厂供货商名称',
  `sp_config` varchar(30) DEFAULT NULL COMMENT '返厂配置',
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
  `sp_remark_1` varchar(30) DEFAULT NULL COMMENT '预留字段1',
  `sp_remark_2` varchar(30) DEFAULT NULL COMMENT '预留字段2',
  `sp_remark_3` varchar(30) DEFAULT NULL COMMENT '预留字段3',
  `sp_remark_4` varchar(30) DEFAULT NULL COMMENT '预留字段4',
  `sp_update_by` int(11) DEFAULT NULL COMMENT '修改人',
  `sp_update_time` date DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`sp_applicationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='返厂出库表';

-- ----------------------------
-- Table structure for sp_returngoods
-- ----------------------------
DROP TABLE IF EXISTS `sp_returngoods`;
CREATE TABLE `sp_returngoods` (
  `sp_orderid` int(11) NOT NULL AUTO_INCREMENT COMMENT '退货申请单编号',
  `sp_sellsid` varchar(30) DEFAULT NULL COMMENT '销售订单编号',
  `sp_applicationid` varchar(30) DEFAULT NULL COMMENT '申请工单号',
  `sp_create_by` varchar(30) DEFAULT NULL COMMENT '制单人',
  `sp_create_date` date DEFAULT NULL COMMENT '制单日期',
  `sp_orderdepartment` int(30) DEFAULT NULL COMMENT '制单部门',
  `sp_handletype` int(3) DEFAULT NULL COMMENT '退换货类型（退货:1）',
  `sp_goodsid` varchar(30) DEFAULT NULL COMMENT '商品编码',
  `sp_goodsname` varchar(30) DEFAULT NULL COMMENT '商品品牌',
  `sp_goodsiemi` varchar(30) DEFAULT NULL COMMENT '商品串码',
  `sp_goodstype` varchar(30) DEFAULT NULL COMMENT '商品型号',
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
  `sp_remark_1` varchar(30) DEFAULT NULL COMMENT '预留字段1',
  `sp_remark_2` varchar(30) DEFAULT NULL COMMENT '预留字段2',
  `sp_remark_3` varchar(30) DEFAULT NULL COMMENT '预留字段3',
  `sp_remark_4` varchar(30) DEFAULT NULL COMMENT '预留字段4',
  `sp_update_by` int(11) DEFAULT NULL COMMENT '修改人',
  `sp_update_time` date DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`sp_orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='退货申请表';

-- ----------------------------
-- Table structure for sp_returnwarehouse
-- ----------------------------
DROP TABLE IF EXISTS `sp_returnwarehouse`;
CREATE TABLE `sp_returnwarehouse` (
  `sp_applicationId` int(11) NOT NULL AUTO_INCREMENT COMMENT '申请单编号',
  `sp_applicationtype` int(3) DEFAULT NULL COMMENT '申请类型（返厂出库）已入库:1 未入库:0',
  `sp_create_by` varchar(30) DEFAULT NULL COMMENT '制单人',
  `sp_create_time` date DEFAULT NULL COMMENT '制单日期',
  `sp_createdepartment` varchar(30) DEFAULT NULL COMMENT '制单部门',
  `sp_goodsid` varchar(30) DEFAULT NULL COMMENT '返厂商品编码',
  `sp_goodsbrand` varchar(30) DEFAULT NULL COMMENT '返厂商品品牌',
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
  `sp_checkdate` date DEFAULT NULL COMMENT '审批时间',
  `sp_orderstatus` int(3) DEFAULT NULL COMMENT '单据状态',
  `sp_addition` varchar(255) DEFAULT NULL COMMENT '备注',
  `sp_remark_1` varchar(30) DEFAULT NULL COMMENT '预留字段1',
  `sp_remark_2` varchar(30) DEFAULT NULL COMMENT '预留字段2',
  `sp_remark_3` varchar(30) DEFAULT NULL COMMENT '预留字段3',
  `sp_remark_4` varchar(30) DEFAULT NULL COMMENT '预留字段4',
  `sp_update_by` int(11) DEFAULT NULL COMMENT '修改人',
  `sp_update_time` date DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`sp_applicationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='返厂入库表';
