-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor (first_name, last_name)
VALUES ('Hampton', 'Avenue'),
        ('Lisa', 'Byway'); 

SELECT * FROM actor;

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
INSERT INTO film (title, description, release_year, language_id, length)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);

SELECT * FROM film WHERE title = 'Euclidean PI';

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
INSERT INTO film_actor (film_id, actor_id)
VALUES (1001, 202),
        (1001, 201);

SELECT * FROM film_actor WHERE film_id = 1001;

-- 4. Add Mathmagical to the category table.
INSERT INTO category (name)
VALUES ('Mathmagical'); 

SELECT * FROM category; 

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

UPDATE film_category SET category_id = 17
WHERE film_id = 274 OR film_id = 494 OR film_id = 714 OR film_id = 996; 

INSERT INTO film_category (film_id, category_id)
VALUES (1001, 17); 

SELECT * FROM film_category; 

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
START TRANSACTION; 
UPDATE film SET rating = 'G' 
WHERE film_id IN (SELECT film_id FROM film_category WHERE category_id = 17);
COMMIT; 

SELECT * FROM film 
WHERE film_id = 274 OR film_id = 494 OR film_id = 714 OR film_id = 996 OR film_id = 1001; 

-- 7. Add a copy of "Euclidean PI" to all the stores. 
INSERT INTO inventory (film_id, store_id)
VALUES (1001, 1),
        (1001, 2);

SELECT * FROM inventory WHERE film_id = 1001;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- This delete did not work because it violates a foreign key constraint.  The film id for Euclidean PI (1001) is used
-- in the film table as the primary key and referenced in the film_actor table as the fk. 
-- Also, it is used in film_category as a fk. 

DELETE FROM film WHERE title = 'Euclidean PI'; 

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- This delete did not work because it violates a foreign key constraint.
-- category_id for Mathmagical (17) is used as a fk for film_category 
DELETE FROM category WHERE name = 'Mathmagical';

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- This was successful because we were deleting the references
-- to category_id and this does not affect any other table (just the one we are in - film_category)
START TRANSACTION; 
DELETE FROM film_category 
WHERE category_id IN  (SELECT category.category_id FROM category WHERE category.name = 'Mathmagical');
COMMIT; 

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- Delete was successful for Mathmagical now, since we deleted all references to it in the pervious question!
-- Delete was NOT successful for Euclidean PI (foreign key constraint in film_actor table)
DELETE FROM category WHERE name = 'Mathmagical';
DELETE FROM film WHERE title = 'Euclidean PI'; 

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

--We would need to delete the two references to the film_id 1001 in the film_actor table
--We would then need to delete the two references to the film_id 1001 in the inventory table