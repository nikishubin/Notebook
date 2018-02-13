DROP DATABASE IF EXISTS test;
CREATE DATABASE test;
USE test;
CREATE TABLE `test`.`notebook` (
  `id` INT(8) NOT NULL AUTO_INCREMENT,
  `message` VARCHAR(100) NOT NULL,
  `date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `done` BIT(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`))
COLLATE='utf8_general_ci';

INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 1', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 2', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 3', CURRENT_TIMESTAMP, 1);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 4', CURRENT_TIMESTAMP, 1);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 5', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 6', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 7', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 8', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 9', CURRENT_TIMESTAMP, 1);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 10', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 11', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 12', CURRENT_TIMESTAMP, 1);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 13', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 14', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 15', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 16', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 17', CURRENT_TIMESTAMP, 1);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 18', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 19', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 20', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 21', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 22', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 23', CURRENT_TIMESTAMP, 0);
INSERT INTO `test`.`notebook` (`message`,`date`,`done`) VALUES ('Note 24', CURRENT_TIMESTAMP, 0);
