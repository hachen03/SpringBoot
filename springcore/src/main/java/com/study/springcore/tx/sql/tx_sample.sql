--交易TX(Transaction)所需要的資料表
--建立 book(書籍資料)、stock(庫存資料)、wallet(客戶雲端錢包)
--建立 book(書籍資料)
create table if not exists book(
   bid integer not null auto_increment,
   bname varchar(20) not null,
   price integer default 0,
   ct timestamp default current_timestamp
   primary key(bid)
)
--建立 stock(庫存資料)
create table if not exists stock(
   sid integer not null auto_increment,
   bid integer not null, --book(書籍資料)的id
   amounty integer default 0,
   primary key(sid)
   foreign key(bid) references book(bid) --外鍵關聯
)
--建立 wallet(客戶雲端錢包)
create table if not exists wallet(
   wid integer not null auto_increment,
   wname varchar(20) not null, 
   money integer default 0,
   primary key(wid) --主鍵
)
-- 建立order_log交易紀錄表
create table if not exists order_log(
  oid integer not null auto_increment,
  oname varchar(20) not null,
  amount integer not null, --數量
  inid integer not null, --商品序號
  total integer not null, --總價格
  ct timestamp default current_timestamp,
  primary key(oid), --主鍵
  foreign key() references wallet(wid)
  foreign key() references wallet(wid)
  )
  -- Homework 建立交易紀錄 order_log
  -- Vincent在2020/1/23 PM 2:07:51買了java書2本共300元
  -- Vincent在2020/1/23 PM 2:08:51買了python書2本共300元
  -- Vincent在2020/1/23 PM 2:10:51買了java書4本共600元
  -- 注意 : 若book的price欄位有變動，order_log則不影響
  -- 試問:資料表應如何創建 ?