CREATE TABLE `movie` (
  `id` int(11) NOT NULL,
  `director` varchar(255) DEFAULT NULL,
  `genere` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `year` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;