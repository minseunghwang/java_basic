purge recyclebin;
select * from tab;


drop table book;
create table book(
   bookno number(5) ,
   title  varchar2(12),
   author varchar2(12),
   pubdate date
);

commit;
rollback;
select * from book;

insert into book values(1,'java','kim',sysdate);
insert into book values(1,'java','kim',sysdate);
insert into book values(2,null,null,'19/05/15');

insert into book (bookno,title,author,pubdate)
           values(3,'sql','lee',null);
           
insert into book (bookno,title,author)
           values(4,'db','java01');
          
commit;
rollback;


delete from book;
delete from book where title is null;
delete from book where author ='kim';


alter table book add(price number(7));

insert into book values(5,default,default,default,default);

update book set price=null;
update book set price=10,title='jsp' where bookno=1;

alter table book modify(price number(7,2));
alter table book drop column price;

rename book to book2;
rename book2 to book;

delete from book;
truncate table book;
drop table book;

select * from emp;
select * from dept;

create table emp2
   as select * from emp;

create table emp3
   as select * from emp where deptno=10;

create table dept2
   as select * from dept;

insert into dept values(50,'EDU','SEOUL');
insert into dept2 values(50,'EDU','SEOUL');
commit;   

insert into dept values(10,'EDU','SEOUL');
insert into dept2 values(10,'EDU','SEOUL');

rollback;

drop table book cascade CONSTRAINT;
drop table book;
create table book(
   bookno number(5) CONSTRAINT scott_book_pk primary key,
   title  varchar2(12) CONSTRAINT book_title_unique unique,
   author varchar2(12),
   price number(5) CONSTRAINT book_price_check check(price>0),
   pubdate date default sysdate
);

commit;
rollback;
select * from book;

insert into book(bookno,title,author,price,pubdate) 
            values(1,'java 1','kim',-9000,sysdate);
            
insert into book(bookno,title,author,price,pubdate) 
            values(1,'java 1','kim',9000,sysdate);
 
insert into book(bookno,title,author,price,pubdate) 
            values(2,'java 2','kim',9000,sysdate);

insert into book(bookno,title,author,price,pubdate) 
            values(3,null,'kim',9000,sysdate);

insert into book(bookno,title,author,price,pubdate) 
            values(4,'java 4','lee',9000,default);

insert into book(bookno,title,price) values(5,'java 5',7000);

select * from book;

select CONSTRAINT_name from user_cons_columns;

select CONSTRAINT_name 
from user_cons_columns
where table_name='BOOK';

drop table book;
purge recyclebin;
drop table book cascade CONSTRAINT;

drop table book;
create table book(
   bookno number(5)  primary key,
   title  varchar2(12) unique,
   author varchar2(12),
   price number(5)  check(price>0),
   pubdate date default sysdate
);

insert into book(bookno,title,price) values(5,'java 5',7000);

drop table book;
create table book(
   bookno number(5) ,
   title  varchar2(12) unique,
   author varchar2(12),
   price number(5)  check(price>0),
   pubdate date default sysdate
);
alter table book add CONSTRAINT book_bookno_pk primary key(bookno);
alter table book drop constraint book_bookno_pk;

drop table dept2;
create table dept2
   as select * from dept;

   //dept2 테이블에 deptno 컬럼에 pk 설정
alter table dept2 add CONSTRAINT dept2_deptno_pk primary key(deptno);

   //emp2 테이블에 empno 컬럼에 pk 설정
alter table emp2 add CONSTRAINT emp2_empno_pk primary key(empno);

  //emp2 테이블에 mgr 컬럼에 Fk 설정
alter table emp2 add CONSTRAINT emp2_mgr_fk foreign key(mgr) references emp2;
alter table emp2 add foreign key(deptno) references dept2;
   
   
create table emp2
   as select * from emp;

alter table book drop constraint book_bookno_pk;

select 
   constraint_name, 
   column_name 
from user_cons_columns
where table_name='BOOK';


p265 참조  세개 이상의 테이블 안시조인 결합
select ename,dname,sal,grade
from emp
     join dept
     on emp.deptno=dept.deptno
     join salgrade
     on sal between losal and hisal ;

select *
from emp
     join dept
     on emp.deptno=dept.deptno
     join salgrade
     on sal between losal and hisal ;


create or replace view emp_detail
as
select ename,dname,sal,grade
from emp
     join dept
     on emp.deptno=dept.deptno
     join salgrade
     on sal between losal and hisal ;

select * from emp_detail;

drop view emp_detail;

insert into emp3
select * from emp where deptno=20;

update emp set sal = sal* 1.1 where deptno=10;



drop table book;
create table book(
   bookno number(5) ,
   title  varchar2(12) ,
   author varchar2(12),
   price number(5)  check(price>0),
   pubdate date default sysdate
);
alter table book add CONSTRAINT book_bookno_pk primary key(bookno);
alter table book drop constraint book_bookno_pk;

create sequence bookno;
drop sequence bookno;

insert into book(bookno,title,price) 
values(bookno.nextval ,'SQL18',7000);

select bookno.currval from dual;

insert into book(bookno,title,price) 
values((select nvl(max(bookno),0)+1 from book) ,'SQL18',7000);

select nvl(max(bookno),0)+1 from book;

select * from book;

set autotrace on;

create index book_title on book(title);
drop index book_title



