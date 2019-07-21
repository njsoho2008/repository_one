use test;
drop table if exists Course;
create table Course(
courseId char(5),
subjectId char(4) not null,
courseNumber integer,
title varchar(50) not null,
numOfCredits integer,
primary key (courseId)
)engine=innodb default charset=GBK;


drop table if exists Student;
create table Student(
ssn  char(15),
firstname char(15),
middlename char(10),
lastname  char(15),
birthdate timestamp,
street varchar(50),
phone  varchar (15),
zipcode varchar (10),
deptID varchar (10),
primary key (ssn)
)engine=innodb default charset=GBK;


insert into Course(courseId, subjectId, courseNumber, title, numOfCredits) values
('1001','csci',3720,'database system',3);
insert into Course(courseId, subjectId, courseNumber, title, numOfCredits) values
('1002','csci',3725,'Python program',3);
insert into Course(courseId, subjectId, courseNumber, title, numOfCredits) values
('1003','csci',3721,'Java program',3);
insert into Course values ('1004','csym',4590,'Java Web Program',6);

insert into Student values
('199912130976','yu','miles','chen','2010-10-10','yangshangbeilu 1 hao','13584026192',
'210000','1001');

insert into Student values
('199912130978','yu','miles','chen','2001-10-10','yangshangbeilu 1 hao','13584026192',
'210000','cs');

insert into Student values
('199912130988','xu','miles','chen','2009-10-10','yangshangbeilu 1 hao','13584026192',
'210000','cs');

insert into Student values
('199912130998','wu','miles','chen','2007-10-10','yangshangbeilu 1 hao','13584026192',
'210028','cs');
/*外键的作用是建立子表与其父表的关联，保证子表与父表的数据一致性。父表中更新或者删除某条信息时，子表与之对应的信息也必须有
相应的改变
*/
//学生注册信息表（相当于选课表）ssn 身份证号
drop table  if exists Enrollment ;
create table Enrollment(
   ssn char(30) not null,
   courseId char(5) not null ,
   dateRegistered timestamp ,
   grade char(1),
   primary key(ssn,courseId),
   foreign key(ssn) references Student(ssn),
   foreign key(courseId) references Course(courseId)
)engine=innodb default charset=GBK;

insert into Enrollment values ('199912130976','1001','2019-4-9','A');
insert into Enrollment values ('199912130978','1001','2019-4-9','B');

insert into Enrollment values ('199912130988','1002','2019-4-8','C');

insert into Enrollment values ('199912130998','1003','2019-4-2','A');



//更新
update Course set numOfCredits=4  where title='database system';
//删除
delete from Course where title='Python program';

delete  from Course where courseId='1004';

//简单查询
select subjectId from Course where title='Java program';

select firstName,mi,lastName from Student
where depId='cs' and zipCode='210000';

select ssn from Student
where phone between '26' and  '92';

//别名
select lastName as "LastName",zipCode as "ZipCode"
from  Student
where depId='CS'

//算术运算符
select title,50*numOfCredits as 'Lecture Minutes Per Week'
from Course
where subjectId='CSCI';

//显示互不相同的记录
select distinct subjectId as 'Subject ID'from  Course;

select distinct subjectId as 'Subject ID'from  Course order by subjectId desc ;
select distinct subjectId as 'Subject ID'from  Course order by subjectId asc ;




/*MySQL错误：Can't create table‘..’ （errno:150）解决方案
//1、检查sc表的外键字段的类型以及大小是否和s表c表完全一致

//2、试图引用的其中一个外键没有建立起索引，或者不是一个primary key , 如果其中一个不是primary key 的放，你必须为它创建一个索引。

//3、一个或两个表是MyISAM引擎的表，若想要使用外键约束，必须是InnoDB引擎

*/


//联结表

select distinct  lastName,firstName,courseId
from Student,Enrollment
where Student.ssn=Enrollment.ssn and
firstName='yu' and lastName='chen';

select firstName,mi,lastName,title,grade from Student,Enrollment_new,Course where Student.ssn='320624199912130976'and Enrollment_new.courseId='1001'and
     Enrollment_new.courseId=Course.courseId and Enrollment_new.ssn=Student.ssn;