-- Script de criacao do banco para MySQL 8.
-- Executado automaticamente pelo docker-compose.yml na primeira subida.
--
-- Baseado nos comandos MySQL do README.md original.
-- O arquivo setup/CreateDatastore.sql foi mantido, mas usa sintaxe
-- PostgreSQL (\c, quantity REAL) e nao funciona no MySQL.

SET NAMES utf8mb4;

CREATE DATABASE IF NOT EXISTS onlinebookstore;

USE onlinebookstore;

CREATE TABLE IF NOT EXISTS books (
    barcode  VARCHAR(100) PRIMARY KEY,
    name     VARCHAR(100),
    author   VARCHAR(100),
    price    INT,
    quantity INT
);

-- usertype: 1 = vendedor (SELLER), 2 = cliente (CUSTOMER)
CREATE TABLE IF NOT EXISTS users (
    username  VARCHAR(100) PRIMARY KEY,
    password  VARCHAR(100),
    firstname VARCHAR(100),
    lastname  VARCHAR(100),
    address   TEXT,
    phone     VARCHAR(100),
    mailid    VARCHAR(100),
    usertype  INT
);

INSERT INTO books VALUES ('9780134190563', 'The Go Programming Language', 'Alan A. A. Donovan and Brian W. Kernighan', 400, 8);
INSERT INTO books VALUES ('9780133053036', 'C++ Primer', 'Stanley Lippman and Josée Lajoie and Barbara Moo', 976, 13);
INSERT INTO books VALUES ('9781718500457', 'The Rust Programming Language', 'Steve Klabnik and Carol Nichols', 560, 12);
INSERT INTO books VALUES ('9781491910740', 'Head First Java', 'Kathy Sierra and Bert Bates and Trisha Gee', 754, 23);
INSERT INTO books VALUES ('9781492056300', 'Fluent Python', 'Luciano Ramalho', 1014, 5);
INSERT INTO books VALUES ('9781720043997', 'The Road to Learn React', 'Robin Wieruch', 239, 18);
INSERT INTO books VALUES ('9780132350884', 'Clean Code: A Handbook of Agile Software Craftsmanship', 'Robert C Martin', 288, 3);
INSERT INTO books VALUES ('9780132181273', 'Domain-Driven Design', 'Eric Evans', 560, 28);
INSERT INTO books VALUES ('9781951204006', 'A Programmers Guide to Computer Science', 'William Springer', 188, 4);
INSERT INTO books VALUES ('9780316204552', 'The Soul of a New Machine', 'Tracy Kidder', 293, 30);
INSERT INTO books VALUES ('9780132778046', 'Effective Java', 'Joshua Bloch', 368, 21);
INSERT INTO books VALUES ('9781484255995', 'Practical Rust Projects', 'Shing Lyu', 257, 15);

-- Usuarios de teste (senha em texto puro, como no sistema legado - DT05)
INSERT INTO users VALUES ('demo', 'demo', 'Demo', 'User', 'Demo Home', '42502216225', 'demo@gmail.com', 2);
INSERT INTO users VALUES ('Admin', 'Admin', 'Mr.', 'Admin', 'Haldia WB', '9584552224521', 'admin@gmail.com', 1);
INSERT INTO users VALUES ('shashi', 'shashi', 'Shashi', 'Raj', 'Bihar', '1236547089', 'shashi@gmail.com', 2);

COMMIT;
