
DROP TABLE IF EXISTS goods;
CREATE TABLE goods(
	id INT PRIMARY KEY,
	goods_name VARCHAR(10),
	price DOUBLE);
INSERT INTO goods VALUES
(1,'华为',6000),
(2,'苹果',7000),
(3,'三星',5000),
(4,'vivo',NULL);
SELECT * FROM goods;