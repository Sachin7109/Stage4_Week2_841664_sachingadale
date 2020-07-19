CREATE database IF NOT EXISTS  user_database;
use user_database;

create table if not exists  User (id int, userName varchar(30), password varchar(30), active tinyint, roles varchar(30));