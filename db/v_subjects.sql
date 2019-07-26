/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50024
Source Host           : 127.0.0.1:3306
Source Database       : voting

Target Server Type    : MYSQL
Target Server Version : 50024
File Encoding         : 65001

Date: 2018-04-22 02:30:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for v_subjects
-- ----------------------------
DROP TABLE IF EXISTS `v_subjects`;
CREATE TABLE `v_subjects` (
  `id` bigint(10) NOT NULL auto_increment COMMENT '主键',
  `title` varchar(50) NOT NULL COMMENT '主题名',
  `totalVotes` bigint(10) NOT NULL COMMENT '投票人数',
  `viewTimes` bigint(10) NOT NULL COMMENT '查看次数',
  `createDate` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='主题表';

-- ----------------------------
-- Records of v_subjects
-- ----------------------------
INSERT INTO `v_subjects` VALUES ('1', '本次考试难度如何', '23', '32', '2018-04-21 19:03:54');
INSERT INTO `v_subjects` VALUES ('2', 'USA对CHINA发动的贸易战主要原因是什么', '34', '56', '2018-04-21 19:06:31');
INSERT INTO `v_subjects` VALUES ('3', '你姓胡吗？', '13', '24', '2018-04-21 19:07:21');
