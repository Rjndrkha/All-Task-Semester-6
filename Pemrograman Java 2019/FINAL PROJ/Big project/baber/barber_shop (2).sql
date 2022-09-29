-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 27, 2019 at 06:49 AM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 7.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `barber_shop`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `username`, `password`) VALUES
(2, 'fachry', 'fachry'),
(1, 'puspito', 'puspito');

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `id_appoint` int(11) NOT NULL,
  `AppointDate` date NOT NULL,
  `AppointTime` varchar(255) NOT NULL,
  `AppointPlace` varchar(255) NOT NULL,
  `id_custom` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`id_appoint`, `AppointDate`, `AppointTime`, `AppointPlace`, `id_custom`) VALUES
(1, '2019-12-19', '10.00 AM - 12.00 PM', 'French Barbara Shop', 1),
(2, '2019-12-19', '18.00 PM - 21.00 PM', 'New States Barbara Shop', 2),
(4, '2019-12-13', '12.00 PM - 15.00 PM', 'Chicago Barbara Shop', 2);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id_custom` int(11) NOT NULL,
  `Firstname` varchar(255) NOT NULL,
  `Lastname` varchar(255) NOT NULL,
  `Phone` varchar(255) NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `id_service` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id_custom`, `Firstname`, `Lastname`, `Phone`, `Gender`, `Address`, `id_service`) VALUES
(1, 'Kelly', 'Lark', '807977', 'Woman', 'USA', 3),
(2, 'Tom', 'Pearl', '804471', 'Man', 'NY', 9),
(4, 'Dimy', 'Well', '809476', 'Man', 'Chile', 4),
(5, 'Kelly', 'Lark', '807977', 'Woman', 'USA', 3);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id_emp` int(11) NOT NULL,
  `Firstname` varchar(255) NOT NULL,
  `Lastname` varchar(255) NOT NULL,
  `Payrate` int(11) NOT NULL,
  `Specialist` varchar(255) NOT NULL,
  `id_service` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id_emp`, `Firstname`, `Lastname`, `Payrate`, `Specialist`, `id_service`) VALUES
(1, 'Mike', 'John', 500000, 'Pompadour', 1),
(2, 'Noel', 'Pole', 500000, 'Under Cut', 2),
(3, 'Ben', 'Cole', 1000000, 'Top Knot', 3),
(4, 'Sam', 'Nichole', 700000, 'Man Bun', 4),
(5, 'Weak', 'Jeff', 600000, 'Spiky', 5),
(6, 'Zee', 'Cendor', 1000000, 'Mohawk', 6),
(7, 'Frans', 'Jee', 5500000, 'Fringe', 7),
(8, 'Ont', 'Kendar', 800000, 'Slicked Back', 8),
(9, 'Trass', 'Cott', 900000, 'Buzz Cut', 9),
(10, 'Gale', 'Wrap', 650000, 'Faux', 10);

-- --------------------------------------------------------

--
-- Table structure for table `service`
--

CREATE TABLE `service` (
  `id_service` int(11) NOT NULL,
  `ServiceName` varchar(255) NOT NULL,
  `ServiceDuration` int(11) NOT NULL,
  `ServicePrice` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `service`
--

INSERT INTO `service` (`id_service`, `ServiceName`, `ServiceDuration`, `ServicePrice`) VALUES
(1, 'Pompadour Hair Cut Style', 15, 25000),
(2, 'Under Cut Hair Style', 30, 20000),
(3, 'Top Knot Hair Cut Style', 15, 25000),
(4, 'Man Bun Hair Cut Style', 20, 3000),
(5, 'Spiky Hair Cut Style', 15, 25000),
(6, 'Mohawk Hair Cut Style', 35, 40000),
(7, 'Fringe Hair Cut Style', 25, 20000),
(8, 'Slicked Back Hair Cut Style', 25, 30000),
(9, 'Buzz Cut Hair Style', 15, 25000),
(10, 'Faux Hawk Hair Cut Style', 20, 25000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`id_appoint`),
  ADD KEY `id_custom` (`id_custom`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id_custom`),
  ADD KEY `id_service` (`id_service`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id_emp`),
  ADD KEY `id_service` (`id_service`);

--
-- Indexes for table `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`id_service`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `appointment`
--
ALTER TABLE `appointment`
  MODIFY `id_appoint` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id_custom` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id_emp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `service`
--
ALTER TABLE `service`
  MODIFY `id_service` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `appointment`
--
ALTER TABLE `appointment`
  ADD CONSTRAINT `appointment_ibfk_1` FOREIGN KEY (`id_custom`) REFERENCES `customer` (`id_custom`);

--
-- Constraints for table `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `customer_ibfk_2` FOREIGN KEY (`id_service`) REFERENCES `service` (`id_service`);

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`id_service`) REFERENCES `service` (`id_service`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
