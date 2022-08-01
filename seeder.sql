USE pets_sp_db;

INSERT INTO pets (age, name, species)
VALUES (2, 'Fred', 'Dog'),
       (10, 'Sparkles', 'Dog'),
       (7, 'Biff', 'Dog'),
       (9, 'Snickers', 'Dog'),
       (11, 'Sparky', 'Dog'),
       (1, 'Bar', 'Dog');

INSERT INTO toys (name, brand, pet_id)
VALUES ('Bone', 'Bones R Us', 1),
       ('Rope', 'Ropes R Us', 2),
       ('Tennis Ball', 'Tennis R Us', 1),
       ('Mouse', 'Mice R Us', 5),
       ('Rock', 'Rocks R Us', 1);

INSERT INTO vets (name)
VALUES ('Dr. Pat Booker'),
       ('Dr. Cindy Waller'),
       ('Dr. Lorne Fredrickson');

INSERT INTO pet_vet (pet_id, vet_id)
VALUES (1, 1),
       (1, 2),
       (1, 3),
       (2, 1),
       (2, 2);
