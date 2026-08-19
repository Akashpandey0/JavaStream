***Database*** ->
It is a collection of data in a format that can be easily accessed (Digital).
A software application used to manage our DB is called ***DBMS.***

**Types of Databases ->**

Relational			                    Non-relational(NoSQL)
Data stored in the form of table.       data not stored in the form of tables.


What is SQL?
SQL is a programming language used to interact with relational databases.

It is used to perform CRUD operations:
Create
Read
Update
Delete

***column*** -> to define structure/schema design
***row*** -> for the individual data

A ***Schema*** is the logical structure of a database. It defines:
Tables (e.g., Users, Orders)
Columns (e.g., name, email, order_date)
Data types (e.g., VARCHAR, INT)
Relationships (e.g., foreign keys between tables)
Constraints (e.g., NOT NULL, UNIQUE)

<!-- Creating Database -->

CREATE DATABASE db_name;

DROP DATABASE db_name; -> Delete the entire database.

USE db_name; -> This command is generally used to select specific database as the default for the current session.

<!-- Creating table -->

CREATE TABLE table_name (
    column_name1 datatype constraint,
    column_name2 datatype constraint,
    column_name3 datatype constraint
);

eg: CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT NOT NULL
);

Types of SQL commands ->
DDL(Data Definition Language): create, alter, rename, truncate & drop.
DQL(Data Query Language): select.
DML(Data Manipulation Language): insert, update & delete.
DCL(Data Control Language): grant & revoke permission to users.
TCL(Transaction Control Language): start transaction, commit, rollback

Database related Queries->
CREATE DATABASE db_name;
CREATE DATABASE IF NOT EXISTS db_name;


***Keys***
***Primary Key*** -> It is a column (or set of columns) in a table that uniquely identifies each row (a unique id). There is only 1PK & it should be not null.

***Foreign Key*** -> It is a column (or set of columns) in a table that establishes a link between data in two tables. It refers to the primary key in another table. There can be multiple FKs in a table.

FKs can have duplicate & null values.

***Constraints***
SQL constraints are used to specify rules for data in a table.

***NOT NULL*** -> Ensures that a column cannot have a NULL value.
***UNIQUE*** -> Ensures that all values in a column are different.
***PRIMARY KEY*** -> makes a column unique and not null but used only for once.

***CHECK*** -> Ensures that all values in a column satisfy a specific condition or it can limit the values allowes in a column.
e.g->
CREATE TABLE city (
    id INT PRIMARY KEY,
    city VARCHAR(50) NOT NULL,
    age INT,
    CONSTRAINT age_check CHECK (age >= 18 AND city = "Delhi")
);

CREATE TABLE newTab (
    age INT CHECK (age >= 18)
);

***DEFAULT*** -> Sets a default value for a column when no value is specified in that column.

CREATE DATABASE college;

USE college;

CREATE TABLE student (
    rollno INT PRIMARY KEY,
    name VARCHAR(50),
    marks INT NOT NULL,
    grade VARCHAR(1)
    city VARCHAR(20)
);

INSERT INTO student
(rollno, name, marks, grade, city)
VALUES
(1, 'Alice', 85, 'A', 'Pune'),
(2, 'Bob', 90, 'A', 'Mumbai'),
(3, 'Charlie', 78, 'B', 'Delhi');
(4, 'David', 92, 'A', 'Delhi'),
(5, 'Eve', 88, 'B', 'Lucknow');

<!-- Select in Detail --> used to select any data from the database.

***Basic Syntax***
SELECT col1, col2 FROM table_name;

***TO Select ALL***
SELECT * FROM table_name;

SELECT name, marks FROM student;

SELECT DISTINCT city FROM student;
<!-- Only distinct value will occur from the table. -->

***WHERE clause***
TO define some conditions;

SELECT * FROM student WHERE marks > 85;

using operators in WHERE clause.

***Arithmetic operators***: +, -, *, /, %
e.g: SELECT * FROM student WHERE (marks + 10) > 100;

***Comparison operators***: =, !=, <>, >, <, >=, <=
e.g: SELECT * FROM student WHERE marks = 85;

***Logical operators***: AND, OR, NOT, IN, BETWEEN, ALL, LIKE, ANY
e.g: SELECT * FROM student WHERE marks > 85 AND city = 'Delhi';

SELECT * FROM student WHERE marks > 85 OR city = 'Delhi';

***BETWEEN***: Selects for a given range.
e.g: SELECT * FROM student WHERE marks BETWEEN 80 AND 90;

***IN***: matches any value in the list.
e.g: SELECT * FROM student WHERE city IN ('Delhi', 'Mumbai');

***NOT***: to negate the give condition
e.g: SELECT * FROM student WHERE city NOT IN ('Delhi', 'Mumbai');

***Bitwise Operators***: &(BITWISE AND), |(Bitwise OR)

***LIMIT clause***: Sets an upper limit on number of(tuples) rows to be returned.
e.g: SELECT * FROM student LIMIT 3;

***OrderBy clause***: to sort in ascending(ASC) or descending(DESC) order.
e.g: SELECT * FROM student ORDER BY marks DESC;

SELECT * FROM student ORDER BY marks DESC LIMIT 3;

***Aggregate Functions*** -> performs a calculation on a set of values and return a single value.

COUNT(): returns the number of rows that matches a specified criteria.
e.g->
SELECT COUNT(*) FROM student;

SUM(): returns the sum of a numeric column.
e.g->
SELECT SUM(marks) FROM student;

AVG(): returns the average value of a numeric column.
e.g->
SELECT AVG(marks) FROM student;

MIN(): returns the minimum value of a numeric column.
e.g->
SELECT MIN(marks) FROM student;

MAX(): returns the maximum value of a numeric column.
e.g->
SELECT MAX(marks) FROM student;


***GROUP BY clause***: groups rows that have the same values into summary rows.
It collects data from the multiple records and groups the result by one or more columns.

<!-- Count number of student in each city -->
SELECT city, COUNT(name) FROM student GROUP BY city;

<!-- Write the query to find the avg marks in each city in ascending order -->
SELECT city, AVG(marks) FROM student GROUP BY city ORDER BY city ASC;

<!-- GROUP BY grade of student -->
SELECT grade, COUNT(rollno) FROM student GROUP BY grade;


<!-- For the given table, find the total payment according to each payment method -->

CREATE DATABASE customer;

USE CUSTOMER;

CREATE TABLE payment (
    customer_id INT PRIMARY KEY,'
    customerName VARCHAR(50),
    modeOfPayment VARCHAR(20),
    city VARCHAR(20)
);

SELECT modeOfPayment, COUNT(customerName)
FROM payment
GROUP BY modeOfPayment ORDER BY modeOfPayment DESC;

***HAVING clause***: Similar to WHERE, used when we want to apply any condition after grouping.

<!-- Count number of student in each city where max marks cross 85 -->
SELECT COUNT(name), city FROM student GROUP BY city HAVING MAX(marks) > 85;

***General Order*** ->
SELECT columns -> FROM table_name -> WHERE condition -> GROUP BY columns -> HAVING condition -> ORDER BY columns -> LIMIT

where clause applies condition to rows while having clause applies condition to groups.

***Table related Queries*** ->
1. Update(to update existing row)
Syntax ->
UPDATE tabel_name
SET column1 = value1, column2 = value2, ...
WHERE condition;

e.g->
UPDATE student
SET grade = "O"
WHERE marks > 90;

<!-- To disable the safe update mode -->
SET SQL_SAFE_UPDATES = 0;

2. Delete(to delete existing row)
Syntax ->
DELETE FROM table_name
WHERE condition;

e.g->
DELETE FROM student
WHERE marks < 80;

3. Alter(to change the schema) means change in the basic style of the table like columns.

To add column
ALTER TABLE table_name
ADD COLUMN column_name datatype constraint;

e.g->
Alter table student
ADD COLUMN age INT;

To drop column
ALTER TABLE table_name
DROP COLUMN column_name;

e.g->
ALTER TABLE student
DROP COLUMN age;

To rename column
ALTER TABLE table_name
RENAME COLUMN old_column_name TO new_column_name;

e.g->
ALTER TABLE student
RENAME COLUMN city TO location;

To modify column
ALTER TABLE table_name
MODIFY COLUMN column_name datatype constraint;

e.g->
ALTER TABLE student
MODIFY COLUMN marks INT NOT NULL;

4. Truncate(to delete the table's data)
Syntax ->
TRUNCATE TABLE table_name;

e.g->
TRUNCATE TABLE student;

5. Drop(to delete the table)
Syntax ->
DROP TABLE table_name;

e.g->
DROP TABLE student;

<!-- Revisiting FKs -->
CREATE TABLE department (
    deptID INT PRIMARY KEY,
    deptName VARCHAR(50)
);

INSERT INTO department
(deptID, deptName)
VALUES
(101, 'English'),
(102, 'Maths'),
(103, 'IT'),
(104, 'Science');

UPDATE department
SET deptID = 111
WHERE deptName = 'English';


CREATE TABLE teacher (
    teacherID INT PRIMARY KEY,
    teacherName VARCHAR(50),
    deptID INT,
    FOREIGN KEY (deptId) REFERENCES department(deptID)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

INSERT INTO teacher
(teacherID, teacherName, deptID)
VALUES
(101,'Pritya',101),
(102,'Akash',103);

SELECT * FROM teacher;

***Cascading for FK*** ->

<!-- ON DELETE CASCADE -->
When we create a foreign key using this option, it deletes the referencing rows int the child table when the referenced row is deleted in the parent table which has primary key.

<!-- ON UPDATE CASCADE -->
When we create a foreign key using this option, it updates the referencing rows in the child table when the referenced row is updated in the parent table which has primary key.


<!-- Practice Qs -->
Qs: In the student table
1. change the name of col "name" to "fullName".
-> Alter TABLE student
-> CHANGE name fullName VARCHAR(50);

2. Delete all the students who scored marks less than 80.
-> DELETE FROM student
-> WHERE marks < 80;

3. Delete the column for grades.
-> ALTER TABLE student
-> DROP COLUMN grade;

***Joins in SQL***
Join is used to combine rows from two or more tables, based on a related column between them.

Types of Joins
1. INNER JOIN: returns records that have matching values in both tables.
2. LEFT JOIN: returns all records from the left table, and the matched records from the right table.
3. RIGHT JOIN: returns all records from the right table, and the matched records from the left table.
4. FULL JOIN: returns all records when there is a match in either left or right table.
5. Self Join: is when a table is joined with itself. It's useful for comparing rows within the same table or finding hierarchical relationships.

***INNER JOIN***: Returns records that have matching values in both tables.
Syntax ->
SELECT column(s)
FROM table1
INNER JOIN table2
ON table1.column_name = table2.column_name;

e.g ->
SELECT * FROM student
Inner JOIN course
ON student.studentID = course.studentID;

student
studentID | name
101       | Alice
102       | Bob
103       | Charlie

course
studentID  | course
101        | Math
102        | Science
105        | English
107        | History

Result ->
studentID | name      | course
101       | Alice     | Math
102       | Bob       | Science

***LEFT JOIN***: Returns all records from the left table, and the matched records from the right table.
Syntax ->
SELECT column(s)
FROM table1
LEFT JOIN table2
ON table1.column_name = table2.column_name;

e.g ->
SELECT * FROM student
LEFT JOIN course
ON student.studentID = course.studentID;

student
studentID | name
101       | Alice
102       | Bob
103       | Charlie

course
studentID  | course
101        | Math
102        | Science
105        | English
107        | History

Result ->
studentID | name      | course
101       | Alice     | Math
102       | Bob       | Science
103       | Charlie   | NULL

***RIGHT JOIN***: Returns all records from the right table, and the matched records from the left table.
Syntax ->
SELECT column(s)
FROM table1
RIGHT JOIN table2
ON table1.column_name = table2.column_name;

e.g ->
SELECT * FROM student
RIGHT JOIN course
ON student.studentID = course.studentID;

student
studentID | name
101       | Alice
102       | Bob
103       | Charlie

course
studentID  | course
101        | Math
102        | Science
105        | English
107        | History

Result ->
studentID | name      | course
101       | Alice     | Math
102       | Bob       | Science
105       | NULL      | English
107       | NULL      | History

***FULL JOIN***: Returns all records when there is a match in either left or right table.
Syntax ->
SELECT column(s)
FROM table1
FULL OUTER JOIN table2
ON table1.column_name = table2.column_name
WHERE condition;

Syntax in MySQL ->

SELECT * FROM student as a
LEFT JOIN course as b
ON a.studentID = b.studentID
UNION
SELECT * FROM student as a
RIGHT JOIN course as b
ON a.studentID = b.studentID;

student
studentID | name
101       | Alice
102       | Bob
103       | Charlie

course
studentID  | course
101        | Math
102        | Science
105        | English
107        | History

Result ->
studentID | name      | course
101       | Alice     | Math
102       | Bob       | Science
103       | Charlie   | NULL
105       | NULL      | English
107       | NULL      | History

<!-- SQL Sub Queries -->
A subquery is a query nested inside another query.

e.g ->
1. Get names of all students who have scored more than class average.

SELECT name FROM student
WHERE marks > (SELECT AVG(marks) FROM student);

2. Get highest marks of student from the city Delhi.

SELECT MAX(marks) FROM (SELECT * FROM student WHERE city = 'Delhi') AS temp;

<!-- End of SQL-->