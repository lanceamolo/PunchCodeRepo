-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)

-- movie, person, movie_actor
-- movie_id, director_id, actor_id, person_id

SELECT title, person_name
FROM movie m
JOIN person p ON m.director_id = p.person_id
JOIN movie_actor ma ON m.movie_id = ma.movie_id

