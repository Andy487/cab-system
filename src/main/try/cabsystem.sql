-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 05, 2021 at 05:15 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cabsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `empprofile`
--

CREATE TABLE `empprofile` (
  `empId` int(10) NOT NULL,
  `empName` varchar(30) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(20) NOT NULL,
  `contactNo` int(15) NOT NULL,
  `emergencyNo` int(15) NOT NULL,
  `gender` varchar(8) NOT NULL,
  `dob` varchar(15) NOT NULL,
  `email` varchar(20) NOT NULL,
  `mangerId` int(10) NOT NULL,
  `department` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(11);

-- --------------------------------------------------------

--
-- Table structure for table `managerdetails`
--

CREATE TABLE `managerdetails` (
  `manId` int(10) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `address` varchar(50) NOT NULL,
  `department` varchar(15) NOT NULL,
  `contactNo` int(12) NOT NULL,
  `age` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `rosterlist`
--

CREATE TABLE `rosterlist` (
  `rosterId` bigint(20) NOT NULL,
  `rosterDate` varchar(255) DEFAULT NULL,
  `empId` varchar(255) DEFAULT NULL,
  `routeCode` varchar(255) DEFAULT NULL,
  `shift` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;




-- --------------------------------------------------------

--
-- Table structure for table `routeandcab`
--

CREATE TABLE `RosterAndCabAssignment` (
  `assignmentId` int(4) NOT NULL,
  `cabNo` varchar(12) DEFAULT NULL,
  `empIds` varchar(30) DEFAULT NULL,
  `routeCode` varchar(30) DEFAULT NULL,
  `tripDate` varchar(10) DEFAULT NULL,
  `shift` varchar(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



CREATE TABLE `cabDriver` (
  `cabId` bigint(20) NOT NULL,
  `cabNo` bigint(20) DEFAULT NOT NULL,
  `deiverName` varchar(255) DEFAULT NULL,
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `rosterId` bigint(20) NOT NULL,
  `cabId` varchar(255) DEFAULT NULL,
  `dateFrom` varchar(255) DEFAULT NULL,
  `dateTo` varchar(255) DEFAULT NULL,
  `empId` varchar(255) DEFAULT NULL,
  `routeAllocate` varchar(255) DEFAULT NULL,
  `shift` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`



--

INSERT INTO `student` (`rosterId`, `cabId`, `dateFrom`, `dateTo`, `empId`, `routeAllocate`, `shift`) VALUES
(5, NULL, '434343', '4343', NULL, 'ceess', '4'),
(6, NULL, '43343', '433443', NULL, 'fffr]]', 'err');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `empprofile`
--
ALTER TABLE `empprofile`
  ADD PRIMARY KEY (`empId`);

--
-- Indexes for table `managerdetails`
--
ALTER TABLE `managerdetails`
  ADD PRIMARY KEY (`manId`);

--
-- Indexes for table `rosterlist`
--
ALTER TABLE `rosterlist`
  ADD PRIMARY KEY (`rosterId`);

--
-- Indexes for table `routeandcab`
--
ALTER TABLE `routeandcab`
  ADD PRIMARY KEY (`rosterId`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`rosterId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `routeandcab`
--
ALTER TABLE `routeandcab`
  MODIFY `rosterId` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
