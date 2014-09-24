/* ------------------------------------------ */
/* -- Sub queries (scalar)------------------- */
/* ------------------------------------------ */
-- only fileds from the out select are shown
-- scalar
-- List the staff working in a Brach at “163 Main street”

SELECT staffNo, fName, lName, position
FROM Staff
WHERE branchNo = (SELECT branchNo FROM Branch WHERE street = '163 Main street');

/* ------------------------------------------ */
/* -- Exercise ------------------------------ */
/* ------------------------------------------ */

-- Get a list of  propertyNo, type, rooms rentet out by Marie Howe


/* ------------------------------------------ */
/* -- Sub queries -------------------------- */
/* ------------------------------------------ */

-- List all staff whose salary is greater than the average salary, 
-- and show how much their salary is greater than the average.

SELECT staffNo,fName,lName,position, 
salary - (SELECT AVG(salary) FROM Staff) AS SalDiff
FROM Staff
WHERE salary > (SELECT AVG(salary) FROM Staff);


/* ------------------------------------------ */
/* -- Sub queries (IN) -------------------------- */
/* ------------------------------------------ */

 -- IN (Used when there is more (rows), then no =)
 -- work your way backwards

-- List the properties that are handled by staff 
-- who work in the branch at '163 Main street'

SELECT * FROM PropertyForRent
WHERE staffNo IN (SELECT staffNo FROM Staff
               WHERE branchNo = (SELECT branchNo
                       FROM Branch
                       WHERE street = '163 Main street'));

/* ------------------------------------------ */
/* -- ANY / ALL -------------------------- */
/* ------------------------------------------ */

SELECT *
FROM Staff
WHERE salary > ANY (SELECT salary FROM Staff WHERE branchNo = 'B003');

-- equals

SELECT * FROM Staff
WHERE salary > (SELECT MIN(salary) FROM Staff WHERE branchNo = 'B003');

-- ALL

SELECT * FROM Staff WHERE salary > ALL (SELECT salary FROM Staff WHERE
               branchNo = 'B003');

SELECT * FROM Staff WHERE salary > (SELECT MAX(salary) FROM Staff WHERE
               branchNo = 'B003');

/* ------------------------------------------ */
/* -- EXISTS / NOT EXISTS ------------------- */
/* ------------------------------------------ */

-- find all staff that work in a London branch office

SELECT 
staffNo, fName, lName, position
FROM Staff s
WHERE EXISTS(SELECT *
				FROM Branch b 
				WHERE s.branchNo = b.branchNo AND city = 'London');
