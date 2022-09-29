-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 25 Mei 2019 pada 15.42
-- Versi Server: 10.1.10-MariaDB
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projectapp_javacloth`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `incloth`
--

CREATE TABLE `incloth` (
  `idtransaksi` varchar(50) NOT NULL,
  `idcloth` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jenis` varchar(50) NOT NULL,
  `hargabeli` varchar(50) NOT NULL,
  `modalsatuan` varchar(50) NOT NULL,
  `jualsatuan` varchar(50) NOT NULL,
  `income` varchar(50) NOT NULL,
  `stoktersedia` varchar(50) NOT NULL,
  `jumlahbeli` varchar(50) NOT NULL,
  `totalstok` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `incloth`
--

INSERT INTO `incloth` (`idtransaksi`, `idcloth`, `tanggal`, `nama`, `jenis`, `hargabeli`, `modalsatuan`, `jualsatuan`, `income`, `stoktersedia`, `jumlahbeli`, `totalstok`) VALUES
('TR001', 'IDC001', '2019-05-24', 'Taco Black', 'T-Shirt', '200000', '40000', '75000', '35000', '20', '5', '25'),
('TR002', 'IDC001', '2019-05-24', 'Taco Black', 'T-Shirt', '400000', '40000', '75000', '35000', '25', '10', '35'),
('TR003', 'IDC002', '2019-05-24', 'Taco Red', 'T-Shirt', '600000', '50000', '80000', '30000', '0', '12', '12'),
('TR004', 'IDC003', '2019-05-24', 'ChocoTacoPubg', 'T-Shirt', '450000', '45000', '80000', '35000', '0', '10', '10'),
('TR005', 'IDC004', '2019-05-24', 'Taco Blue', 'T-Shirt', '600000', '60000', '90000', '30000', '0', '10', '10'),
('TR006', 'IDC004', '2019-05-25', 'Taco Blue', 'T-Shirt', '720000', '60000', '90000', '30000', '0', '12', '12'),
('TR007', 'IDC001', '2019-05-25', 'Taco Black', 'T-Shirt', '480000', '40000', '75000', '35000', '9', '12', '21'),
('TR008', 'IDC002', '2019-05-25', 'Taco Red', 'T-Shirt', '600000', '50000', '80000', '30000', '10', '12', '22'),
('TR009', 'IDC002', '2019-05-25', 'Taco Red', 'T-Shirt', '600000', '50000', '80000', '30000', '20', '12', '32');

-- --------------------------------------------------------

--
-- Struktur dari tabel `inventori`
--

CREATE TABLE `inventori` (
  `idcloth` varchar(20) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `stok` varchar(50) NOT NULL,
  `hargamodal` varchar(50) NOT NULL,
  `hargajual` varchar(50) NOT NULL,
  `income` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `inventori`
--

INSERT INTO `inventori` (`idcloth`, `nama`, `jenis`, `stok`, `hargamodal`, `hargajual`, `income`) VALUES
('IDC001', 'Taco Black', 'T-Shirt', '21', '40000', '75000', '35000'),
('IDC002', 'Taco Red', 'T-Shirt', '30', '50000', '80000', '30000'),
('IDC003', 'ChocoTacoPubg', 'T-Shirt', '9', '45000', '80000', '35000'),
('IDC004', 'Taco Blue', 'T-Shirt', '9', '60000', '90000', '30000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `outcloth`
--

CREATE TABLE `outcloth` (
  `idtransaksi` varchar(50) NOT NULL,
  `idcloth` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jenis` varchar(50) NOT NULL,
  `jumlah` varchar(50) NOT NULL,
  `hargajual` varchar(50) NOT NULL,
  `subtotal` varchar(50) NOT NULL,
  `total` varchar(50) NOT NULL,
  `bayar` varchar(50) NOT NULL,
  `kembalian` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `outcloth`
--

INSERT INTO `outcloth` (`idtransaksi`, `idcloth`, `tanggal`, `nama`, `jenis`, `jumlah`, `hargajual`, `subtotal`, `total`, `bayar`, `kembalian`) VALUES
('TR001', 'IDC002', '2019-05-25', 'Taco Red', 'T-Shirt', '2', '80000', '160000', '160000', '200000', '40000'),
('TR002', 'IDC001', '2019-05-25', 'Taco Black', 'T-Shirt', '5', '75000', '375000', '375000', '400000', '25000'),
('TR003', 'IDC001', '2019-05-25', 'Taco Black', 'T-Shirt', '5', '75000', '375000', '375000', '400000', '25000'),
('TR004', 'IDC001', '2019-05-25', 'Taco Black', 'T-Shirt', '5', '75000', '375000', '375000', '375000', '0'),
('TR005', 'IDC004', '2019-05-25', 'Taco Blue', 'T-Shirt', '1', '90000', '90000', '90000', '90000', '0'),
('TR006', 'IDC004', '2019-05-25', 'Taco Blue', 'T-Shirt', '9', '90000', '810000', '810000', '810000', '0'),
('TR007', 'IDC001', '2019-05-25', 'Taco Black', 'T-Shirt', '1', '75000', '75000', '75000', '100000', '25000'),
('TR008', 'IDC001', '2019-05-25', 'Taco Black', 'T-Shirt', '1', '75000', '75000', '75000', '80000', '5000'),
('TR009', 'IDC001', '2019-05-25', 'Taco Black', 'T-Shirt', '2', '75000', '150000', '150000', '150000', '0'),
('TR010', 'IDC001', '2019-05-25', 'Taco Black', 'T-Shirt', '1', '75000', '75000', '75000', '75000', '0'),
('TR011', 'IDC001', '2019-05-25', 'Taco Black', 'T-Shirt', '1', '75000', '75000', '75000', '100000', '25000'),
('TR012', 'IDC001', '2019-05-25', 'Taco Black', 'T-Shirt', '4', '75000', '300000', '300000', '300000', '0'),
('TR013', 'IDC001', '2019-05-25', 'Taco Black', 'T-Shirt', '1', '75000', '75000', '75000', '75000', '0'),
('TR014', 'IDC004', '2019-05-25', 'Taco Blue', 'T-Shirt', '2', '90000', '180000', '180000', '200000', '20000'),
('TR015', 'IDC004', '2019-05-25', 'Taco Blue', 'T-Shirt', '1', '90000', '90000', '170000', '200000', '30000'),
('TR016', 'IDC004', '2019-05-25', 'Taco Blue', 'T-Shirt', '1', '90000', '90000', '90000', '90000', '0'),
('TR017', 'IDC002', '2019-05-25', 'Taco Red', 'T-Shirt', '2', '80000', '160000', '160000', '200000', '40000'),
('TR018', 'IDC002', '2019-05-25', 'Taco Red', 'T-Shirt', '2', '80000', '160000', '160000', '200000', '40000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `incloth`
--
ALTER TABLE `incloth`
  ADD PRIMARY KEY (`idtransaksi`);

--
-- Indexes for table `inventori`
--
ALTER TABLE `inventori`
  ADD PRIMARY KEY (`idcloth`);

--
-- Indexes for table `outcloth`
--
ALTER TABLE `outcloth`
  ADD PRIMARY KEY (`idtransaksi`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
