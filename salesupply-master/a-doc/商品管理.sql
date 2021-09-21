
CREATE TABLE `gd_goods` (

`goods_id` int NOT NULL AUTO_INCREMENT COMMENT '商品管理',

`goods_encode` varchar(50) NULL COMMENT '存货档案编码',

`goods_category` varchar(50) NULL COMMENT '分类',

`goods_model` varchar(50) NULL COMMENT '型号  ALFA D81',

`goods_brand` varchar(50) NULL COMMENT '品牌',

`goods_color` varchar(50) NULL COMMENT '颜色',

`goods_classify` varchar(50) NULL COMMENT '分类',

`goods_buytype` varchar(50) NULL COMMENT '采购模式',

`goods_distribution` varchar(50) NULL COMMENT '铺货 1-铺货 0-非铺货',

`goods_standby` varchar(50) NULL COMMENT '备机 1-备机 0-非备机',

`goods_marketprice` double NULL COMMENT '市场价',

`goods_shoprice` double NULL COMMENT '商场价',

`goods_type` varchar(50) NULL COMMENT '型号 1X手机-翻盖',

`goods_lowstock` int NULL COMMENT '最低库存量',

`goods_isbuy` int NULL COMMENT '是否可采购 1-可采购 0-不可采购',

`goods_IMEI` varchar(100) NULL COMMENT '串码',
`create_by` INT (11) COMMENT '创建者',
`update_by` VARCHAR (20) COMMENT '更新者',
`create_time` datetime NOT NULL COMMENT '创建时间',
`update_time` datetime NOT NULL COMMENT '更新时间',
`remark_1` varchar (50) COMMENT '预留字段1',
`remark_2` varchar (20) COMMENT '预留字段2',

PRIMARY KEY (`goods_id`) 

);


CREATE TABLE `gd_product` (

`product_id` int NOT NULL AUTO_INCREMENT,

`product_encode` varchar(50) NOT NULL COMMENT '产品编码（存货档案编码）',

`product_brand` varchar(50) NULL COMMENT '品牌',

`product_type` varchar(50) NULL COMMENT '型号',

`product_businessmode` varchar(100) NULL COMMENT '业务模式',

`product_color` varchar(50) NULL COMMENT '颜色',

`product_classify` varchar(50) NULL COMMENT '分类',
`create_by` INT (11) COMMENT '创建者',
`update_by` VARCHAR (20) COMMENT '更新者',
`create_time` datetime NOT NULL COMMENT '创建时间',
`update_time` datetime NOT NULL COMMENT '更新时间',
`remark_1` varchar (50) COMMENT '预留字段1',
`remark_2` varchar (20) COMMENT '预留字段2',

PRIMARY KEY (`product_id`) 

);



CREATE TABLE `gd_brand` (

`brand_id` int NOT NULL AUTO_INCREMENT,

`brand_name` varchar(100) NULL COMMENT '品牌名',

`brand_url` varchar(100) NULL,

`brand_des` text NULL COMMENT '品牌描述',
`create_by` INT (11) COMMENT '创建者',
`update_by` VARCHAR (20) COMMENT '更新者',
`create_time` datetime NOT NULL COMMENT '创建时间',
`update_time` datetime NOT NULL COMMENT '更新时间',
`remark_1` varchar (50) COMMENT '预留字段1',
`remark_2` varchar (20) COMMENT '预留字段2',

PRIMARY KEY (`brand_id`) 

);



CREATE TABLE `gd_classify` (

`classify_id` int NOT NULL AUTO_INCREMENT,

`classify_name` varchar(50) NULL COMMENT '商品类型名称',

`classify_des` text NULL COMMENT '品牌类型描述',

`classify_isparent` int NULL COMMENT '是否是父类分类 1-父类  0-子类 ',
`create_by` INT (11) COMMENT '创建者',
`update_by` VARCHAR (20) COMMENT '更新者',
`create_time` datetime NOT NULL COMMENT '创建时间',
`update_time` datetime NOT NULL COMMENT '更新时间',
`remark_1` varchar (50) COMMENT '预留字段1',
`remark_2` varchar (20) COMMENT '预留字段2',

PRIMARY KEY (`classify_id`) 

);


CREATE TABLE `gt_gift` (

`gift_id` int NOT NULL AUTO_INCREMENT,

`gift_name` varchar(100) NULL COMMENT '赠品名称',

`gift_model` varchar(50) NULL COMMENT '赠品型号 ',

`gift_classify` varchar(100) NULL COMMENT '赠品类型',

`gift_lowstock` int NULL COMMENT '最低库存量',

`gift_price` double NULL COMMENT '赠品单价',

`gift_cost` double NULL COMMENT '赠品成本',

`gift_status` int NULL COMMENT '赠品状态 1-有效  0-无效 ',

`gift_brand` varchar(10) NULL COMMENT '赠品品牌',

`gift_color` varchar(10) NULL COMMENT '赠品颜色',

`gift_IMEI` varchar(100) NULL COMMENT '串码',
`create_by` INT (11) COMMENT '创建者',
`update_by` VARCHAR (20) COMMENT '更新者',
`create_time` datetime NOT NULL COMMENT '创建时间',
`update_time` datetime NOT NULL COMMENT '更新时间',
`remark_1` varchar (50) COMMENT '预留字段1',
`remark_2` varchar (20) COMMENT '预留字段2',

PRIMARY KEY (`gift_id`) 

);




CREATE TABLE `gd_IMEI` (

`IMEI_id` int NOT NULL AUTO_INCREMENT,

`IMEI_number` int NULL COMMENT '串码',
`IMEI_status` int NULL COMMENT '状态  0- 已销售 1-未销售',

`create_by` INT (11) COMMENT '创建者',

`update_by` VARCHAR (20) COMMENT '更新者',

`create_time` datetime NOT NULL COMMENT '创建时间',

`update_time` datetime NOT NULL COMMENT '更新时间',

`remark_1` varchar (50) COMMENT '预留字段1',

`remark_2` varchar (20) COMMENT '预留字段2',


PRIMARY KEY (`IMEI_id`) 

);



CREATE TABLE `gt_promote` (

`promote_id` int NOT NULL AUTO_INCREMENT,

`promote_startime` datetime NULL COMMENT '活动开始时间  ',

`promote_endtime` datetime NULL COMMENT '活动结束时间 ',

`promote_name` varchar(50) NULL COMMENT '活动名称',

`promote_type` varchar(50) NULL COMMENT '促销类型 ',

`promote_goodid` int NULL COMMENT '促销商品id',



`promote_mk_adjustpricetype` int NULL COMMENT '百分比,绝对值',

`promote_mk_adjustnum`  double NULL COMMENT '调价的数字',

`promote_mk_proprice` double NULL COMMENT '市场促销价'	,
	
`promote_shop_adjustpricetype` int NULL COMMENT '百分比,绝对值',

`promote_shop_adjustnum`   double NULL COMMENT '调价的数字',

`promote_shop_proprice` double NULL COMMENT '市场促销价'	,




`promote_pricestartime` date NULL COMMENT '希望价格生效时间',

`promote_pricendtime` date NULL COMMENT '希望价格失效时间  ',

`promote_reason` varchar(255) NULL COMMENT '活动情况或原因',

`promote_file` varchar(50) NULL COMMENT '活动策划问价',

`promote_comment` varchar(50) NULL COMMENT '备注  ',

`promote_approvaid` int NULL COMMENT '审批',
`create_by` INT (11) COMMENT '创建者',
`update_by` VARCHAR (20) COMMENT '更新者',
`create_time` datetime NOT NULL COMMENT '创建时间',
`update_time` datetime NOT NULL COMMENT '更新时间',
`remark_1` varchar (50) COMMENT '预留字段1',
`remark_2` varchar (20) COMMENT '预留字段2',

PRIMARY KEY (`promote_id`) 

);



CREATE TABLE `gt_approval` (

`approval_id` int NOT NULL AUTO_INCREMENT,

`approval_user_id` int NULL COMMENT '审批人id',

`approval_user_name` varchar(255) NULL COMMENT '审批人姓名',

`approval_time` datetime NULL, 

`approval_status` int NULL COMMENT '审核状态 1-通过 0 - 未通过',

`approval_comment` text NULL COMMENT '审核评语',
`create_by` INT (11) COMMENT '创建者',
`update_by` VARCHAR (20) COMMENT '更新者',
`create_time` datetime NOT NULL COMMENT '创建时间',
`update_time` datetime NOT NULL COMMENT '更新时间',
`remark_1` varchar (50) COMMENT '预留字段1',
`remark_2` varchar (20) COMMENT '预留字段2',

PRIMARY KEY (`approval_id`) 

);



CREATE TABLE `gt_adjust` (

`adjust_id` int NOT NULL AUTO_INCREMENT,

`adjust_goodid` int NULL COMMENT '商品id',

`adjust_mk_adjustpricetype` int NULL COMMENT '百分比,绝对值',

`adjust_mk_adjustnum`  double NULL COMMENT '调价的数字',

`adjust_mk_proprice`  double NULL COMMENT '市场促销价'	,

`adjust_shop_adjustpricetype` int NULL COMMENT  '百分比,绝对值',

`adjust_shop_adjustnum` double NULL COMMENT '调价的数字',

`adjust_shop_proprice` double NULL COMMENT '市场促销价'	,

`create_by` INT (11) COMMENT '创建者',
`update_by` VARCHAR (20) COMMENT '更新者',
`create_time` datetime NOT NULL COMMENT '创建时间',
`update_time` datetime NOT NULL COMMENT '更新时间',
`remark_1` varchar (50) COMMENT '预留字段1',
`remark_2` varchar (20) COMMENT '预留字段2',

PRIMARY KEY (`adjust_id`) 

);



CREATE TABLE `gd_good2gift` (

`good_id` int NOT NULL AUTO_INCREMENT ,

`good_swich_putwarehouse` int NULL COMMENT '入库数量',

`good_approvaid` int NULL COMMENT '审核表id',
`create_by` INT (11) COMMENT '创建者',
`update_by` VARCHAR (20) COMMENT '更新者',
`create_time` datetime NOT NULL COMMENT '创建时间',
`update_time` datetime NOT NULL COMMENT '更新时间',
`remark_1` varchar (50) COMMENT '预留字段1',
`remark_2` varchar (20) COMMENT '预留字段2',

PRIMARY KEY (`good_id`) 

);



CREATE TABLE `gd_gift2good` (

`gift_id` int NOT NULL AUTO_INCREMENT ,

`gift_switch_putwarehouse` varchar(50) NULL COMMENT '入库数量',

`gift_swich_typrice` double NULL COMMENT '调整后的价格',

`gift_approvaid` int NULL COMMENT '审核表id',
`create_by` INT (11) COMMENT '创建者',
`update_by` VARCHAR (20) COMMENT '更新者',
`create_time` datetime NOT NULL COMMENT '创建时间',
`update_time` datetime NOT NULL COMMENT '更新时间',
`remark_1` varchar (50) COMMENT '预留字段1',
`remark_2` varchar (20) COMMENT '预留字段2',

PRIMARY KEY (`gift_id`) 

);



