-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 15, 2018 at 09:03 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jaanvi`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `name` varchar(20) DEFAULT NULL,
  `billno` varchar(10) NOT NULL DEFAULT '',
  `tinno` varchar(15) DEFAULT NULL,
  `date` varchar(12) DEFAULT NULL,
  `gr` varchar(20) DEFAULT NULL,
  `transport` varchar(10) DEFAULT NULL,
  `srno` varchar(10) NOT NULL DEFAULT '',
  `equipment` varchar(20) DEFAULT NULL,
  `company` varchar(20) DEFAULT NULL,
  `product` varchar(15) DEFAULT NULL,
  `description` varchar(10) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `vat` varchar(10) DEFAULT NULL,
  `quantity` varchar(10) DEFAULT NULL,
  `amount` varchar(15) DEFAULT NULL,
  `total` varchar(10) DEFAULT NULL,
  `totalquantity` varchar(10) DEFAULT NULL,
  `totalvat` varchar(15) DEFAULT NULL,
  `grandtotal` varchar(20) DEFAULT NULL,
  `payment` varchar(20) DEFAULT NULL,
  `paid` varchar(20) DEFAULT NULL,
  `balance` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`name`, `billno`, `tinno`, `date`, `gr`, `transport`, `srno`, `equipment`, `company`, `product`, `description`, `price`, `vat`, `quantity`, `amount`, `total`, `totalquantity`, `totalvat`, `grandtotal`, `payment`, `paid`, `balance`) VALUES
('Radhika', '109', '123', '14/07/2016', '123', 'Bus', '1', 'pipe', 'Super', 'Nill', '1/5m', '100', '6.05', '1', '100', '100.0', '1.0', '6.05', '106.05', 'Cash', '106.05', '0.0'),
('ksda', '123456', 'wrw', '14/07/2016', 'erwr', 'erwe', '1', 'gasstove', 'Sunflame', 'Metal', '2B', '2200', '14.3', '1', '2200', '2200.0', '1.0', '14.3', '2514.6', 'Cash', '2514.6', '0.0'),
('nsjks', '12346', '123', '14/07/2016', '121`2', 'sds', '1', 'uniform', 'Indane', 'Nill', 'Green', '650', '6.05', '1', '650', '650.0', '1.0', '6.05', '689.325', 'Cash', '689.325', '0.0'),
('Radhika', '2', '1234', '13/07/2016', '123', 'Bus', '1', 'pipe', 'Super', 'Nill', '1/5m', '100', '6.05', '1', '100', '100.0', '1.0', '6.05', '106.05', NULL, NULL, NULL),
('hjkk', '3', '688', '13/07/2016', 'ugiho', 'kjhhi', '1', 'gasstove', 'Sunflame', 'Glass', '2B', '5000', '14.3', '7', '35000', '', '', '', '', NULL, NULL, NULL),
('hjkk', '4', '688', '13/07/2016', 'ugiho', 'kjhhi', '1', 'gasstove', 'Sunflame', 'Glass', '2B', '5000', '14.3', '7', '35000', '5000.0', '7.0', '14.3', '5715.0', NULL, NULL, NULL),
('hsbs', '9191', '122', '14/07/2016', 'qqqq', '1222', '1', 'pipe', 'Supersale', 'Nill', '1/2m', '75', '6.05', '1', '75', '725.0', '2.0', '12.1', '812.725', 'Cash', '812.725', '0.0'),
('hsbs', '9191', '122', '14/07/2016', 'qqqq', '1222', '2', 'uniform', 'Bharat', 'Nill', 'Blue', '650', '6.05', '1', '650', '725.0', '2.0', '12.1', '812.725', 'Cash', '812.725', '0.0'),
('', '9192', '', '04/08/2016', '', '', '1', 'gasstove', 'Sunflame', 'Glass', '3B', '8000', '14.3', '1233', '9864000', '9864000.0', '1233.0', '14.3', '1.1274552E7', 'Cash', '', ''),
('', '9192', '', '04/08/2016', '', '', '2', 'gasstove', 'Sunflame', 'Glass', '3B', '8000', '14.3', '0', '0', '9864000.0', '1233.0', '14.3', '1.1274552E7', 'Cash', '', ''),
('s', '9193', 's', '05/10/2016', 's', 's', '1', 'gasstove', 'Sunflame', 'Glass', '3B', '8000', '14.3', '1', '8000', '8000.0', '1.0', '14.3', '9144.0', 'Cash', '11', '9133.0');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `no` int(5) NOT NULL DEFAULT '0',
  `company` varchar(25) DEFAULT NULL,
  `colour` varchar(10) DEFAULT NULL,
  `quantity` int(6) DEFAULT NULL,
  `price` int(6) DEFAULT NULL,
  `tax` float DEFAULT NULL,
  `dealer` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`no`, `company`, `colour`, `quantity`, `price`, `tax`, `dealer`) VALUES
(1, 'HP', 'Blue', 10, 4, 6.05, 'Sahil');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `no` int(6) NOT NULL DEFAULT '0',
  `dname` varchar(25) DEFAULT NULL,
  `company` varchar(25) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `phone` varchar(12) DEFAULT NULL,
  `item` varchar(25) DEFAULT NULL,
  `date` varchar(20) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `district` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`no`, `dname`, `company`, `address`, `phone`, `item`, `date`, `city`, `district`) VALUES
(1, 'jaanvi', 'hp', 'civil lines', '7896543212', 'stationery', '11/12/16', 'Pune', 'Pune'),
(2, 'Monika', 'hp', 'civillines', '9779590175', 'Stationery', '17/11/16', 'ludhiana', 'ludhiana'),
(3, 'Kareena', 'hp', 'civillines', '9814162452', 'Stationery', '17/11/16', 'ludhiana', 'ludhiana'),
(4, 'raman', 'hp', 'civil lines', '9814162452', 'gasstove', '17/04/17', 'patial', 'ludhiana'),
(5, 'Jaanvi', 'hp', 'civil', '9814162452', 'Stationery', '18/11/16', 'ludhiana', 'ludhiana'),
(7, 'janavi', 'hp', '', '', '', '18/04/17', 'ludhiana', '');

-- --------------------------------------------------------

--
-- Table structure for table `dealer`
--

CREATE TABLE `dealer` (
  `no` int(6) NOT NULL DEFAULT '0',
  `dname` varchar(25) DEFAULT NULL,
  `company` varchar(25) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `phone` int(12) DEFAULT NULL,
  `item` varchar(25) DEFAULT NULL,
  `date` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dealer`
--

INSERT INTO `dealer` (`no`, `dname`, `company`, `address`, `phone`, `item`, `date`) VALUES
(1, 'J', 'H', 'K', 977959017, 'y', '05-04-2017'),
(2, 'kunal', 'hp', 'model town', 987654321, 'uniform', '04-03-2019');

-- --------------------------------------------------------

--
-- Table structure for table `dealerf`
--

CREATE TABLE `dealerf` (
  `no` int(6) NOT NULL DEFAULT '0',
  `dname` varchar(25) DEFAULT NULL,
  `company` varchar(25) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `phone` varchar(12) DEFAULT NULL,
  `item` varchar(25) DEFAULT NULL,
  `date` varchar(20) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `district` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dealerf`
--

INSERT INTO `dealerf` (`no`, `dname`, `company`, `address`, `phone`, `item`, `date`, `city`, `district`) VALUES
(1, 'Sahil', 'Bharat', 'Rudarpur', '9814162451', 'book', '10/07/2016', NULL, NULL),
(2, 'vscomputyer', 'vscomputer', 'likjijuj8u9jk8uj', '9814162452', 'books', '16/06/2018', ' ludhiana', 'ludhiana'),
(3, 'Mohit', 'HP', 'Delhi', '98776655', 'gasstove', '04-03-2017', NULL, NULL),
(4, 'Aman', 'HP', 'Delhi', '123', 'gasstove', '04-05-2018', NULL, NULL),
(7, 'Gagan', 'Bharat', 'Ludhiana', '9988', 'pipe', '04-03-2018', NULL, NULL),
(8, 'verma', 'HP', 'Ludhiana', '9779981126', 'book', '10/07/2016', NULL, NULL),
(11, 'Riya', 'hp', 'ludhiana', '9814162451', 'pipe', '11/04/2017', 'ludhiana', 'ludhiana'),
(101, 'Akhil', 'Bharat', 'Ludhiana', '9911', 'pipe', '04-03-2018', NULL, NULL),
(104, 'Neelam', 'Bharat', 'Rudarpur', '991122', 'uniform', '04-03-2018', NULL, NULL),
(109, 'jaanvi', 'kayjay', 'ludhiana', '9464566617', 'stationery', '24/07/2016', NULL, NULL),
(110, 'rakesh', 'kayjay', 'ludhiana', '9814162452', 'stationery', '24/07/2016', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `dues`
--

CREATE TABLE `dues` (
  `name` varchar(25) DEFAULT NULL,
  `balance` varchar(10) DEFAULT NULL,
  `due` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dues`
--

INSERT INTO `dues` (`name`, `balance`, `due`) VALUES
('Harsimrat', '885.95', '1'),
('', '', ''),
('s', '9133.0', '');

-- --------------------------------------------------------

--
-- Table structure for table `gas`
--

CREATE TABLE `gas` (
  `company` varchar(25) DEFAULT NULL,
  `product` varchar(10) DEFAULT NULL,
  `burner` varchar(5) DEFAULT NULL,
  `quantity` int(6) DEFAULT NULL,
  `price` int(6) DEFAULT NULL,
  `tax` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gas`
--

INSERT INTO `gas` (`company`, `product`, `burner`, `quantity`, `price`, `tax`) VALUES
('Sunflame', 'Glass', '2B', 1, 0, 1),
('Sunflame', 'Glass', '2B', 1, 0, 1),
('Sunflame', 'Glass', '2B', 1, 0, 1),
('Sunflame', 'Glass', '2B', 1, 0, 1),
('Sunflame', 'Glass', '2B', 1, 0, 1),
('Sunflame', 'Glass', '2B', 1, 10589, 1),
('Sunflame', 'Glass', '4B', 1, 10589, 1),
('Apollo', 'Metal', '4B', 16, 5000, 6.05);

-- --------------------------------------------------------

--
-- Table structure for table `gasstove`
--

CREATE TABLE `gasstove` (
  `no` int(5) NOT NULL DEFAULT '0',
  `company` varchar(25) DEFAULT NULL,
  `product` varchar(10) DEFAULT NULL,
  `burner` varchar(5) DEFAULT NULL,
  `quantity` int(6) DEFAULT NULL,
  `price` int(6) DEFAULT NULL,
  `tax` float DEFAULT NULL,
  `dealer` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gasstove`
--

INSERT INTO `gasstove` (`no`, `company`, `product`, `burner`, `quantity`, `price`, `tax`, `dealer`) VALUES
(1, 'Apollo', 'Glass', '2B', 7, 5000, 14.3, 'Mohit'),
(2, 'Sunflame', 'Glass', '3B', 2, 8000, 14.3, 'Mohit'),
(3, 'Sunflame', 'Glass', '4B', 0, 12000, 14.3, 'Mohit'),
(4, 'Sunflame', 'Steel', '2B', 10, 1650, 14.3, 'Mohit'),
(5, 'Sunflame', 'Steel', '3B', 1, 1950, 14.3, 'Mohit'),
(6, 'Sunflame', 'Steel', '4B', 5, 2250, 14.3, 'Mohit'),
(7, 'Sunflame', 'Metal', '2B', 10, 2200, 14.3, 'Mohit'),
(8, 'Sunflame', 'Metal', '3B', 10, 4400, 14.3, 'Mohit'),
(9, 'Sunflame', 'Metal', '4B', 10, 8800, 14.3, 'Mohit');

-- --------------------------------------------------------

--
-- Table structure for table `gs`
--

CREATE TABLE `gs` (
  `sno` int(2) DEFAULT NULL,
  `company` varchar(20) DEFAULT NULL,
  `size` int(5) DEFAULT NULL,
  `price` int(4) DEFAULT NULL,
  `quantity` int(4) DEFAULT NULL,
  `tax` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pipe`
--

CREATE TABLE `pipe` (
  `no` int(5) NOT NULL DEFAULT '0',
  `company` varchar(25) DEFAULT NULL,
  `size` varchar(10) DEFAULT NULL,
  `price` int(6) DEFAULT NULL,
  `quantity` int(6) DEFAULT NULL,
  `tax` float DEFAULT NULL,
  `dealer` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pipe`
--

INSERT INTO `pipe` (`no`, `company`, `size`, `price`, `quantity`, `tax`, `dealer`) VALUES
(1, 'Super', '1/5m', 100, 10, 6.05, 'Gagan'),
(2, 'Supersale', '1/5m', 100, -1, 6.05, 'Gagan'),
(3, 'Super', '1/2m', 75, 10, 6.05, 'Gagan'),
(4, 'Supersale', '1/2m', 75, 10, 6.05, 'Gagan');

-- --------------------------------------------------------

--
-- Table structure for table `reminder`
--

CREATE TABLE `reminder` (
  `Customer_name` varchar(30) DEFAULT NULL,
  `Account_no` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `reminder2`
--

CREATE TABLE `reminder2` (
  `date` varchar(10) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `company` varchar(20) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `item` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reminder2`
--

INSERT INTO `reminder2` (`date`, `name`, `company`, `city`, `item`) VALUES
('17/11/16', 'Monika', 'hp', 'ludhiana', 'Stationery'),
('17/11/16', 'Kareena', 'hp', 'ludhiana', 'Stationery'),
('18/11/16', 'Jaanvi', 'hp', 'ludhiana', 'Stationery');

-- --------------------------------------------------------

--
-- Table structure for table `stationery`
--

CREATE TABLE `stationery` (
  `no` varchar(5) NOT NULL DEFAULT '',
  `company` varchar(25) DEFAULT NULL,
  `description` varchar(25) DEFAULT NULL,
  `quantity` varchar(5) DEFAULT NULL,
  `price` varchar(6) DEFAULT NULL,
  `tax` varchar(6) DEFAULT NULL,
  `dealer` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stationery`
--

INSERT INTO `stationery` (`no`, `company`, `description`, `quantity`, `price`, `tax`, `dealer`) VALUES
('1', 'Bharat', 'blue', '12', '100', '1.1', 'rakesh');

-- --------------------------------------------------------

--
-- Table structure for table `table1`
--

CREATE TABLE `table1` (
  `Username` varchar(20) NOT NULL DEFAULT '',
  `Password` varchar(11) NOT NULL DEFAULT '',
  `dob` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `table1`
--

INSERT INTO `table1` (`Username`, `Password`, `dob`) VALUES
('Jaanvi', 'Scientist', '11_July_1998');

-- --------------------------------------------------------

--
-- Table structure for table `table2`
--

CREATE TABLE `table2` (
  `no` int(10) NOT NULL DEFAULT '0',
  `dname` varchar(30) DEFAULT NULL,
  `company` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone` int(10) NOT NULL DEFAULT '0',
  `item` varchar(25) DEFAULT NULL,
  `price` int(10) DEFAULT NULL,
  `packet` int(10) DEFAULT NULL,
  `tax` int(10) DEFAULT NULL,
  `amount` int(10) DEFAULT NULL,
  `date` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `table2`
--

INSERT INTO `table2` (`no`, `dname`, `company`, `address`, `phone`, `item`, `price`, `packet`, `tax`, `amount`, `date`) VALUES
(1, 'Anil', 'I', 'CivilLine', 9383, 'gd', 1, 1, 1, 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `uniform`
--

CREATE TABLE `uniform` (
  `no` int(5) NOT NULL DEFAULT '0',
  `company` varchar(25) DEFAULT NULL,
  `colour` varchar(10) DEFAULT NULL,
  `quantity` int(6) DEFAULT NULL,
  `price` int(6) DEFAULT NULL,
  `tax` float DEFAULT NULL,
  `dealer` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `uniform`
--

INSERT INTO `uniform` (`no`, `company`, `colour`, `quantity`, `price`, `tax`, `dealer`) VALUES
(1, 'HP', 'Mehroon', 10, 650, 6.05, 'Neelam'),
(2, 'Bharat', 'Blue', 10, 650, 6.05, 'Neelam'),
(3, 'Indane', 'Green', 10, 650, 6.05, 'Neelam');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`billno`,`srno`);

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `dealer`
--
ALTER TABLE `dealer`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `dealerf`
--
ALTER TABLE `dealerf`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `gasstove`
--
ALTER TABLE `gasstove`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `pipe`
--
ALTER TABLE `pipe`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `reminder`
--
ALTER TABLE `reminder`
  ADD PRIMARY KEY (`Account_no`);

--
-- Indexes for table `stationery`
--
ALTER TABLE `stationery`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `table1`
--
ALTER TABLE `table1`
  ADD PRIMARY KEY (`Username`,`Password`);

--
-- Indexes for table `table2`
--
ALTER TABLE `table2`
  ADD PRIMARY KEY (`no`,`phone`);

--
-- Indexes for table `uniform`
--
ALTER TABLE `uniform`
  ADD PRIMARY KEY (`no`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
