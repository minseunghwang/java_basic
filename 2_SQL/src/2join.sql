select
from
where
order by

select * from emp;

select lower(ename),hiredate,to_char(hiredate,'YY'),substr(hiredate,1,2) 
from emp;

select round(55.55),trunc(55.55)
from dual;

select round(sal),trunc(sal)
from emp;

select * from emp order by deptno;

select ename,deptno,sal,sal*1.1 
from emp;

select ename,deptno,sal,sal*1.1 
from emp
where deptno=10;

select ename,deptno,sal,sal*1.2 
from emp
where deptno=20;

select ename,deptno,sal,sal*1.3 
from emp
where deptno=30;

select ename,deptno,sal,decode(deptno,10, sal*1.1,
                                      20,sal*1.2,
                                          sal ) as 수당
from emp;

select ename,mgr 
from emp;

select ename,nvl(to_char(mgr),'X') 
from emp;

select ename,nvl2(mgr,'O','X') 
from emp;

select * from emp;
select * from dept;

select *
from emp,dept
where emp.deptno = dept.deptno;

select ename,job,dname,loc
from emp,dept
where emp.deptno = dept.deptno;

select ename,job,emp.deptno,dname,loc
from emp,dept
where emp.deptno = dept.deptno;

select ename,job,d.deptno,dname,loc
from emp e , dept d
where e.deptno = d.deptno;

안시 표준  :  , => join    where => on
select ename,job,d.deptno,dname,loc
from emp e join dept d
on e.deptno = d.deptno;

select ename,job,d.deptno,dname,loc
from emp e inner join dept d
on e.deptno = d.deptno;

select ename,job,dname,sal
from emp e inner join dept d
on e.deptno = d.deptno
where sal > 2000;

select ename,job,dname,sal
from emp e , dept d
where e.deptno = d.deptno and sal > 2000;

select ename,job,d.deptno,dname,loc
from emp e , dept d
where e.deptno(+) = d.deptno;

select ename,job,d.deptno,dname,loc
from emp e right outer join dept d
on e.deptno = d.deptno;

select * from SALGRADE;

select ename,sal,grade 
from emp,SALGRADE
where sal between losal and hisal;

select ename,sal,grade 
from emp join SALGRADE
on sal between losal and hisal;

select e.ename 사원이름, m.ename 상사이름
from emp e,emp m
where e.mgr=m.empno;

select e.ename 사원이름, m.ename 상사이름
from emp e,emp m
where e.mgr=m.empno(+);

select e.ename 사원이름, nvl(m.ename,'<<CEO>>') 상사이름
from emp e left join emp m
on e.mgr=m.empno;

상사보다 입사일자가 빠른 사원
select e.ename 사원이름,e.hiredate,m.ename 상사이름,m.hiredate
from emp e left join emp m
on e.mgr=m.empno
where e.hiredate < m.hiredate;

상사보다 급여가 맣은 사원 목록 구하는 쿼리구문을 작설 하세요.
select e.ename 사원이름,e.sal,m.ename 상사이름,m.sal
from emp e left join emp m
on e.mgr=m.empno
where e.sal > m.sal;

select e.ename 사원이름,e.sal,m.ename 상사이름,m.sal
from emp e , emp m
where e.mgr=m.empno and e.sal > m.sal;

집계함수

select ename,round(sal) from emp;
select avg(sal) from emp;
select count(sal),count(comm),count(*),count(mgr) from emp;

select count(job) from emp;
select count(distinct job) from emp;

select sum(sal),count(*),round(sum(sal)/count(*),2) 평균 
                        ,round(avg(sal),2) 
from emp;

select sum(sal),count(*),round(avg(sal),2) 평균
from emp;

select sum(sal),count(*),round(avg(sal),2) 평균
from emp
where deptno=40;

select deptno,sum(sal),count(*),round(avg(sal),2) 평균
from emp
group by deptno;

select deptno,max(sal),min(sal),count(*),round(avg(sal),2) 평균
from emp
group by deptno;

select emp.deptno,dname ,avg(sal) 평균
from emp,dept
where emp.deptno=dept.deptno 
group by emp.deptno,dname
order by 3;

select emp.deptno,dname,count(*) ,avg(sal) 평균
from emp,dept
where emp.deptno=dept.deptno 
group by emp.deptno,dname
order by 평균;

급여가 2000 이상인 부서별 평균 급여를 구하세요
select emp.deptno,dname,count(*) ,avg(sal) 평균
from emp,dept
where emp.deptno=dept.deptno and sal > 2000
group by emp.deptno,dname
order by 평균;

평균 급여가 2000 이상인 부서정보 출력 
select emp.deptno,dname,count(*) ,avg(sal) 평균
from emp,dept
where emp.deptno=dept.deptno  
group by emp.deptno,dname
having avg(sal) > 2000
order by 평균;


select ename,dname,sal,grade
from emp,dept,salgrade
where emp.deptno=dept.deptno and sal between losal and hisal ;

p265 참조  세개 이상의 테이블 안시조인 결합
select ename,dname,sal,grade
from emp
     join dept
     on emp.deptno=dept.deptno
     join salgrade
     on sal between losal and hisal ;


서브쿼리
FORD의 급여 구하는 sql 구문 
select sal from emp where ename='FORD'; 
select * from emp where sal>3000;

select * 
from emp 
where sal > (select sal from emp where ename='FORD');

select * 
from emp 
where sal < (select round(avg(sal)) from emp);

select min(sal) from emp;

select * 
from emp 
where sal = (select min(sal) from emp);


select min(sal) from emp group by deptno;

select * 
from emp 
where sal in (select min(sal) from emp group by deptno);

자신이 속한 부서의 평균보다 급여가 적은 사람 리스트
select * 
from emp outer 
where sal < (select avg(sal) from emp where deptno=outer.deptno);
     
select rownum,ename,job,sal 
from emp;

select rownum,ename,job,sal 
from emp
order by sal;

select rownum,ename,job,sal 
from (select * from emp order by sal desc);

select rownum,ename,job,sal 
from (select * from emp order by sal desc)
where rownum<4;

select * 
from emp
order by deptno,sal;

각부서별 최고 급여를 받는 사람 리스트
select * 
from emp 
where sal in (select max(sal) from emp group by deptno);

select * 
from emp 
where (deptno, sal) 
    in (select deptno, max(sal) from emp group by deptno);







select
from
where
order by

select emp.deptno,dname ,sal,grade
from emp, dept,salgrade
where emp.deptno=dept.deptno and emp.sal between losal and hisal;


select emp.deptno,dname ,sal,grade
from emp 
     join dept
     on emp.deptno=dept.deptno
     join salgrade
     on sal between losal and hisal;

     