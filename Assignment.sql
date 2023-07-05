--Creating Database
CREATE DATABASE Practice

--Creating Tables
CREATE TABLE userInfo
(
	[USER_ID] INT NOT NULL IDENTITY PRIMARY KEY,
	FIRST_NAME VARCHAR(20) NOT NULL,
	AGE INT NOT NULL,
	GENDER CHAR(1) CHECK (GENDER IN ('M','F')) NOT NULL,
	EMAIL VARCHAR(30) NOT NULL,
	PHONE_NUMBER BIGINT DEFAULT 0 UNIQUE
)

CREATE TABLE userSubscription
(
	SUB_ID INT NOT NULL IDENTITY PRIMARY KEY,
	SUB_DATE DATE NOT NULL,
	SUB_EXPIRY DATE NOT NULL,
	[USER_ID] INT FOREIGN KEY REFERENCES userInfo([USER_ID])--NOT NULL
)

--Inserting Values
INSERT INTO userInfo VALUES ('Paras',22,'M','parasgada@gmail.com',7303579807)
INSERT INTO userInfo VALUES ('Alex', 20, 'M', 'alex@gmail.com', 6396173073)
INSERT INTO userInfo (FIRST_NAME,AGE,GENDER,EMAIL)VALUES ('David', 21, 'M', 'david@gmail.com')
INSERT INTO userInfo VALUES ('Doris', 24, 'M', 'doris@gmail.com', 8788945023)
INSERT INTO userInfo VALUES ('Ruby', 18, 'F', 'ruby@gmail.com', 9975379341)
INSERT INTO userInfo VALUES ('Kate', 26, 'F', 'kate@gmail.com', 7649170921)


INSERT INTO userSubscription VALUES ('2023-02-26','2023-05-25',1)
INSERT INTO userSubscription VALUES ('2023-02-14','2023-06-13',1)
INSERT INTO userSubscription VALUES ('2023-05-23','2023-07-22',2)
INSERT INTO userSubscription VALUES ('2023-03-13','2023-08-12',3)
INSERT INTO userSubscription VALUES ('2023-01-18','2023-06-17',4)

--Creating non-clustered index 
CREATE INDEX idx_user_name
ON userInfo (FIRST_NAME )

--Drop Tables
DROP TABLE userInfo
DROP TABLE userSubscription

--Alter Tables
ALTER TABLE userInfo
ALTER COLUMN EMAIL VARCHAR(35)

--Select Into statement
SELECT *
INTO copy_userInfo
FROM userInfo

-- Insert Into Select statement
CREATE TABLE copy_userSubscription
(
	SUB_ID INT,
	SUB_DATE DATE,
	SUB_EXPIRY DATE,
	[USER_ID] INT
)

INSERT INTO copy_userSubscription
SELECT *
FROM userSubscription

SELECT * FROM copy_userSubscription

--Queries
--1)
SELECT *
FROM userSubscription
WHERE SUB_EXPIRY > '2023-06-14'
ORDER BY  SUB_DATE

--2)
SELECT DISTINCT [USER_ID]
FROM userSubscription

--3)
SELECT *
FROM userInfo
WHERE PHONE_NUMBER LIKE '%3'

--4)
SELECT *
FROM userInfo
WHERE FIRST_NAME LIKE 'D__i%'

--5)
SELECT TOP 2 EMAIL
FROM userInfo
WHERE AGE IN (20,21,23)

--6)
SELECT * 
FROM userInfo
WHERE AGE BETWEEN 15 AND 23 AND GENDER = 'F'

--7)
WITH temp1 AS
(
	SELECT [USER_ID], EMAIL
	FROM userInfo
	WHERE [USER_ID] < 6
)

SELECT *
FROM userSubscription AS sub
RIGHT JOIN temp1 ON sub.[USER_ID] = temp1.[USER_ID]

--8)
SELECT *
FROM userSubscription AS sub
LEFT JOIN userInfo ON sub.[USER_ID] = userInfo.[USER_ID]

--9)
SELECT *
FROM userSubscription AS sub
INNER JOIN userInfo ON sub.[USER_ID] = userInfo.[USER_ID]

--10)
SELECT *
FROM userSubscription AS sub
FULL JOIN userInfo ON sub.[USER_ID] = userInfo.[USER_ID]

--11)
SELECT *
FROM userSubscription AS sub
CROSS JOIN userInfo

--12)
SELECT [USER_ID]
FROM userInfo
WHERE AGE < 23

UNION

SELECT [USER_ID]
FROM userSubscription
WHERE SUB_EXPIRY > '2023-06-01'

--13)
SELECT *
FROM userInfo
WHERE AGE < 21 OR AGE >=22

--14)
SELECT COUNT([USER_ID]) AS 'CountofMaleUsers'
FROM userInfo
GROUP BY GENDER
HAVING GENDER = 'M'

--15)
CREATE VIEW Feb_subs AS SELECT [USER_ID], SUB_DATE
FROM userSubscription
WHERE SUB_DATE > '2023-02-01' AND SUB_DATE < '2023-02-28'

SELECT *
FROM Feb_subs

--16)
UPDATE userInfo
SET PHONE_NUMBER = NULL
WHERE [USER_ID] = 3

--17)
SELECT [USER_ID],FIRST_NAME,ISNULL(PHONE_NUMBER,-1) AS RESULT
FROM userInfo

--18)
DELETE 
FROM userInfo
WHERE FIRST_NAME = 'Doris'

--Creating Procedure
CREATE PROCEDURE selectByName @FIRST_NAME nvarchar(20)
AS
SELECT * 
FROM userInfo
WHERE FIRST_NAME = @FIRST_NAME

EXEC selectByName @FIRST_NAME = 'Paras'