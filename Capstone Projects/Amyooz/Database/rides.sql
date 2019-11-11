START TRANSACTION; 

CREATE TABLE rides (
        id                          SERIAL      NOT NULL,
        ride_name                   VARCHAR(72) NOT NULL,
        ride_speed                  INTEGER     NOT NULL,
        height_requirement          INTEGER,
        can_ride_while_pregnant     BOOLEAN     NOT NULL,
        average_line_time           INTEGER, 
        rollercoaster               BOOLEAN     NOT NULL,
        upsidedown                  BOOLEAN     NOT NULL,
        water                       BOOLEAN     NOT NULL,
        scary                       BOOLEAN     NOT NULL,
        freefall_drop               BOOLEAN     NOT NULL,
        twisted                     BOOLEAN     NOT NULL,
        kid_friendly                BOOLEAN     NOT NULL,
        nostalgic                   BOOLEAN     NOT NULL,
        CONSTRAINT pk_ride_id PRIMARY KEY(id)
); 

COMMIT; 


START TRANSACTION; 


INSERT INTO rides(id, ride_name, ride_speed, height_requirement, can_ride_while_pregnant, average_line_time, rollercoaster, upsidedown, water, scary, freefall_drop, twisted, kid_friendly, nostalgic)
    VALUES  (1, 'Thunderbolt', 8, 52, false, 65, true, false, false, false, false, false, false, true),
        (2, 'Phantom’s_Revenge', 10, 48, false, 110, true, false, false, true, true, true, false, false),
        (3, ‘Skycoaster’, 9, 42, false, 200, false, false, false, true, true, false, false, false),
        (4, ‘Pirate_Ship’, 4, 39, false, 25, false, false, false, false, true, false, true, true),
        (5, ‘Kangaroo’, 3, 46, true, 20, false, false, false, false, false, false, true, true),
        (6, ‘MerryGoRound’, 2, 46, true, 10, false, false, false, false, false, false, true, true),
        (7, ‘Turtle’, 2, 46, true, 15, false, false, false, false, false, false, true, true),
        (8, ‘The_Whip’, 3, 46, true, 15, false, false, false, false, false, false, true, true),
        (9, ‘Wave_Swinger’, 4, 46, false, 10, false, false, false, false, false, false, true, true),
        (10, ‘Musik_Express’, 5, 50, false, 40, false, false, false, false, false, true, false, true),
        (11, ‘Racer’, 6, 46, false, 60, true, false, false, false, false, false, true, true),
        (12, ‘Volcano’, 6, 54, false, 15, false, true, false, false, false, false, false, false),
        (13, ‘Aero_360’, 6, 48, false, 35, false, true, false, true, true, false, false, false),
        (14, ‘Gran_Prix’, 1, 48, false, 20, false, false, false, false, false, false, true, true),
        (15, ‘Raging_Rapids’, 5, 42, true, 60, false, false, true, false, false, true, true, false),
        (16, ‘Pittsburg_Plunge’, 5, 36, false, 40, false, false, true, false, true, false, true, true), 
        (17, ‘Exterminator’, 5, 46, false, 120, true, false, false, true, false, true, false, false), 
        (18, ‘Jack_Rabbit’, 7, 42, false, 100, true, false, false, false, true, false, false, true);  
                
COMMIT; 



