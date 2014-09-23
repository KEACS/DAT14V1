SELECT * FROM Branch;
SELECT branchNo, street, city, postcode FROM Branch;
SELECT branchNo FROM Branch;

SELECT propertyNo FROM Viewing;
SELECT DISTINCT propertyNo FROM Viewing;

-- CALCULATED FIELDS
SELECT staffNo, fName, lName, salary/12 AS monthlySallaooooo FROM Staff;

-- WHERE
SELECT * FROM Staff WHERE salary <> 9000;

-- LOGICAL OPERATORS
SELECT * FROM Branch WHERE city = 'London' OR CITY = 'Glasgow';
SELECT * FROM Branch WHERE city = 'London' AND postcode = 'SW1 4EH';

-- BETWEEN
SELECT * FROM Staff WHERE salary BETWEEN 9000 AND 18000;
SELECT * FROM Staff WHERE salary > 9000 AND salary <= 18000;

-- LIKE %  _
SELECT * FROM Branch WHERE street LIKE '32%';
SELECT * FROM Branch WHERE street LIKE '32%R___';

-- IS NULL
SELECT * FROM Viewing WHERE comment IS NULL;

-- SORTING
SELECT * FROM Branch WHERE street ORDER BY branchNo DESC;
SELECT * FROM PropertyForRent ORDER BY rent, type;

-- AGGREGATE FUNCTION
SELECT COUNT(*) AS number FROM PropertyForRent WHERE rent < 450;
SELECT COUNT(*) AS Manager, SUM(salary) AS salarySum FROM Staff WHERE position = 'Manager';
SELECT MIN(salary), MAX(salary), AVG(salary) FROM Staff;

SELECT branchNo, COUNT(*) AS Employee 
FROM  Staff 
GROUP BY branchNo 
HAVING Employee <= 1
ORDER BY branchNo;

-- EXERCISE
SELECT position, branchNo, AVG(salary) AS AVERAGESALLERY
FROM Staff
GROUP BY position
ORDER BY salary DESC;


-- READ, DELETE, UPDATE, CREATE
-- CRUD

-- INSERT
INSERT INTO Branch VALUES('B007', 'Victor Bendix Gade 6', 'KBH', '2100');

INSERT INTO Branch (branchNo, street, city, postcode) 
VALUES('B008', 'Victor Bendix Gade 6', 'KBH', '2100');

-- DELETE
DELETE FROM Branch WHERE branchNo = 'B008';
DELETE FROM Branch; -- DETTE ER DUMT AT GØRE!!

-- UPDATE
UPDATE Branch 
SET street = 'Frederiksvej 8', city = 'Viborg' 
where branchNo = 'B007' 



