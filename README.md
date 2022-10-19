# <a href="https://theonlinebookstore.herokuapp.com" target="_blank"> OnlineBookStore </a> 
- Java web developement project
- See Live website demo at: [https://theonlinebookstore.herokuapp.com](https://theonlinebookstore.herokuapp.com)
- User Login Credentials: (shashi/shashi)
- Admin Login Credentials: (Admin/Admin)
### About
This is online Bookstore system project where user can buy books online, view available books, select books to buy and their quantity. And can get payment receipt after payment. This is also used by administrator who maintain books selling history, add new books, remove books and increase or decrease books amount. 
![onlinebookstore](https://user-images.githubusercontent.com/34605595/137615096-8447d32d-bddc-4f13-a8ed-3c0f4dd5e04e.png)

#### To View live demo of this website visit <a href="https://theonlinebookstore.herokuapp.com/" target="_blank">https://theonlinebookstore.herokuapp.com</a><br>
<span style="color:blue">**This Website is built for following purpose:-**</span>
- For Selling books online.
- Maintaining books selling history.
- Adding and managing books.
- User Friendly.
- For Implementation of Generic Servlets in Java.
- This is a Mini-project developed using Java, Jdbc, And Generic Servlets.

<span style="color:blue">**Admin Have Following Access for this online store site:-**</span>
- Add New Books.
- View Books Available.
- Remove Books.
- Increase Books Amount.

<span style="color:blue">**Users Have Following Access for this online store site:-**</span>
- Create New Account or Register.
- Login.
- View Available Books.
- Select Books to Buy.
- Select Books Quantity.
- Buy Books.
- Get Payment Receipt.

### Technologies used:-
1. Front-End Development:
- Html 5.
- Css.
- Javascript.
- <a href="https://theonlinebookstore.herokuapp.com" target="_blank">Click Here for Front End View</a>

2. Back-End Development
- Java [JDK 8+]
- JDBC
- Servlet
- MySQL
- Apache Maven

3. Database used.
- MySql

### ==== Software And Tools Required ====
- MySQL
- Eclipse [Enterprise Edition]
- Java [JDK 8+]
- Tomcat v8.0+
- Apache Maven

Note:- This is a Sample Project, So we have used only Generic Servlet and not taken care for Security.

### =============== Dummy Database Initialization =====================

STEP 1: Open MySQL Command Prompt or MySQL Workbench

STEP 2: Login to the administrator user as : ```mysql -u <username> -p``` (Enter Password if asked)

STEP 3 :Copy paste the following MySql Commands:
```MySQL
create database if not exists onlinebookstore;

use onlinebookstore;

create table if not exists books(barcode varchar(100) primary key, name varchar(100), author varchar(100), price int, quantity int);

create table if not exists users(username varchar(100) primary key,password varchar(100), firstname varchar(100),
    lastname varchar(100),address text, phone varchar(100),mailid varchar(100),usertype int);

insert into books values('9780134190563','The Go Programming Language','Alan A. A. Donovan and Brian W. Kernighan',400,8);
insert into books values('9780133053036','C++ Primer','Stanley Lippman and Josée Lajoie and Barbara Moo',976,13);
insert into books values('9781718500457','The Rust Programming Language','Steve Klabnik and Carol Nichols',560,12);
insert into books values('9781491910740','Head First Java','Kathy Sierra and Bert Bates and Trisha Gee',754,23);
insert into books values('9781492056300','Fluent Python','Luciano Ramalho',1014,5);
insert into books values('9781720043997','The Road to Learn React','Robin Wieruch',239,18);
insert into books values('9780132350884','Clean Code: A Handbook of Agile Software Craftsmanship','Robert C Martin',288,3);
insert into books values('9780132181273','Domain-Driven Design','Eric Evans',560,28);
insert into books values('9781951204006','A Programmers Guide to Computer Science','William Springer',188,4);
insert into books values('9780316204552','The Soul of a New Machine','Tracy Kidder',293,30);
insert into books values('9780132778046','Effective Java','Joshua Bloch',368,21);
insert into books values('9781484255995','Practical Rust Projects','Shing Lyu',257,15);
insert into users values('demo','demo','Demo','User','Demo Home','42502216225','demo@gmail.com',2);
insert into users values('Admin','Admin','Mr.','Admin','Haldia WB','9584552224521','admin@gmail.com',1);
insert into users values('shashi','shashi','Shashi','Raj','Bihar','1236547089','shashi@gmail.com',2);

commit;
```

### ======== Importing and Running The Project Through Eclipse EE ===========

Step 0: Open Eclipse Enterprise Edition. [Install, if not already installed.]

Step 1: Click On File > Import > Git > Projects From Git > Clone Uri  > Paste The Repository Url as: ```https://github.com/shashirajraja/onlinebookstore.git```> Select J2EE Branch > Next > Next > Finish

Step 2.a: Go inside ```src/main/resources > application.properties``` and update the value of database details as per your usage, like db.driver, db.host, db.username and db.password according to your installed mysql/postgresql admin user credentials
Step 2.b: Right Click On Project > Build Path > Configure Build Path > Libraries > Remove and Update Any Libraries if having Red Mark > Finish.

Step 3: [Only If Tomcat Server is not configured in Eclipse] : Right Click On Project > Run As > Run On Server > Select Tomcat V8.0 > (Select Tomcat V8.0 Installation Location If Asked) Next > Add onlinebookstore > Finish

Step 4: In The Server Tab > Double Click On Tomcat Server > Ports > Change The Port Number For Http/1.1 To 8083 > Close And Save

Step 5: Right Click On Project > Run As > Run On Server > Select Tomcat v8.0 > Next > Add All> Done

Step 6: Check Running The Site At  <a href="http://localhost:8083/onlinebookstore/">http://localhost:8083/onlinebookstore/</a>

Step 7: Default Username And Password For Admin Is "Admin" And "Admin"

Step 8: Default Username And Password For User Is "shashi" And "shashi"


#### "Suggestions and project Improvements are Invited!"

<bold>Thanks a lot</bold><br/>
                                                                                                        Project Leader<br/>
                                                                                                         <b>Shashi Raj</b>
