/*Simple Queries*/
 
-- 6.7		List full details of all hotels.
 
SELECT * FROM Hotel;
 
-- 6.8		List full details of all hotels in London.
 
SELECT * FROM Hotel WHERE city = 'London';
 
-- 6.9		List the names and addresses of all guests in London, alphabetically ordered by name.
 
SELECT guestName, guestAddress 
FROM Guest 
WHERE guestAddress LIKE '%London%'
ORDER BY guestName;
 
 
-- 6.10		List all double or family rooms with a price below £40.00 per night, in ascending order of price.
 
SELECT * 
FROM Room 
WHERE price < 40 AND type IN ('D', 'F')
ORDER BY price;         

-- 6.11		List the bookings for which no dateTo has been specified.
 
SELECT * FROM Booking WHERE dateTo IS NULL;
 
/*	Aggregate Functions	*/
 
-- 6.12		How many hotels are there?
 
SELECT COUNT(*) FROM Hotel;
 
-- 6.13		What is the average price of a room?
 
SELECT AVG(price) FROM Room;
 
-- 6.14		What is the total revenue per night from all double rooms?
 
SELECT SUM(price) FROM Room WHERE type = 'D';
 
-- 6.15		How many different guests have made bookings for August?
 
SELECT COUNT(DISTINCT guestNo) FROM Booking
WHERE dateFrom LIKE '20__-08%' OR dateTo LIKE '20__-08%';
 

/*	Grouping	*/
 
-- 6.22		List the number of rooms in each hotel.
 
SELECT hotelNo, COUNT(roomNo) AS count 
FROM Room
GROUP BY hotelNo;
 
-- 6.23		List the number of rooms in each hotel in London.
 
SELECT r.hotelNo, COUNT(roomNo) AS count FROM Room r, Hotel h
WHERE r.hotelNo = h.hotelNo AND city = 'London'
GROUP BY r.hotelNo;
 
/*	Populating Tables	*/
 
-- 6.27		Insert records into each of these tables.
 
INSERT INTO Hotel (hotelNo, hotelName)
VALUES ('H111', 'Grosvenor Hotel');
 
INSERT INTO Room
VALUES ('1', 'H111', 'S', 72.00);
            
INSERT INTO Guest
VALUES ('G111', 'John Smith', 'London');
            
INSERT INTO Booking
VALUES ('H111', 'G111', DATE'2005-01-01', DATE'2005-01-02', '1');
 
-- 6.28		Update the price of all rooms by 5%.
 
UPDATE Room SET price = price*1.05 WHERE roomNo >= 0;


DELETE FROM Room WHERE roomNo = 1;
