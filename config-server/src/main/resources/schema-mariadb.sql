DROP TABLE IF EXISTS `properties`;
CREATE TABLE `properties` (
  `application` varchar(200) DEFAULT NULL,
  `profile` varchar(200) DEFAULT NULL,
  `label` varchar(200) DEFAULT NULL,
  `key` varchar(200) DEFAULT NULL,
  `value` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1

INSERT INTO `properties` (`key`, `value`, `application`, `profile`, `label`)
VALUES ('datasource-driver-class-name','MyDriverClass','application1','production','latest');

<------------------------------------------------------>

DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  empId VARCHAR(10) NOT NULL,
  empName VARCHAR(100) NOT NULL
);