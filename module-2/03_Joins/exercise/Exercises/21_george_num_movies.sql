-- 21. For every person in the person table with the first name of "George", list the number of movies they've been in--include all Georges, even those that have not appeared in any movies. Display the names in alphabetical order. (59 rows)
-- Name the count column 'num_of_movies'

SELECT person_name, COUNT(movie_id) AS num_of_movies
FROM person p
LEFT JOIN movie_actor ma ON p.person_id = ma.actor_id
WHERE person_name LIKE 'George %'
GROUP BY person_id, person_name
ORDER BY person_name;

-- select name and count number of movies they've been in even if they haven't been in any
-- person table
-- join with actor table (match person_id to actor_id)
-- where person_name contains(like) 'George %'
-- group by person_id, person_name
-- order by person_name