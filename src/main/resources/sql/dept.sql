select * from dept;
insert into dept
values
(60,'xxx','yyy');


update dept
set dname='개발부',
	loc='광주'
where deptno=60;

delete from dept
where deptno=60;

