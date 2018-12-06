drop table if exists user;
create table user (
  id int(10) identity,
  name varchar(25) not null,
  address varchar(25) not null,
  phone varchar(100) not null,
  age int(10) not null
);
