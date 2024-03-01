CREATE TABLE persons
(
    name           varchar(30) NOT NULL ,
    surname        varchar(30) NOT NULL ,
    age            integer     NOT NULL CHECK (age > 0),
    phone_number   char(10),
    city_of_living varchar(30),
    PRIMARY KEY    (name, surname, age)
);
