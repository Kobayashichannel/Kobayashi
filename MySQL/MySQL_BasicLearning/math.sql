-- 演示数学相关函数

-- ABS(num)  绝对值
SELECT ABS(10) FROM DUAL;
-- BIN (decimal_number)  十进制转二进制
SELECT BIN(10) FROM DUAL;
-- CEILING (number2) 向上取整,得到比num2 大的最小整数
SELECT CEILING(-1.1) FROM DUAL;

-- CONV(number2,from_base,to_base) 进制转换
-- 下面的含义是 8 是十进制的8,转成 2进制输出
SELECT CONV(8, 10, 2) FROM DUAL;
-- 下面的含义是 16 是十六进制的8,转成 十进制输出
SELECT CONV(16, 16, 10) FROM DUAL;

-- FLOOR (number2)  向下取整,得到比 num2 小的最大整数
SELECT FLOOR(1.1) FROM DUAL;

-- FORMAT (number, decimal_places ) 保留小数位数(四舍五入)
SELECT FORMAT(78.1234512, 2) FROM DUAL;

-- HEX (DecimalNumber) 转十六进制

-- LEAST (number,number2 [,..]) 求最小值
SELECT LEAST(0,1,-10,4) FROM DUAL;
-- MOD (numerator, denominator) 求余
SELECT MOD(11,3) FROM DUAL;

-- RAND([seed]) RAND([seed]) 返回随机数 其范围为 0 <= 随机数 <= 1.0
-- 老韩说明
-- 1. 如果使用 rand() 每次返回不同的随机数, 在 0 <= 随机数 <= 1.0
-- 2. 如果使用 rand(seed) 返回随机数, 范围 0 <= 随机数 <= 1.0, 
--    如果seed不变该随机数也不会改变
SELECT RAND(3) FROM DUAL;