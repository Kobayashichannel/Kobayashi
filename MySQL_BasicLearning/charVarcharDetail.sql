#演示字符串类型的使用细节
#char(4) 和 varchar(4) 这个4表示的是字符,而不是字节，不区分字符是汉字还是字母
CREATE TABLE t11(
	`name` CHAR(4));
INSERT INTO t11 VALUES('ab北京');

SELECT * FROM t11;

CREATE TABLE t12(
	`name` VARCHAR(4));
INSERT INTO t12 VALUES('韩顺平好');
INSERT INTO t12 VALUES('ab北京');
SELECT * FROM t12;

#如果varchar  不够用, 可以考虑使用mediumtext 或者 longtext,
#如果想简单点, 可以使用直接使用text
create table t13( content text, content2 mediumtext, content3 longtext);
insert into t13 values('韩顺平教育', '韩顺平教育100', '韩顺平教育1000~~');
select * from t13;