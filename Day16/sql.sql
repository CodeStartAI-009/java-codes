Last login: Sun Nov 16 09:45:00 on console
varun@Varuns-MacBook-Air ~ % mysql -u root -p

Enter password: 
ERROR 1045 (28000): Access denied for user 'root'@'localhost' (using password: YES)
varun@Varuns-MacBook-Air ~ % mysql -u root -p

Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 10
Server version: 9.4.0 Homebrew

Copyright (c) 2000, 2025, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> CREATE TABLE Expance( User_Id INT PRIMARY KEY, User_name VARCHAR(50), Icome INT, Expence INT);
ERROR 1046 (3D000): No database selected
mysql> CREATE DATABASE expenses_db;
Query OK, 1 row affected (0.021 sec)

mysql> USE expenses_db;
Database changed
mysql> CREATE TABLE Expance(
    ->     User_Id INT PRIMARY KEY,
    ->     User_name VARCHAR(50),
    ->     Icome INT,
    ->     Expence INT
    -> );
Query OK, 0 rows affected (0.013 sec)

mysql> INSERT INTO (User_Id,User_name,Icome,Expence) VALUES (1,'varun',5000,2500),(2,'ashish',10000,5000);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(User_Id,User_name,Icome,Expence) VALUES (1,'varun',5000,2500),(2,'ashish',10000' at line 1
mysql> INSERT INTO Expance (User_Id, User_name, Icome, Expence)
    -> VALUES 
    -> (1, 'varun', 5000, 2500),
    -> (2, 'ashish', 10000, 5000);
Query OK, 2 rows affected (0.007 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM Expence
    -> ;
ERROR 1146 (42S02): Table 'expenses_db.expence' doesn't exist
mysql> SELECT * FROM Expence;
ERROR 1146 (42S02): Table 'expenses_db.expence' doesn't exist
mysql> SELECT * FROM Expeance
    -> ;
ERROR 1146 (42S02): Table 'expenses_db.expeance' doesn't exist
mysql> SELECT * FROM Expance;
+---------+-----------+-------+---------+
| User_Id | User_name | Icome | Expence |
+---------+-----------+-------+---------+
|       1 | varun     |  5000 |    2500 |
|       2 | ashish    | 10000 |    5000 |
+---------+-----------+-------+---------+
2 rows in set (0.000 sec)

mysql> SELECT User_Id FROM Expance;
+---------+
| User_Id |
+---------+
|       1 |
|       2 |
+---------+
2 rows in set (0.000 sec)

mysql> SELECT User_name FROM Expance WHERE User_name='ashish';
+-----------+
| User_name |
+-----------+
| ashish    |
+-----------+
1 row in set (0.002 sec)

mysql> SELECT * FROM Expance ORDER BY User_name DESC;
+---------+-----------+-------+---------+
| User_Id | User_name | Icome | Expence |
+---------+-----------+-------+---------+
|       1 | varun     |  5000 |    2500 |
|       2 | ashish    | 10000 |    5000 |
+---------+-----------+-------+---------+
2 rows in set (0.001 sec)

mysql> 
