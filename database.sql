-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`ViTri`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`ViTri` ;

CREATE TABLE IF NOT EXISTS `mydb`.`ViTri` (
  `IDViTri` INT NOT NULL,
  `TenViTri` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`IDViTri`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TrinhDo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`TrinhDo` ;

CREATE TABLE IF NOT EXISTS `mydb`.`TrinhDo` (
  `IDTrinhDo` INT NOT NULL,
  `TrinhDo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`IDTrinhDo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`BoPhan`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`BoPhan` ;

CREATE TABLE IF NOT EXISTS `mydb`.`BoPhan` (
  `IDBoPhan` INT NOT NULL,
  `TenBoPhan` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`IDBoPhan`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`NhanVien`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`NhanVien` ;

CREATE TABLE IF NOT EXISTS `mydb`.`NhanVien` (
  `IDNhanVien` INT NOT NULL,
  `HoTen` VARCHAR(45) NOT NULL,
  `NgaySinh` DATE NOT NULL,
  `SoCMTND` VARCHAR(45) NOT NULL,
  `Luong` VARCHAR(45) NOT NULL,
  `SDT` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `DiaChi` VARCHAR(45) NOT NULL,
  `IDViTri` INT NOT NULL,
  `IDTrinhDo` INT NOT NULL,
  `IDBoPhan` INT NOT NULL,
  PRIMARY KEY (`IDNhanVien`),
  INDEX `fk_NhanVien_ViTri_idx` (`IDViTri` ASC) VISIBLE,
  INDEX `fk_NhanVien_TrinhDo1_idx` (`IDTrinhDo` ASC) VISIBLE,
  INDEX `fk_NhanVien_BoPhan1_idx` (`IDBoPhan` ASC) VISIBLE,
  CONSTRAINT `fk_NhanVien_ViTri`
    FOREIGN KEY (`IDViTri`)
    REFERENCES `mydb`.`ViTri` (`IDViTri`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_NhanVien_TrinhDo1`
    FOREIGN KEY (`IDTrinhDo`)
    REFERENCES `mydb`.`TrinhDo` (`IDTrinhDo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_NhanVien_BoPhan1`
    FOREIGN KEY (`IDBoPhan`)
    REFERENCES `mydb`.`BoPhan` (`IDBoPhan`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`LoaiKhach`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`LoaiKhach` ;

CREATE TABLE IF NOT EXISTS `mydb`.`LoaiKhach` (
  `IDLoaiKhach` INT NOT NULL,
  `TenLoaiKhach` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`IDLoaiKhach`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`KhachHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`KhachHang` ;

CREATE TABLE IF NOT EXISTS `mydb`.`KhachHang` (
  `IDKhachHang` INT NOT NULL,
  `HoTen` VARCHAR(45) NOT NULL,
  `NgaySinh` DATE NOT NULL,
  `SoCMTND` VARCHAR(45) NOT NULL,
  `SDT` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `DiaChi` VARCHAR(45) NOT NULL,
  `KhachHangcol` VARCHAR(45) NOT NULL,
  `IDLoaiKhach` INT NOT NULL,
  PRIMARY KEY (`IDKhachHang`),
  INDEX `fk_KhachHang_LoaiKhach1_idx` (`IDLoaiKhach` ASC) VISIBLE,
  CONSTRAINT `fk_KhachHang_LoaiKhach1`
    FOREIGN KEY (`IDLoaiKhach`)
    REFERENCES `mydb`.`LoaiKhach` (`IDLoaiKhach`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`KieuThue`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`KieuThue` ;

CREATE TABLE IF NOT EXISTS `mydb`.`KieuThue` (
  `IDKieuThue` INT NOT NULL,
  `TenKieuThue` VARCHAR(45) NOT NULL,
  `Gia` INT NOT NULL,
  PRIMARY KEY (`IDKieuThue`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`LoaiDichVu`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`LoaiDichVu` ;

CREATE TABLE IF NOT EXISTS `mydb`.`LoaiDichVu` (
  `IDLoaiDichVu` INT NOT NULL,
  `TenLoaiDichVu` VARCHAR(45) NULL,
  PRIMARY KEY (`IDLoaiDichVu`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`DichVu`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`DichVu` ;

CREATE TABLE IF NOT EXISTS `mydb`.`DichVu` (
  `IDDichVu` INT NOT NULL,
  `TenDichVu` VARCHAR(45) NOT NULL,
  `DienTich` INT NOT NULL,
  `SoTang` INT NOT NULL,
  `SoNguoiToiDa` VARCHAR(45) NOT NULL,
  `ChiPhiThue` VARCHAR(45) NOT NULL,
  `TrangThai` VARCHAR(45) NOT NULL,
  `IDKieuThue` INT NOT NULL,
  `IDLoaiDichVu` INT NOT NULL,
  PRIMARY KEY (`IDDichVu`),
  INDEX `fk_DichVu_KieuThue1_idx` (`IDKieuThue` ASC) VISIBLE,
  INDEX `fk_DichVu_LoaiDichVu1_idx` (`IDLoaiDichVu` ASC) VISIBLE,
  CONSTRAINT `fk_DichVu_KieuThue1`
    FOREIGN KEY (`IDKieuThue`)
    REFERENCES `mydb`.`KieuThue` (`IDKieuThue`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_DichVu_LoaiDichVu1`
    FOREIGN KEY (`IDLoaiDichVu`)
    REFERENCES `mydb`.`LoaiDichVu` (`IDLoaiDichVu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`HopDong`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`HopDong` ;

CREATE TABLE IF NOT EXISTS `mydb`.`HopDong` (
  `IDHopDong` INT NOT NULL,
  `NgayLamHopDong` DATE NOT NULL,
  `NgayKetThuc` DATE NOT NULL,
  `TienDatCoc` INT NOT NULL,
  `TongTien` INT NOT NULL,
  `IDKhachHang` INT NOT NULL,
  `IDDichVu` INT NOT NULL,
  `IDNhanVien` INT NOT NULL,
  PRIMARY KEY (`IDHopDong`),
  INDEX `fk_HopDong_KhachHang1_idx` (`IDKhachHang` ASC) VISIBLE,
  INDEX `fk_HopDong_DichVu1_idx` (`IDDichVu` ASC) VISIBLE,
  INDEX `fk_HopDong_NhanVien1_idx` (`IDNhanVien` ASC) VISIBLE,
  CONSTRAINT `fk_HopDong_KhachHang1`
    FOREIGN KEY (`IDKhachHang`)
    REFERENCES `mydb`.`KhachHang` (`IDKhachHang`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_HopDong_DichVu1`
    FOREIGN KEY (`IDDichVu`)
    REFERENCES `mydb`.`DichVu` (`IDDichVu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_HopDong_NhanVien1`
    FOREIGN KEY (`IDNhanVien`)
    REFERENCES `mydb`.`NhanVien` (`IDNhanVien`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`DichVuDiKem`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`DichVuDiKem` ;

CREATE TABLE IF NOT EXISTS `mydb`.`DichVuDiKem` (
  `IDDichVuDiKem` INT NOT NULL,
  `TenDichVuDiKem` VARCHAR(45) NOT NULL,
  `Gia` INT NOT NULL,
  `DonVi` VARCHAR(45) NOT NULL,
  `TrangThaiKhaDung` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`IDDichVuDiKem`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`HopDongChiTiet`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`HopDongChiTiet` ;

CREATE TABLE IF NOT EXISTS `mydb`.`HopDongChiTiet` (
  `IDHopDongChiTiet` INT NOT NULL,
  `SoLuong` INT NOT NULL,
  `IDHopDong` INT NOT NULL,
  `IDDichVuDiKem` INT NOT NULL,
  PRIMARY KEY (`IDHopDongChiTiet`),
  INDEX `fk_HopDongChiTiet_HopDong1_idx` (`IDHopDong` ASC) VISIBLE,
  INDEX `fk_HopDongChiTiet_DichVuDiKem1_idx` (`IDDichVuDiKem` ASC) VISIBLE,
  CONSTRAINT `fk_HopDongChiTiet_HopDong1`
    FOREIGN KEY (`IDHopDong`)
    REFERENCES `mydb`.`HopDong` (`IDHopDong`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_HopDongChiTiet_DichVuDiKem1`
    FOREIGN KEY (`IDDichVuDiKem`)
    REFERENCES `mydb`.`DichVuDiKem` (`IDDichVuDiKem`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
