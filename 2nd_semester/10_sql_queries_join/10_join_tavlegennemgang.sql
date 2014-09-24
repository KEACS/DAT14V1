/* ------------------------------------------ */
/* -- (INNER) JOIN ---------------------------------- */
/* ------------------------------------------ */
/*
List names of all clients 
who have viewed a property 
along with any comment supplied.
*/
SELECT 
    c.clientNo, fName, lName, propertyNo, comment
FROM Client c 
JOIN Viewing v ON c.clientNo = v.clientNo;

/*
Only those rows from both tables 
that have identical values 
in the clientNo columns (c.clientNo = v.clientNo) 
are included in result. 
*/

/* ------------------------------------------ */
/* -- Alternetives -------------------------- */
/* ------------------------------------------ */

-- 1
-- IF the primary key and the FK has the same name
SELECT 
    clientNo, fName, lName, propertyNo, comment
	FROM Client NATURAL JOIN Viewing;

-- 2
SELECT 
    c.clientNo, fName, lName, propertyNo, comment
FROM
    Client c,
    Viewing v
WHERE
    c.clientNo = v.clientNo;


/* ------------------------------------------ */
/* -- SORTING A JOIN -------------------------- */
/* ------------------------------------------ */

SELECT 
    c.clientNo, fName, lName, propertyNo, comment
FROM Client c 
JOIN Viewing v ON c.clientNo = v.clientNo
ORDER BY propertyNo;


/* ------------------------------------------ */
/* -- JOINING 3 TABLES ---------------------- */
/* ------------------------------------------ */

-- List staff info and info about the branch they work in 
-- togeteher with the number of properties they manage

SELECT 
	fName,lName,position,b.branchNo,b.street,b.city,b.postcode, COUNT(p.propertyNo) AS numProAdmin
FROM Staff s 
JOIN Branch b ON s.branchNo = b.branchNo 
JOIN PropertyForRent p ON s.staffNo = p.staffNo
GROUP BY fName;

/* ------------------------------------------ */
/* -- (OUTER) Left Join ----------------------------- */
/* ------------------------------------------ */

-- try to remove the key word LEFT

SELECT
	c.clientNo,fName, COUNT(v.ID)
FROM Client c
LEFT JOIN Viewing v ON c.clientNo = v.clientNo
GROUP BY c.clientNo;

/* ------------------------------------------ */
/* -- (OUTER) RIGHT Join ----------------------------- */
/* ------------------------------------------ */

-- try to CHANGE the key word RIGHT

SELECT
	p.propertyNo, COUNT(v.ID)
FROM PropertyForRent p
RIGHT JOIN Viewing v ON p.propertyNo = v.propertyNo
GROUP BY p.propertyNo;

/* ------------------------------------------ */
/* -- FULL OUTER Join ----------------------------- */
/* ------------------------------------------ */

 -- DOES NOT EXIST IN MYSQL, BUT USE OF UNION CAN DO THE SAME 

SELECT * FROM PropertyForRent p
LEFT JOIN Viewing v ON p.propertyNo = v.propertyNo
UNION
SELECT * FROM PropertyForRent p
RIGHT JOIN Viewing v ON p.propertyNo = v.propertyNo



