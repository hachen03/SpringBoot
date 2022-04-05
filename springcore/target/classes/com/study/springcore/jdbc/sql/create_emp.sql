-- 建立 Emp資料表
create table if not exists emp(
eid int not null auto_increment, --主鍵(自動產生序號:1,2,3過號不返回)
ename varchar(50) not null unique, --員工姓名
age int, --員工年齡
createtime timestamp default current_timestamp, --建檔時間
primary key(eid)
)
-- 新增Emp範例
insert into emp(ename,age)values('John',28)
insert into emp(ename,age)values('allen',30)
insert into emp(ename,age)values('bobo',29)
-- 建立 Job資料表
create table if not exists job(
jid int not null auto_increment, --主鍵(自動產生序號:1,2,3過號不返回)
jname varchar(50) not null unique, --工作名稱
eid int, --員工年齡
primary key(jid),
foreign key(eid) references emp(eid) --外鍵約束/關聯
)
--由上述可知,一個emp對應多個job,一個job對應一個emp