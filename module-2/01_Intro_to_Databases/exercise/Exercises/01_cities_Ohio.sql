
-- 1. The name and population of all cities in Ohio (OH) (6 rows)

-- select name & population from city table in the state of Ohio --
SELECT city_name, population
FROM city
WHERE state_abbreviation = 'OH';