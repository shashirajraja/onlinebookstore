### Copy and Paste the following MYSQL commands to make a dummy database for this Project :


create database if not exists onlinebookstore;

use onlinebookstore;

create table if not exists books(barcode varchar(100) primary key, name varchar(100), author varchar(100), price int, quantity int);

create table if not exists users(username varchar(100) primary key,password varchar(100), firstname varchar(100),lastname varchar(100),address text, phone varchar(100),mailid varchar(100),usertype int);

insert into  books values('9780134190500', 'Data Structures Through C', 'G.S. Baluja', 525, 20);

insert into  books values('9780134190563','The Go Programming Language','Alan A. A. Donovan and Brian W. Kernighan',400,8);

insert into  books values('9780133053036','C++ Primer','Stanley Lippman and Josée Lajoie and Barbara Moo',976,13);

insert into  books values('9781718500457','The Rust Programming Language','Steve Klabnik and Carol Nichols',560,12);

insert into  books values('9781491910740','Head First Java','Kathy Sierra and Bert Bates and Trisha Gee',754,23);

insert into  books values('9781492056300','Fluent Python','Luciano Ramalho',1014,5);

insert into  books values('9781720043997','The Road to Learn React','Robin Wieruch',239,18);

insert into  books values('9780132350884','Clean Code: A Handbook of Agile Software Craftsmanship','Robert C Martin',288,3);

insert into  books values('9780132181273','Domain-Driven Design','Eric Evans',560,28);

insert into  books values('9780132181785', 'Let us C', 'Yashavant Kanetkar', 329, 15);

insert into  books values('9781951204006','A Programmers Guide to Computer Science','William Springer',188,4);

insert into  books values('9780316204552','The Soul of a New Machine','Tracy Kidder',293,30);

insert into  books values('9780132778046','Effective Java','Joshua Bloch',368,21);

insert into  books values('9781484255995','Practical Rust Projects','Shing Lyu',257,15);

insert into  books values('9781484255996','Agni Veena','Kazi Nasrul Islam',259,25);

insert into users values('demo','demo','Demo','User','Demo Home','42502216225','demo@gmail.com',2);

insert into users values('Admin','Admin','Mr.','Admin','Haldia WB','9584552224521','admin@gmail.com',1);

insert into users values('shashi','shashi','Shashi','Raj','Bihar','1236547089','shashi@gmail.com',2);

commit;
