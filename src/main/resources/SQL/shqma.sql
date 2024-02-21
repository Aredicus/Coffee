CREATE TABLE PERSONS
(
    id       BIGSERIAL PRIMARY KEY,
    name     varchar(255),
    password varchar(255)
);

CREATE TABLE COFFEE
(
    id    BIGSERIAL PRIMARY KEY,
    name  varchar(255),
    price int
);

CREATE TABLE COFFEESHOP
(
    id       BIGSERIAL PRIMARY KEY,
    personid BIGSERIAL,
    coffeeid BIGSERIAL,
    datetime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_person_id FOREIGN KEY ("personid") REFERENCES PERSONS ("id"),
    CONSTRAINT fk_coffee_id FOREIGN KEY ("coffeeid") REFERENCES COFFEE ("id")
);
