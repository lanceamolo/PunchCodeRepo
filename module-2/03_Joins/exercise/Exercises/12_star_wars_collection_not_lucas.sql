-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)

-- SELECT title
-- FROM movie table
-- movie table, director_id -> person table, person_id
-- movie table, collection_id -> collection table, collection_id
-- WHERE person_name != 'George Lucas'
-- AND collection_name = 'Star Wars Collection'


SELECT title
FROM movie mo
JOIN person pe ON mo.director_id = pe.person_id
JOIN collection co ON mo.collection_id = co.collection_id
WHERE person_name != 'George Lucas'
AND collection_name = 'Star Wars Collection'