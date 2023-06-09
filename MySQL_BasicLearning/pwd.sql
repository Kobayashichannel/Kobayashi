-- 演示加密函数和系统函数

-- USER()  	查询用户
-- DATEBASE()   数据库名称
SELECT USER() FROM DUAL; -- 用户@IP地址
-- DATEBASE()   查询当前使用数据库名称
SELECT DATABASE();

-- MD5(str)  	为字符串算出一个 MD5 32的字符串, (用户密码) 加密
-- root 密码是 hso -> 加密md5 -> 在数据库中存放的是加密后的密码
SELECT MD5('hsp') FROM DUAL; 
SELECT LENGTH(MD5('hsp')) FROM DUAL; -- MD5加密后一定是32位

-- 演示用户表,存放密码时,是md5
CREATE TABLE hsp_user
	(id INT,
	`name` VARCHAR(32) NOT NULL DEFAULT '',
	pwd CHAR(32) NOT NULL DEFAULT '');
INSERT INTO hsp_user
	VALUES(100, '韩顺平', MD5('hsp'));
SELECT * FROM hsp_user; -- csdn

SELECT * FROM hsp_user
	WHERE `name` = '韩顺平' AND pwd = MD5('hsp')
	
-- PASSWORD(str) -- 加密函数, mysql数据库的用户密码是 PASSWORD函数加密

SELECT PASSWORD('hsp') FROM DUAL;

-- select * from mysql.user \G 从原文密码 str 计算并返回密码字符串,
-- 通常用于对mysql数据库的用户密码加密
-- mysql.user 表示 数据库.表
SELECT * FROM mysql.user