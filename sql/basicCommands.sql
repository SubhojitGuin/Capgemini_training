CONN username/password -- to connect using the username and password

SET PAGES 1000 LINES 1000; -- sets the pages and lines for readability

CL SCR; -- clears the terminal

SELECT * FROM TAB; -- gives the tables in the database

/*
  SELECT queries
*/

SELECT * / [DISTINCT] Column_Name / EXPRESSION [ALIAS] 
FROM Table_Name
WHERE <filter_condition>;

SELECT * FROM EMP;
SELECT DISTINCT SAL FROM EMP;
SELECT * FROM EMP WHERE SAL > 1000;