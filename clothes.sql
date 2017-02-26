/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50712
Source Host           : 127.0.0.1:3306
Source Database       : clothes

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2017-02-26 19:30:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `adminlendinformation`
-- ----------------------------
DROP TABLE IF EXISTS `adminlendinformation`;
CREATE TABLE `adminlendinformation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `isaccess` int(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of adminlendinformation
-- ----------------------------
INSERT INTO `adminlendinformation` VALUES ('1', 'admin', 'admin', '0');
INSERT INTO `adminlendinformation` VALUES ('2', 'wuang', 'wuang', '0');

-- ----------------------------
-- Table structure for `clothes_information`
-- ----------------------------
DROP TABLE IF EXISTS `clothes_information`;
CREATE TABLE `clothes_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `team` varchar(20) NOT NULL,
  `student_id` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `identity_id` varchar(18) NOT NULL,
  `sex` varchar(20) NOT NULL,
  `qihouqu` varchar(20) DEFAULT NULL,
  `junbingzhong` varchar(20) DEFAULT NULL,
  `danweiqufen` varchar(20) DEFAULT NULL,
  `danweileixing` varchar(20) DEFAULT NULL,
  `zhiwujibie` varchar(20) DEFAULT NULL,
  `xianzhishijian` varchar(20) DEFAULT NULL,
  `junxianjibie` varchar(20) DEFAULT NULL,
  `xianxianshijian` varchar(20) DEFAULT NULL,
  `gongzuogangwei` varchar(20) DEFAULT NULL,
  `gongzuoshijian` varchar(20) DEFAULT NULL,
  `ruwushijian` varchar(20) DEFAULT NULL,
  `tiganshijian` varchar(20) DEFAULT NULL,
  `gaixuanshijian` varchar(20) DEFAULT NULL,
  `zucema` varchar(20) DEFAULT NULL,
  `dengjibiaohao` varchar(20) DEFAULT NULL,
  `shengao` varchar(20) DEFAULT NULL,
  `xiongwei` varchar(20) DEFAULT NULL,
  `yaowei` varchar(20) DEFAULT NULL,
  `touwei` varchar(20) DEFAULT NULL,
  `jiaochang` varchar(20) DEFAULT NULL,
  `tuochang` varchar(20) DEFAULT NULL,
  `daima` varchar(20) DEFAULT NULL,
  `pingming` varchar(20) DEFAULT NULL,
  `haoxing` varchar(20) DEFAULT NULL,
  `beidongleixing` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`,`student_id`),
  UNIQUE KEY `student_id` (`student_id`),
  UNIQUE KEY `student_id_2` (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=344 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of clothes_information
-- ----------------------------
INSERT INTO `clothes_information` VALUES ('229', '九队', 'YYYY1', '李', 'XXXX1', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '187', '81', '50', '77', '15', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('230', '九队', 'YYYY2', '王尼玛', 'XXXX2', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '185', '82', '60', '85', '34', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('231', '九队', 'YYYY3', '激励哥', 'XXXX3', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '168', '70', '56', '83', '4445', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('232', '十一队', 'YYYY4', '邰藕', 'XXXX4', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '181', '70', '69', '86', '123', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('233', '七队', 'YYYY5', '张橐', 'XXXX5', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '163', '76', '68', '94', '123', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('234', '十队', 'YYYY6', '蓝限写', 'XXXX6', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '181', '78', '63', '75', '222', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('235', '九队', 'YYYY7', '滑续丹', 'XXXX7', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '185', '83', '67', '82', '22', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('236', '八队', 'YYYY8', '何廿朔', 'XXXX8', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '188', '83', '54', '89', '1231', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('237', '九队', 'YYYY9', '裴无', 'XXXX9', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '179', '72', '51', '90', '123', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('238', '七队', 'YYYY10', '太史撺慨', 'XXXX10', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '160', '87', '50', '99', '12312', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('239', '十一队', 'YYYY11', '齐窈', 'XXXX11', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '172', '74', '66', '79', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('240', '七队', 'YYYY12', '宓兔踱', 'XXXX12', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '170', '88', '61', '103', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('241', '七队', 'YYYY13', '白锆', 'XXXX13', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '157', '80', '60', '78', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('242', '十一队', 'YYYY14', '桓仄', 'XXXX14', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '163', '76', '62', '101', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('243', '九队', 'YYYY15', '俞厕滏', 'XXXX15', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '151', '79', '57', '83', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('244', '七队', 'YYYY16', '俞秣', 'XXXX16', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '183', '76', '58', '82', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('245', '十队', 'YYYY17', '公威酱', 'XXXX17', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '185', '79', '53', '98', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('246', '九队', 'YYYY18', '康喽', 'XXXX18', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '160', '83', '53', '93', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('247', '八队', 'YYYY19', '樊我', 'XXXX19', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '150', '81', '69', '83', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('248', '七队', 'YYYY20', '寿彪', 'XXXX20', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '152', '74', '52', '75', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('249', '九队', 'YYYY21', '厉珧', 'XXXX21', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '151', '75', '59', '92', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('250', '七队', 'YYYY22', '浦樊', 'XXXX22', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '175', '86', '59', '93', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('251', '八队', 'YYYY23', '湛蘸褐', 'XXXX23', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '189', '78', '57', '87', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('252', '八队', 'YYYY24', '栾哳知', 'XXXX24', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '185', '78', '52', '76', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('253', '七队', 'YYYY25', '暴唠仰', 'XXXX25', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '186', '75', '57', '102', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('254', '七队', 'YYYY26', '东方聩苘', 'XXXX26', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '175', '78', '55', '80', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('255', '七队', 'YYYY27', '谢酹首', 'XXXX27', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '180', '77', '50', '84', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('256', '十队', 'YYYY28', '汪糯', 'XXXX28', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '151', '76', '66', '77', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('257', '十队', 'YYYY29', '冼薜情', 'XXXX29', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '174', '83', '65', '104', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('258', '十一队', 'YYYY30', '房本糨', 'XXXX30', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '151', '79', '61', '77', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('259', '十一队', 'YYYY31', '曲断肌', 'XXXX31', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '159', '73', '55', '98', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('260', '七队', 'YYYY32', 'wuang', 'XXXX32', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '162', '82', '58', '76', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('261', '八队', 'YYYY33', '岑枭', 'XXXX33', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '159', '88', '63', '82', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('262', '七队', 'YYYY34', '贾遍哪', 'XXXX34', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '189', '70', '63', '102', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('263', '八队', 'YYYY35', '石鹳佐', 'XXXX35', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '177', '82', '60', '91', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('264', '七队', 'YYYY36', '韶恫', 'XXXX36', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '184', '84', '54', '88', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('265', '七队', 'YYYY37', '种亲翟', 'XXXX37', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '154', '75', '52', '76', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('266', '七队', 'YYYY38', '佟武碲', 'XXXX38', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '183', '81', '50', '99', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('267', '十队', 'YYYY39', '丁狡樟', 'XXXX39', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '155', '82', '57', '100', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('268', '十一队', 'YYYY40', '乜僚寺', 'XXXX40', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '159', '85', '55', '91', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('269', '七队', 'YYYY41', '封辩', 'XXXX41', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '188', '86', '68', '99', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('270', '十队', 'YYYY42', '独孤认', 'XXXX42', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '169', '88', '51', '77', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('271', '十队', 'YYYY43', '狐馕堍', 'XXXX43', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '170', '84', '52', '91', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('272', '十一队', 'YYYY44', '欧阳茆牵', 'XXXX44', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '181', '80', '64', '102', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('273', '七队', 'YYYY45', '毋丘睢', 'XXXX45', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '178', '82', '60', '78', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('274', '八队', 'YYYY46', '官萑够', 'XXXX46', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '176', '84', '50', '88', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('275', '八队', 'YYYY47', '甄蜗', 'XXXX47', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '166', '80', '50', '87', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('276', '十一队', 'YYYY48', '麻也俱', 'XXXX48', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '162', '75', '64', '95', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('277', '九队', 'YYYY49', '寿病', 'XXXX49', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '180', '81', '60', '75', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('278', '七队', 'YYYY50', '步忝', 'XXXX50', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '150', '74', '52', '82', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('279', '九队', 'YYYY51', '有抟', 'XXXX51', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '171', '85', '54', '86', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('280', '八队', 'YYYY52', '百里椽坍', 'XXXX52', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '172', '88', '57', '80', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('281', '七队', 'YYYY53', '苏厌', 'XXXX53', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '151', '77', '58', '95', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('282', '七队', 'YYYY54', '东郭羰', 'XXXX54', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '159', '72', '65', '103', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('283', '七队', 'YYYY55', '莘鐾钾', 'XXXX55', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '167', '79', '69', '101', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('284', '九队', 'YYYY56', '寇锡', 'XXXX56', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '175', '83', '59', '78', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('285', '九队', 'YYYY57', '宰父贽怼', 'XXXX57', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '183', '77', '64', '89', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('286', '八队', 'YYYY58', '寇抉', 'XXXX58', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '156', '87', '60', '93', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('287', '九队', 'YYYY59', '澹台东', 'XXXX59', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '151', '78', '67', '100', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('288', '九队', 'YYYY60', '苌谓那', 'XXXX60', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '154', '84', '57', '99', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('289', '十队', 'YYYY61', '梅剿', 'XXXX61', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '188', '78', '64', '87', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('290', '九队', 'YYYY62', '禄矧', 'XXXX62', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '185', '74', '57', '79', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('291', '十一队', 'YYYY63', '刘嫔疙', 'XXXX63', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '169', '87', '66', '98', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('292', '七队', 'YYYY64', '章谎', 'XXXX64', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '169', '85', '50', '77', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('293', '十一队', 'YYYY65', '能撰', 'XXXX65', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '177', '85', '67', '90', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('294', '十队', 'YYYY66', '单壮煤', 'XXXX66', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '168', '73', '51', '99', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('295', '十队', 'YYYY67', '刘糊闯', 'XXXX67', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '174', '76', '62', '94', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('296', '十队', 'YYYY68', '云亢', 'XXXX68', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '161', '86', '60', '99', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('297', '七队', 'YYYY69', '段干既剃', 'XXXX69', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '188', '79', '51', '77', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('298', '七队', 'YYYY70', '敬痉至', 'XXXX70', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '171', '74', '65', '84', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('299', '九队', 'YYYY71', '汲耘', 'XXXX71', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '165', '72', '66', '88', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('300', '十队', 'YYYY72', '赵被铫', 'XXXX72', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '180', '76', '63', '96', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('301', '十队', 'YYYY73', '汤挪', 'XXXX73', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '179', '70', '62', '102', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('302', '七队', 'YYYY74', '法眼勐', 'XXXX74', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '188', '86', '51', '85', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('303', '十一队', 'YYYY75', '拓跋粜莺', 'XXXX75', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '174', '76', '61', '102', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('304', '七队', 'YYYY76', '尚楱昏', 'XXXX76', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '179', '89', '51', '82', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('305', '七队', 'YYYY77', '夹谷旃噪', 'XXXX77', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '161', '72', '58', '86', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('306', '九队', 'YYYY78', '濮宁扭', 'XXXX78', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '161', '88', '68', '99', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('307', '九队', 'YYYY79', '干橐流', 'XXXX79', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '174', '84', '68', '82', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('308', '七队', 'YYYY80', '耿鹄侍', 'XXXX80', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '161', '83', '66', '76', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('309', '十队', 'YYYY81', '湛阌洞', 'XXXX81', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '182', '33', '66', '79', '12', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('310', '七队', 'YYYY82', '雷钛嘌', 'XXXX82', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '171', '81', '57', '80', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('311', '七队', 'YYYY83', '颛孙彀碎', 'XXXX83', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '164', '70', '55', '76', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('312', '七队', 'YYYY84', '毋丘露', 'XXXX84', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '174', '89', '55', '98', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('313', '七队', 'YYYY85', '姚劝屡', 'XXXX85', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '175', '85', '59', '78', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('314', '十一队', 'YYYY86', '家炼圃', 'XXXX86', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '159', '88', '64', '82', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('315', '七队', 'YYYY87', '真畈', 'XXXX87', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '167', '70', '50', '104', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('316', '七队', 'YYYY88', '廉裹', 'XXXX88', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '159', '76', '66', '86', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('317', '八队', 'YYYY89', '鄂锵慎', 'XXXX89', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '174', '84', '61', '82', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('318', '十队', 'YYYY90', '辛垛', 'XXXX90', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '186', '79', '60', '86', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('319', '七队', 'YYYY91', '缑橇赘', 'XXXX91', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '161', '81', '50', '90', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('320', '十一队', 'YYYY92', '华险', 'XXXX92', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '151', '83', '51', '78', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('321', '九队', 'YYYY93', '阚诶', 'XXXX93', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '177', '75', '58', '98', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('322', '八队', 'YYYY94', '喻忮扛', 'XXXX94', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '176', '87', '68', '97', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('323', '七队', 'YYYY95', '靳猖', 'XXXX95', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '170', '77', '64', '85', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('324', '十队', 'YYYY96', '鄂鱿觥', 'XXXX96', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '178', '83', '68', '99', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('325', '十一队', 'YYYY97', '铁鹁伲', 'XXXX97', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '155', '78', '52', '82', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('326', '七队', 'YYYY98', '景嫔', 'XXXX98', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '189', '78', '51', '80', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('327', '十一队', 'YYYY99', '苏疣纯', 'XXXX99', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '178', '86', '62', '76', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('328', '七队', 'YYYY100', '段谆', 'XXXX100', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '167', '80', '58', '95', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('329', '十一队', 'YYYY101', '计澧弘', 'XXXX101', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '156', '83', '61', '89', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('330', '七队', 'YYYY102', '景褚恐', 'XXXX102', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '167', '73', '59', '79', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('331', '十队', 'YYYY103', '计荞', 'XXXX103', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '168', '80', '69', '81', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('332', '七队', 'YYYY104', '洪羞奖', 'XXXX104', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '151', '75', '63', '81', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('333', '七队', 'YYYY105', '安讣', 'XXXX105', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '154', '85', '65', '93', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('334', '七队', 'YYYY106', '宰父眠', 'XXXX106', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '181', '77', '58', '99', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('335', '十队', 'YYYY107', '别舾', 'XXXX107', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '155', '73', '66', '100', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('336', '十队', 'YYYY108', '郁腽朊', 'XXXX108', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '189', '81', '62', '85', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('337', '十队', 'YYYY109', '符供', 'XXXX109', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '178', '81', '54', '97', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('338', '九队', 'YYYY110', '林淳富', 'XXXX110', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '152', '83', '60', '80', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('339', '十一队', 'YYYY111', '井亦叹', 'XXXX111', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '157', '73', '60', '78', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('340', '八队', 'YYYY112', '吴淅', 'XXXX112', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '151', '76', '50', '101', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('341', '十队', 'YYYY113', '揭鼋猪', 'XXXX113', 'male', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '167', '86', '58', '86', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('342', '七队', 'YYYY114', '贲蘅圈', 'XXXX114', 'female', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '181', '73', '69', '75', '', '', '', '', '', '');
INSERT INTO `clothes_information` VALUES ('343', 'team', 'student_id', 'name', 'identity_id', 'sex', 'qihouqu', 'junbingzhong', 'danweiqufen', 'danweileixing', 'zhiwujibie', 'xianzhishijian', 'junxianjibie', 'xianxianshijian', 'gongzuogangwei', 'gongzuoshijian', 'ruwushijian', 'tiganshijian', 'gaixuanshijian', 'zucema', 'dengjibiaohao', 'shengao', 'xiongwei', 'yaowei', 'touwei', 'jiaochang', 'tuochang', 'daima', 'pingming', 'haoxing', 'beidongleixing');

-- ----------------------------
-- Table structure for `exchange_info`
-- ----------------------------
DROP TABLE IF EXISTS `exchange_info`;
CREATE TABLE `exchange_info` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `student_id` int(20) NOT NULL,
  `clothestype` varchar(20) NOT NULL,
  `clothesname` varchar(20) NOT NULL,
  `clothesnowsize` varchar(10) NOT NULL,
  `clotheschangesize` varchar(10) NOT NULL,
  `clothescode` varchar(20) NOT NULL,
  `clothessize` varchar(20) NOT NULL,
  `exchangeisok` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exchange_info
-- ----------------------------
INSERT INTO `exchange_info` VALUES ('1', '0', 'hat', '07XXXX1帽', '53', '54', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('2', '0', 'shangyi', '07XXXX2衣', '185/104', '185/100', '501342', 'male', '0');
INSERT INTO `exchange_info` VALUES ('3', '0', 'shangyi', '07XXXX3衣', '185/104', '180/104', '501513', 'male', '0');
INSERT INTO `exchange_info` VALUES ('5', '0', 'hat', '07XXXX4帽', '54', '55', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('6', '0', 'hat', '07XXXX5帽', '53', '54', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('7', '0', 'hat', '07XXXX6帽', '53', '55', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('8', '0', 'hat', '07XXXX7帽', '55', '53', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('9', '0', 'hat', '07XXXX8帽', '55', '53', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('10', '0', 'hat', '07XXXX9帽', '54', '53', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('11', '0', 'hat', '07XXXX10帽', '57', '54', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('13', '0', 'hat', '07XXXX11帽', '53', '56', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('14', '0', 'hat', '07XXXX12帽', '57', '53', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('15', '0', 'hat', '07XXXX13帽', '58', '54', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('16', '0', 'hat', '07XXXX14帽', '59', '55', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('17', '0', 'hat', '07XXXX15帽', '60', '55', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('18', '0', 'hat', '07XXXX16帽', '56', '54', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('19', '0', 'hat', '07XXXX17帽', '57', '55', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('20', '0', 'hat', '07XXXX18帽', '54', '55', '500116', 'male', '0');
INSERT INTO `exchange_info` VALUES ('21', '0', 'hat', '07XXXX19帽', '54', '55', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('22', '0', 'hat', '07XXXX20帽', '57', '55', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('23', '0', 'hat', '', '54', '55', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('24', '0', 'hat', '07XXXX21帽', '53', '55', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('25', '0', 'hat', '', '53', '60', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('26', '0', 'hat', '07XXXX22帽', '53', '55', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('27', '0', 'hat', '07XXXX23帽', '53', '60', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('28', '0', 'hat', '07XXXX24帽', '59', '53', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('29', '0', 'hat', '07XXXX25帽', '55', '55', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('30', '0', 'hat', '07XXXX26帽', '53', '56', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('31', '0', 'hat', '07XXXX27帽', '53', '55', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('32', '0', 'hat', '07XXXX28帽', '53', '54', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('33', '0', 'hat', '07XXXX29帽', '55', '54', '500152', 'male', '0');
INSERT INTO `exchange_info` VALUES ('34', '0', 'hat', '07XXXX30帽', '55', '54', '500152', 'male', '0');

-- ----------------------------
-- Table structure for `femaledayi`
-- ----------------------------
DROP TABLE IF EXISTS `femaledayi`;
CREATE TABLE `femaledayi` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `clothesname` varchar(20) NOT NULL,
  `clothesnum` int(20) DEFAULT '0',
  `a175b88` int(10) DEFAULT '0',
  `a170b92c96` int(10) DEFAULT '0',
  `a170b88` int(10) DEFAULT '0',
  `a170b80c84` int(10) DEFAULT '0',
  `a165b100` int(10) DEFAULT '0',
  `a165b92c96` int(10) DEFAULT '0',
  `a165b88` int(10) DEFAULT '0',
  `a165b80c84` int(10) DEFAULT '0',
  `a160b100` int(10) DEFAULT '0',
  `a160b92c96` int(10) DEFAULT '0',
  `a160b88` int(10) DEFAULT '0',
  `a160b80c84` int(10) DEFAULT '0',
  `a160b76` int(10) DEFAULT '0',
  `a155b92c96` int(10) DEFAULT '0',
  `a155b88` int(10) DEFAULT '0',
  `a155b80c84` int(10) DEFAULT '0',
  `a155b76` int(10) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of femaledayi
-- ----------------------------
INSERT INTO `femaledayi` VALUES ('1', '07XXXX1衣', null, '2', '31', '3', '2', '22', '12', '23', '11', '22', '1', '2', '3', '1', '3', '1', '3', '2');
INSERT INTO `femaledayi` VALUES ('2', '07XXXX2衣', null, '3', '2', '3', '3', '33', '23', '23', '232', '2', '2', '1', '1', '3', '13', '2', '3', '100');
INSERT INTO `femaledayi` VALUES ('3', '07XXXX3衣', '514', '112', '332', '3', '23', '3', '4', '3', '2', '4', '2', '3', '3', '4', '2', '4', '5', '5');
INSERT INTO `femaledayi` VALUES ('4', '07XXXX4衣', null, '3', '2', '2', '22', '3', '11', '23', '32', '21', '3', '3', '3', '1', '1', '1', '1', '13');

-- ----------------------------
-- Table structure for `femaleshangyi`
-- ----------------------------
DROP TABLE IF EXISTS `femaleshangyi`;
CREATE TABLE `femaleshangyi` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `clothesname` varchar(20) NOT NULL,
  `clothesnum` int(20) DEFAULT '0',
  `a175b88` int(10) DEFAULT '0',
  `a170b96` int(10) DEFAULT '0',
  `a170b92` int(10) DEFAULT '0',
  `a170b88` int(10) DEFAULT '0',
  `a170b84` int(10) DEFAULT '0',
  `a170b80` int(10) DEFAULT '0',
  `a165b100` int(10) DEFAULT '0',
  `a165b96` int(10) DEFAULT '0',
  `a165b92` int(10) DEFAULT '0',
  `a165b88` int(10) DEFAULT '0',
  `a165b84` int(10) DEFAULT '0',
  `a165b80` int(10) DEFAULT '0',
  `a160b100` int(10) DEFAULT '0',
  `a160b96` int(10) DEFAULT '0',
  `a160b92` int(10) DEFAULT '0',
  `a160b88` int(10) DEFAULT '0',
  `a160b84` int(10) DEFAULT '0',
  `a160b80` int(10) DEFAULT '0',
  `a160b76` int(10) DEFAULT '0',
  `a155b96` int(10) DEFAULT '0',
  `a155b92` int(10) DEFAULT '0',
  `a155b88` int(10) DEFAULT '0',
  `a155b84` int(10) DEFAULT '0',
  `a155b80` int(10) DEFAULT '0',
  `a155b76` int(10) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of femaleshangyi
-- ----------------------------
INSERT INTO `femaleshangyi` VALUES ('1', '07XXXX1', '2', '2', '4', '6', '8', '6', '66', '85', '6', '6', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '0');
INSERT INTO `femaleshangyi` VALUES ('2', '07XXXX2', '3', '3', '5', '7', '7', '7', '65', '84', '8', '12', '3', '5', '7', '9', '11', '13', '15', '17', '19', '21', '23', '25', '27', '29', '31', '0');
INSERT INTO `femaleshangyi` VALUES ('3', '07XXXX3', '4', '3', '5', '7', '7', '7', '64', '83', '10', '18', '4', '7', '10', '13', '16', '19', '22', '25', '28', '31', '34', '37', '40', '43', '46', '0');
INSERT INTO `femaleshangyi` VALUES ('4', '07XXXX4', '5', '3', '5', '7', '7', '7', '63', '82', '12', '24', '5', '9', '13', '17', '21', '25', '29', '33', '37', '41', '45', '49', '53', '57', '61', '0');
INSERT INTO `femaleshangyi` VALUES ('5', '07XXXX5', '6', '3', '5', '7', '7', '7', '62', '81', '14', '30', '6', '11', '16', '21', '26', '31', '36', '41', '46', '51', '56', '61', '66', '71', '76', '0');
INSERT INTO `femaleshangyi` VALUES ('6', '07XXXX6', '7', '3', '5', '7', '7', '7', '61', '80', '16', '36', '7', '13', '19', '25', '31', '37', '43', '49', '55', '61', '67', '73', '79', '85', '91', '0');
INSERT INTO `femaleshangyi` VALUES ('7', '07XXXX7', '8', '3', '5', '7', '7', '7', '60', '79', '18', '42', '8', '15', '22', '29', '36', '43', '50', '57', '64', '71', '78', '85', '92', '99', '106', '0');
INSERT INTO `femaleshangyi` VALUES ('8', '07XXXX8', '9', '3', '5', '7', '7', '7', '59', '78', '20', '48', '9', '17', '25', '33', '41', '49', '57', '65', '73', '81', '89', '97', '105', '113', '121', '0');
INSERT INTO `femaleshangyi` VALUES ('9', '07XXXX9', '10', '3', '5', '7', '7', '7', '58', '77', '22', '54', '10', '19', '28', '37', '46', '55', '64', '73', '82', '91', '100', '109', '118', '127', '136', '0');
INSERT INTO `femaleshangyi` VALUES ('10', '07XXXX10', '11', '3', '5', '7', '7', '7', '57', '76', '24', '60', '11', '21', '31', '41', '51', '61', '71', '81', '91', '101', '111', '121', '131', '141', '151', '0');
INSERT INTO `femaleshangyi` VALUES ('11', '07XXXX11', '12', '3', '5', '7', '7', '7', '56', '75', '26', '66', '12', '23', '34', '45', '56', '67', '78', '89', '100', '111', '122', '133', '144', '155', '166', '0');

-- ----------------------------
-- Table structure for `femalexiaku`
-- ----------------------------
DROP TABLE IF EXISTS `femalexiaku`;
CREATE TABLE `femalexiaku` (
  `id` int(20) NOT NULL,
  `clothesname` varchar(20) NOT NULL,
  `clothesnum` int(20) DEFAULT '0',
  `a175b93` int(10) DEFAULT '0',
  `a175b83` int(10) DEFAULT '0',
  `a170b78` int(10) DEFAULT '0',
  `a170b73` int(10) DEFAULT '0',
  `a170b68` int(10) DEFAULT '0',
  `a170b64` int(10) DEFAULT '0',
  `a165b88` int(10) DEFAULT '0',
  `a165b83` int(10) DEFAULT '0',
  `a165b78` int(10) DEFAULT '0',
  `a165b73` int(10) DEFAULT '0',
  `a165b68` int(10) DEFAULT '0',
  `a165b64` int(10) DEFAULT '0',
  `a160b88` int(10) DEFAULT '0',
  `a160b83` int(10) DEFAULT '0',
  `a160b78` int(10) DEFAULT '0',
  `a160b73` int(10) DEFAULT '0',
  `a160b68` int(10) DEFAULT '0',
  `a160b64` int(10) DEFAULT '0',
  `a160b60` int(10) DEFAULT '0',
  `a155b83` int(10) DEFAULT '0',
  `a155b78` int(10) DEFAULT '0',
  `a155b68` int(10) DEFAULT '0',
  `a155b64` int(10) DEFAULT NULL,
  `a155b60` int(10) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of femalexiaku
-- ----------------------------
INSERT INTO `femalexiaku` VALUES ('1', 'XXXX1', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', null, '0');
INSERT INTO `femalexiaku` VALUES ('2', 'XXXX2', '0', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24', null, '0');
INSERT INTO `femalexiaku` VALUES ('3', 'XXXX3', '0', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24', '25', '26', null, '0');

-- ----------------------------
-- Table structure for `hat`
-- ----------------------------
DROP TABLE IF EXISTS `hat`;
CREATE TABLE `hat` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `clothesname` varchar(20) NOT NULL,
  `clothesnum` int(20) DEFAULT '0',
  `a53` int(10) NOT NULL DEFAULT '0',
  `a54` int(10) NOT NULL DEFAULT '0',
  `a55` int(10) NOT NULL DEFAULT '0',
  `a56` int(10) NOT NULL DEFAULT '0',
  `a57` int(10) NOT NULL DEFAULT '0',
  `a58` int(10) NOT NULL DEFAULT '0',
  `a59` int(10) NOT NULL DEFAULT '0',
  `a60` int(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hat
-- ----------------------------
INSERT INTO `hat` VALUES ('1', 'XXXX1', '141', '101', '5', '12', '4', '1', '6', '11', '1');
INSERT INTO `hat` VALUES ('2', 'XXXX2', '24', '1', '1', '6', '1', '7', '5', '7', '1');
INSERT INTO `hat` VALUES ('3', 'XXXX3', '65', '5', '12', '22', '1', '7', '4', '7', '7');
INSERT INTO `hat` VALUES ('4', 'XXXX4', '338', '6', '312', '0', '6', '8', '0', '1', '5');
INSERT INTO `hat` VALUES ('5', 'XXXX5', '21', '4', '1', '1', '0', '1', '7', '1', '6');
INSERT INTO `hat` VALUES ('6', 'XXXX6', '44', '8', '1', '1', '8', '7', '5', '7', '7');
INSERT INTO `hat` VALUES ('7', 'XXXX7', '36', '9', '3', '1', '8', '6', '1', '1', '7');
INSERT INTO `hat` VALUES ('8', 'XXXX8', '27', '0', '1', '1', '8', '7', '8', '1', '1');
INSERT INTO `hat` VALUES ('9', 'XXXX9', '44', '1', '11', '1', '8', '7', '1', '7', '8');

-- ----------------------------
-- Table structure for `loadedname`
-- ----------------------------
DROP TABLE IF EXISTS `loadedname`;
CREATE TABLE `loadedname` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '被装品茗id',
  `loadedTypeId` int(20) NOT NULL COMMENT '所属被装类别的id',
  `loadedName` varchar(50) NOT NULL COMMENT '被装品名',
  `loadedNameState` varchar(20) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loadedname
-- ----------------------------
INSERT INTO `loadedname` VALUES ('1', '1', '哈哈哈', '0');
INSERT INTO `loadedname` VALUES ('2', '1', '嘻嘻', '1');
INSERT INTO `loadedname` VALUES ('3', '2', '你你你你你你', '1');
INSERT INTO `loadedname` VALUES ('4', '3', 'asda打算', '1');

-- ----------------------------
-- Table structure for `loadedsize`
-- ----------------------------
DROP TABLE IF EXISTS `loadedsize`;
CREATE TABLE `loadedsize` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '被装号型的id',
  `loadedSizeName` varchar(50) NOT NULL COMMENT '被装好型的名称',
  `loadedSizeList` varchar(255) NOT NULL,
  `loadedSizeState` varchar(20) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loadedsize
-- ----------------------------
INSERT INTO `loadedsize` VALUES ('1', '大衣', '1,2,3,4,5,6', '0');
INSERT INTO `loadedsize` VALUES ('2', '鞋子', '2,3,4,5,6,6', '0');
INSERT INTO `loadedsize` VALUES ('3', '帽子', 'a52,a53,a56', '0');

-- ----------------------------
-- Table structure for `loadedtype`
-- ----------------------------
DROP TABLE IF EXISTS `loadedtype`;
CREATE TABLE `loadedtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '被装类型id',
  `loadedTypeName` varchar(20) NOT NULL COMMENT '被装类型名称',
  `loadedSizeId` int(20) DEFAULT NULL COMMENT '被装类型对应的号型',
  `loadedTypeState` varchar(20) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loadedtype
-- ----------------------------
INSERT INTO `loadedtype` VALUES ('1', '衣服', null, '1');
INSERT INTO `loadedtype` VALUES ('2', '啥都', null, '1');
INSERT INTO `loadedtype` VALUES ('13', '阿斯顿', null, '1');

-- ----------------------------
-- Table structure for `maledayi`
-- ----------------------------
DROP TABLE IF EXISTS `maledayi`;
CREATE TABLE `maledayi` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `clothesname` varchar(20) NOT NULL,
  `clothesnum` int(20) DEFAULT '0',
  `a185b104c108` int(10) DEFAULT '0',
  `a185b100` int(10) DEFAULT '0',
  `a185b92c96` int(10) DEFAULT '0',
  `a180b104c108` int(10) DEFAULT '0',
  `a180b100` int(10) DEFAULT '0',
  `a180b92c96` int(10) DEFAULT '0',
  `a175b104c108` int(10) DEFAULT '0',
  `a175b100` int(10) DEFAULT '0',
  `a175b92c96` int(10) DEFAULT '0',
  `a175b88` int(10) DEFAULT '0',
  `a170b104c108` int(10) DEFAULT '0',
  `a170b100` int(10) DEFAULT '0',
  `a170b92c96` int(10) DEFAULT '0',
  `a170b88` int(10) DEFAULT '0',
  `a165b100` int(10) DEFAULT '0',
  `a165b92c96` int(10) DEFAULT '0',
  `a165b84c88` int(10) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of maledayi
-- ----------------------------
INSERT INTO `maledayi` VALUES ('1', 'XXXX1大衣', '0', '207', '205', '203', '201', '199', '197', '195', '193', '191', '189', '187', '185', '183', '181', '179', '177', '175');
INSERT INTO `maledayi` VALUES ('2', 'XXXX2大衣', '0', '206', '204', '202', '200', '198', '196', '194', '192', '190', '188', '186', '184', '182', '180', '178', '176', '174');
INSERT INTO `maledayi` VALUES ('3', 'XXXX3大衣', '0', '205', '203', '201', '199', '197', '195', '193', '191', '189', '187', '185', '183', '181', '179', '177', '175', '173');
INSERT INTO `maledayi` VALUES ('4', 'XXXX4大衣', '0', '204', '202', '200', '198', '196', '194', '192', '190', '188', '186', '184', '182', '180', '178', '176', '174', '172');
INSERT INTO `maledayi` VALUES ('5', 'XXXX5大衣', '0', '203', '201', '199', '197', '195', '193', '191', '189', '187', '185', '183', '181', '179', '177', '175', '173', '171');
INSERT INTO `maledayi` VALUES ('6', 'XXXX6大衣', '0', '202', '200', '198', '196', '194', '192', '190', '188', '186', '184', '182', '180', '178', '176', '174', '172', '170');
INSERT INTO `maledayi` VALUES ('7', 'XXXX7大衣', '0', '201', '199', '197', '195', '193', '191', '189', '187', '185', '183', '181', '179', '177', '175', '173', '171', '169');
INSERT INTO `maledayi` VALUES ('8', 'XXXX8大衣', '0', '200', '198', '196', '194', '192', '190', '188', '186', '184', '182', '180', '178', '176', '174', '172', '170', '168');
INSERT INTO `maledayi` VALUES ('9', 'XXXX9大衣', '0', '199', '197', '195', '193', '191', '189', '187', '185', '183', '181', '179', '177', '175', '173', '171', '169', '167');
INSERT INTO `maledayi` VALUES ('10', 'XXXX10大衣', '0', '198', '196', '194', '192', '190', '188', '186', '184', '182', '180', '178', '176', '174', '172', '170', '168', '166');
INSERT INTO `maledayi` VALUES ('11', 'XXXX11大衣', '0', '197', '195', '193', '191', '189', '187', '185', '183', '181', '179', '177', '175', '173', '171', '169', '167', '165');
INSERT INTO `maledayi` VALUES ('12', 'XXXX12大衣', '0', '196', '194', '192', '190', '188', '186', '184', '182', '180', '178', '176', '174', '172', '170', '168', '166', '164');
INSERT INTO `maledayi` VALUES ('13', 'XXXX13大衣', '0', '195', '193', '191', '189', '187', '185', '183', '181', '179', '177', '175', '173', '171', '169', '167', '165', '163');
INSERT INTO `maledayi` VALUES ('14', 'XXXX14大衣', '0', '194', '192', '190', '188', '186', '184', '182', '180', '178', '176', '174', '172', '170', '168', '166', '164', '162');

-- ----------------------------
-- Table structure for `maleshangyi`
-- ----------------------------
DROP TABLE IF EXISTS `maleshangyi`;
CREATE TABLE `maleshangyi` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `clothesname` varchar(20) NOT NULL,
  `clothesnum` int(20) DEFAULT '0',
  `a185b104` int(10) DEFAULT '0',
  `a185b100` int(10) DEFAULT '0',
  `a185b96` int(10) DEFAULT '0',
  `a180b108` int(10) DEFAULT '0',
  `a180b104` int(10) DEFAULT '0',
  `a180b100` int(10) DEFAULT '0',
  `a180b96` int(10) DEFAULT '0',
  `a180b92` int(10) DEFAULT '0',
  `a175b108` int(10) DEFAULT '0',
  `a175b104` int(10) DEFAULT '0',
  `a175b100` int(10) DEFAULT '0',
  `a175b96` int(10) DEFAULT '0',
  `a175b92` int(10) DEFAULT '0',
  `a170b108` int(10) DEFAULT '0',
  `a170b104` int(10) DEFAULT '0',
  `a170b100` int(10) DEFAULT '0',
  `a170b96` int(10) DEFAULT '0',
  `a170b92` int(10) DEFAULT '0',
  `a170b88` int(10) DEFAULT '0',
  `a165b100` int(10) DEFAULT '0',
  `a165b96` int(10) DEFAULT '0',
  `a165b92` int(10) DEFAULT '0',
  `a165b88` int(10) DEFAULT '0',
  `a165b84` int(10) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of maleshangyi
-- ----------------------------
INSERT INTO `maleshangyi` VALUES ('1', '07XXXX1服', '0', '500', '499', '498', '497', '496', '495', '494', '493', '492', '491', '490', '489', '488', '487', '486', '485', '484', '483', '482', '481', '480', '479', '478', '477');
INSERT INTO `maleshangyi` VALUES ('2', '07XXXX2服', '0', '497', '496', '495', '494', '493', '492', '491', '490', '489', '488', '487', '486', '485', '484', '483', '482', '481', '480', '479', '478', '477', '476', '475', '474');
INSERT INTO `maleshangyi` VALUES ('3', '07XXXX3服', '0', '494', '493', '492', '491', '490', '489', '488', '487', '486', '485', '484', '483', '482', '481', '480', '479', '478', '477', '476', '475', '474', '473', '472', '471');
INSERT INTO `maleshangyi` VALUES ('4', '07XXXX4服', '0', '491', '490', '489', '488', '487', '486', '485', '484', '483', '482', '481', '480', '479', '478', '477', '476', '475', '474', '473', '472', '471', '470', '469', '468');
INSERT INTO `maleshangyi` VALUES ('5', '07XXXX5服', '0', '488', '487', '486', '485', '484', '483', '482', '481', '480', '479', '478', '477', '476', '475', '474', '473', '472', '471', '470', '469', '468', '467', '466', '465');
INSERT INTO `maleshangyi` VALUES ('6', '07XXXX6服', '0', '485', '484', '483', '482', '481', '480', '479', '478', '477', '476', '475', '474', '473', '472', '471', '470', '469', '468', '467', '466', '465', '464', '463', '462');
INSERT INTO `maleshangyi` VALUES ('7', '07XXXX7服', '0', '482', '481', '480', '479', '478', '477', '476', '475', '474', '473', '472', '471', '470', '469', '468', '467', '466', '465', '464', '463', '462', '461', '460', '459');
INSERT INTO `maleshangyi` VALUES ('8', '07XXXX8衣', '0', '479', '478', '477', '476', '475', '474', '473', '472', '471', '470', '469', '468', '467', '466', '465', '464', '463', '462', '461', '460', '459', '458', '457', '456');
INSERT INTO `maleshangyi` VALUES ('9', '07XXXX9衣', '0', '476', '475', '474', '473', '472', '471', '470', '469', '468', '467', '466', '465', '464', '463', '462', '461', '460', '459', '458', '457', '456', '455', '454', '453');
INSERT INTO `maleshangyi` VALUES ('10', '07XXXX10衣', '0', '473', '472', '471', '470', '469', '468', '467', '466', '465', '464', '463', '462', '461', '460', '459', '458', '457', '456', '455', '454', '453', '452', '451', '450');
INSERT INTO `maleshangyi` VALUES ('11', '07XXXX11衣', '0', '470', '469', '468', '467', '466', '465', '464', '463', '462', '461', '460', '459', '458', '457', '456', '455', '454', '453', '452', '451', '450', '449', '448', '447');
INSERT INTO `maleshangyi` VALUES ('12', '07XXXX12衣', '0', '467', '466', '465', '464', '463', '462', '461', '460', '459', '458', '457', '456', '455', '454', '453', '452', '451', '450', '449', '448', '447', '446', '445', '444');
INSERT INTO `maleshangyi` VALUES ('13', '07XXXX13衣', '0', '464', '463', '462', '461', '460', '459', '458', '457', '456', '455', '454', '453', '452', '451', '450', '449', '448', '447', '446', '445', '444', '443', '442', '441');
INSERT INTO `maleshangyi` VALUES ('14', '07XXXX14衣', '0', '461', '460', '459', '458', '457', '456', '455', '454', '453', '452', '451', '450', '449', '448', '447', '446', '445', '444', '443', '442', '441', '440', '439', '438');
INSERT INTO `maleshangyi` VALUES ('15', '07XXXX15衣', '0', '458', '457', '456', '455', '454', '453', '452', '451', '450', '449', '448', '447', '446', '445', '444', '443', '442', '441', '440', '439', '438', '437', '436', '435');
INSERT INTO `maleshangyi` VALUES ('16', '07XXXX16衣', '0', '455', '454', '453', '452', '451', '450', '449', '448', '447', '446', '445', '444', '443', '442', '441', '440', '439', '438', '437', '436', '435', '434', '433', '432');
INSERT INTO `maleshangyi` VALUES ('17', '07XXXX17衣', '0', '452', '451', '450', '449', '448', '447', '446', '445', '444', '443', '442', '441', '440', '439', '438', '437', '436', '435', '434', '433', '432', '431', '430', '429');
INSERT INTO `maleshangyi` VALUES ('18', '07XXXX18衣', '0', '449', '448', '447', '446', '445', '444', '443', '442', '441', '440', '439', '438', '437', '436', '435', '434', '433', '432', '431', '430', '429', '428', '427', '426');
INSERT INTO `maleshangyi` VALUES ('19', '07XXXX19衣', '0', '446', '445', '444', '443', '442', '441', '440', '439', '438', '437', '436', '435', '434', '433', '432', '431', '430', '429', '428', '427', '426', '425', '424', '423');
INSERT INTO `maleshangyi` VALUES ('20', '07XXXX20衣', '0', '443', '442', '441', '440', '439', '438', '437', '436', '435', '434', '433', '432', '431', '430', '429', '428', '427', '426', '425', '424', '423', '422', '421', '420');
INSERT INTO `maleshangyi` VALUES ('21', '07XXXX21服', '0', '440', '439', '438', '437', '436', '435', '434', '433', '432', '431', '430', '429', '428', '427', '426', '425', '424', '423', '422', '421', '420', '419', '418', '417');
INSERT INTO `maleshangyi` VALUES ('22', '07XXXX22服', '0', '437', '436', '435', '434', '433', '432', '431', '430', '429', '428', '427', '426', '425', '424', '423', '422', '421', '420', '419', '418', '417', '416', '415', '414');
INSERT INTO `maleshangyi` VALUES ('23', '07XXXX23服', '0', '434', '433', '432', '431', '430', '429', '428', '427', '426', '425', '424', '423', '422', '421', '420', '419', '418', '417', '416', '415', '414', '413', '412', '411');
INSERT INTO `maleshangyi` VALUES ('24', '07XXXX24服', '0', '431', '430', '429', '428', '427', '426', '425', '424', '423', '422', '421', '420', '419', '418', '417', '416', '415', '414', '413', '412', '411', '410', '409', '408');
INSERT INTO `maleshangyi` VALUES ('25', '07XXXX25服', '0', '428', '427', '426', '425', '424', '423', '422', '421', '420', '419', '418', '417', '416', '415', '414', '413', '412', '411', '410', '409', '408', '407', '406', '405');
INSERT INTO `maleshangyi` VALUES ('26', '07XXXX26服', '0', '425', '424', '423', '422', '421', '420', '419', '418', '417', '416', '415', '414', '413', '412', '411', '410', '409', '408', '407', '406', '405', '404', '403', '402');
INSERT INTO `maleshangyi` VALUES ('27', '07XXXX27服', '0', '422', '421', '420', '419', '418', '417', '416', '415', '414', '413', '412', '411', '410', '409', '408', '407', '406', '405', '404', '403', '402', '401', '400', '399');
INSERT INTO `maleshangyi` VALUES ('28', '07XXXX28服', '0', '419', '418', '417', '416', '415', '414', '413', '412', '411', '410', '409', '408', '407', '406', '405', '404', '403', '402', '401', '400', '399', '398', '397', '396');
INSERT INTO `maleshangyi` VALUES ('29', '07XXXX29服', '0', '416', '415', '414', '413', '412', '411', '410', '409', '408', '407', '406', '405', '404', '403', '402', '401', '400', '399', '398', '397', '396', '395', '394', '393');
INSERT INTO `maleshangyi` VALUES ('30', '07XXXX30服', '0', '413', '412', '411', '410', '409', '408', '407', '406', '405', '404', '403', '402', '401', '400', '399', '398', '397', '396', '395', '394', '393', '392', '391', '390');
INSERT INTO `maleshangyi` VALUES ('31', '07XXXX31服', '0', '410', '409', '408', '407', '406', '405', '404', '403', '402', '401', '400', '399', '398', '397', '396', '395', '394', '393', '392', '391', '390', '389', '388', '387');
INSERT INTO `maleshangyi` VALUES ('32', '07XXXX32服', '0', '407', '406', '405', '404', '403', '402', '401', '400', '399', '398', '397', '396', '395', '394', '393', '392', '391', '390', '389', '388', '387', '386', '385', '384');
INSERT INTO `maleshangyi` VALUES ('33', '07XXXX33服', '0', '404', '403', '402', '401', '400', '399', '398', '397', '396', '395', '394', '393', '392', '391', '390', '389', '388', '387', '386', '385', '384', '383', '382', '381');
INSERT INTO `maleshangyi` VALUES ('34', '07XXXX34服', '0', '401', '400', '399', '398', '397', '396', '395', '394', '393', '392', '391', '390', '389', '388', '387', '386', '385', '384', '383', '382', '381', '380', '379', '378');
INSERT INTO `maleshangyi` VALUES ('35', '07XXXX35服', '0', '398', '397', '396', '395', '394', '393', '392', '391', '390', '389', '388', '387', '386', '385', '384', '383', '382', '381', '380', '379', '378', '377', '376', '375');
INSERT INTO `maleshangyi` VALUES ('36', '07XXXX36服', '0', '395', '394', '393', '392', '391', '390', '389', '388', '387', '386', '385', '384', '383', '382', '381', '380', '379', '378', '377', '376', '375', '374', '373', '372');
INSERT INTO `maleshangyi` VALUES ('37', '07XXXX37服', '0', '392', '391', '390', '389', '388', '387', '386', '385', '384', '383', '382', '381', '380', '379', '378', '377', '376', '375', '374', '373', '372', '371', '370', '369');
INSERT INTO `maleshangyi` VALUES ('38', '07XXXX38衣', '0', '389', '388', '387', '386', '385', '384', '383', '382', '381', '380', '379', '378', '377', '376', '375', '374', '373', '372', '371', '370', '369', '368', '367', '366');
INSERT INTO `maleshangyi` VALUES ('39', '07XXXX39衣', '0', '386', '385', '384', '383', '382', '381', '380', '379', '378', '377', '376', '375', '374', '373', '372', '371', '370', '369', '368', '367', '366', '365', '364', '363');
INSERT INTO `maleshangyi` VALUES ('40', '07XXXX40衣', '0', '383', '382', '381', '380', '379', '378', '377', '376', '375', '374', '373', '372', '371', '370', '369', '368', '367', '366', '365', '364', '363', '362', '361', '360');
INSERT INTO `maleshangyi` VALUES ('41', '07XXXX41裤', '0', '380', '379', '378', '377', '376', '375', '374', '373', '372', '371', '370', '369', '368', '367', '366', '365', '364', '363', '362', '361', '360', '359', '358', '357');
INSERT INTO `maleshangyi` VALUES ('42', '07XXXX42裤', '0', '377', '376', '375', '374', '373', '372', '371', '370', '369', '368', '367', '366', '365', '364', '363', '362', '361', '360', '359', '358', '357', '356', '355', '354');
INSERT INTO `maleshangyi` VALUES ('43', '07XXXX43裤', '0', '374', '373', '372', '371', '370', '369', '368', '367', '366', '365', '364', '363', '362', '361', '360', '359', '358', '357', '356', '355', '354', '353', '352', '351');
INSERT INTO `maleshangyi` VALUES ('44', '07XXXX44衣', '0', '371', '370', '369', '368', '367', '366', '365', '364', '363', '362', '361', '360', '359', '358', '357', '356', '355', '354', '353', '352', '351', '350', '349', '348');
INSERT INTO `maleshangyi` VALUES ('45', '07XXXX45衣', '0', '368', '367', '366', '365', '364', '363', '362', '361', '360', '359', '358', '357', '356', '355', '354', '353', '352', '351', '350', '349', '348', '347', '346', '345');
INSERT INTO `maleshangyi` VALUES ('46', '07XXXX46衣', '0', '365', '364', '363', '362', '361', '360', '359', '358', '357', '356', '355', '354', '353', '352', '351', '350', '349', '348', '347', '346', '345', '344', '343', '342');
INSERT INTO `maleshangyi` VALUES ('47', '07XXXX47衣', '0', '362', '361', '360', '359', '358', '357', '356', '355', '354', '353', '352', '351', '350', '349', '348', '347', '346', '345', '344', '343', '342', '341', '340', '339');
INSERT INTO `maleshangyi` VALUES ('48', '07XXXX48裤', '0', '359', '358', '357', '356', '355', '354', '353', '352', '351', '350', '349', '348', '347', '346', '345', '344', '343', '342', '341', '340', '339', '338', '337', '336');
INSERT INTO `maleshangyi` VALUES ('49', '07XXXX49服', '0', '356', '355', '354', '353', '352', '351', '350', '349', '348', '347', '346', '345', '344', '343', '342', '341', '340', '339', '338', '337', '336', '335', '334', '333');
INSERT INTO `maleshangyi` VALUES ('50', '07XXXX50服', '0', '353', '352', '351', '350', '349', '348', '347', '346', '345', '344', '343', '342', '341', '340', '339', '338', '337', '336', '335', '334', '333', '332', '331', '330');
INSERT INTO `maleshangyi` VALUES ('51', '07XXXX51服', '0', '350', '349', '348', '347', '346', '345', '344', '343', '342', '341', '340', '339', '338', '337', '336', '335', '334', '333', '332', '331', '330', '329', '328', '327');
INSERT INTO `maleshangyi` VALUES ('52', '07XXXX52服', '0', '347', '346', '345', '344', '343', '342', '341', '340', '339', '338', '337', '336', '335', '334', '333', '332', '331', '330', '329', '328', '327', '326', '325', '324');
INSERT INTO `maleshangyi` VALUES ('53', '07XXXX53服', '0', '344', '343', '342', '341', '340', '339', '338', '337', '336', '335', '334', '333', '332', '331', '330', '329', '328', '327', '326', '325', '324', '323', '322', '321');
INSERT INTO `maleshangyi` VALUES ('54', '07XXXX54服', '0', '341', '340', '339', '338', '337', '336', '335', '334', '333', '332', '331', '330', '329', '328', '327', '326', '325', '324', '323', '322', '321', '320', '319', '318');
INSERT INTO `maleshangyi` VALUES ('55', '07XXXX55服', '0', '338', '337', '336', '335', '334', '333', '332', '331', '330', '329', '328', '327', '326', '325', '324', '323', '322', '321', '320', '319', '318', '317', '316', '315');
INSERT INTO `maleshangyi` VALUES ('56', '07XXXX56服', '0', '335', '334', '333', '332', '331', '330', '329', '328', '327', '326', '325', '324', '323', '322', '321', '320', '319', '318', '317', '316', '315', '314', '313', '312');
INSERT INTO `maleshangyi` VALUES ('57', '07XXXX57服', '0', '332', '331', '330', '329', '328', '327', '326', '325', '324', '323', '322', '321', '320', '319', '318', '317', '316', '315', '314', '313', '312', '311', '310', '309');
INSERT INTO `maleshangyi` VALUES ('58', '07XXXX58服', '0', '329', '328', '327', '326', '325', '324', '323', '322', '321', '320', '319', '318', '317', '316', '315', '314', '313', '312', '311', '310', '309', '308', '307', '306');
INSERT INTO `maleshangyi` VALUES ('59', '07XXXX59服', '0', '326', '325', '324', '323', '322', '321', '320', '319', '318', '317', '316', '315', '314', '313', '312', '311', '310', '309', '308', '307', '306', '305', '304', '303');

-- ----------------------------
-- Table structure for `malexiaku`
-- ----------------------------
DROP TABLE IF EXISTS `malexiaku`;
CREATE TABLE `malexiaku` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `clothesname` varchar(20) NOT NULL,
  `clothesnum` int(20) DEFAULT '0',
  `a185b98` int(10) DEFAULT '0',
  `a185b92` int(10) DEFAULT '0',
  `a185b86` int(10) DEFAULT '0',
  `a180b104` int(10) DEFAULT '0',
  `a180b98` int(10) DEFAULT '0',
  `a180b92` int(10) DEFAULT '0',
  `a180b86` int(10) DEFAULT '0',
  `a180b80` int(10) DEFAULT '0',
  `a175b104` int(10) DEFAULT '0',
  `a175b98` int(10) DEFAULT '0',
  `a175b92` int(10) DEFAULT '0',
  `a175b86` int(10) DEFAULT '0',
  `a175b80` int(10) DEFAULT '0',
  `a175b74` int(10) DEFAULT '0',
  `a170b104` int(10) DEFAULT '0',
  `a170b98` int(10) DEFAULT '0',
  `a170b92` int(10) DEFAULT '0',
  `a170b86` int(10) DEFAULT '0',
  `a170b80` int(10) DEFAULT '0',
  `a170b74` int(10) DEFAULT '0',
  `a165b92` int(10) DEFAULT '0',
  `a165b86` int(10) DEFAULT '0',
  `a165b80` int(10) DEFAULT '0',
  `a165b74` int(10) DEFAULT '0',
  `a165b70` int(10) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of malexiaku
-- ----------------------------
INSERT INTO `malexiaku` VALUES ('1', 'XXXX1', '12201', '500', '499', '498', '497', '496', '495', '494', '493', '492', '491', '490', '489', '488', '487', '486', '485', '484', '483', '482', '481', '480', '479', '478', '477', '476');
INSERT INTO `malexiaku` VALUES ('2', 'XXXX2', '0', '497', '496', '495', '494', '493', '492', '491', '490', '489', '488', '487', '486', '485', '484', '483', '482', '481', '480', '479', '478', '477', '476', '475', '474', '473');
INSERT INTO `malexiaku` VALUES ('3', 'XXXX3', '0', '494', '493', '492', '491', '490', '489', '488', '487', '486', '485', '484', '483', '482', '481', '480', '479', '478', '477', '476', '475', '474', '473', '472', '471', '470');
INSERT INTO `malexiaku` VALUES ('4', 'XXXX4', '0', '491', '490', '489', '488', '487', '486', '485', '484', '483', '482', '481', '480', '479', '478', '477', '476', '475', '474', '473', '472', '471', '470', '469', '468', '467');
INSERT INTO `malexiaku` VALUES ('5', 'XXXX5', '11901', '488', '487', '486', '485', '484', '483', '482', '481', '480', '479', '478', '477', '476', '475', '474', '473', '472', '471', '470', '469', '468', '467', '466', '465', '464');

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(20) NOT NULL,
  `username` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `adminid` int(20) DEFAULT NULL,
  `adminname` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `createtime` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `replytime` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `clothesname` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `size` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `changesize` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `userphone` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `context` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `adminphone` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `replycontext` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `isdo` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `dd` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=456 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('157', '1', '揭跖', '101', '揭镒', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '饱肼', '180/1', '170/1', '1367263331', '这个是第1条信息', '1561769651', '这个是第1回复信息', '0');
INSERT INTO `message` VALUES ('158', '2', '汲坚需', '102', '汲军汛', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '溉臾', '180/2', '170/2', '1367263332', '这个是第2条信息', '1561769652', '这个是第2回复信息', '0');
INSERT INTO `message` VALUES ('159', '3', '抗绂襞', '103', '抗鲅棵', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '息谋', '180/3', '170/3', '1367263333', '这个是第3条信息', '1561769653', '这个是第3回复信息', '0');
INSERT INTO `message` VALUES ('160', '4', '夹谷浒煮', '104', '夹谷憬芥', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '抱赍', '180/4', '170/4', '1367263334', '这个是第4条信息', '1561769654', '这个是第4回复信息', '0');
INSERT INTO `message` VALUES ('161', '5', '达缀', '105', '达骝', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '嶙辽', '180/5', '170/5', '1367263335', '这个是第5条信息', '1561769655', '这个是第5回复信息', '0');
INSERT INTO `message` VALUES ('162', '6', '揭蜢腻', '106', '揭鼋源', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '琴陴', '180/6', '170/6', '1367263336', '这个是第6条信息', '1561769656', '这个是第6回复信息', '0');
INSERT INTO `message` VALUES ('163', '7', '鞠障', '107', '鞠嚣', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '馕鳖', '180/7', '170/7', '1367263337', '这个是第7条信息', '1561769657', '这个是第7回复信息', '0');
INSERT INTO `message` VALUES ('164', '8', '温砹巨', '108', '贲锎洛', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '啄爨', '180/8', '170/8', '1367263338', '这个是第8条信息', '1561769658', '这个是第8回复信息', '0');
INSERT INTO `message` VALUES ('165', '9', '夹谷嚓', '109', '夹谷讳', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '瑛促', '180/9', '170/9', '1367263339', '这个是第9条信息', '1561769659', '这个是第9回复信息', '0');
INSERT INTO `message` VALUES ('166', '10', '燕猫', '110', '燕埒', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '田绨', '180/10', '170/10', '13672633310', '这个是第10条信息', '15617696510', '这个是第10回复信息', '0');
INSERT INTO `message` VALUES ('167', '11', '汪丹壬', '111', '汪需觑', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '络蒌', '180/11', '170/11', '13672633311', '这个是第11条信息', '15617696511', '这个是第11回复信息', '0');
INSERT INTO `message` VALUES ('168', '12', '解豸袼', '112', '解筏麻', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '腋曹', '180/12', '170/12', '13672633312', '这个是第12条信息', '15617696512', '这个是第12回复信息', '0');
INSERT INTO `message` VALUES ('169', '13', '贺膻', '113', '贺刻', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '缣煦', '180/13', '170/13', '13672633313', '这个是第13条信息', '15617696513', '这个是第13回复信息', '0');
INSERT INTO `message` VALUES ('170', '14', '甘庐闹', '114', '甘聿字', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '亏亵', '180/14', '170/14', '13672633314', '这个是第14条信息', '15617696514', '这个是第14回复信息', '0');
INSERT INTO `message` VALUES ('171', '15', '冀麻簿', '115', '冀貉糟', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '岳罚', '180/15', '170/15', '13672633315', '这个是第15条信息', '15617696515', '这个是第15回复信息', '0');
INSERT INTO `message` VALUES ('172', '16', '江间', '116', '展款', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '肇简', '180/16', '170/16', '13672633316', '这个是第16条信息', '15617696516', '这个是第16回复信息', '0');
INSERT INTO `message` VALUES ('173', '17', '岑桧', '117', '岑琳', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '崮荮', '180/17', '170/17', '13672633317', '这个是第17条信息', '15617696517', '这个是第17回复信息', '0');
INSERT INTO `message` VALUES ('174', '18', '陶孢蕾', '118', '陶狭揶', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '躔尥', '180/18', '170/18', '13672633318', '这个是第18条信息', '15617696518', '这个是第18回复信息', '0');
INSERT INTO `message` VALUES ('175', '19', '蔺镥', '119', '蔺阝', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '吒跆', '180/19', '170/19', '13672633319', '这个是第19条信息', '15617696519', '这个是第19回复信息', '0');
INSERT INTO `message` VALUES ('176', '20', '邵李吧', '120', '邵旌仔', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '渭盎', '180/20', '170/20', '13672633320', '这个是第20条信息', '15617696520', '这个是第20回复信息', '0');
INSERT INTO `message` VALUES ('177', '21', '狐蹿阽', '121', '狐璋佟', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '寰蜮', '180/21', '170/21', '13672633321', '这个是第21条信息', '15617696521', '这个是第21回复信息', '0');
INSERT INTO `message` VALUES ('178', '22', '京者', '122', '京卖', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '烯浙', '180/22', '170/22', '13672633322', '这个是第22条信息', '15617696522', '这个是第22回复信息', '0');
INSERT INTO `message` VALUES ('179', '23', '独孤窨谘', '123', '独孤镏含', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '鞍犏', '180/23', '170/23', '13672633323', '这个是第23条信息', '15617696523', '这个是第23回复信息', '0');
INSERT INTO `message` VALUES ('180', '24', '东方怒', '124', '东方龊', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '恳响', '180/24', '170/24', '13672633324', '这个是第24条信息', '15617696524', '这个是第24回复信息', '0');
INSERT INTO `message` VALUES ('181', '25', '颛孙变', '125', '郈崖', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '辱鸫', '180/25', '170/25', '13672633325', '这个是第25条信息', '15617696525', '这个是第25回复信息', '0');
INSERT INTO `message` VALUES ('182', '26', '魏槔妻', '126', '魏遗兹', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '娟潍', '180/26', '170/26', '13672633326', '这个是第26条信息', '15617696526', '这个是第26回复信息', '0');
INSERT INTO `message` VALUES ('183', '27', '简叵悄', '127', '简澧缧', '2016-06-19 11:56:48', '2016-06-19 11:56:48', '浪杼', '180/27', '170/27', '13672633327', '这个是第27条信息', '15617696527', '这个是第27回复信息', '0');
INSERT INTO `message` VALUES ('184', '28', '卓亥灾', '128', '卓狺芪', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '搏逖', '180/28', '170/28', '13672633328', '这个是第28条信息', '15617696528', '这个是第28回复信息', '0');
INSERT INTO `message` VALUES ('185', '29', '廉呃蔼', '129', '廉枞糗', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '蒽顷', '180/29', '170/29', '13672633329', '这个是第29条信息', '15617696529', '这个是第29回复信息', '0');
INSERT INTO `message` VALUES ('186', '30', '宁邻', '130', '宁槌', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '褚钪', '180/30', '170/30', '13672633330', '这个是第30条信息', '15617696530', '这个是第30回复信息', '0');
INSERT INTO `message` VALUES ('187', '31', '高慑', '131', '高媸', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '麻琬', '180/31', '170/31', '13672633331', '这个是第31条信息', '15617696531', '这个是第31回复信息', '0');
INSERT INTO `message` VALUES ('188', '32', '红捉', '132', '红凌', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '訇曩', '180/32', '170/32', '13672633332', '这个是第32条信息', '15617696532', '这个是第32回复信息', '0');
INSERT INTO `message` VALUES ('189', '33', '原扦诃', '133', '原苑恕', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '钿嘭', '180/33', '170/33', '13672633333', '这个是第33条信息', '15617696533', '这个是第33回复信息', '0');
INSERT INTO `message` VALUES ('190', '34', '吉碚', '134', '吉茭', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '钒亲', '180/34', '170/34', '13672633334', '这个是第34条信息', '15617696534', '这个是第34回复信息', '0');
INSERT INTO `message` VALUES ('191', '35', '郏蟑', '135', '韶舳', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '邦贴', '180/35', '170/35', '13672633335', '这个是第35条信息', '15617696535', '这个是第35回复信息', '0');
INSERT INTO `message` VALUES ('192', '36', '崔搔让', '136', '崔嗟缶', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '杩晰', '180/36', '170/36', '13672633336', '这个是第36条信息', '15617696536', '这个是第36回复信息', '0');
INSERT INTO `message` VALUES ('193', '37', '徐镓', '137', '徐庄', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '刚篪', '180/37', '170/37', '13672633337', '这个是第37条信息', '15617696537', '这个是第37回复信息', '0');
INSERT INTO `message` VALUES ('194', '38', '查礞', '138', '查砬', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '赣蜊', '180/38', '170/38', '13672633338', '这个是第38条信息', '15617696538', '这个是第38回复信息', '0');
INSERT INTO `message` VALUES ('195', '39', '查螈瘃', '139', '查矾缪', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '矶氽', '180/39', '170/39', '13672633339', '这个是第39条信息', '15617696539', '这个是第39回复信息', '0');
INSERT INTO `message` VALUES ('196', '40', '褚卷', '140', '褚謇', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '金瘴', '180/40', '170/40', '13672633340', '这个是第40条信息', '15617696540', '这个是第40回复信息', '0');
INSERT INTO `message` VALUES ('197', '41', '乌钙咣', '141', '乌罾铐', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '簖丰', '180/41', '170/41', '13672633341', '这个是第41条信息', '15617696541', '这个是第41回复信息', '0');
INSERT INTO `message` VALUES ('198', '42', '翟刿', '142', '翟货', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '烨嵋', '180/42', '170/42', '13672633342', '这个是第42条信息', '15617696542', '这个是第42回复信息', '0');
INSERT INTO `message` VALUES ('199', '43', '臧潞殍', '143', '臧钣幂', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '磲猁', '180/43', '170/43', '13672633343', '这个是第43条信息', '15617696543', '这个是第43回复信息', '0');
INSERT INTO `message` VALUES ('200', '44', '计赡爿', '144', '计鹉拧', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '酮沅', '180/44', '170/44', '13672633344', '这个是第44条信息', '15617696544', '这个是第44回复信息', '0');
INSERT INTO `message` VALUES ('201', '45', '王投瀵', '145', '王龙滤', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '裔莽', '180/45', '170/45', '13672633345', '这个是第45条信息', '15617696545', '这个是第45回复信息', '0');
INSERT INTO `message` VALUES ('202', '46', '邬靡', '146', '邬弁', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '馐儇', '180/46', '170/46', '13672633346', '这个是第46条信息', '15617696546', '这个是第46回复信息', '0');
INSERT INTO `message` VALUES ('203', '47', '牟媲碓', '147', '牟蛴缚', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '筅盂', '180/47', '170/47', '13672633347', '这个是第47条信息', '15617696547', '这个是第47回复信息', '0');
INSERT INTO `message` VALUES ('204', '48', '过绨', '148', '过渊', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '填刿', '180/48', '170/48', '13672633348', '这个是第48条信息', '15617696548', '这个是第48回复信息', '0');
INSERT INTO `message` VALUES ('205', '49', '葛颃', '149', '葛措', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '嚎摘', '180/49', '170/49', '13672633349', '这个是第49条信息', '15617696549', '这个是第49回复信息', '0');
INSERT INTO `message` VALUES ('206', '50', '周瘐', '150', '周赏', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '蛱怦', '180/50', '170/50', '13672633350', '这个是第50条信息', '15617696550', '这个是第50回复信息', '0');
INSERT INTO `message` VALUES ('207', '51', '广掼', '151', '邓稼龇', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '趄鳋', '180/51', '170/51', '13672633351', '这个是第51条信息', '15617696551', '这个是第51回复信息', '0');
INSERT INTO `message` VALUES ('208', '52', '公冶脚', '152', '公冶肪', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '橙殷', '180/52', '170/52', '13672633352', '这个是第52条信息', '15617696552', '这个是第52回复信息', '0');
INSERT INTO `message` VALUES ('209', '53', '吴漠疋', '153', '吴晋钔', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '冢叻', '180/53', '170/53', '13672633353', '这个是第53条信息', '15617696553', '这个是第53回复信息', '0');
INSERT INTO `message` VALUES ('210', '54', '符压', '154', '符撩', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '虻蟥', '180/54', '170/54', '13672633354', '这个是第54条信息', '15617696554', '这个是第54回复信息', '0');
INSERT INTO `message` VALUES ('211', '55', '段干咸彻', '155', '段干悸目', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '觅久', '180/55', '170/55', '13672633355', '这个是第55条信息', '15617696555', '这个是第55回复信息', '0');
INSERT INTO `message` VALUES ('212', '56', '林页矮', '156', '林乎岳', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '侵钱', '180/56', '170/56', '13672633356', '这个是第56条信息', '15617696556', '这个是第56回复信息', '0');
INSERT INTO `message` VALUES ('213', '57', '南褥', '157', '南浪', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '幸漯', '180/57', '170/57', '13672633357', '这个是第57条信息', '15617696557', '这个是第57回复信息', '0');
INSERT INTO `message` VALUES ('214', '58', '来砉谝', '158', '来雩雀', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '解痢', '180/58', '170/58', '13672633358', '这个是第58条信息', '15617696558', '这个是第58回复信息', '0');
INSERT INTO `message` VALUES ('215', '59', '辜锍', '159', '辜铟', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '砬唏', '180/59', '170/59', '13672633359', '这个是第59条信息', '15617696559', '这个是第59回复信息', '0');
INSERT INTO `message` VALUES ('216', '60', '胡母祭', '160', '岳泽', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '硪觎', '180/60', '170/60', '13672633360', '这个是第60条信息', '15617696560', '这个是第60回复信息', '0');
INSERT INTO `message` VALUES ('217', '61', '柳稻', '161', '柳琛', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '梓荤', '180/61', '170/61', '13672633361', '这个是第61条信息', '15617696561', '这个是第61回复信息', '0');
INSERT INTO `message` VALUES ('218', '62', '叔孙撮', '162', '叔孙亲', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '咀熟', '180/62', '170/62', '13672633362', '这个是第62条信息', '15617696562', '这个是第62回复信息', '0');
INSERT INTO `message` VALUES ('219', '63', '宓既', '163', '宓宫', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '嗖胃', '180/63', '170/63', '13672633363', '这个是第63条信息', '15617696563', '这个是第63回复信息', '0');
INSERT INTO `message` VALUES ('220', '64', '屈突跬', '164', '屈突蜿', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '镨键', '180/64', '170/64', '13672633364', '这个是第64条信息', '15617696564', '这个是第64回复信息', '0');
INSERT INTO `message` VALUES ('221', '65', '方漉洋', '165', '方裤造', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '跗昭', '180/65', '170/65', '13672633365', '这个是第65条信息', '15617696565', '这个是第65回复信息', '0');
INSERT INTO `message` VALUES ('222', '66', '蓬瘛', '166', '蓬辙', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '岽缵', '180/66', '170/66', '13672633366', '这个是第66条信息', '15617696566', '这个是第66回复信息', '0');
INSERT INTO `message` VALUES ('223', '67', '公乘讳蚁', '167', '公乘玢壮', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '簧介', '180/67', '170/67', '13672633367', '这个是第67条信息', '15617696567', '这个是第67回复信息', '0');
INSERT INTO `message` VALUES ('224', '68', '苗毹妥', '168', '苗曷僳', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '锏揭', '180/68', '170/68', '13672633368', '这个是第68条信息', '15617696568', '这个是第68回复信息', '0');
INSERT INTO `message` VALUES ('225', '69', '长孙靳', '169', '长孙扑', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '吭客', '180/69', '170/69', '13672633369', '这个是第69条信息', '15617696569', '这个是第69回复信息', '0');
INSERT INTO `message` VALUES ('226', '70', '秘胗', '170', '秘盯', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '氡苄', '180/70', '170/70', '13672633370', '这个是第70条信息', '15617696570', '这个是第70回复信息', '0');
INSERT INTO `message` VALUES ('227', '71', '逯呖促', '171', '逯绦佳', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '奠倨', '180/71', '170/71', '13672633371', '这个是第71条信息', '15617696571', '这个是第71回复信息', '0');
INSERT INTO `message` VALUES ('228', '72', '容咬', '172', '容磬', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '犀痦', '180/72', '170/72', '13672633372', '这个是第72条信息', '15617696572', '这个是第72回复信息', '0');
INSERT INTO `message` VALUES ('229', '73', '侯辞蹩', '173', '侯镤蒡', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '绩悍', '180/73', '170/73', '13672633373', '这个是第73条信息', '15617696573', '这个是第73回复信息', '0');
INSERT INTO `message` VALUES ('230', '74', '霍医偈', '174', '霍奎蔫', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '宅谔', '180/74', '170/74', '13672633374', '这个是第74条信息', '15617696574', '这个是第74回复信息', '0');
INSERT INTO `message` VALUES ('231', '75', '夔咦', '175', '隗蜚', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '兄让', '180/75', '170/75', '13672633375', '这个是第75条信息', '15617696575', '这个是第75回复信息', '0');
INSERT INTO `message` VALUES ('232', '76', '田帐', '176', '田苌', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '纹焱', '180/76', '170/76', '13672633376', '这个是第76条信息', '15617696576', '这个是第76回复信息', '0');
INSERT INTO `message` VALUES ('233', '77', '韦荥', '177', '韦鐾', '2016-06-19 11:56:49', '2016-06-19 11:56:49', '磴棹', '180/77', '170/77', '13672633377', '这个是第77条信息', '15617696577', '这个是第77回复信息', '0');
INSERT INTO `message` VALUES ('234', '78', '权霪', '178', '权磬', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '颞瀛', '180/78', '170/78', '13672633378', '这个是第78条信息', '15617696578', '这个是第78回复信息', '0');
INSERT INTO `message` VALUES ('235', '79', '申惫破', '179', '申锷衽', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '潇歆', '180/79', '170/79', '13672633379', '这个是第79条信息', '15617696579', '这个是第79回复信息', '0');
INSERT INTO `message` VALUES ('236', '80', '还缱毓', '180', '还断菥', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '乖蚶', '180/80', '170/80', '13672633380', '这个是第80条信息', '15617696580', '这个是第80回复信息', '0');
INSERT INTO `message` VALUES ('237', '81', '佟烹沮', '181', '宰坯辋', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '瘊赀', '180/81', '170/81', '13672633381', '这个是第81条信息', '15617696581', '这个是第81回复信息', '0');
INSERT INTO `message` VALUES ('238', '82', '向瘗', '182', '向懦', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '镇捏', '180/82', '170/82', '13672633382', '这个是第82条信息', '15617696582', '这个是第82回复信息', '0');
INSERT INTO `message` VALUES ('239', '83', '阿闳钓', '183', '阿政亮', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '迹涟', '180/83', '170/83', '13672633383', '这个是第83条信息', '15617696583', '这个是第83回复信息', '0');
INSERT INTO `message` VALUES ('240', '84', '马氮谒', '184', '马嫡剪', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '铙忪', '180/84', '170/84', '13672633384', '这个是第84条信息', '15617696584', '这个是第84回复信息', '0');
INSERT INTO `message` VALUES ('241', '85', '仓炻锱', '185', '仓皆趺', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '踊怕', '180/85', '170/85', '13672633385', '这个是第85条信息', '15617696585', '这个是第85回复信息', '0');
INSERT INTO `message` VALUES ('242', '86', '嵇耳桫', '186', '嵇嫔稽', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '河蕲', '180/86', '170/86', '13672633386', '这个是第86条信息', '15617696586', '这个是第86回复信息', '0');
INSERT INTO `message` VALUES ('243', '87', '舒霏蝶', '187', '舒罾槌', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '槠豹', '180/87', '170/87', '13672633387', '这个是第87条信息', '15617696587', '这个是第87回复信息', '0');
INSERT INTO `message` VALUES ('244', '88', '凤脚', '188', '凤虻', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '鲔茎', '180/88', '170/88', '13672633388', '这个是第88条信息', '15617696588', '这个是第88回复信息', '0');
INSERT INTO `message` VALUES ('245', '89', '屈煤', '189', '屈她', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '橐坡', '180/89', '170/89', '13672633389', '这个是第89条信息', '15617696589', '这个是第89回复信息', '0');
INSERT INTO `message` VALUES ('246', '90', '盖犸', '190', '盖猾', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '愤玑', '180/90', '170/90', '13672633390', '这个是第90条信息', '15617696590', '这个是第90回复信息', '0');
INSERT INTO `message` VALUES ('247', '91', '茹矧崇', '191', '茹忍敲', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '蓰获', '180/91', '170/91', '13672633391', '这个是第91条信息', '15617696591', '这个是第91回复信息', '0');
INSERT INTO `message` VALUES ('248', '92', '游很獗', '192', '游腋颏', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '泖倘', '180/92', '170/92', '13672633392', '这个是第92条信息', '15617696592', '这个是第92回复信息', '0');
INSERT INTO `message` VALUES ('249', '93', '蔡仟畲', '193', '第五槛耐', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '恶轾', '180/93', '170/93', '13672633393', '这个是第93条信息', '15617696593', '这个是第93回复信息', '0');
INSERT INTO `message` VALUES ('250', '94', '庞愉', '194', '庞桄', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '迎觜', '180/94', '170/94', '13672633394', '这个是第94条信息', '15617696594', '这个是第94回复信息', '0');
INSERT INTO `message` VALUES ('251', '95', '练胜', '195', '练梯', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '梏鸱', '180/95', '170/95', '13672633395', '这个是第95条信息', '15617696595', '这个是第95回复信息', '0');
INSERT INTO `message` VALUES ('252', '96', '隆羼尾', '196', '隆贾肴', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '偶币', '180/96', '170/96', '13672633396', '这个是第96条信息', '15617696596', '这个是第96回复信息', '0');
INSERT INTO `message` VALUES ('253', '97', '田苎', '197', '田蛔', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '螋枋', '180/97', '170/97', '13672633397', '这个是第97条信息', '15617696597', '这个是第97回复信息', '0');
INSERT INTO `message` VALUES ('254', '98', '龚敷跎', '198', '龚琬氵', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '书纣', '180/98', '170/98', '13672633398', '这个是第98条信息', '15617696598', '这个是第98回复信息', '0');
INSERT INTO `message` VALUES ('255', '99', '竺阻忉', '199', '竺只浑', '2016-06-19 11:56:50', '2016-06-19 11:56:50', '十峪', '180/99', '170/99', '13672633399', '这个是第99条信息', '15617696599', '这个是第99回复信息', '0');
INSERT INTO `message` VALUES ('256', '100', '阿玢', '200', '古昔绺', '2016-06-19 12:08:48', '2016-06-19 12:08:48', '渥奉', '180/100', '170/100', '136726333100', '这个是第100条信息', '156176965100', '这个是第100回复信息', '0');
INSERT INTO `message` VALUES ('257', '101', '揭珧嚓', '201', '揭蹲逶', '2016-06-19 12:08:48', '2016-06-19 12:08:48', '谥犭', '180/101', '170/101', '136726333101', '这个是第101条信息', '156176965101', '这个是第101回复信息', '0');
INSERT INTO `message` VALUES ('258', '102', '毋探昕', '202', '毋忪滕', '2016-06-19 12:08:48', '2016-06-19 12:08:48', '鲶辋', '180/102', '170/102', '136726333102', '这个是第102条信息', '156176965102', '这个是第102回复信息', '0');
INSERT INTO `message` VALUES ('259', '103', '皇甫豸', '203', '皇甫刻', '2016-06-19 12:08:48', '2016-06-19 12:08:48', '秧嘛', '180/103', '170/103', '136726333103', '这个是第103条信息', '156176965103', '这个是第103回复信息', '0');
INSERT INTO `message` VALUES ('260', '104', '卓罟叁', '204', '卓棕困', '2016-06-19 12:08:48', '2016-06-19 12:08:48', '碴叩', '180/104', '170/104', '136726333104', '这个是第104条信息', '156176965104', '这个是第104回复信息', '0');
INSERT INTO `message` VALUES ('261', '105', '子车判', '205', '子车戊', '2016-06-19 12:08:48', '2016-06-19 12:08:48', '胗厉', '180/105', '170/105', '136726333105', '这个是第105条信息', '156176965105', '这个是第105回复信息', '0');
INSERT INTO `message` VALUES ('262', '106', '衡玩', '206', '衡慷', '2016-06-19 12:08:48', '2016-06-19 12:08:48', '哈敞', '180/106', '170/106', '136726333106', '这个是第106条信息', '156176965106', '这个是第106回复信息', '0');
INSERT INTO `message` VALUES ('263', '107', '居黔', '207', '居蟒', '2016-06-19 12:08:48', '2016-06-19 12:08:48', '陴钽', '180/107', '170/107', '136726333107', '这个是第107条信息', '156176965107', '这个是第107回复信息', '0');
INSERT INTO `message` VALUES ('264', '108', '闵坫啖', '208', '闵岢躬', '2016-06-19 12:08:49', '2016-06-19 12:08:49', '馗揠', '180/108', '170/108', '136726333108', '这个是第108条信息', '156176965108', '这个是第108回复信息', '0');
INSERT INTO `message` VALUES ('265', '109', '莫筹', '209', '莫甸', '2016-06-19 12:08:49', '2016-06-19 12:08:49', '桨拙', '180/109', '170/109', '136726333109', '这个是第109条信息', '156176965109', '这个是第109回复信息', '0');
INSERT INTO `message` VALUES ('266', '110', '从绊相', '210', '从弱珀', '2016-06-19 12:08:49', '2016-06-19 12:08:49', '亨说', '180/110', '170/110', '136726333110', '这个是第110条信息', '156176965110', '这个是第110回复信息', '0');
INSERT INTO `message` VALUES ('267', '111', '勾柝', '211', '勾摹', '2016-06-19 12:08:49', '2016-06-19 12:08:49', '垢刳', '180/111', '170/111', '136726333111', '这个是第111条信息', '156176965111', '这个是第111回复信息', '0');
INSERT INTO `message` VALUES ('268', '112', '慎三湔', '212', '慎缗欠', '2016-06-19 12:08:49', '2016-06-19 12:08:49', '蓓弹', '180/112', '170/112', '136726333112', '这个是第112条信息', '156176965112', '这个是第112回复信息', '0');
INSERT INTO `message` VALUES ('269', '113', '公冶蝴', '213', '公冶荃', '2016-06-19 12:08:49', '2016-06-19 12:08:49', '斋盎', '180/113', '170/113', '136726333113', '这个是第113条信息', '156176965113', '这个是第113回复信息', '0');
INSERT INTO `message` VALUES ('270', '114', '童怛摹', '214', '童粞阎', '2016-06-19 12:08:49', '2016-06-19 12:08:49', '馆腰', '180/114', '170/114', '136726333114', '这个是第114条信息', '156176965114', '这个是第114回复信息', '0');
INSERT INTO `message` VALUES ('271', '115', '储亿糨', '215', '储茼组', '2016-06-19 12:08:49', '2016-06-19 12:08:49', '之该', '180/115', '170/115', '136726333115', '这个是第115条信息', '156176965115', '这个是第115回复信息', '0');
INSERT INTO `message` VALUES ('272', '116', '木页篚', '216', '木蚣和', '2016-06-19 12:08:49', '2016-06-19 12:08:49', '汊捋', '180/116', '170/116', '136726333116', '这个是第116条信息', '156176965116', '这个是第116回复信息', '0');
INSERT INTO `message` VALUES ('273', '117', '薛凝', '217', '薛崩', '2016-06-19 12:08:49', '2016-06-19 12:08:49', '衤碲', '180/117', '170/117', '136726333117', '这个是第117条信息', '156176965117', '这个是第117回复信息', '0');
INSERT INTO `message` VALUES ('274', '118', '齐蓓待', '218', '齐璨肺', '2016-06-19 12:08:49', '2016-06-19 12:08:49', '过濑', '180/118', '170/118', '136726333118', '这个是第118条信息', '156176965118', '这个是第118回复信息', '0');
INSERT INTO `message` VALUES ('275', '119', '皋蓉', '219', '皋聊', '2016-06-19 12:08:50', '2016-06-19 12:08:50', '隗沉', '180/119', '170/119', '136726333119', '这个是第119条信息', '156176965119', '这个是第119回复信息', '0');
INSERT INTO `message` VALUES ('276', '120', '沈帖屣', '220', '沈噗缱', '2016-06-19 12:08:50', '2016-06-19 12:08:50', '嗪耶', '180/120', '170/120', '136726333120', '这个是第120条信息', '156176965120', '这个是第120回复信息', '0');
INSERT INTO `message` VALUES ('277', '121', '查轳', '221', '查茫', '2016-06-19 12:08:50', '2016-06-19 12:08:50', '蜡要', '180/121', '170/121', '136726333121', '这个是第121条信息', '156176965121', '这个是第121回复信息', '0');
INSERT INTO `message` VALUES ('278', '122', '濮阳骜', '222', '濮阳氨', '2016-06-19 12:08:50', '2016-06-19 12:08:50', '政鳄', '180/122', '170/122', '136726333122', '这个是第122条信息', '156176965122', '这个是第122回复信息', '0');
INSERT INTO `message` VALUES ('279', '123', '东劓', '223', '东午', '2016-06-19 12:08:50', '2016-06-19 12:08:50', '蒲懦', '180/123', '170/123', '136726333123', '这个是第123条信息', '156176965123', '这个是第123回复信息', '0');
INSERT INTO `message` VALUES ('280', '124', '司城谔', '224', '司城飧', '2016-06-19 12:08:50', '2016-06-19 12:08:50', '蝈鲚', '180/124', '170/124', '136726333124', '这个是第124条信息', '156176965124', '这个是第124回复信息', '0');
INSERT INTO `message` VALUES ('281', '125', '席疔自', '225', '席书捏', '2016-06-19 12:08:50', '2016-06-19 12:08:50', '砭宿', '180/125', '170/125', '136726333125', '这个是第125条信息', '156176965125', '这个是第125回复信息', '0');
INSERT INTO `message` VALUES ('282', '126', '纵足', '226', '纵罩', '2016-06-19 12:08:50', '2016-06-19 12:08:50', '烀沁', '180/126', '170/126', '136726333126', '这个是第126条信息', '156176965126', '这个是第126回复信息', '0');
INSERT INTO `message` VALUES ('283', '127', '花遣', '227', '花芳', '2016-06-19 12:08:50', '2016-06-19 12:08:50', '刳淞', '180/127', '170/127', '136726333127', '这个是第127条信息', '156176965127', '这个是第127回复信息', '0');
INSERT INTO `message` VALUES ('284', '128', '怀吓', '228', '怀穸', '2016-06-19 12:08:50', '2016-06-19 12:08:50', '埚铰', '180/128', '170/128', '136726333128', '这个是第128条信息', '156176965128', '这个是第128回复信息', '0');
INSERT INTO `message` VALUES ('285', '129', '车哮', '229', '车夸', '2016-06-19 12:08:50', '2016-06-19 12:08:50', '掴焕', '180/129', '170/129', '136726333129', '这个是第129条信息', '156176965129', '这个是第129回复信息', '0');
INSERT INTO `message` VALUES ('286', '130', '满铥', '230', '满淆', '2016-06-19 12:08:50', '2016-06-19 12:08:50', '壕壕', '180/130', '170/130', '136726333130', '这个是第130条信息', '156176965130', '这个是第130回复信息', '0');
INSERT INTO `message` VALUES ('287', '131', '楚忖', '231', '楚肯', '2016-06-19 12:08:51', '2016-06-19 12:08:51', '悝徇', '180/131', '170/131', '136726333131', '这个是第131条信息', '156176965131', '这个是第131回复信息', '0');
INSERT INTO `message` VALUES ('288', '132', '公西壅循', '232', '公西摩搔', '2016-06-19 12:08:51', '2016-06-19 12:08:51', '忪瞬', '180/132', '170/132', '136726333132', '这个是第132条信息', '156176965132', '这个是第132回复信息', '0');
INSERT INTO `message` VALUES ('289', '133', '东方树', '233', '东方匹', '2016-06-19 12:08:51', '2016-06-19 12:08:51', '滩馋', '180/133', '170/133', '136726333133', '这个是第133条信息', '156176965133', '这个是第133回复信息', '0');
INSERT INTO `message` VALUES ('290', '134', '夏侯淝蘖', '234', '夏侯桑棺', '2016-06-19 12:08:51', '2016-06-19 12:08:51', '窕岬', '180/134', '170/134', '136726333134', '这个是第134条信息', '156176965134', '这个是第134回复信息', '0');
INSERT INTO `message` VALUES ('291', '135', '羊沽', '235', '羊撸', '2016-06-19 12:08:51', '2016-06-19 12:08:51', '稹崛', '180/135', '170/135', '136726333135', '这个是第135条信息', '156176965135', '这个是第135回复信息', '0');
INSERT INTO `message` VALUES ('292', '136', '季陴', '236', '季阙', '2016-06-19 12:08:51', '2016-06-19 12:08:51', '噍殂', '180/136', '170/136', '136726333136', '这个是第136条信息', '156176965136', '这个是第136回复信息', '0');
INSERT INTO `message` VALUES ('293', '137', '阎垢箧', '237', '阎岵梯', '2016-06-19 12:08:51', '2016-06-19 12:08:51', '惮钌', '180/137', '170/137', '136726333137', '这个是第137条信息', '156176965137', '这个是第137回复信息', '0');
INSERT INTO `message` VALUES ('294', '138', '苏塑', '238', '苏脒', '2016-06-19 12:08:51', '2016-06-19 12:08:51', '埕昊', '180/138', '170/138', '136726333138', '这个是第138条信息', '156176965138', '这个是第138回复信息', '0');
INSERT INTO `message` VALUES ('295', '139', '包彻', '239', '包见', '2016-06-19 12:08:51', '2016-06-19 12:08:51', '她钫', '180/139', '170/139', '136726333139', '这个是第139条信息', '156176965139', '这个是第139回复信息', '0');
INSERT INTO `message` VALUES ('296', '140', '段干仃', '240', '段干鲻', '2016-06-19 12:08:51', '2016-06-19 12:08:51', '敖庞', '180/140', '170/140', '136726333140', '这个是第140条信息', '156176965140', '这个是第140回复信息', '0');
INSERT INTO `message` VALUES ('297', '141', '阴鹪癜', '241', '阴绉俩', '2016-06-19 12:08:51', '2016-06-19 12:08:51', '津膛', '180/141', '170/141', '136726333141', '这个是第141条信息', '156176965141', '这个是第141回复信息', '0');
INSERT INTO `message` VALUES ('298', '142', '舜褊', '242', '舜豆', '2016-06-19 12:08:51', '2016-06-19 12:08:51', '绘尾', '180/142', '170/142', '136726333142', '这个是第142条信息', '156176965142', '这个是第142回复信息', '0');
INSERT INTO `message` VALUES ('299', '143', '安燥', '243', '淳于殁褥', '2016-06-19 12:08:52', '2016-06-19 12:08:52', '沲玺', '180/143', '170/143', '136726333143', '这个是第143条信息', '156176965143', '这个是第143回复信息', '0');
INSERT INTO `message` VALUES ('300', '144', '涂誉觏', '244', '涂坩窃', '2016-06-19 12:08:52', '2016-06-19 12:08:52', '抠屋', '180/144', '170/144', '136726333144', '这个是第144条信息', '156176965144', '这个是第144回复信息', '0');
INSERT INTO `message` VALUES ('301', '145', '钦柩壳', '245', '钦犍浓', '2016-06-19 12:08:52', '2016-06-19 12:08:52', '这谚', '180/145', '170/145', '136726333145', '这个是第145条信息', '156176965145', '这个是第145回复信息', '0');
INSERT INTO `message` VALUES ('302', '146', '狄谐', '246', '狄蠢', '2016-06-19 12:08:52', '2016-06-19 12:08:52', '嘎踢', '180/146', '170/146', '136726333146', '这个是第146条信息', '156176965146', '这个是第146回复信息', '0');
INSERT INTO `message` VALUES ('303', '147', '弘拙', '247', '弘锕', '2016-06-19 12:08:52', '2016-06-19 12:08:52', '砜俱', '180/147', '170/147', '136726333147', '这个是第147条信息', '156176965147', '这个是第147回复信息', '0');
INSERT INTO `message` VALUES ('304', '148', '禹升倔', '248', '禹腩镬', '2016-06-19 12:08:52', '2016-06-19 12:08:52', '筅遽', '180/148', '170/148', '136726333148', '这个是第148条信息', '156176965148', '这个是第148回复信息', '0');
INSERT INTO `message` VALUES ('305', '149', '益椋债', '249', '益骊陆', '2016-06-19 12:08:52', '2016-06-19 12:08:52', '塬蚌', '180/149', '170/149', '136726333149', '这个是第149条信息', '156176965149', '这个是第149回复信息', '0');
INSERT INTO `message` VALUES ('306', '150', '鲜于凭', '250', '鲜于址', '2016-06-19 12:08:52', '2016-06-19 12:08:52', '脬嘴', '180/150', '170/150', '136726333150', '这个是第150条信息', '156176965150', '这个是第150回复信息', '0');
INSERT INTO `message` VALUES ('307', '151', '谷杈职', '251', '谷沅镆', '2016-06-19 12:08:52', '2016-06-19 12:08:52', '叉贽', '180/151', '170/151', '136726333151', '这个是第151条信息', '156176965151', '这个是第151回复信息', '0');
INSERT INTO `message` VALUES ('308', '152', '司套结', '252', '司纭旺', '2016-06-19 12:08:52', '2016-06-19 12:08:52', '领馊', '180/152', '170/152', '136726333152', '这个是第152条信息', '156176965152', '这个是第152回复信息', '0');
INSERT INTO `message` VALUES ('309', '153', '太叔霾', '253', '沃火', '2016-06-19 12:08:52', '2016-06-19 12:08:52', '五蹦', '180/153', '170/153', '136726333153', '这个是第153条信息', '156176965153', '这个是第153回复信息', '0');
INSERT INTO `message` VALUES ('310', '154', '端朦角', '254', '端毵黎', '2016-06-19 12:08:52', '2016-06-19 12:08:52', '闵香', '180/154', '170/154', '136726333154', '这个是第154条信息', '156176965154', '这个是第154回复信息', '0');
INSERT INTO `message` VALUES ('311', '155', '于浇', '255', '鲍舷煞', '2016-06-19 12:08:53', '2016-06-19 12:08:53', '豪圃', '180/155', '170/155', '136726333155', '这个是第155条信息', '156176965155', '这个是第155回复信息', '0');
INSERT INTO `message` VALUES ('312', '156', '金蠃圾', '256', '金又钓', '2016-06-19 12:08:53', '2016-06-19 12:08:53', '皲炯', '180/156', '170/156', '136726333156', '这个是第156条信息', '156176965156', '这个是第156回复信息', '0');
INSERT INTO `message` VALUES ('313', '157', '庾受', '257', '庾虾', '2016-06-19 12:08:53', '2016-06-19 12:08:53', '莠争', '180/157', '170/157', '136726333157', '这个是第157条信息', '156176965157', '这个是第157回复信息', '0');
INSERT INTO `message` VALUES ('314', '158', '吕蛤鹾', '258', '吕愍踩', '2016-06-19 12:08:53', '2016-06-19 12:08:53', '产楂', '180/158', '170/158', '136726333158', '这个是第158条信息', '156176965158', '这个是第158回复信息', '0');
INSERT INTO `message` VALUES ('315', '159', '戈拱', '259', '戈娌', '2016-06-19 12:08:53', '2016-06-19 12:08:53', '鸷汆', '180/159', '170/159', '136726333159', '这个是第159条信息', '156176965159', '这个是第159回复信息', '0');
INSERT INTO `message` VALUES ('316', '160', '祝缃炬', '260', '祝伏京', '2016-06-19 12:08:53', '2016-06-19 12:08:53', '按榕', '180/160', '170/160', '136726333160', '这个是第160条信息', '156176965160', '这个是第160回复信息', '0');
INSERT INTO `message` VALUES ('317', '161', '尉迟挖', '261', '尉迟皓', '2016-06-19 12:08:53', '2016-06-19 12:08:53', '喙继', '180/161', '170/161', '136726333161', '这个是第161条信息', '156176965161', '这个是第161回复信息', '0');
INSERT INTO `message` VALUES ('318', '162', '武抚', '262', '武莼', '2016-06-19 12:08:53', '2016-06-19 12:08:53', '冻梯', '180/162', '170/162', '136726333162', '这个是第162条信息', '156176965162', '这个是第162回复信息', '0');
INSERT INTO `message` VALUES ('319', '163', '赵斡旌', '263', '敬猓', '2016-06-19 12:08:53', '2016-06-19 12:08:53', '蘼酥', '180/163', '170/163', '136726333163', '这个是第163条信息', '156176965163', '这个是第163回复信息', '0');
INSERT INTO `message` VALUES ('320', '164', '繁泄', '264', '繁辫', '2016-06-19 12:08:53', '2016-06-19 12:08:53', '蛤撄', '180/164', '170/164', '136726333164', '这个是第164条信息', '156176965164', '这个是第164回复信息', '0');
INSERT INTO `message` VALUES ('321', '165', '晋椰', '265', '晋钾', '2016-06-19 12:08:53', '2016-06-19 12:08:53', '鹅殉', '180/165', '170/165', '136726333165', '这个是第165条信息', '156176965165', '这个是第165回复信息', '0');
INSERT INTO `message` VALUES ('322', '166', '姚进舂', '266', '端木娩', '2016-06-19 12:08:53', '2016-06-19 12:08:53', '嵛效', '180/166', '170/166', '136726333166', '这个是第166条信息', '156176965166', '这个是第166回复信息', '0');
INSERT INTO `message` VALUES ('323', '167', '连泵仝', '267', '连函圹', '2016-06-19 12:08:54', '2016-06-19 12:08:54', '级藜', '180/167', '170/167', '136726333167', '这个是第167条信息', '156176965167', '这个是第167回复信息', '0');
INSERT INTO `message` VALUES ('324', '168', '茅檩柩', '268', '南宫掎', '2016-06-19 12:08:54', '2016-06-19 12:08:54', '肜峁', '180/168', '170/168', '136726333168', '这个是第168条信息', '156176965168', '这个是第168回复信息', '0');
INSERT INTO `message` VALUES ('325', '169', '范汊借', '269', '竹缦', '2016-06-19 12:08:54', '2016-06-19 12:08:54', '尔貂', '180/169', '170/169', '136726333169', '这个是第169条信息', '156176965169', '这个是第169回复信息', '0');
INSERT INTO `message` VALUES ('326', '170', '西门叠评', '270', '石湎', '2016-06-19 12:08:54', '2016-06-19 12:08:54', '炽门', '180/170', '170/170', '136726333170', '这个是第170条信息', '156176965170', '这个是第170回复信息', '0');
INSERT INTO `message` VALUES ('327', '171', '詹坊', '271', '詹滢', '2016-06-19 12:08:54', '2016-06-19 12:08:54', '蔻猸', '180/171', '170/171', '136726333171', '这个是第171条信息', '156176965171', '这个是第171回复信息', '0');
INSERT INTO `message` VALUES ('328', '172', '别潍囤', '272', '别坪扇', '2016-06-19 12:08:54', '2016-06-19 12:08:54', '霍尊', '180/172', '170/172', '136726333172', '这个是第172条信息', '156176965172', '这个是第172回复信息', '0');
INSERT INTO `message` VALUES ('329', '173', '蒯邓', '273', '蒯睾', '2016-06-19 12:08:54', '2016-06-19 12:08:54', '昴二', '180/173', '170/173', '136726333173', '这个是第173条信息', '156176965173', '这个是第173回复信息', '0');
INSERT INTO `message` VALUES ('330', '174', '廖粕', '274', '廖肜', '2016-06-19 12:08:54', '2016-06-19 12:08:54', '澎铿', '180/174', '170/174', '136726333174', '这个是第174条信息', '156176965174', '这个是第174回复信息', '0');
INSERT INTO `message` VALUES ('331', '175', '覃禧', '275', '晁桶澈', '2016-06-19 12:08:54', '2016-06-19 12:08:54', '扮琼', '180/175', '170/175', '136726333175', '这个是第175条信息', '156176965175', '这个是第175回复信息', '0');
INSERT INTO `message` VALUES ('332', '176', '东乡菇', '276', '东乡燕', '2016-06-19 12:08:54', '2016-06-19 12:08:54', '滏墒', '180/176', '170/176', '136726333176', '这个是第176条信息', '156176965176', '这个是第176回复信息', '0');
INSERT INTO `message` VALUES ('333', '177', '蹇专婵', '277', '蹇悠尢', '2016-06-19 12:08:54', '2016-06-19 12:08:54', '糖莪', '180/177', '170/177', '136726333177', '这个是第177条信息', '156176965177', '这个是第177回复信息', '0');
INSERT INTO `message` VALUES ('334', '178', '卞渝', '278', '卞陌', '2016-06-19 12:08:54', '2016-06-19 12:08:54', '擐甸', '180/178', '170/178', '136726333178', '这个是第178条信息', '156176965178', '这个是第178回复信息', '0');
INSERT INTO `message` VALUES ('335', '179', '蓟曛', '279', '胡唼鹨', '2016-06-19 12:08:55', '2016-06-19 12:08:55', '奎匐', '180/179', '170/179', '136726333179', '这个是第179条信息', '156176965179', '这个是第179回复信息', '0');
INSERT INTO `message` VALUES ('336', '180', '裴鹞锅', '280', '俞莪', '2016-06-19 12:08:55', '2016-06-19 12:08:55', '肫稳', '180/180', '170/180', '136726333180', '这个是第180条信息', '156176965180', '这个是第180回复信息', '0');
INSERT INTO `message` VALUES ('337', '181', '眭造蕺', '281', '鱼蹀伴', '2016-06-19 12:08:55', '2016-06-19 12:08:55', '冂漳', '180/181', '170/181', '136726333181', '这个是第181条信息', '156176965181', '这个是第181回复信息', '0');
INSERT INTO `message` VALUES ('338', '182', '花垠', '282', '邝伽', '2016-06-19 12:08:55', '2016-06-19 12:08:55', '尿香', '180/182', '170/182', '136726333182', '这个是第182条信息', '156176965182', '这个是第182回复信息', '0');
INSERT INTO `message` VALUES ('339', '183', '艾睾峒', '283', '艾阢慈', '2016-06-19 12:08:55', '2016-06-19 12:08:55', '寞抗', '180/183', '170/183', '136726333183', '这个是第183条信息', '156176965183', '这个是第183回复信息', '0');
INSERT INTO `message` VALUES ('340', '184', '卫璁浅', '284', '卫缈谪', '2016-06-19 12:08:55', '2016-06-19 12:08:55', '筇潸', '180/184', '170/184', '136726333184', '这个是第184条信息', '156176965184', '这个是第184回复信息', '0');
INSERT INTO `message` VALUES ('341', '185', '劳笏桡', '285', '劳唱抽', '2016-06-19 12:08:55', '2016-06-19 12:08:55', '疟牛', '180/185', '170/185', '136726333185', '这个是第185条信息', '156176965185', '这个是第185回复信息', '0');
INSERT INTO `message` VALUES ('342', '186', '岑阋', '286', '岑萄', '2016-06-19 12:08:55', '2016-06-19 12:08:55', '影穰', '180/186', '170/186', '136726333186', '这个是第186条信息', '156176965186', '这个是第186回复信息', '0');
INSERT INTO `message` VALUES ('343', '187', '华抛', '287', '华细', '2016-06-19 12:08:55', '2016-06-19 12:08:55', '倜豆', '180/187', '170/187', '136726333187', '这个是第187条信息', '156176965187', '这个是第187回复信息', '0');
INSERT INTO `message` VALUES ('344', '188', '曲诊铰', '288', '费夺首', '2016-06-19 12:08:55', '2016-06-19 12:08:55', '造渗', '180/188', '170/188', '136726333188', '这个是第188条信息', '156176965188', '这个是第188回复信息', '0');
INSERT INTO `message` VALUES ('345', '189', '羊诱狙', '289', '羊癌黑', '2016-06-19 12:08:55', '2016-06-19 12:08:55', '牵姜', '180/189', '170/189', '136726333189', '这个是第189条信息', '156176965189', '这个是第189回复信息', '0');
INSERT INTO `message` VALUES ('346', '190', '敖番荪', '290', '敖历推', '2016-06-19 12:08:55', '2016-06-19 12:08:55', '仅蜮', '180/190', '170/190', '136726333190', '这个是第190条信息', '156176965190', '这个是第190回复信息', '0');
INSERT INTO `message` VALUES ('347', '191', '孔潆', '291', '孔咪', '2016-06-19 12:08:56', '2016-06-19 12:08:56', '躁记', '180/191', '170/191', '136726333191', '这个是第191条信息', '156176965191', '这个是第191回复信息', '0');
INSERT INTO `message` VALUES ('348', '192', '林拌贾', '292', '郑甥', '2016-06-19 12:08:56', '2016-06-19 12:08:56', '妈么', '180/192', '170/192', '136726333192', '这个是第192条信息', '156176965192', '这个是第192回复信息', '0');
INSERT INTO `message` VALUES ('349', '193', '舜荀', '293', '胥孝花', '2016-06-19 12:08:56', '2016-06-19 12:08:56', '痤径', '180/193', '170/193', '136726333193', '这个是第193条信息', '156176965193', '这个是第193回复信息', '0');
INSERT INTO `message` VALUES ('350', '194', '能艰', '294', '能旋', '2016-06-19 12:08:56', '2016-06-19 12:08:56', '皴狒', '180/194', '170/194', '136726333194', '这个是第194条信息', '156176965194', '这个是第194回复信息', '0');
INSERT INTO `message` VALUES ('351', '195', '钱雄乔', '295', '钱铙茆', '2016-06-19 12:08:56', '2016-06-19 12:08:56', '漳枋', '180/195', '170/195', '136726333195', '这个是第195条信息', '156176965195', '这个是第195回复信息', '0');
INSERT INTO `message` VALUES ('352', '196', '颜定', '296', '颜斡', '2016-06-19 12:08:56', '2016-06-19 12:08:56', '包藤', '180/196', '170/196', '136726333196', '这个是第196条信息', '156176965196', '这个是第196回复信息', '0');
INSERT INTO `message` VALUES ('353', '197', '宗疙勇', '297', '宗穆柬', '2016-06-19 12:08:56', '2016-06-19 12:08:56', '垆咆', '180/197', '170/197', '136726333197', '这个是第197条信息', '156176965197', '这个是第197回复信息', '0');
INSERT INTO `message` VALUES ('354', '198', '权盏', '298', '黎鹆徂', '2016-06-19 12:08:56', '2016-06-19 12:08:56', '轵蟑', '180/198', '170/198', '136726333198', '这个是第198条信息', '156176965198', '这个是第198回复信息', '0');
INSERT INTO `message` VALUES ('355', '199', '侯豁种', '299', '侯噌饪', '2016-06-19 12:08:56', '2016-06-19 12:08:56', '擀机', '180/199', '170/199', '136726333199', '这个是第199条信息', '156176965199', '这个是第199回复信息', '0');
INSERT INTO `message` VALUES ('356', '100', '皮元', '200', '皮哐', '2016-06-19 18:10:23', '2016-06-19 18:10:23', '蛄澶', '180/100', '170/100', '136726333100', '这个是第100条信息', '156176965100', '这个是第100回复信息', '0');
INSERT INTO `message` VALUES ('357', '101', '强鼗任', '201', '强掣喏', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '蹼蜃', '180/101', '170/101', '136726333101', '这个是第101条信息', '156176965101', '这个是第101回复信息', '0');
INSERT INTO `message` VALUES ('358', '102', '曲淑', '202', '曲椰', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '声蕺', '180/102', '170/102', '136726333102', '这个是第102条信息', '156176965102', '这个是第102回复信息', '0');
INSERT INTO `message` VALUES ('359', '103', '贺兰铡籍', '203', '贺兰浇鲡', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '染障', '180/103', '170/103', '136726333103', '这个是第103条信息', '156176965103', '这个是第103回复信息', '0');
INSERT INTO `message` VALUES ('360', '104', '曲筋恬', '204', '曲磬袢', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '众禅', '180/104', '170/104', '136726333104', '这个是第104条信息', '156176965104', '这个是第104回复信息', '0');
INSERT INTO `message` VALUES ('361', '105', '巫马楚', '205', '巫马汴', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '阶鲽', '180/105', '170/105', '136726333105', '这个是第105条信息', '156176965105', '这个是第105回复信息', '0');
INSERT INTO `message` VALUES ('362', '106', '木丶蘑', '206', '木斛烹', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '狷累', '180/106', '170/106', '136726333106', '这个是第106条信息', '156176965106', '这个是第106回复信息', '0');
INSERT INTO `message` VALUES ('363', '107', '卓醉', '207', '卓鲭', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '昕叛', '180/107', '170/107', '136726333107', '这个是第107条信息', '156176965107', '这个是第107回复信息', '0');
INSERT INTO `message` VALUES ('364', '108', '陶惜缇', '208', '陶浔桡', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '烛票', '180/108', '170/108', '136726333108', '这个是第108条信息', '156176965108', '这个是第108回复信息', '0');
INSERT INTO `message` VALUES ('365', '109', '漆乱称', '209', '漆舒瑭', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '槛冰', '180/109', '170/109', '136726333109', '这个是第109条信息', '156176965109', '这个是第109回复信息', '0');
INSERT INTO `message` VALUES ('366', '110', '史拟觉', '210', '史壕钲', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '憾军', '180/110', '170/110', '136726333110', '这个是第110条信息', '156176965110', '这个是第110回复信息', '0');
INSERT INTO `message` VALUES ('367', '111', '桂耀蜗', '211', '桂胆缛', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '獠洙', '180/111', '170/111', '136726333111', '这个是第111条信息', '156176965111', '这个是第111回复信息', '0');
INSERT INTO `message` VALUES ('368', '112', '阚嗅莸', '212', '阚嗲忑', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '骏眍', '180/112', '170/112', '136726333112', '这个是第112条信息', '156176965112', '这个是第112回复信息', '0');
INSERT INTO `message` VALUES ('369', '113', '漆碲娣', '213', '漆秽窍', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '正笈', '180/113', '170/113', '136726333113', '这个是第113条信息', '156176965113', '这个是第113回复信息', '0');
INSERT INTO `message` VALUES ('370', '114', '史诃', '214', '史绛', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '五獾', '180/114', '170/114', '136726333114', '这个是第114条信息', '156176965114', '这个是第114回复信息', '0');
INSERT INTO `message` VALUES ('371', '115', '季劲修', '215', '季舭静', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '懈笨', '180/115', '170/115', '136726333115', '这个是第115条信息', '156176965115', '这个是第115回复信息', '0');
INSERT INTO `message` VALUES ('372', '116', '欧阳摁倮', '216', '欧阳帷妇', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '宥漆', '180/116', '170/116', '136726333116', '这个是第116条信息', '156176965116', '这个是第116回复信息', '0');
INSERT INTO `message` VALUES ('373', '117', '綦勐', '217', '綦辆', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '声栋', '180/117', '170/117', '136726333117', '这个是第117条信息', '156176965117', '这个是第117回复信息', '0');
INSERT INTO `message` VALUES ('374', '118', '庾反枷', '218', '庾蔹谈', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '染外', '180/118', '170/118', '136726333118', '这个是第118条信息', '156176965118', '这个是第118回复信息', '0');
INSERT INTO `message` VALUES ('375', '119', '司寇幺', '219', '司寇嚎', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '怎礼', '180/119', '170/119', '136726333119', '这个是第119条信息', '156176965119', '这个是第119回复信息', '0');
INSERT INTO `message` VALUES ('376', '120', '蓝捐希', '220', '蓝都啊', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '荦攉', '180/120', '170/120', '136726333120', '这个是第120条信息', '156176965120', '这个是第120回复信息', '0');
INSERT INTO `message` VALUES ('377', '121', '曹盒', '221', '曹橄', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '孕耖', '180/121', '170/121', '136726333121', '这个是第121条信息', '156176965121', '这个是第121回复信息', '0');
INSERT INTO `message` VALUES ('378', '122', '和判狴', '222', '和屡凵', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '糁訇', '180/122', '170/122', '136726333122', '这个是第122条信息', '156176965122', '这个是第122回复信息', '0');
INSERT INTO `message` VALUES ('379', '123', '严沟翡', '223', '严驺齐', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '荮肱', '180/123', '170/123', '136726333123', '这个是第123条信息', '156176965123', '这个是第123回复信息', '0');
INSERT INTO `message` VALUES ('380', '124', '富滩佳', '224', '富芥争', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '蹰纠', '180/124', '170/124', '136726333124', '这个是第124条信息', '156176965124', '这个是第124回复信息', '0');
INSERT INTO `message` VALUES ('381', '125', '束保喏', '225', '束唐荀', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '晁揍', '180/125', '170/125', '136726333125', '这个是第125条信息', '156176965125', '这个是第125回复信息', '0');
INSERT INTO `message` VALUES ('382', '126', '伏慑', '226', '伏桔', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '王掊', '180/126', '170/126', '136726333126', '这个是第126条信息', '156176965126', '这个是第126回复信息', '0');
INSERT INTO `message` VALUES ('383', '127', '胶但', '227', '胶山', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '宴宅', '180/127', '170/127', '136726333127', '这个是第127条信息', '156176965127', '这个是第127回复信息', '0');
INSERT INTO `message` VALUES ('384', '128', '太叔醐', '228', '太叔狂', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '丽糇', '180/128', '170/128', '136726333128', '这个是第128条信息', '156176965128', '这个是第128回复信息', '0');
INSERT INTO `message` VALUES ('385', '129', '龙腮鳄', '229', '龙帑龌', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '钅喵', '180/129', '170/129', '136726333129', '这个是第129条信息', '156176965129', '这个是第129回复信息', '0');
INSERT INTO `message` VALUES ('386', '130', '范迤', '230', '范逶', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '肌呖', '180/130', '170/130', '136726333130', '这个是第130条信息', '156176965130', '这个是第130回复信息', '0');
INSERT INTO `message` VALUES ('387', '131', '龙翦羌', '231', '戴滕', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '影邂', '180/131', '170/131', '136726333131', '这个是第131条信息', '156176965131', '这个是第131回复信息', '0');
INSERT INTO `message` VALUES ('388', '132', '徐瓢', '232', '徐工', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '枫歃', '180/132', '170/132', '136726333132', '这个是第132条信息', '156176965132', '这个是第132回复信息', '0');
INSERT INTO `message` VALUES ('389', '133', '太叔气木', '233', '太叔戌莰', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '胥枥', '180/133', '170/133', '136726333133', '这个是第133条信息', '156176965133', '这个是第133回复信息', '0');
INSERT INTO `message` VALUES ('390', '134', '冒芋岐', '234', '冒渍衩', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '笋嫜', '180/134', '170/134', '136726333134', '这个是第134条信息', '156176965134', '这个是第134回复信息', '0');
INSERT INTO `message` VALUES ('391', '135', '段阃', '235', '段举', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '犯蹰', '180/135', '170/135', '136726333135', '这个是第135条信息', '156176965135', '这个是第135回复信息', '0');
INSERT INTO `message` VALUES ('392', '136', '宗正泉', '236', '宗正桉', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '蜉倦', '180/136', '170/136', '136726333136', '这个是第136条信息', '156176965136', '这个是第136回复信息', '0');
INSERT INTO `message` VALUES ('393', '137', '晏虫嵋', '237', '晏暨柙', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '蒡廖', '180/137', '170/137', '136726333137', '这个是第137条信息', '156176965137', '这个是第137回复信息', '0');
INSERT INTO `message` VALUES ('394', '138', '邬袼', '238', '麦惫赝', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '腮掾', '180/138', '170/138', '136726333138', '这个是第138条信息', '156176965138', '这个是第138回复信息', '0');
INSERT INTO `message` VALUES ('395', '139', '刁箭兼', '239', '刁踉熔', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '孛鹫', '180/139', '170/139', '136726333139', '这个是第139条信息', '156176965139', '这个是第139回复信息', '0');
INSERT INTO `message` VALUES ('396', '140', '水茌纟', '240', '水麓笼', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '捏弼', '180/140', '170/140', '136726333140', '这个是第140条信息', '156176965140', '这个是第140回复信息', '0');
INSERT INTO `message` VALUES ('397', '141', '贲囹', '241', '贲烙', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '笤裒', '180/141', '170/141', '136726333141', '这个是第141条信息', '156176965141', '这个是第141回复信息', '0');
INSERT INTO `message` VALUES ('398', '142', '罗滢', '242', '罗位', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '淀镞', '180/142', '170/142', '136726333142', '这个是第142条信息', '156176965142', '这个是第142回复信息', '0');
INSERT INTO `message` VALUES ('399', '143', '楼幽胩', '243', '楼讴弛', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '伺掺', '180/143', '170/143', '136726333143', '这个是第143条信息', '156176965143', '这个是第143回复信息', '0');
INSERT INTO `message` VALUES ('400', '144', '澹台挣', '244', '澹台每', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '记檬', '180/144', '170/144', '136726333144', '这个是第144条信息', '156176965144', '这个是第144回复信息', '0');
INSERT INTO `message` VALUES ('401', '145', '能哙窗', '245', '能祖跬', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '揄锾', '180/145', '170/145', '136726333145', '这个是第145条信息', '156176965145', '这个是第145回复信息', '0');
INSERT INTO `message` VALUES ('402', '146', '罗匙鳆', '246', '罗纛描', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '霁蹇', '180/146', '170/146', '136726333146', '这个是第146条信息', '156176965146', '这个是第146回复信息', '0');
INSERT INTO `message` VALUES ('403', '147', '壤驷鞋粗', '247', '壤驷悍蜃', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '悍焙', '180/147', '170/147', '136726333147', '这个是第147条信息', '156176965147', '这个是第147回复信息', '0');
INSERT INTO `message` VALUES ('404', '148', '壤驷呐', '248', '壤驷帱', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '你柏', '180/148', '170/148', '136726333148', '这个是第148条信息', '156176965148', '这个是第148回复信息', '0');
INSERT INTO `message` VALUES ('405', '149', '池璧舌', '249', '江傩', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '赓咎', '180/149', '170/149', '136726333149', '这个是第149条信息', '156176965149', '这个是第149回复信息', '0');
INSERT INTO `message` VALUES ('406', '150', '储谂', '250', '储博', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '起唳', '180/150', '170/150', '136726333150', '这个是第150条信息', '156176965150', '这个是第150回复信息', '0');
INSERT INTO `message` VALUES ('407', '151', '敬究', '251', '敬挎', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '郭铟', '180/151', '170/151', '136726333151', '这个是第151条信息', '156176965151', '这个是第151回复信息', '0');
INSERT INTO `message` VALUES ('408', '152', '厉揲毡', '252', '厉邪能', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '俪氇', '180/152', '170/152', '136726333152', '这个是第152条信息', '156176965152', '这个是第152回复信息', '0');
INSERT INTO `message` VALUES ('409', '153', '浦峰值', '253', '浦滨榷', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '沙摈', '180/153', '170/153', '136726333153', '这个是第153条信息', '156176965153', '这个是第153回复信息', '0');
INSERT INTO `message` VALUES ('410', '154', '尉迟镏', '254', '尉迟盏', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '辱珞', '180/154', '170/154', '136726333154', '这个是第154条信息', '156176965154', '这个是第154回复信息', '0');
INSERT INTO `message` VALUES ('411', '155', '钱栀', '255', '钱萍', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '先濞', '180/155', '170/155', '136726333155', '这个是第155条信息', '156176965155', '这个是第155回复信息', '0');
INSERT INTO `message` VALUES ('412', '156', '尚憩斡', '256', '羊舌鲂', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '气悖', '180/156', '170/156', '136726333156', '这个是第156条信息', '156176965156', '这个是第156回复信息', '0');
INSERT INTO `message` VALUES ('413', '157', '禹爸', '257', '禹粮', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '谕嗫', '180/157', '170/157', '136726333157', '这个是第157条信息', '156176965157', '这个是第157回复信息', '0');
INSERT INTO `message` VALUES ('414', '158', '尚踱', '258', '尚楫', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '拷筑', '180/158', '170/158', '136726333158', '这个是第158条信息', '156176965158', '这个是第158回复信息', '0');
INSERT INTO `message` VALUES ('415', '159', '鞠败', '259', '鞠枧', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '届诎', '180/159', '170/159', '136726333159', '这个是第159条信息', '156176965159', '这个是第159回复信息', '0');
INSERT INTO `message` VALUES ('416', '160', '狄霓鹤', '260', '拓跋宥', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '汐探', '180/160', '170/160', '136726333160', '这个是第160条信息', '156176965160', '这个是第160回复信息', '0');
INSERT INTO `message` VALUES ('417', '161', '国懊共', '261', '国耩莱', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '嗫泰', '180/161', '170/161', '136726333161', '这个是第161条信息', '156176965161', '这个是第161回复信息', '0');
INSERT INTO `message` VALUES ('418', '162', '颜蛑', '262', '颜撮', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '紧脔', '180/162', '170/162', '136726333162', '这个是第162条信息', '156176965162', '这个是第162回复信息', '0');
INSERT INTO `message` VALUES ('419', '163', '揭蜍', '263', '侯缍勾', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '坞叠', '180/163', '170/163', '136726333163', '这个是第163条信息', '156176965163', '这个是第163回复信息', '0');
INSERT INTO `message` VALUES ('420', '164', '慕容饼', '264', '慕容讧', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '师箐', '180/164', '170/164', '136726333164', '这个是第164条信息', '156176965164', '这个是第164回复信息', '0');
INSERT INTO `message` VALUES ('421', '165', '爱健', '265', '爱誓', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '谋达', '180/165', '170/165', '136726333165', '这个是第165条信息', '156176965165', '这个是第165回复信息', '0');
INSERT INTO `message` VALUES ('422', '166', '厍墙怄', '266', '厍读相', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '昧渲', '180/166', '170/166', '136726333166', '这个是第166条信息', '156176965166', '这个是第166回复信息', '0');
INSERT INTO `message` VALUES ('423', '167', '凌肆', '267', '凌枧', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '汉蛰', '180/167', '170/167', '136726333167', '这个是第167条信息', '156176965167', '这个是第167回复信息', '0');
INSERT INTO `message` VALUES ('424', '168', '容篪', '268', '容宄', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '答述', '180/168', '170/168', '136726333168', '这个是第168条信息', '156176965168', '这个是第168回复信息', '0');
INSERT INTO `message` VALUES ('425', '169', '益腊萎', '269', '益朋榷', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '淆钣', '180/169', '170/169', '136726333169', '这个是第169条信息', '156176965169', '这个是第169回复信息', '0');
INSERT INTO `message` VALUES ('426', '170', '项足', '270', '项缠', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '芤枳', '180/170', '170/170', '136726333170', '这个是第170条信息', '156176965170', '这个是第170回复信息', '0');
INSERT INTO `message` VALUES ('427', '171', '凤鸭', '271', '凤喙', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '镞雠', '180/171', '170/171', '136726333171', '这个是第171条信息', '156176965171', '这个是第171回复信息', '0');
INSERT INTO `message` VALUES ('428', '172', '堵犀', '272', '堵偬', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '在岱', '180/172', '170/172', '136726333172', '这个是第172条信息', '156176965172', '这个是第172回复信息', '0');
INSERT INTO `message` VALUES ('429', '173', '虞淋', '273', '虞铛', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '彻邗', '180/173', '170/173', '136726333173', '这个是第173条信息', '156176965173', '这个是第173回复信息', '0');
INSERT INTO `message` VALUES ('430', '174', '鲜于枭少', '274', '鲜于萸睇', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '筠斧', '180/174', '170/174', '136726333174', '这个是第174条信息', '156176965174', '这个是第174回复信息', '0');
INSERT INTO `message` VALUES ('431', '175', '何极', '275', '何裆', '2016-06-19 18:10:24', '2016-06-19 18:10:24', '军绳', '180/175', '170/175', '136726333175', '这个是第175条信息', '156176965175', '这个是第175回复信息', '0');
INSERT INTO `message` VALUES ('432', '176', '屈突蠓阋', '276', '屈突槠缵', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '箢邹', '180/176', '170/176', '136726333176', '这个是第176条信息', '156176965176', '这个是第176回复信息', '0');
INSERT INTO `message` VALUES ('433', '177', '钟离蟑', '277', '钟离趱', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '竖哭', '180/177', '170/177', '136726333177', '这个是第177条信息', '156176965177', '这个是第177回复信息', '0');
INSERT INTO `message` VALUES ('434', '178', '练贵', '278', '练念', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '坚猫', '180/178', '170/178', '136726333178', '这个是第178条信息', '156176965178', '这个是第178回复信息', '0');
INSERT INTO `message` VALUES ('435', '179', '纪祜', '279', '纪轼', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '秘榆', '180/179', '170/179', '136726333179', '这个是第179条信息', '156176965179', '这个是第179回复信息', '0');
INSERT INTO `message` VALUES ('436', '180', '蓟鲩', '280', '蓟颡', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '砬龅', '180/180', '170/180', '136726333180', '这个是第180条信息', '156176965180', '这个是第180回复信息', '0');
INSERT INTO `message` VALUES ('437', '181', '马旧脑', '281', '马引健', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '皿蒂', '180/181', '170/181', '136726333181', '这个是第181条信息', '156176965181', '这个是第181回复信息', '0');
INSERT INTO `message` VALUES ('438', '182', '篁焕', '282', '篁曙', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '责并', '180/182', '170/182', '136726333182', '这个是第182条信息', '156176965182', '这个是第182回复信息', '0');
INSERT INTO `message` VALUES ('439', '183', '樊槠灾', '283', '樊癣扌', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '肮爷', '180/183', '170/183', '136726333183', '这个是第183条信息', '156176965183', '这个是第183回复信息', '0');
INSERT INTO `message` VALUES ('440', '184', '宇文阄镐', '284', '宇文廪蛙', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '煮崤', '180/184', '170/184', '136726333184', '这个是第184条信息', '156176965184', '这个是第184回复信息', '0');
INSERT INTO `message` VALUES ('441', '185', '公乘彗', '285', '公乘刈', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '梧酷', '180/185', '170/185', '136726333185', '这个是第185条信息', '156176965185', '这个是第185回复信息', '0');
INSERT INTO `message` VALUES ('442', '186', '仓臊随', '286', '仓惑绍', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '股趄', '180/186', '170/186', '136726333186', '这个是第186条信息', '156176965186', '这个是第186回复信息', '0');
INSERT INTO `message` VALUES ('443', '187', '长孙做霭', '287', '长孙诮瑷', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '矸酱', '180/187', '170/187', '136726333187', '这个是第187条信息', '156176965187', '这个是第187回复信息', '0');
INSERT INTO `message` VALUES ('444', '188', '康饺', '288', '康谆', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '晷艴', '180/188', '170/188', '136726333188', '这个是第188条信息', '156176965188', '这个是第188回复信息', '0');
INSERT INTO `message` VALUES ('445', '189', '巩凄', '289', '巩邾', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '哺潍', '180/189', '170/189', '136726333189', '这个是第189条信息', '156176965189', '这个是第189回复信息', '0');
INSERT INTO `message` VALUES ('446', '190', '蔚坶', '290', '蔚襦', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '炝悻', '180/190', '170/190', '136726333190', '这个是第190条信息', '156176965190', '这个是第190回复信息', '0');
INSERT INTO `message` VALUES ('447', '191', '夔裙', '291', '夔张', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '裢野', '180/191', '170/191', '136726333191', '这个是第191条信息', '156176965191', '这个是第191回复信息', '0');
INSERT INTO `message` VALUES ('448', '192', '轩辕啷', '292', '轩辕借', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '瓤获', '180/192', '170/192', '136726333192', '这个是第192条信息', '156176965192', '这个是第192回复信息', '0');
INSERT INTO `message` VALUES ('449', '193', '杨泵枧', '293', '杨晃瘃', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '陧衍', '180/193', '170/193', '136726333193', '这个是第193条信息', '156176965193', '这个是第193回复信息', '0');
INSERT INTO `message` VALUES ('450', '194', '钮帧', '294', '钮皱', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '隶蝻', '180/194', '170/194', '136726333194', '这个是第194条信息', '156176965194', '这个是第194回复信息', '0');
INSERT INTO `message` VALUES ('451', '195', '公仪挈', '295', '公仪艄', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '泠缙', '180/195', '170/195', '136726333195', '这个是第195条信息', '156176965195', '这个是第195回复信息', '0');
INSERT INTO `message` VALUES ('452', '196', '韩新迹', '296', '老铳', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '讵淼', '180/196', '170/196', '136726333196', '这个是第196条信息', '156176965196', '这个是第196回复信息', '0');
INSERT INTO `message` VALUES ('453', '197', '卞颞', '297', '卞扇', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '宀珞', '180/197', '170/197', '136726333197', '这个是第197条信息', '156176965197', '这个是第197回复信息', '0');
INSERT INTO `message` VALUES ('454', '198', '高哼', '298', '高怕', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '也俞', '180/198', '170/198', '136726333198', '这个是第198条信息', '156176965198', '这个是第198回复信息', '0');
INSERT INTO `message` VALUES ('455', '199', '申屠椰', '299', '申屠瘘', '2016-06-19 18:10:25', '2016-06-19 18:10:25', '蜗芳', '180/199', '170/199', '136726333199', '这个是第199条信息', '156176965199', '这个是第199回复信息', '0');

-- ----------------------------
-- Table structure for `msgboard`
-- ----------------------------
DROP TABLE IF EXISTS `msgboard`;
CREATE TABLE `msgboard` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `context` varchar(200) DEFAULT NULL,
  `createtime` varchar(50) DEFAULT NULL,
  `userphone` varchar(50) DEFAULT NULL,
  `clothesname` varchar(50) DEFAULT NULL,
  `size` varchar(50) DEFAULT NULL,
  `changesize` varchar(50) DEFAULT NULL,
  `isActive` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of msgboard
-- ----------------------------

-- ----------------------------
-- Table structure for `natice`
-- ----------------------------
DROP TABLE IF EXISTS `natice`;
CREATE TABLE `natice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `title` varchar(50) NOT NULL,
  `announcement` varchar(200) NOT NULL,
  `createid` int(11) DEFAULT NULL,
  `createname` varchar(50) DEFAULT NULL,
  `isActive` varchar(50) DEFAULT NULL,
  `createtime` varchar(50) DEFAULT NULL,
  `picurl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of natice
-- ----------------------------
INSERT INTO `natice` VALUES ('2', '张三', 'today', '大家好', null, null, null, null, null);
INSERT INTO `natice` VALUES ('6', '李四', 'today', '大家下午好', null, null, null, null, null);
INSERT INTO `natice` VALUES ('7', '王五', 'today', '大家中午好', null, null, null, null, null);
INSERT INTO `natice` VALUES ('8', '2131', '早上好', '你好', null, 'admin', null, '2016-06-20 08:12:01', null);
INSERT INTO `natice` VALUES ('9', '2131', '你好', '下午好，发服装了', null, 'admin', null, '2016-06-20 14:49:56', null);
INSERT INTO `natice` VALUES ('10', '2131', '和ihi', '就能看见你看', null, 'admin', null, '2016-10-13 19:33:02', null);

-- ----------------------------
-- Table structure for `stock`
-- ----------------------------
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `clothescode` int(10) NOT NULL DEFAULT '0',
  `clothesname` varchar(50) NOT NULL,
  `clothestype` varchar(50) DEFAULT NULL,
  `clothesnum` int(20) DEFAULT NULL,
  `clothessex` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=244 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stock
-- ----------------------------
INSERT INTO `stock` VALUES ('46', '0', 'XXXX1', 'xiaku', null, 'male');
INSERT INTO `stock` VALUES ('47', '1', 'XXXX2', 'xiaku', null, 'male');
INSERT INTO `stock` VALUES ('48', '2', 'XXXX3', 'xiaku', null, 'male');
INSERT INTO `stock` VALUES ('49', '3', 'XXXX4', 'xiaku', null, 'male');
INSERT INTO `stock` VALUES ('50', '4', 'XXXX5', 'xiaku', null, 'male');
INSERT INTO `stock` VALUES ('51', '5', 'XXXX6', 'xiaku', null, 'male');
INSERT INTO `stock` VALUES ('52', '6', 'XXXX7', 'xiaku', null, 'male');
INSERT INTO `stock` VALUES ('53', '7', 'XXXX8', 'xiaku', null, 'male');
INSERT INTO `stock` VALUES ('54', '8', 'XXXX9', 'xiaku', null, 'male');
INSERT INTO `stock` VALUES ('89', '1', 'XXXX1', 'xiezi', null, 'all');
INSERT INTO `stock` VALUES ('90', '2', 'XXXX2', 'xiezi', null, 'all');
INSERT INTO `stock` VALUES ('91', '3', 'XXXX3', 'xiezi', null, 'all');
INSERT INTO `stock` VALUES ('92', '4', 'XXXX4', 'xiezi', null, 'all');
INSERT INTO `stock` VALUES ('154', '54', 'XXXX1', 'shangyi', null, 'male');
INSERT INTO `stock` VALUES ('155', '55', 'XXXX2', 'shangyi', null, 'male');
INSERT INTO `stock` VALUES ('156', '56', 'XXXX3', 'shangyi', null, 'male');
INSERT INTO `stock` VALUES ('157', '57', 'XXXX4', 'shangyi', null, 'male');
INSERT INTO `stock` VALUES ('158', '58', 'XXXX5', 'shangyi', null, 'male');
INSERT INTO `stock` VALUES ('159', '59', 'XXXX6', 'shangyi', null, 'male');
INSERT INTO `stock` VALUES ('166', '7', 'XXXX1', 'dayi', null, 'male');
INSERT INTO `stock` VALUES ('170', '11', 'XXXX2', 'dayi', null, 'male');
INSERT INTO `stock` VALUES ('171', '12', 'XXXX3', 'dayi', null, 'male');
INSERT INTO `stock` VALUES ('172', '13', 'XXXX4', 'dayi', null, 'male');
INSERT INTO `stock` VALUES ('173', '14', 'XXXX5', 'dayi', null, 'male');
INSERT INTO `stock` VALUES ('174', '1', 'XXXX6', 'hat', null, 'all');
INSERT INTO `stock` VALUES ('175', '2', 'XXXX7', 'hat', null, 'all');
INSERT INTO `stock` VALUES ('189', '16', 'XXXX8', 'hat', null, 'all');
INSERT INTO `stock` VALUES ('190', '17', 'XXXX9', 'hat', null, 'all');
INSERT INTO `stock` VALUES ('196', '23', 'XXXX10', 'hat', null, 'all');
INSERT INTO `stock` VALUES ('197', '1', 'XXXX1', 'xiaku', null, 'female');
INSERT INTO `stock` VALUES ('198', '2', 'XXXX2', 'xiaku', null, 'female');
INSERT INTO `stock` VALUES ('199', '3', 'XXXX3', 'xiaku', null, 'female');
INSERT INTO `stock` VALUES ('200', '4', 'XXXX4', 'xiaku', null, 'female');
INSERT INTO `stock` VALUES ('201', '5', 'XXXX5', 'xiaku', null, 'female');
INSERT INTO `stock` VALUES ('202', '6', 'XXXX6', 'xiaku', null, 'female');
INSERT INTO `stock` VALUES ('215', '19', 'XXXX7', 'xiaku', null, 'female');
INSERT INTO `stock` VALUES ('233', '19', 'XXXX1', 'shangyi', null, 'female');
INSERT INTO `stock` VALUES ('234', '20', 'XXXX2', 'shangyi', null, 'female');
INSERT INTO `stock` VALUES ('239', '114', 'XXXX3', 'shangyi', null, 'female');
INSERT INTO `stock` VALUES ('240', '1', 'XXXX4', 'dayi', null, 'female');
INSERT INTO `stock` VALUES ('241', '2', 'XXXX5', 'dayi', null, 'female');
INSERT INTO `stock` VALUES ('242', '3', 'XXXX6', 'dayi', null, 'female');
INSERT INTO `stock` VALUES ('243', '4', 'XXXX7', 'dayi', null, 'female');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `identyid` varchar(18) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `realname` varchar(50) DEFAULT NULL,
  `isaccess` int(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'user', 'XXXX1', 'user', null, '0');

-- ----------------------------
-- Table structure for `xiezi`
-- ----------------------------
DROP TABLE IF EXISTS `xiezi`;
CREATE TABLE `xiezi` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `clothesname` varchar(20) NOT NULL,
  `clothesnum` int(20) DEFAULT '0',
  `a240` int(10) DEFAULT '0',
  `a245` int(10) DEFAULT '0',
  `a250` int(10) DEFAULT '0',
  `a255` int(10) DEFAULT '0',
  `a260` int(10) DEFAULT '0',
  `a265` int(10) DEFAULT '0',
  `a270` int(10) DEFAULT '0',
  `a275` int(10) DEFAULT '0',
  `a280` int(10) DEFAULT '0',
  `a285` int(10) DEFAULT '0',
  `a290` int(10) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xiezi
-- ----------------------------
INSERT INTO `xiezi` VALUES ('1', 'XXXX1', '0', '39', '38', '37', '36', '35', '34', '33', '32', '31', '30', '29');
INSERT INTO `xiezi` VALUES ('2', 'XXXX2', '0', '36', '35', '34', '33', '32', '31', '30', '29', '28', '27', '26');
INSERT INTO `xiezi` VALUES ('3', 'XXXX3', '0', '33', '32', '31', '30', '29', '28', '27', '26', '25', '24', '23');
INSERT INTO `xiezi` VALUES ('4', 'XXXX4', '0', '30', '29', '28', '27', '26', '25', '24', '23', '22', '21', '20');
INSERT INTO `xiezi` VALUES ('5', 'XXXX5', '0', '27', '26', '25', '24', '23', '22', '21', '20', '19', '18', '17');
INSERT INTO `xiezi` VALUES ('6', 'XXXX6', '0', '24', '23', '22', '21', '20', '19', '18', '17', '16', '15', '14');
INSERT INTO `xiezi` VALUES ('7', 'XXXX7', '0', '21', '20', '19', '18', '17', '16', '15', '14', '13', '12', '11');
INSERT INTO `xiezi` VALUES ('8', 'XXXX8', '0', '18', '17', '16', '15', '14', '13', '12', '11', '10', '9', '8');
INSERT INTO `xiezi` VALUES ('9', 'XXXX9', '0', '15', '14', '13', '12', '11', '10', '9', '8', '7', '6', '5');
