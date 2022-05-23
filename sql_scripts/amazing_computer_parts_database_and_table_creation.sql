CREATE DATABASE  IF NOT EXISTS `computer_parts`;
USE `computer_parts`;
--
-- Table structure for table `computer_parts`
--
DROP TABLE IF EXISTS `computer_parts`;
CREATE TABLE `computer_parts` (
  `computer_part_id` int(11) NOT NULL AUTO_INCREMENT,
  `computer_part_name` varchar(45) DEFAULT NULL, 
  `computer_part_type` varchar(45) DEFAULT NULL,
  `computer_part_brand` varchar(45) DEFAULT NULL,
  `computer_part_price` decimal(5, 2) DEFAULT NULL,
  `computer_part_quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`computer_part_id`)
);

INSERT INTO `computer_parts` VALUES
(1,'Core i7','CPU','Intel','249.99',1);