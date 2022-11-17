/*
 Navicat Premium Data Transfer

 Source Server         : 本地链接
 Source Server Type    : MySQL
 Source Server Version : 80030 (8.0.30)
 Source Host           : localhost:3306
 Source Schema         : basic_demo

 Target Server Type    : MySQL
 Target Server Version : 80030 (8.0.30)
 File Encoding         : 65001

 Date: 17/11/2022 13:54:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `account` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '账号',
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '电话',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '头像',
  `sex` tinyint(1) NULL DEFAULT NULL COMMENT '性别（0--未知1--男2--女）',
  `create_time` datetime NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_user` bigint NULL DEFAULT NULL COMMENT '创建人',
  `status` tinyint(1) NULL DEFAULT 0 COMMENT '状态（0--正常1--冻结）',
  `del_flag` tinyint(1) NULL DEFAULT 0 COMMENT '删除状态（0，正常，1已删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户信息表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES (1, 'admin1', '123456', '张三', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (2, 'admin2', '123456', '李四22', '18577370965', 'www.baidu.com', 2, '2022-11-15 00:58:26', 1, 0, 0);
INSERT INTO `user_info` VALUES (3, 'admin2', '123456', '李四11', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (4, 'admin3', '123456', '张三3', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (5, 'admin4', '123456', '张三4', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (6, 'admin5', '123456', '张三5', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (7, 'admin6', '123456', '张三6', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (8, 'admin7', '123456', '张三7', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (9, 'admin8', '123456', '张三8', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (10, 'admin9', '123456', '张三9', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (11, 'admin10', '123456', '张三10', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (12, 'admin11', '123456', '张三11', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (13, 'admin12', '123456', '张三12', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (14, 'admin13', '123456', '张三13', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (15, 'admin14', '123456', '张三14', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (16, 'admin15', '123456', '张三15', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (17, 'admin16', '123456', '张三16', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (18, 'admin17', '123456', '张三17', '18577370897', 'www.baidu.com', 1, '2022-11-15 00:53:14', 1, 0, 0);
INSERT INTO `user_info` VALUES (20, 'wangwu1', '123456', '王五', '18577370112', NULL, 1, '2022-11-16 11:04:02', NULL, 0, 0);
INSERT INTO `user_info` VALUES (21, 'laozhao', '123456', '老赵', '18575254', NULL, 1, '2022-11-16 11:04:05', NULL, 0, 0);
INSERT INTO `user_info` VALUES (22, 'zhangwuji', '123456', '张无忌', '122445', NULL, 1, NULL, NULL, 0, 0);
INSERT INTO `user_info` VALUES (23, 'zhangsanfeng', '123456', '张三丰1', '185777', NULL, 1, '2022-11-16 11:11:20', NULL, 0, 1);

SET FOREIGN_KEY_CHECKS = 1;
