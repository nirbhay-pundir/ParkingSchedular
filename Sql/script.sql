-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema parkingschedular
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema parkingschedular
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `parkingschedular` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `parkingschedular` ;

-- -----------------------------------------------------
-- Table `parkingschedular`.`admininfo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `parkingschedular`.`admininfo` (
  `name` VARCHAR(20) NULL DEFAULT NULL,
  `Email` VARCHAR(40) NOT NULL,
  `password` VARCHAR(40) NULL DEFAULT NULL,
  `price` FLOAT NULL DEFAULT NULL,
  PRIMARY KEY (`Email`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `parkingschedular`.`released_slots`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `parkingschedular`.`released_slots` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `vehicle` VARCHAR(45) NOT NULL,
  `vehicle_type` INT NOT NULL,
  `arrival_time` VARCHAR(45) NOT NULL,
  `released_time` VARCHAR(45) NOT NULL,
  `charge` VARCHAR(45) NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `parkingschedular`.`slots`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `parkingschedular`.`slots` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `vehicle` VARCHAR(45) NOT NULL,
  `arrival_time` VARCHAR(20) NOT NULL,
  `vehicle_type` INT NOT NULL,
  `payment` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `parkingschedular`.`userinfo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `parkingschedular`.`userinfo` (
  `name` VARCHAR(30) NOT NULL,
  `phone` VARCHAR(14) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `vehicle` VARCHAR(45) NOT NULL,
  `vehicle_type` INT NOT NULL,
  PRIMARY KEY (`email`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  UNIQUE INDEX `phone_UNIQUE` (`phone` ASC) VISIBLE,
  UNIQUE INDEX `vehicle_UNIQUE` (`vehicle` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
