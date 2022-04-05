create table if not exists order_log(
  oid integer not null auto_increment,
  oname varchar(20) not null,
  amount integer not null,
  inid integer not null,
  total integer not null,
  ct timestamp default current_timestamp,
  primary key(oid),
  foreign key(oid) references wallet(wid)
 )