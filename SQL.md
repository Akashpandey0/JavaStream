# 📘 SQL Notes

---

## 🗄️ What is a Database?
A **Database** is a collection of data in a format that can be easily accessed (Digital).  
A software application used to manage a DB is called **DBMS**.

### Types of Databases
| Relational | Non-Relational (NoSQL) |
|---|---|
| Data stored in the form of **tables** | Data **not** stored in the form of tables |

---

## 💬 What is SQL?
**SQL** (Structured Query Language) is a programming language used to interact with relational databases.

Used to perform **CRUD** operations:
- ✅ **C**reate
- 📖 **R**ead
- ✏️ **U**pdate
- 🗑️ **D**elete

> **column** → defines structure/schema  
> **row** → holds individual data

---

## 🧱 Schema
A **Schema** is the logical structure of a database. It defines:
- Tables (e.g., Users, Orders)
- Columns (e.g., name, email, order_date)
- Data types (e.g., VARCHAR, INT)
- Relationships (e.g., foreign keys)
- Constraints (e.g., NOT NULL, UNIQUE)

---

## 🗂️ Types of SQL Commands

| Type | Full Form | Commands |
|---|---|---|
| **DDL** | Data Definition Language | `CREATE`, `ALTER`, `RENAME`, `TRUNCATE`, `DROP` |
| **DQL** | Data Query Language | `SELECT` |
| **DML** | Data Manipulation Language | `INSERT`, `UPDATE`, `DELETE` |
| **DCL** | Data Control Language | `GRANT`, `REVOKE` |
| **TCL** | Transaction Control Language | `START TRANSACTION`, `COMMIT`, `ROLLBACK` |

---

## 🔑 Keys

### Primary Key
- Uniquely identifies each row
- Only **1 PK** per table
- Cannot be **NULL**

### Foreign Key
- Links data between two tables
- References the **Primary Key** of another table
- Can have **multiple FKs** in a table
- Can have **duplicate & NULL** values

---

## 🔒 Constraints

| Constraint | Description |
|---|---|
| `NOT NULL` | Column cannot have a NULL value |
| `UNIQUE` | All values in a column must be different |
| `PRIMARY KEY` | Unique + Not Null (only once per table) |
| `CHECK` | Values must satisfy a specific condition |
| `DEFAULT` | Sets a default value when none is provided |

---

## 🛠️ Database Queries

```sql
-- Create
CREATE DATABASE db_name;
CREATE DATABASE IF NOT EXISTS db_name;

-- Delete
DROP DATABASE db_name;

-- Select/Use
USE db_name;
```

---

## 📋 Table Queries

### Create Table
```sql
CREATE TABLE table_name (
    column_name1 datatype constraint,
    column_name2 datatype constraint
);
```

```sql
-- Example
CREATE TABLE student (
    rollno INT PRIMARY KEY,
    name   VARCHAR(50),
    marks  INT NOT NULL,
    grade  VARCHAR(1),
    city   VARCHAR(20)
);
```

### Insert Data
```sql
INSERT INTO student (rollno, name, marks, grade, city)
VALUES
    (1, 'Alice',   85, 'A', 'Pune'),
    (2, 'Bob',     90, 'A', 'Mumbai'),
    (3, 'Charlie', 78, 'B', 'Delhi'),
    (4, 'David',   92, 'A', 'Delhi'),
    (5, 'Eve',     88, 'B', 'Lucknow');
```

### Update
```sql
UPDATE table_name
SET col1 = value1, col2 = value2
WHERE condition;

-- Example
UPDATE student SET grade = 'O' WHERE marks > 90;
```

### Delete
```sql
DELETE FROM table_name WHERE condition;

-- Example
DELETE FROM student WHERE marks < 80;
```

### Truncate vs Drop
```sql
TRUNCATE TABLE student;  -- Deletes all data, keeps structure
DROP TABLE student;      -- Deletes entire table
```

---

## 🔧 ALTER (Schema Changes)

```sql
-- Add column
ALTER TABLE student ADD COLUMN age INT;

-- Drop column
ALTER TABLE student DROP COLUMN age;

-- Rename column
ALTER TABLE student RENAME COLUMN city TO location;

-- Modify column
ALTER TABLE student MODIFY COLUMN marks INT NOT NULL;

-- Change column name + type
ALTER TABLE student CHANGE name fullName VARCHAR(50);
```

---

## 🔍 SELECT & Filtering

```sql
-- Basic
SELECT col1, col2 FROM table_name;
SELECT * FROM table_name;

-- Distinct values
SELECT DISTINCT city FROM student;
```

### WHERE Clause
```sql
SELECT * FROM student WHERE marks > 85;
```

### Operators

| Type | Operators |
|---|---|
| Arithmetic | `+`, `-`, `*`, `/`, `%` |
| Comparison | `=`, `!=`, `<>`, `>`, `<`, `>=`, `<=` |
| Logical | `AND`, `OR`, `NOT`, `IN`, `BETWEEN`, `LIKE`, `ANY`, `ALL` |
| Bitwise | `&`, `\|` |

```sql
-- AND / OR
SELECT * FROM student WHERE marks > 85 AND city = 'Delhi';
SELECT * FROM student WHERE marks > 85 OR city = 'Delhi';

-- BETWEEN
SELECT * FROM student WHERE marks BETWEEN 80 AND 90;

-- IN / NOT IN
SELECT * FROM student WHERE city IN ('Delhi', 'Mumbai');
SELECT * FROM student WHERE city NOT IN ('Delhi', 'Mumbai');
```

### LIMIT & ORDER BY
```sql
SELECT * FROM student LIMIT 3;
SELECT * FROM student ORDER BY marks DESC;
SELECT * FROM student ORDER BY marks DESC LIMIT 3;
```

---

## 📊 Aggregate Functions

> Perform a calculation on a set of values and return a **single value**.

```sql
SELECT COUNT(*) FROM student;   -- Number of rows
SELECT SUM(marks) FROM student; -- Total
SELECT AVG(marks) FROM student; -- Average
SELECT MIN(marks) FROM student; -- Minimum
SELECT MAX(marks) FROM student; -- Maximum
```

---

## 📦 GROUP BY & HAVING

```sql
-- GROUP BY
SELECT city, COUNT(name) FROM student GROUP BY city;
SELECT city, AVG(marks) FROM student GROUP BY city ORDER BY city ASC;
SELECT grade, COUNT(rollno) FROM student GROUP BY grade;

-- HAVING (filter after grouping)
SELECT COUNT(name), city FROM student
GROUP BY city
HAVING MAX(marks) > 85;
```

> **WHERE** filters rows → **HAVING** filters groups

---

## 📐 General Query Order

```sql
SELECT columns
FROM table_name
WHERE condition
GROUP BY columns
HAVING condition
ORDER BY columns
LIMIT n;
```

---

## 🔗 Foreign Key & Cascading

```sql
CREATE TABLE teacher (
    teacherID   INT PRIMARY KEY,
    teacherName VARCHAR(50),
    deptID      INT,
    FOREIGN KEY (deptID) REFERENCES department(deptID)
        ON UPDATE CASCADE
        ON DELETE CASCADE
);
```

| Cascade Option | Behavior |
|---|---|
| `ON UPDATE CASCADE` | Updates child rows when parent PK is updated |
| `ON DELETE CASCADE` | Deletes child rows when parent row is deleted |

---

## 🔀 Joins

> Used to combine rows from two or more tables based on a related column.

### Sample Data
**student**
| studentID | name |
|---|---|
| 101 | Alice |
| 102 | Bob |
| 103 | Charlie |

**course**
| studentID | course |
|---|---|
| 101 | Math |
| 102 | Science |
| 105 | English |
| 107 | History |

---

### INNER JOIN
Returns only **matching** rows from both tables.
```sql
SELECT * FROM student
INNER JOIN course ON student.studentID = course.studentID;
```
| studentID | name | course |
|---|---|---|
| 101 | Alice | Math |
| 102 | Bob | Science |

---

### LEFT JOIN
Returns **all rows from left** table + matched rows from right.
```sql
SELECT * FROM student
LEFT JOIN course ON student.studentID = course.studentID;
```
| studentID | name | course |
|---|---|---|
| 101 | Alice | Math |
| 102 | Bob | Science |
| 103 | Charlie | NULL |

---

### RIGHT JOIN
Returns **all rows from right** table + matched rows from left.
```sql
SELECT * FROM student
RIGHT JOIN course ON student.studentID = course.studentID;
```
| studentID | name | course |
|---|---|---|
| 101 | Alice | Math |
| 102 | Bob | Science |
| 105 | NULL | English |
| 107 | NULL | History |

---

### FULL JOIN (MySQL workaround)
Returns all rows when there's a match in **either** table.
```sql
SELECT * FROM student AS a LEFT JOIN course AS b ON a.studentID = b.studentID
UNION
SELECT * FROM student AS a RIGHT JOIN course AS b ON a.studentID = b.studentID;
```
| studentID | name | course |
|---|---|---|
| 101 | Alice | Math |
| 102 | Bob | Science |
| 103 | Charlie | NULL |
| 105 | NULL | English |
| 107 | NULL | History |

---

### Self Join
A table joined with **itself** — useful for hierarchical or comparative queries.
```sql
SELECT a.name, b.name
FROM student a
JOIN student b ON a.city = b.city AND a.rollno != b.rollno;
```

---

## 🪆 Subqueries

> A query nested inside another query.

```sql
-- Students who scored above class average
SELECT name FROM student
WHERE marks > (SELECT AVG(marks) FROM student);

-- Highest marks among Delhi students
SELECT MAX(marks)
FROM (SELECT * FROM student WHERE city = 'Delhi') AS temp;
```

---

## ⚙️ Misc

```sql
-- Disable safe update mode
SET SQL_SAFE_UPDATES = 0;
```

---

## 🧪 Practice Queries

```sql
-- 1. Rename column 'name' to 'fullName'
ALTER TABLE student CHANGE name fullName VARCHAR(50);

-- 2. Delete students who scored less than 80
DELETE FROM student WHERE marks < 80;

-- 3. Drop the grade column
ALTER TABLE student DROP COLUMN grade;

-- 4. Top 3 students by marks
SELECT * FROM student ORDER BY marks DESC LIMIT 3;

-- 5. Average marks per city
SELECT city, AVG(marks) FROM student GROUP BY city ORDER BY city ASC;

-- 6. Cities where max marks >= 90
SELECT city FROM student GROUP BY city HAVING MAX(marks) >= 90;
```
