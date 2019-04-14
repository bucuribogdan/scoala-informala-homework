create database school;
use school;

create table classes (
classid int primary key,
courseid int,
days date, 
starttime time,
endtime time,
bldg varchar(64),
roomnum int,
foreign key(courseid) references courses(courseid));
create table courses(
courseid int not null primary key,
area varchar(255),
title varchar(255),
descrip varchar(255),
prereqs varchar(255),
foreign key(courseid) references classes(courseid)
);
create table crosslistings(
courseid int not null primary key,
dept varchar(64) not null primary key,
coursenum int not null,
foreign key(courseid) references courses(courseid)
);
create table coursesprofs(
courseid int not null primary key,
profid int not null primary key,
foreign key(courseid) references courses(courseid),
foreign key(profid) references profs(profid)
);
create table profs(
profid int not null primary key,
profname varchar(64) 
);
