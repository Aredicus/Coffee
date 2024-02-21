INSERT INTO coffee (name, price)
VALUES ('cappuccino', 180),
       ('latte', 210),
       ('raf', 240),
       ('americano', 200);

INSERT INTO persons(name, password)
VALUES ('Danila', MD5('123')),
       ('Valentina', MD5('2112')),
       ('Dmitry', md5('1986')),
       ('Stepan', md5('Stepan'));

INSERT into coffeeshop(personid, coffeeid)
VALUES (1, 3),
       (2, 1),
       (3, 1),
       (4, 4);