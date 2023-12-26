-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 26, 2023 at 08:17 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `muhammadhamdani_2110010302`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_admin`
--

CREATE TABLE `tbl_admin` (
  `kd_admin` varchar(20) NOT NULL,
  `nama_admin` varchar(50) DEFAULT NULL,
  `username_admin` varchar(50) DEFAULT NULL,
  `password_admin` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_admin`
--

INSERT INTO `tbl_admin` (`kd_admin`, `nama_admin`, `username_admin`, `password_admin`) VALUES
('A001', 'Admin1', 'admin1_username', 'admin1_password'),
('A002', 'Admin2', 'admin2_username', 'admin2_password'),
('A003', 'Admin3', 'admin3_username', 'admin3_password');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_jabatan`
--

CREATE TABLE `tbl_jabatan` (
  `kd_jabatan` varchar(20) NOT NULL,
  `nama_jabatan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_jabatan`
--

INSERT INTO `tbl_jabatan` (`kd_jabatan`, `nama_jabatan`) VALUES
('J001', 'Jabatan1'),
('J002', 'Jabatan2'),
('J003', 'Jabatan3');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pegawai`
--

CREATE TABLE `tbl_pegawai` (
  `kd_pegawai` varchar(20) NOT NULL,
  `nama_pegawai` varchar(50) DEFAULT NULL,
  `kd_jabatan` varchar(20) DEFAULT NULL,
  `password_pegawai` varchar(50) DEFAULT NULL,
  `foto_pegawai` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_pegawai`
--

INSERT INTO `tbl_pegawai` (`kd_pegawai`, `nama_pegawai`, `kd_jabatan`, `password_pegawai`, `foto_pegawai`) VALUES
('P001', 'Pegawai1', 'J001', 'pegawai1_password', 'pegawai1.jpg'),
('P002', 'Pegawai2', 'J002', 'pegawai2_password', 'pegawai2.jpg'),
('P003', 'Pegawai3', 'J003', 'pegawai3_password', 'pegawai3.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_sppd`
--

CREATE TABLE `tbl_sppd` (
  `kd_sppd` varchar(20) NOT NULL,
  `no_sppd` varchar(10) DEFAULT NULL,
  `kd_pegawai` varchar(20) DEFAULT NULL,
  `tgl_sppd` date DEFAULT NULL,
  `tempat_sppd` varchar(50) DEFAULT NULL,
  `kendaraan_sppd` varchar(50) DEFAULT NULL,
  `biaya_sppd` int(11) DEFAULT NULL,
  `tgl_inputsppd` date DEFAULT NULL,
  `kd_admin` varchar(20) DEFAULT NULL,
  `scan_sppd` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_sppd`
--

INSERT INTO `tbl_sppd` (`kd_sppd`, `no_sppd`, `kd_pegawai`, `tgl_sppd`, `tempat_sppd`, `kendaraan_sppd`, `biaya_sppd`, `tgl_inputsppd`, `kd_admin`, `scan_sppd`) VALUES
('S001', '001', 'P001', '2023-01-01', 'City1', 'Car', 500, '2023-01-02', 'A001', 'sppd001.jpg'),
('S002', '002', 'P002', '2023-02-01', 'City2', 'Train', 700, '2023-02-02', 'A002', 'sppd002.jpg'),
('S003', '003', 'P003', '2023-03-01', 'City3', 'Plane', 1000, '2023-03-02', 'A003', 'sppd003.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_suratkeluar`
--

CREATE TABLE `tbl_suratkeluar` (
  `kd_suratkeluar` varchar(20) NOT NULL,
  `tgl_suratkeluar` date DEFAULT NULL,
  `no_suratkeluar` varchar(20) DEFAULT NULL,
  `tujuan_suratkeluar` varchar(50) DEFAULT NULL,
  `perihal_suratkeluar` longtext DEFAULT NULL,
  `scan_suratkeluar` varchar(50) DEFAULT NULL,
  `tgl_inputsuratkeluar` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `kd_admin` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_suratkeluar`
--

INSERT INTO `tbl_suratkeluar` (`kd_suratkeluar`, `tgl_suratkeluar`, `no_suratkeluar`, `tujuan_suratkeluar`, `perihal_suratkeluar`, `scan_suratkeluar`, `tgl_inputsuratkeluar`, `kd_admin`) VALUES
('SK001', '2023-01-01', '001', 'Recipient1', 'Subject1', 'scan001.jpg', '2023-01-01 16:00:00', 'A001'),
('SK002', '2023-02-01', '002', 'Recipient2', 'Subject2', 'scan002.jpg', '2023-02-01 16:00:00', 'A002'),
('SK003', '2023-03-01', '003', 'Recipient3', 'Subject3', 'scan003.jpg', '2023-03-01 16:00:00', 'A003');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_suratmasuk`
--

CREATE TABLE `tbl_suratmasuk` (
  `kd_suratmasuk` varchar(20) NOT NULL,
  `tgl_inputsuratmasuk` date DEFAULT NULL,
  `no_suratmasuk` varchar(20) DEFAULT NULL,
  `pengirim_suratmasuk` varchar(50) DEFAULT NULL,
  `perihal_suratmasuk` longtext DEFAULT NULL,
  `scan_suratmasuk` varchar(50) DEFAULT NULL,
  `kd_pegawai` varchar(20) DEFAULT NULL,
  `tgl_disposisi` date DEFAULT NULL,
  `kd_jabatan` varchar(20) DEFAULT NULL,
  `keterangan` varchar(50) DEFAULT NULL,
  `kd_admin` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_suratmasuk`
--

INSERT INTO `tbl_suratmasuk` (`kd_suratmasuk`, `tgl_inputsuratmasuk`, `no_suratmasuk`, `pengirim_suratmasuk`, `perihal_suratmasuk`, `scan_suratmasuk`, `kd_pegawai`, `tgl_disposisi`, `kd_jabatan`, `keterangan`, `kd_admin`) VALUES
('SM001', '2023-01-01', '001', 'Sender1', 'Subject1', 'scan001.jpg', 'P001', '2023-01-02', 'J001', 'Disposition1', 'A001'),
('SM002', '2023-02-01', '002', 'Sender2', 'Subject2', 'scan002.jpg', 'P002', '2023-02-02', 'J002', 'Disposition2', 'A002'),
('SM003', '2023-03-01', '003', 'Sender3', 'Subject3', 'scan003.jpg', 'P003', '2023-03-02', 'J003', 'Disposition3', 'A003');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_admin`
--
ALTER TABLE `tbl_admin`
  ADD PRIMARY KEY (`kd_admin`);

--
-- Indexes for table `tbl_jabatan`
--
ALTER TABLE `tbl_jabatan`
  ADD PRIMARY KEY (`kd_jabatan`);

--
-- Indexes for table `tbl_pegawai`
--
ALTER TABLE `tbl_pegawai`
  ADD PRIMARY KEY (`kd_pegawai`),
  ADD KEY `kd_jabatan` (`kd_jabatan`);

--
-- Indexes for table `tbl_sppd`
--
ALTER TABLE `tbl_sppd`
  ADD PRIMARY KEY (`kd_sppd`),
  ADD KEY `kd_pegawai` (`kd_pegawai`),
  ADD KEY `kd_admin` (`kd_admin`);

--
-- Indexes for table `tbl_suratkeluar`
--
ALTER TABLE `tbl_suratkeluar`
  ADD PRIMARY KEY (`kd_suratkeluar`),
  ADD KEY `kd_admin` (`kd_admin`);

--
-- Indexes for table `tbl_suratmasuk`
--
ALTER TABLE `tbl_suratmasuk`
  ADD PRIMARY KEY (`kd_suratmasuk`),
  ADD KEY `kd_pegawai` (`kd_pegawai`),
  ADD KEY `kd_admin` (`kd_admin`),
  ADD KEY `kd_jabatan` (`kd_jabatan`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_pegawai`
--
ALTER TABLE `tbl_pegawai`
  ADD CONSTRAINT `tbl_pegawai_ibfk_1` FOREIGN KEY (`kd_jabatan`) REFERENCES `tbl_jabatan` (`kd_jabatan`);

--
-- Constraints for table `tbl_sppd`
--
ALTER TABLE `tbl_sppd`
  ADD CONSTRAINT `tbl_sppd_ibfk_1` FOREIGN KEY (`kd_pegawai`) REFERENCES `tbl_pegawai` (`kd_pegawai`),
  ADD CONSTRAINT `tbl_sppd_ibfk_2` FOREIGN KEY (`kd_admin`) REFERENCES `tbl_admin` (`kd_admin`);

--
-- Constraints for table `tbl_suratkeluar`
--
ALTER TABLE `tbl_suratkeluar`
  ADD CONSTRAINT `tbl_suratkeluar_ibfk_1` FOREIGN KEY (`kd_admin`) REFERENCES `tbl_admin` (`kd_admin`);

--
-- Constraints for table `tbl_suratmasuk`
--
ALTER TABLE `tbl_suratmasuk`
  ADD CONSTRAINT `tbl_suratmasuk_ibfk_1` FOREIGN KEY (`kd_pegawai`) REFERENCES `tbl_pegawai` (`kd_pegawai`),
  ADD CONSTRAINT `tbl_suratmasuk_ibfk_2` FOREIGN KEY (`kd_admin`) REFERENCES `tbl_admin` (`kd_admin`),
  ADD CONSTRAINT `tbl_suratmasuk_ibfk_3` FOREIGN KEY (`kd_jabatan`) REFERENCES `tbl_jabatan` (`kd_jabatan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
