-- 多表查询的 自连接
-- 思考题:显示公司员工姓名和他的上级的名字
-- 老韩分析: 员工姓名 在 emp表的 mgr 列关联
-- 员工和上级是通过 emp表的 mgr 列关联
-- 这里老师小结
-- 自连接的特点 1. 把同一张表当做两张表使用
-- 		2. 需要给表取别名 表名 表别名
--		3. 列名不明确,可以指定列的别名, 列名 as 列的别名
SELECT worker.ename AS '职员名', boss.ename AS '上级名'
	FROM emp worker, emp boss
	WHERE worker.mgr = boss.empno;
SELECT * FROM emp;