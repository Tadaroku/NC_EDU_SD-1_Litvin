-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema litvin
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `litvin` ;

-- -----------------------------------------------------
-- Schema litvin
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `litvin` DEFAULT CHARACTER SET utf8 ;
USE `litvin` ;

-- -----------------------------------------------------
-- Table `litvin`.`role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `litvin`.`role` ;

CREATE TABLE IF NOT EXISTS `litvin`.`role` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `role` VARCHAR(50) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `litvin`.`info`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `litvin`.`info` ;

CREATE TABLE IF NOT EXISTS `litvin`.`info` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NULL,
  `surname` VARCHAR(45) NULL,
  `lastname` VARCHAR(45) NULL,
  `phone` VARCHAR(20) NULL,
  `address` VARCHAR(500) NULL,
  `booking_history` VARCHAR(5000) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `litvin`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `litvin`.`user` ;

CREATE TABLE IF NOT EXISTS `litvin`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(20) NULL,
  `password` VARCHAR(45) NULL,
  `info_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_users_info1_idx` (`info_id` ASC),
  CONSTRAINT `fk_users_info1`
    FOREIGN KEY (`info_id`)
    REFERENCES `litvin`.`info` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `litvin`.`model`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `litvin`.`model` ;

CREATE TABLE IF NOT EXISTS `litvin`.`model` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `model_name` VARCHAR(100) NULL,
  `brand` VARCHAR(100) NULL,
  `description` VARCHAR(5000) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `litvin`.`rent`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `litvin`.`rent` ;

CREATE TABLE IF NOT EXISTS `litvin`.`rent` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `start_date` TIMESTAMP(1) NULL,
  `end_date` TIMESTAMP(1) NULL,
  `price` DOUBLE NULL,
  `users_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_rent_users1_idx` (`users_id` ASC),
  CONSTRAINT `fk_rent_users1`
    FOREIGN KEY (`users_id`)
    REFERENCES `litvin`.`user` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `litvin`.`car`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `litvin`.`car` ;

CREATE TABLE IF NOT EXISTS `litvin`.`car` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `status` VARCHAR(45) NULL,
  `mileage` DOUBLE NULL,
  `transmission` VARCHAR(100) NULL,
  `engine_type` VARCHAR(100) NULL,
  `condition` TINYINT(1) NULL,
  `color` VARCHAR(50) NULL,
  `provider` VARCHAR(100) NULL,
  `models_id` INT NOT NULL,
  `rent_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_cars_models1_idx` (`models_id` ASC),
  INDEX `fk_cars_rent1_idx` (`rent_id` ASC),
  CONSTRAINT `fk_cars_models1`
    FOREIGN KEY (`models_id`)
    REFERENCES `litvin`.`model` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_cars_rent1`
    FOREIGN KEY (`rent_id`)
    REFERENCES `litvin`.`rent` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `litvin`.`role_to_user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `litvin`.`role_to_user` ;

CREATE TABLE IF NOT EXISTS `litvin`.`role_to_user` (
  `roles_id` INT NOT NULL,
  `users_id` INT NOT NULL,
  PRIMARY KEY (`roles_id`, `users_id`),
  INDEX `fk_roles_has_users_users1_idx` (`users_id` ASC),
  INDEX `fk_roles_has_users_roles1_idx` (`roles_id` ASC),
  CONSTRAINT `fk_roles_has_users_roles1`
    FOREIGN KEY (`roles_id`)
    REFERENCES `litvin`.`role` (`id`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT,
  CONSTRAINT `fk_roles_has_users_users1`
    FOREIGN KEY (`users_id`)
    REFERENCES `litvin`.`user` (`id`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
