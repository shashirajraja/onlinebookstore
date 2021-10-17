# <a href="https://shashirajraja.github.io/onlinebookstore/WebContent/index.html" target="_blank"> OnlineBookStore </a> Website Using Java 
![onlinebookstore](https://user-images.githubusercontent.com/34605595/137615096-8447d32d-bddc-4f13-a8ed-3c0f4dd5e04e.png)
#### To View First Front Page Design of this website <a href="https://shashirajraja.github.io/onlinebookstore/WebContent/index.html" target="_blank">Click Here</a><br>
<span style="color:blue">**This Website is built for following purpose:-**</span>
- For Selling books online.
- Maintaining books selling history.
- Adding and managing books.
- User Friendly.
- For Implemention of Generic Servlets in Java.
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
- Html.
- Css.
- Javascript.
- <a href="https://shashirajraja.github.io/onlinebookstore/WebContent/index.html" target="_blank">Click Here for Front End View</a>

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
create database onlinebookstore;

use onlinebookstore;

create table books(barcode varchar(100) primary key, name varchar(100), author varchar(100), price int, quantity int);

create table users(username varchar(100) primary key,password varchar(100), firstname varchar(100),
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

### ======== Importing and Running The Project Through Eclipse EE ===========

Step 0: Open Eclipse Enterprise Edition. [Install, if not already installed.]

Step 1: Click On File > Import > Git > Projects From Git > Clone Uri  > Paste The Repository Url as: ```https://github.com/shashirajraja/onlinebookstore.git```> Select J2EE Branch > Next > Next > Finish

Step 2: Go inside ```OnlineBookStore > constants > IDatabase.java``` and update the value of USER_NAME and PASSWORD according to your installed mysql admin user credentials

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
