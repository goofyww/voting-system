/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50024
Source Host           : 127.0.0.1:3306
Source Database       : voting

Target Server Type    : MYSQL
Target Server Version : 50024
File Encoding         : 65001

Date: 2018-04-22 02:29:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for v_options
-- ----------------------------
DROP TABLE IF EXISTS `v_options`;
CREATE TABLE `v_options` (
  `id` bigint(10) NOT NULL auto_increment COMMENT '主键',
  `optContent` int(10) NOT NULL COMMENT '选项内容（0-4 很容易-很难）',
  `vote` bigint(10) NOT NULL COMMENT '得票数',
  `sid` bigint(10) NOT NULL COMMENT '主题id  (外键)',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='选项表';

-- ----------------------------
-- Records of v_options
-- ----------------------------
INSERT INTO `v_options` VALUES ('1', '4', '0', '1');
INSERT INTO `v_options` VALUES ('2', '3', '8', '1');
INSERT INTO `v_options` VALUES ('3', '2', '12', '1');
INSERT INTO `v_options` VALUES ('4', '1', '3', '1');
INSERT INTO `v_options` VALUES ('5', '0', '0', '1');
INSERT INTO `v_options` VALUES ('6', '4', '6', '2');
INSERT INTO `v_options` VALUES ('7', '3', '7', '2');
INSERT INTO `v_options` VALUES ('8', '2', '7', '2');
INSERT INTO `v_options` VALUES ('9', '1', '7', '2');
INSERT INTO `v_options` VALUES ('10', '0', '7', '2');
INSERT INTO `v_options` VALUES ('11', '4', '2', '3');
INSERT INTO `v_options` VALUES ('12', '3', '2', '3');
INSERT INTO `v_options` VALUES ('13', '2', '2', '3');
INSERT INTO `v_options` VALUES ('14', '1', '2', '3');
INSERT INTO `v_options` VALUES ('15', '0', '5', '3');
