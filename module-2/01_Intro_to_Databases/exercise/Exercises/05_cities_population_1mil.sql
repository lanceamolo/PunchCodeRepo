-- 5. The name, state abbreviation, and population of cities with a population greater than 1,000,000 people (10 rows)

-- name, state abb, pop / city / pop > 1 mil --

SELECT city_name, state_abbreviation, population
FROM city
WHERE population > 1000000;