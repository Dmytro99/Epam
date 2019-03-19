-- ======================= 1 ======================== 
-- 1
-- SELECT maker,type FROM product ORDER BY maker
-- 2
-- SELECT model, ram, screen, price FROM laptop WHERE price > 1000  ORDER BY ram AND price DESC
-- 3
-- SELECT * FROM printer WHERE color = 'y' ORDER BY price DESC	
-- 4
-- SELECT model, speed, hd, cd, price FROM PC WHERE (cd = '12x' OR cd = '24x') AND price < 600 ORDER BY speed DESC
-- 5
-- SELECT name, class FROM ships ORDER BY name
-- 6
-- SELECT * FROM PC WHERE price < 800 AND speed >= 500 ORDER BY price DESC
-- 7
-- SELECT * FROM printer WHERE type != 'Matrix' AND price < 300 ORDER BY type DESC
-- 8
-- SELECT model, speed FROM PC WHERE price BETWEEN 400 AND 600 ORDER BY hd
-- 9
-- SELECT model, speed, hd FROM PC WHERE hd = 10 OR hd = 20 ORDER BY speed
-- 10
-- SELECT model, speed, hd, price FROM laptop WHERE screen >= 12 ORDER BY price DESC
-- 11
-- SELECT model, type, price FROM printer WHERE price <= 300 ORDER BY type DESC
-- 12
-- SELECT model, ram, price FROM laptop WHERE ram = 64 ORDER BY screen 
-- 13
-- SELECT model, ram, price FROM PC WHERE ram > 64 ORDER BY hd
-- 14 
-- SELECT model, speed, price FROM PC WHERE speed BETWEEN 500 AND 750 ORDER BY hd DESC
-- 15
-- SELECT * FROM outcome_o WHERE outcome_o.out > 2000 ORDER BY date DESC
-- ======================= 2 ========================
-- 1
-- SELECT model FROM PC WHERE model RLIKE '11'
-- 2
-- SELECT * FROM outcome WHERE date RLIKE'03'
-- 3
-- SELECT * FROM outcome WHERE date RLIKE'14'
-- 4
-- SELECT * FROM Ships WHERE name RLIKE'^W' AND name RLIKE 'n$'
-- 5
-- SELECT * FROM Ships WHERE name LIKE'%e' AND name LIKE'%e' 
-- 6
-- SELECT name, launched FROM Ships WHERE name RLIKE'[b-z]$'
-- 7
-- SELECT name FROM Ships WHERE name LIKE'%%' AND NOT name RLIKE'c$' 
-- 8
-- SELECT *  FROM Trip WHERE time_out RLIKE '1[2-6]:[0-5][0-9]:' 
-- 9
-- SELECT *  FROM Trip WHERE time_in RLIKE '1[7-9]:[0-5][0-9]:' OR time_in RLIKE '2[0-3]:[0-5][0-9]:' 
-- 10
-- SELECT date FROM Pass_in_trip WHERE place RLIKE '^1'



-- ======================= 3 ========================
-- 1
-- SELECT maker, type, speed, hd FROM product  JOIN PC ON hd <= 8
-- 2
-- SELECT maker FROM product INNER JOIN PC ON speed >= 600
-- 3
-- SELECT maker FROM product INNER JOIN PC ON speed <= 500
-- 4


-- UNCORRECT==========================================UNCORRECT
-- SELECT DISTINCT model, hd, ram FROM Laptop WHERE hd = hd AND ram = ram 
-- UNCORRECT==========================================UNCORRECT
 
 
-- 5
-- SELECT  country FROM Classes WHERE type='bb' and country IN (SELECT  country FROM Classes WHERE type='bc')
-- 6
-- SELECT product.model, maker FROM PC INNER JOIN product ON price < 600
-- 7
-- SELECT product.model, maker, price FROM printer JOIN product ON printer.model = product.model AND price > 300
-- 8
-- SELECT maker, PC.model, price FROM PC JOIN product ON PC.model = product.model
-- 9


-- UNCORRECT==========================================UNCORRECT
 -- SELECT DISTINCT PC.model, maker  FROM PC  JOIN product ON product.model = pc.model 
-- UNCORRECT==========================================UNCORRECT

 


-- 10
-- SELECT DISTINCT maker, type, product.model, speed FROM PC INNER JOIN product ON speed > 600





