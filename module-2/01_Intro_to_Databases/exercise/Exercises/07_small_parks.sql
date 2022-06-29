-- 7. The name, date established, and area of parks with an area less than 100 square kilometers (6 rows)

-- name, date est, area / park / area < 100 sq --

SELECT park_name, date_established, area
FROM park
WHERE area < 100;