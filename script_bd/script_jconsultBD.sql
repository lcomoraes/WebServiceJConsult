SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `jconsultBD` DEFAULT CHARACTER SET latin1 COLLATE latin1_general_ci ;
USE `jconsultBD` ;

-- -----------------------------------------------------
-- Table `jconsultBD`.`tblprocesso`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `jconsultBD`.`tblprocesso` (
  `numeroUnico` VARCHAR(25) NOT NULL ,
  `numeroProcesso` VARCHAR(10) NULL ,
  `dataAbertura` DATETIME NOT NULL ,
  `natureza` LONGTEXT NOT NULL ,
  `classe` LONGTEXT NOT NULL ,
  PRIMARY KEY (`numeroUnico`) ,
  UNIQUE INDEX `numeroProcesso_UNIQUE` (`numeroProcesso` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_general_ci;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


/*insets*/
use jconsultBD

select * from tblprocesso


insert into tblprocesso (numeroUnico, numeroProcesso, dataAbertura, natureza,classe) 
values ("00003008420108100089","0000202012","2013-02-01 13:13:13","CÍVEL RECURSO","PROCESSO CÍVEL E DO TRABALHO | Recursos | Apelação");

insert into tblprocesso (numeroUnico, numeroProcesso, dataAbertura, natureza,classe) 
values ("12345671212348101234","0000202013","2012-02-01 13:13:13","CÍVEL ORIGINÁRIO","PROCESSO CÍVEL E DO TRABALHO | Recursos | Apelação");

insert into tblprocesso (numeroUnico, numeroProcesso, dataAbertura, natureza,classe) 
values ("11111111111118101111","0000102013","2012-02-01 12:12:12","CÍVEL ORIGINÁRIO","PROCESSO CÍVEL E DO TRABALHO | Recursos | Apelação");

insert into tblprocesso (numeroUnico, numeroProcesso, dataAbertura, natureza,classe) 
values ("11111111111111111111","0000112013","2013-01-01 13:13:13","CÍVEL ORIGINÁRIO","PROCESSO CÍVEL E DO TRABALHO | Recursos | Apelação");

/*1234567-12.1234.8.10.1234*/

/*----------------------*/







