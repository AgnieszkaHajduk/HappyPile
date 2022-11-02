--- BARS ---

INSERT INTO bars (id, name, diameter, wall_thickness, ultimate_load, yield_load, weight, price)
VALUES ('RR03204S', 'Żerdź samowiercąca', 'R32', '4,5S', 240, 200, 2.75, 8.5),
       ('RR03205S', 'Żerdź samowiercąca', 'R32', '5,2S', 270, 230, 3.25, 10.0),
       ('RR03206S','Żerdź samowiercąca', 'R32', '5,6S', 300, 250, 3.59, 10.8),
       ('RR03207S','Żerdź samowiercąca', 'R32', '7,2S', 340, 290, 3.97, 12.0),
       ('RR03805S','Żerdź samowiercąca', 'R38', '5,2S', 350, 300, 4.05, 12.5),
       ('RR03807S','Żerdź samowiercąca', 'R38', '7,1S', 440, 370, 5.25, 15.5),
       ('RR03808S','Żerdź samowiercąca', 'R38', '8,2S', 500, 410, 5.87, 17.5),
       ('RR05107S','Żerdź samowiercąca', 'R51', '7,1S', 610, 510, 7.38, 22.0),
       ('RR05109S','Żerdź samowiercąca', 'R51', '9,4S', 800, 630, 9.26, 27.0);

--- COUPLINGS ---

INSERT INTO couplings (id, name, diameter, weight, price)
VALUES ('RM032NA', 'Łącznik', 'R32', 0.95, 3.2),
       ('RM038NA', 'Łącznik', 'R38', 1.2, 6.7),
       ('RM051NA', 'Łącznik', 'R51', 2.2, 7.5);

--- PLATES ---

INSERT INTO plates (id, name, size, weight, price)
VALUES ('PR150x8', 'Płyta oporowa', '150x150x8', 1.4, 3.2),
       ('PR150x10', 'Płyta oporowa', '150x150x10', 1.7, 4.0),
       ('PR200x10', 'Płyta oporowa', '200x200x10', 3.1, 7.0),
       ('PR200x20', 'Płyta oporowa', '200x200x20', 6.2, 17.2),
       ('PR200x25', 'Płyta oporowa', '200x200x25', 8.5, 20.0),
       ('PR250x20', 'Płyta oporowa', '250x250x20', 9.8, 27.0),
       ('PR250x25', 'Płyta oporowa', '250x250x25', 12.3, 34.0),
       ('PR250x30', 'Płyta oporowa', '250x250x30', 14.7, 41.2);

--- NUTS ---

INSERT INTO nuts (id, name, diameter, weight, price)
VALUES ('RD032D', 'Nakrętka kulista', 'R32', 0.55, 4.8),
       ('RD032DG', 'Nakrętka kulista galv', 'R32', 0.55, 5.3),
       ('RD032L', 'Nakrętka HEX', 'R32', 0.48, 6.0),
       ('RD032LG', 'Nakrętka HEX galv', 'R32', 0.48, 6.5),
       ('RD038D', 'Nakrętka kulista', 'R38', 0.7, 6.0),
       ('RD038DG', 'Nakrętka kulista galv', 'R38', 0.7, 6.8),
       ('RD038L', 'Nakrętka HEX', 'R38', 1.1, 11.0),
       ('RD038LG', 'Nakrętka HEX galv', 'R38', 1.1, 12.1),
       ('RD051D', 'Nakrętka kulista', 'R51', 1.7, 15.0),
       ('RD051DG', 'Nakrętka kulista galv', 'R51', 1.7, 16.5),
       ('RD051L', 'Nakrętka HEX', 'R51', 1.9, 15.0),
       ('RD051LG', 'Nakrętka HEX galv', 'R51', 1.9, 16.9);