# <a href="https://theonlinebookstore.herokuapp.com" target="_blank"> OnlineBookStore </a> 
- A Java Web Developement Project
- Check out the Live website demo: [https://theonlinebookstore.herokuapp.com](https://theonlinebookstore.herokuapp.com)
- User Login Credentials: (shashi/shashi)
- Admin Login Credentials: (Admin/Admin)
### About
A userfriendly Online Bookstore System project where users can login or register, view the available books, select books along with their quantity, and buy them. Users can also get payment receipt after sucessful payment. The project can also be used by the administrator, who can add new books, remove books, increase and decrease the quantity of books, change the price of the books as well as maintain the selling history of books.

![onlinebookstore](https://user-images.githubusercontent.com/34605595/137615096-8447d32d-bddc-4f13-a8ed-3c0f4dd5e04e.png)

### Technologies used:-
1. Front-End Development:
- Html 5.
- CSS.
- Javascript.

2. Back-End Development:
- Java
- JDBC
- Servlet

3. Database:
- MySql

### ================ Software And Tools Required ================
- Eclipse [Enterprise Edition]
- Java [JDK 8+]
- Tomcat v8.0+
- Apache Maven
- MySQL

Note:- This is a Sample Project hence we have used only Generic Servlet and not taken care for Security.

### ================= Dummy Database Initialization =================

STEP 1: Open MySQL Command Prompt or MySQL Workbench

STEP 2: Login to the administrator user as : ```mysql -u <username> -p``` (Enter Password if asked)

STEP 3: Copy paste the following MySql Commands-
```MySQL
create database if not exists onlinebookstore;

use onlinebookstore;

create table if not exists books(barcode varchar(100) primary key, name varchar(100), author varchar(100), price int, quantity int);

create table if not exists users(username varchar(100) primary key,password varchar(100), firstname varchar(100),
    lastname varchar(100),address text, phone varchar(100),mailid varchar(100),usertype int);

insert into books values('10101','Programming in C','James k Wick',500,5);
insert into books values('10102','Learn Java','Scott Mayers',150,13);
insert into books values('10103','Database Knowledge','Charles Pettzoid',124,360);
insert into books values('10104','Let us c++','Steve Macclen',90,111);
insert into books values('10105','Success Key','Shashi Raj',5000,15);
insert into users values('User','Password','First','User','My Home','42502216225','User@gmail.com',2);
insert into users values('Admin','Admin','Mr.','Admin','Haldia WB','9584552224521','admin@gmail.com',1);
insert into users values('shashi','shashi','Shashi','Raj','Bihar','1236547089','shashi@gmail.com',2);

commit;
```

### ========== Importing and Running The Project Through Eclipse EE ==========

Step 0: Open Eclipse Enterprise Edition. [Install, if not already installed.]

Step 1: Click On File > Import > Git > Projects From Git > Clone Uri  > Paste The Repository Url as: ```https://github.com/shashirajraja/onlinebookstore.git```> Select J2EE Branch > Next > Next > Finish.

Step 2.a: Go inside ```src/main/resources > application.properties``` and update the value of database details as per your usage, like db.driver, db.host, db.username and db.password according to your installed mysql/postgresql admin user credentials.

Step 2.b: Right Click On Project > Build Path > Configure Build Path > Libraries > Remove and Update Any Libraries if having Red Mark > Finish.

Step 3: [Only If Tomcat Server is not configured in Eclipse] : Right Click On Project > Run As > Run On Server > Select Tomcat V8.0 > (Select Tomcat V8.0 Installation Location If Asked) Next > Add onlinebookstore > Finish.

Step 4: In The Server Tab > Double Click On Tomcat Server > Ports > Change The Port Number For Http/1.1 To 8083 > Close And Save.

Step 5: Right Click On Project > Run As > Run On Server > Select Tomcat v8.0 > Next > Add All> Done.

Step 6: Check Running The Site At  <a href="http://localhost:8083/onlinebookstore/">http://localhost:8083/onlinebookstore/</a>

Step 7: Default Username And Password For Admin Is "Admin" And "Admin"

Step 8: Default Username And Password For User Is "shashi" And "shashi"


#### "Suggestions and project improvement ideas are welcomed!"

<bold>Thanks a lot,</bold><br/>
                                                                                                        Project Leader<br/>
                                                                                                         <b>Shashi Raj</b>
