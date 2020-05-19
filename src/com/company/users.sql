-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Túın: 127.0.0.1
-- Jasaý ýaqyty: 2020-05-10, 06:44
-- Server nusqasy: 10.4.11-MariaDB
-- PHP nusqasy: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Derekqor: `database1`
--

-- --------------------------------------------------------

--
-- Keste úshin keste qurylymy `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `birthday` varchar(20) NOT NULL,
  `number` varchar(11) NOT NULL,
  `password` varchar(20) NOT NULL,
  `helpWord` varchar(30) NOT NULL,
  `answer` varchar(20) NOT NULL,
  `admin` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Keste úshin derekterdi damptaý `users`
--

INSERT INTO `users` (`id`, `name`, `surname`, `Gender`, `birthday`, `number`, `password`, `helpWord`, `answer`, `admin`) VALUES
(1, 'Yerulan', 'Kurbanbek', 'man', '2002-06-29', '87077082145', 'qwerty1234', 'Your favourite food name', 'mach', 1),
(3, 'Nurakhmet', 'Karsybai', 'MAN', '2002-06-20', '87716441748', '87716441748', 'Your favourite food name', 'plov', 0),
(6, 'Aza', 'Aza', 'MAN', '2008-08-1', '87778887878', '87778887878', 'Your favourite food name', 'plov', 0),
(7, 'Abo', 'Abo', 'MAN', '2009-09-1', '87078088899', '87078088899', 'Your favourite food name', 'franch soup', 0);

--
-- Damptalǵan kesteler úshin ındekster
--

--
-- Keste úshin ındekster `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- Damptalǵan kesteler úshin AUTO_INCREMENT
--

--
-- Keste úshin AUTO_INCREMENT `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
