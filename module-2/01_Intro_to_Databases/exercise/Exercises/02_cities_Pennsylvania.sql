-- 2. The name and area of all cities in Pennsylvania (PA) (4 rows)

-- select name, area / city table / state_abbreviation = PA --

-- what data do I SELECT / what table to pull FROM / WHERE are the parameters  --

SELECT city_name, area
FROM city
WHERE state_abbreviation = 'PA'