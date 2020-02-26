DROP DATABASE library; 

CREATE DATABASE library;

USE library;

CREATE TABLE books(
	name varchar(120) not null,
    description text default("No description"),
    date_of_publication date not null default("2018-01-01"),
    author varchar(60) not null,
    category varchar(30) not null
);

INSERT INTO books(name, description, date_of_publication, author, category) 
VALUES("Ho to install MySQL for the dumb", "Ho to install MySQL for the dumb", "2020-02-15", "Genius", "Science and technology"),
	("The little train that could", "Good story about friendship and love", "1995-03-24", "Major Payne", "War and history");

INSERT INTO books(name, description, author, category) 
VALUES("The Witcher: The Last Wish", "About cool witcher Geralt", "Andrzej Sapkowski", "Fantasy"),
	("The Witcher: Sword of Destiny", "About crybaby Geralt and his girlfriend", "Andrzej Sapkowski", "Fantasy"),
	("The Witcher: Blood of Elves", "About politics and racism", "Andrzej Sapkowski", "Fantasy");
    
INSERT INTO books(name, date_of_publication, author, category) 
VALUES("Book name", "2010-11-12", "Author name", "Science and technology"),
	("Dates and days", "1234-05-06", "Unknown", "War and history");
    
INSERT INTO books(name, author, category) 
VALUES("Computer and  the mouse", "Brothers Grimm", "Fairytales"),
	("Carol and Tuesday", "Shinichirō Watanabe", "Animation"),
	("The little train that could 2", "Major Payne", "War and history");
    
SELECT `books`.`name`,
    `books`.`description`,
    `books`.`date_of_publication`,
    `books`.`author`,
    `books`.`category`
FROM `library`.`books`;
