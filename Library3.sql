DROP DATABASE library; 

CREATE DATABASE library;

USE library;

CREATE TABLE books(
	id MEDIUMINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	book_name varchar(120) not null,
    price decimal(6, 2) not null,
    description text default("No description"),
    date_of_publication date not null default("2018-01-01"),
    category varchar(30) not null,
    isbn varchar(20) not null unique,
    pages int (4) not null,
    author_name varchar(45) not null,
    author_surname varchar(45) not null,
    author_email varchar(50) not null,
    author_age int(3) not null,
    author_date_of_birth date not null,
    author_awards text default (null)
);

INSERT INTO books(book_name, price, description, date_of_publication, category, isbn, pages, author_name, author_surname, author_email, author_age, author_date_of_birth, author_awards) 
VALUES
	("The little train that could", "499.99", "Good story about friendship and love", "1995-03-24", "War and history", "432-234-34-2447-2", "27", "Payne", "Major", "vitnam@usa.net", "57", "1963-05-05", "Medal of honour"),
	("How to install MySQL for the dumb", "9999.99", "Ho to install MySQL for the dumb", "2020-02-15", "Science and technology", "433-623-37-2348-9", "9579", "Some", "Genius", "Genius@mail.com", "80", "1940-09-018", "The Nobel Prize in Literature"),
    ("The little train that could 2", "499.99", "Good story about friendship and love 2", "1996-05-01", "War and history", "432-234-34-2421-4", "32", "Payne", "Major", "vitnam@usa.net", "57", "1963-05-05", "Medal of honour"),
    ("Carol and Tuesday", "650.00", "Chill and relax", "2019-10-05", "Animation", "368-347-41-0567-0", "24", "Shinichirō", "Watanabe", "authorEmail@blabla.net", "54", "1965-05-24", null),
    ("Computer and  the mouse", "325.00", "Computer try to cath a mouse? What a story...", "1997-09-28", "Fairytales", "835-238-88-2312-8", "57", "Jacob and Wilhelm", "Grimm", "unknown", "151", "1785-08-12", null),
    ("Dates and days", "1945.92", "description of some dates and days", "1234-05-06", "War and history", "348-534-26-4439-5", "999", "Van", "Darkholme", "deepDarkEmail@gmail.com", "37", "1983-02-14", "Best performance artist"),
    ("Book name", "9.99", "book description", "2010-11-12", "Science and technology", "448-547-16-4569-2", "432", "Author name", "Author surname", "Author email", "0", "2010-10-20", null),
	("Ostatnie życzenie", "199.99", "About cool witcher Geralt", "1993-01-01", "Fantasy", "978-617-12-0499-7", "288", "Andrzej", "Sapkowski", "anSap@pol.net", "71", "1948-06-21", "2016: World Fantasy Award—Life Achievement for The Witcher saga
2014: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2012: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2010: European Science Fiction Society 'European Grand Master' honorary award
2009: David Gemmell Legend Award
1997: Polityka's Passport award, which is awarded annually to artists who have strong prospects for international success
1996: European Science Fiction Society Hall of Fame: author"),
	("Miecz przeznaczenia", "299.99", "About crybaby Geralt and his girlfriend", "1992-01-01", "Fantasy", "978-617-12-0498-0", "368", "Andrzej", "Sapkowski", "anSap@pol.net", "71", "1948-06-21", "2016: World Fantasy Award—Life Achievement for The Witcher saga
2014: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2012: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2010: European Science Fiction Society 'European Grand Master' honorary award
2009: David Gemmell Legend Award
1997: Polityka's Passport award, which is awarded annually to artists who have strong prospects for international success
1996: European Science Fiction Society Hall of Fame: author"),
	("Krew elfów", "399.99", "About politics and racism", "1994-01-01", "Fantasy", "978-617-12-1037-0", "320", "Andrzej", "Sapkowski", "anSap@pol.net", "71", "1948-06-21", "2016: World Fantasy Award—Life Achievement for The Witcher saga
2014: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2012: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2010: European Science Fiction Society 'European Grand Master' honorary award
2009: David Gemmell Legend Award
1997: Polityka's Passport award, which is awarded annually to artists who have strong prospects for international success
1996: European Science Fiction Society Hall of Fame: author"),
	("Czas pogardy", "499.99", "Geralt take care of Cirilla", "1995-01-01", "Fantasy", "978-617-12-1038-7", "320", "Andrzej", "Sapkowski", "anSap@pol.net", "71", "1948-06-21", "2016: World Fantasy Award—Life Achievement for The Witcher saga
2014: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2012: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2010: European Science Fiction Society 'European Grand Master' honorary award
2009: David Gemmell Legend Award
1997: Polityka's Passport award, which is awarded annually to artists who have strong prospects for international success
1996: European Science Fiction Society Hall of Fame: author"),
	("Chrzest ognia", "599.99", "Geralt go to find Cirilla", "1996-01-01", "Fantasy", "978-617-12-1488-0", "384", "Andrzej", "Sapkowski", "anSap@pol.net", "71", "1948-06-21", "2016: World Fantasy Award—Life Achievement for The Witcher saga
2014: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2012: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2010: European Science Fiction Society 'European Grand Master' honorary award
2009: David Gemmell Legend Award
1997: Polityka's Passport award, which is awarded annually to artists who have strong prospects for international success
1996: European Science Fiction Society Hall of Fame: author"),
	("Wieża Jaskółki", "699.99", "Geralt go to find Cirilla again", "1997-01-01", "Fantasy", "978-617-12-1656-3", "480", "Andrzej", "Sapkowski", "anSap@pol.net", "71", "1948-06-21", "2016: World Fantasy Award—Life Achievement for The Witcher saga
2014: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2012: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2010: European Science Fiction Society 'European Grand Master' honorary award
2009: David Gemmell Legend Award
1997: Polityka's Passport award, which is awarded annually to artists who have strong prospects for international success
1996: European Science Fiction Society Hall of Fame: author"),
	("Pani Jeziora", "799.99", "The last book in saga", "1999-01-01", "Fantasy", "978-617-12-3114-6", "576", "Andrzej", "Sapkowski", "anSap@pol.net", "71", "1948-06-21", "2016: World Fantasy Award—Life Achievement for The Witcher saga
2014: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2012: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2010: European Science Fiction Society 'European Grand Master' honorary award
2009: David Gemmell Legend Award
1997: Polityka's Passport award, which is awarded annually to artists who have strong prospects for international success
1996: European Science Fiction Society Hall of Fame: author"),
	("Sezon burz", "899.99", "One more book", "2013-11-06", "Fantasy", "978-617-12-3396-6", "352", "Andrzej", "Sapkowski", "anSap@pol.net", "71", "1948-06-21", "2016: World Fantasy Award—Life Achievement for The Witcher saga
2014: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2012: Silver medal Gloria Artis, Ministry of Culture and National Heritage of the Republic of Poland
2010: European Science Fiction Society 'European Grand Master' honorary award
2009: David Gemmell Legend Award
1997: Polityka's Passport award, which is awarded annually to artists who have strong prospects for international success
1996: European Science Fiction Society Hall of Fame: author"),
    ("Harry Potter and the Philosopher's Stone", "500.00", "Arriving at Hogwarts", "1997-06-26", "Fantasy", "0-7475-3269-9", "332", "Joanne", "Rowling", "jkrowling@gmail.com", "54", "1965-07-31", "1997: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Philosopher's Stone
1998: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Chamber of Secrets
1998: British Children's Book of the Year, winner Harry Potter and the Philosopher's Stone
1999: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Prisoner of Azkaban
1999: National Book Awards Children's Book of the Year, winner Harry Potter and the Chamber of Secrets
1999: Whitbread Children's Book of the Year, winner Harry Potter and the Prisoner of Azkaban
2000: British Book Awards, Author of the Year
2000: Officer of the Order of the British Empire (OBE), for services to Children's Literature
2000: Locus Award, winner Harry Potter and the Prisoner of Azkaban
2001: Hugo Award for Best Novel, winner Harry Potter and the Goblet of Fire
2003: Premio Príncipe de Asturias, Concord
2003: Bram Stoker Award for Best Work for Young Readers, winner Harry Potter and the Order of the Phoenix
2006: British Book of the Year, winner for Harry Potter and the Half Blood Prince
2007: Blue Peter Badge, Gold
2007: Named Barbara Walters' Most Fascinating Person of the year
2008: British Book Awards, Outstanding Achievement
2008: The Edinburgh Award
2010: Hans Christian Andersen Literature Award, inaugural award winner
2011: British Academy Film Awards, Outstanding British Contribution to Cinema for the Harry Potter film series, shared with David Heyman, cast and crew
2012: Freedom of the City of London
2012: Rowling was among the British cultural icons selected by artist Sir Peter Blake to appear in a new version of his most famous artwork – the Beatles' Sgt. Pepper's Lonely Hearts Club Band album cover – to celebrate the British cultural figures of his life
2017: Member of the Order of the Companions of Honour (CH) at the 2017 Birthday Honours for services to literature and philanthropy
2019: For their first match of March 2019, the women of the United States women's national soccer team each wore a jersey with the name of a woman they were honoring on the back; Rose Lavelle chose the name of Rowling"),
	("Harry Potter and the Chamber of Secrets", "500.00", " Harry Potter's twelfth birthday", "1999-06-02", "Fantasy", "0-7475-3849-2", "360", "Joanne", "Rowling", "jkrowling@gmail.com", "54", "1965-07-31", "1997: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Philosopher's Stone
1998: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Chamber of Secrets
1998: British Children's Book of the Year, winner Harry Potter and the Philosopher's Stone
1999: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Prisoner of Azkaban
1999: National Book Awards Children's Book of the Year, winner Harry Potter and the Chamber of Secrets
1999: Whitbread Children's Book of the Year, winner Harry Potter and the Prisoner of Azkaban
2000: British Book Awards, Author of the Year
2000: Officer of the Order of the British Empire (OBE), for services to Children's Literature
2000: Locus Award, winner Harry Potter and the Prisoner of Azkaban
2001: Hugo Award for Best Novel, winner Harry Potter and the Goblet of Fire
2003: Premio Príncipe de Asturias, Concord
2003: Bram Stoker Award for Best Work for Young Readers, winner Harry Potter and the Order of the Phoenix
2006: British Book of the Year, winner for Harry Potter and the Half Blood Prince
2007: Blue Peter Badge, Gold
2007: Named Barbara Walters' Most Fascinating Person of the year
2008: British Book Awards, Outstanding Achievement
2008: The Edinburgh Award
2010: Hans Christian Andersen Literature Award, inaugural award winner
2011: British Academy Film Awards, Outstanding British Contribution to Cinema for the Harry Potter film series, shared with David Heyman, cast and crew
2012: Freedom of the City of London
2012: Rowling was among the British cultural icons selected by artist Sir Peter Blake to appear in a new version of his most famous artwork – the Beatles' Sgt. Pepper's Lonely Hearts Club Band album cover – to celebrate the British cultural figures of his life
2017: Member of the Order of the Companions of Honour (CH) at the 2017 Birthday Honours for services to literature and philanthropy
2019: For their first match of March 2019, the women of the United States women's national soccer team each wore a jersey with the name of a woman they were honoring on the back; Rose Lavelle chose the name of Rowling"),
	("Harry Potter and the Prisoner of Azkaban", "500.00", "Harry learns from Arthur Weasley that Sirius Black is a convicted murderer from the wizarding world and that Black has escaped from the wizard prison Azkaban to kill Harry", "1999-07-08", "Fantasy", "	0-7475-4215-5", "462", "Joanne", "Rowling", "jkrowling@gmail.com", "54", "1965-07-31", "1997: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Philosopher's Stone
1998: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Chamber of Secrets
1998: British Children's Book of the Year, winner Harry Potter and the Philosopher's Stone
1999: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Prisoner of Azkaban
1999: National Book Awards Children's Book of the Year, winner Harry Potter and the Chamber of Secrets
1999: Whitbread Children's Book of the Year, winner Harry Potter and the Prisoner of Azkaban
2000: British Book Awards, Author of the Year
2000: Officer of the Order of the British Empire (OBE), for services to Children's Literature
2000: Locus Award, winner Harry Potter and the Prisoner of Azkaban
2001: Hugo Award for Best Novel, winner Harry Potter and the Goblet of Fire
2003: Premio Príncipe de Asturias, Concord
2003: Bram Stoker Award for Best Work for Young Readers, winner Harry Potter and the Order of the Phoenix
2006: British Book of the Year, winner for Harry Potter and the Half Blood Prince
2007: Blue Peter Badge, Gold
2007: Named Barbara Walters' Most Fascinating Person of the year
2008: British Book Awards, Outstanding Achievement
2008: The Edinburgh Award
2010: Hans Christian Andersen Literature Award, inaugural award winner
2011: British Academy Film Awards, Outstanding British Contribution to Cinema for the Harry Potter film series, shared with David Heyman, cast and crew
2012: Freedom of the City of London
2012: Rowling was among the British cultural icons selected by artist Sir Peter Blake to appear in a new version of his most famous artwork – the Beatles' Sgt. Pepper's Lonely Hearts Club Band album cover – to celebrate the British cultural figures of his life
2017: Member of the Order of the Companions of Honour (CH) at the 2017 Birthday Honours for services to literature and philanthropy
2019: For their first match of March 2019, the women of the United States women's national soccer team each wore a jersey with the name of a woman they were honoring on the back; Rose Lavelle chose the name of Rowling"),
	("Harry Potter and the Goblet of Fire", "500.00", "The Weasleys invite Harry and Hermione Granger to the Quidditch World Cup", "2000-07-28", "Fantasy", "0-7475-4624-X", "636", "Joanne", "Rowling", "jkrowling@gmail.com", "54", "1965-07-31", "1997: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Philosopher's Stone
1998: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Chamber of Secrets
1998: British Children's Book of the Year, winner Harry Potter and the Philosopher's Stone
1999: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Prisoner of Azkaban
1999: National Book Awards Children's Book of the Year, winner Harry Potter and the Chamber of Secrets
1999: Whitbread Children's Book of the Year, winner Harry Potter and the Prisoner of Azkaban
2000: British Book Awards, Author of the Year
2000: Officer of the Order of the British Empire (OBE), for services to Children's Literature
2000: Locus Award, winner Harry Potter and the Prisoner of Azkaban
2001: Hugo Award for Best Novel, winner Harry Potter and the Goblet of Fire
2003: Premio Príncipe de Asturias, Concord
2003: Bram Stoker Award for Best Work for Young Readers, winner Harry Potter and the Order of the Phoenix
2006: British Book of the Year, winner for Harry Potter and the Half Blood Prince
2007: Blue Peter Badge, Gold
2007: Named Barbara Walters' Most Fascinating Person of the year
2008: British Book Awards, Outstanding Achievement
2008: The Edinburgh Award
2010: Hans Christian Andersen Literature Award, inaugural award winner
2011: British Academy Film Awards, Outstanding British Contribution to Cinema for the Harry Potter film series, shared with David Heyman, cast and crew
2012: Freedom of the City of London
2012: Rowling was among the British cultural icons selected by artist Sir Peter Blake to appear in a new version of his most famous artwork – the Beatles' Sgt. Pepper's Lonely Hearts Club Band album cover – to celebrate the British cultural figures of his life
2017: Member of the Order of the Companions of Honour (CH) at the 2017 Birthday Honours for services to literature and philanthropy
2019: For their first match of March 2019, the women of the United States women's national soccer team each wore a jersey with the name of a woman they were honoring on the back; Rose Lavelle chose the name of Rowling"),
	("Harry Potter and the Order of the Phoenix", "500.00", "Harry Potter and the Order of the Phoenix", "2003-06-21", "Fantasy", "0-7475-5100-6", "766", "Joanne", "Rowling", "jkrowling@gmail.com", "54", "1965-07-31", "1997: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Philosopher's Stone
1998: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Chamber of Secrets
1998: British Children's Book of the Year, winner Harry Potter and the Philosopher's Stone
1999: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Prisoner of Azkaban
1999: National Book Awards Children's Book of the Year, winner Harry Potter and the Chamber of Secrets
1999: Whitbread Children's Book of the Year, winner Harry Potter and the Prisoner of Azkaban
2000: British Book Awards, Author of the Year
2000: Officer of the Order of the British Empire (OBE), for services to Children's Literature
2000: Locus Award, winner Harry Potter and the Prisoner of Azkaban
2001: Hugo Award for Best Novel, winner Harry Potter and the Goblet of Fire
2003: Premio Príncipe de Asturias, Concord
2003: Bram Stoker Award for Best Work for Young Readers, winner Harry Potter and the Order of the Phoenix
2006: British Book of the Year, winner for Harry Potter and the Half Blood Prince
2007: Blue Peter Badge, Gold
2007: Named Barbara Walters' Most Fascinating Person of the year
2008: British Book Awards, Outstanding Achievement
2008: The Edinburgh Award
2010: Hans Christian Andersen Literature Award, inaugural award winner
2011: British Academy Film Awards, Outstanding British Contribution to Cinema for the Harry Potter film series, shared with David Heyman, cast and crew
2012: Freedom of the City of London
2012: Rowling was among the British cultural icons selected by artist Sir Peter Blake to appear in a new version of his most famous artwork – the Beatles' Sgt. Pepper's Lonely Hearts Club Band album cover – to celebrate the British cultural figures of his life
2017: Member of the Order of the Companions of Honour (CH) at the 2017 Birthday Honours for services to literature and philanthropy
2019: For their first match of March 2019, the women of the United States women's national soccer team each wore a jersey with the name of a woman they were honoring on the back; Rose Lavelle chose the name of Rowling"),
	("Harry Potter and the Half-Blood Prince", "500.00", "Severus Snape, a member of the Order of the Phoenix, meets with Narcissa Malfoy", "2005-06-16", "Fantasy", "0-7475-8108-8", "607", "Joanne", "Rowling", "jkrowling@gmail.com", "54", "1965-07-31", "1997: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Philosopher's Stone
1998: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Chamber of Secrets
1998: British Children's Book of the Year, winner Harry Potter and the Philosopher's Stone
1999: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Prisoner of Azkaban
1999: National Book Awards Children's Book of the Year, winner Harry Potter and the Chamber of Secrets
1999: Whitbread Children's Book of the Year, winner Harry Potter and the Prisoner of Azkaban
2000: British Book Awards, Author of the Year
2000: Officer of the Order of the British Empire (OBE), for services to Children's Literature
2000: Locus Award, winner Harry Potter and the Prisoner of Azkaban
2001: Hugo Award for Best Novel, winner Harry Potter and the Goblet of Fire
2003: Premio Príncipe de Asturias, Concord
2003: Bram Stoker Award for Best Work for Young Readers, winner Harry Potter and the Order of the Phoenix
2006: British Book of the Year, winner for Harry Potter and the Half Blood Prince
2007: Blue Peter Badge, Gold
2007: Named Barbara Walters' Most Fascinating Person of the year
2008: British Book Awards, Outstanding Achievement
2008: The Edinburgh Award
2010: Hans Christian Andersen Literature Award, inaugural award winner
2011: British Academy Film Awards, Outstanding British Contribution to Cinema for the Harry Potter film series, shared with David Heyman, cast and crew
2012: Freedom of the City of London
2012: Rowling was among the British cultural icons selected by artist Sir Peter Blake to appear in a new version of his most famous artwork – the Beatles' Sgt. Pepper's Lonely Hearts Club Band album cover – to celebrate the British cultural figures of his life
2017: Member of the Order of the Companions of Honour (CH) at the 2017 Birthday Honours for services to literature and philanthropy
2019: For their first match of March 2019, the women of the United States women's national soccer team each wore a jersey with the name of a woman they were honoring on the back; Rose Lavelle chose the name of Rowling"),
	("Harry Potter and the Deathly Hallows", "500.00", "Deathly Hallows is realy dedly", "2007-06-21", "Fantasy", "0-545-01022-5", "607", "Joanne", "Rowling", "jkrowling@gmail.com", "54", "1965-07-31", "1997: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Philosopher's Stone
1998: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Chamber of Secrets
1998: British Children's Book of the Year, winner Harry Potter and the Philosopher's Stone
1999: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Prisoner of Azkaban
1999: National Book Awards Children's Book of the Year, winner Harry Potter and the Chamber of Secrets
1999: Whitbread Children's Book of the Year, winner Harry Potter and the Prisoner of Azkaban
2000: British Book Awards, Author of the Year
2000: Officer of the Order of the British Empire (OBE), for services to Children's Literature
2000: Locus Award, winner Harry Potter and the Prisoner of Azkaban
2001: Hugo Award for Best Novel, winner Harry Potter and the Goblet of Fire
2003: Premio Príncipe de Asturias, Concord
2003: Bram Stoker Award for Best Work for Young Readers, winner Harry Potter and the Order of the Phoenix
2006: British Book of the Year, winner for Harry Potter and the Half Blood Prince
2007: Blue Peter Badge, Gold
2007: Named Barbara Walters' Most Fascinating Person of the year
2008: British Book Awards, Outstanding Achievement
2008: The Edinburgh Award
2010: Hans Christian Andersen Literature Award, inaugural award winner
2011: British Academy Film Awards, Outstanding British Contribution to Cinema for the Harry Potter film series, shared with David Heyman, cast and crew
2012: Freedom of the City of London
2012: Rowling was among the British cultural icons selected by artist Sir Peter Blake to appear in a new version of his most famous artwork – the Beatles' Sgt. Pepper's Lonely Hearts Club Band album cover – to celebrate the British cultural figures of his life
2017: Member of the Order of the Companions of Honour (CH) at the 2017 Birthday Honours for services to literature and philanthropy
2019: For their first match of March 2019, the women of the United States women's national soccer team each wore a jersey with the name of a woman they were honoring on the back; Rose Lavelle chose the name of Rowling"),
	("Harry Potter and the Cursed Child", "500.00", " Harry Potter and Ginny Potter send their son, Albus Severus Potter, on the Hogwarts Express to begin his first year at Hogwarts", "2016-09-30", "Fantasy", "978-617-585-112-8", "	352", "Joanne", "Rowling", "jkrowling@gmail.com", "54", "1965-07-31", "1997: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Philosopher's Stone
1998: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Chamber of Secrets
1998: British Children's Book of the Year, winner Harry Potter and the Philosopher's Stone
1999: Nestlé Smarties Book Prize, Gold Award for Harry Potter and the Prisoner of Azkaban
1999: National Book Awards Children's Book of the Year, winner Harry Potter and the Chamber of Secrets
1999: Whitbread Children's Book of the Year, winner Harry Potter and the Prisoner of Azkaban
2000: British Book Awards, Author of the Year
2000: Officer of the Order of the British Empire (OBE), for services to Children's Literature
2000: Locus Award, winner Harry Potter and the Prisoner of Azkaban
2001: Hugo Award for Best Novel, winner Harry Potter and the Goblet of Fire
2003: Premio Príncipe de Asturias, Concord
2003: Bram Stoker Award for Best Work for Young Readers, winner Harry Potter and the Order of the Phoenix
2006: British Book of the Year, winner for Harry Potter and the Half Blood Prince
2007: Blue Peter Badge, Gold
2007: Named Barbara Walters' Most Fascinating Person of the year
2008: British Book Awards, Outstanding Achievement
2008: The Edinburgh Award
2010: Hans Christian Andersen Literature Award, inaugural award winner
2011: British Academy Film Awards, Outstanding British Contribution to Cinema for the Harry Potter film series, shared with David Heyman, cast and crew
2012: Freedom of the City of London
2012: Rowling was among the British cultural icons selected by artist Sir Peter Blake to appear in a new version of his most famous artwork – the Beatles' Sgt. Pepper's Lonely Hearts Club Band album cover – to celebrate the British cultural figures of his life
2017: Member of the Order of the Companions of Honour (CH) at the 2017 Birthday Honours for services to literature and philanthropy
2019: For their first match of March 2019, the women of the United States women's national soccer team each wore a jersey with the name of a woman they were honoring on the back; Rose Lavelle chose the name of Rowling"),
    ("Английский для дебилов", "567.52", "Тут і так все зрозуміло", "2016-01-01", "Science and technology", "978-5-17-108292-5", "421", "Max", "English", "unknown", "32", "1987-08-10", null),
    ("Классическая демонология", "666.00", "About demons", "2017-01-28", "Folklore. Myths", "978-5-521-05283-7", "297", "Александр", "Амфитеатров", "unknown", "27", "1992-10-07", null);
    
SELECT * FROM books;
    
UPDATE books SET author_surname = "Capitan" WHERE id IN (1, 3);
    
SELECT COUNT(*) FROM books WHERE author_awards = null; -- Чомусь показує 0, а повинно бути 5 
SELECT COUNT(*) - COUNT(author_awards) FROM books;  -- Невеличкий костиль
    
SELECT * FROM books WHERE pages = (SELECT MIN(pages) FROM books); 
    
SELECT MAX(pages) FROM books; 
    
SELECT SUM(price) FROM books;
    
SELECT AVG(price) FROM books;
    
SELECT category FROM books WHERE pages;
SELECT count(*) FROM books WHERE category = "War and history";
SELECT count(*) FROM books WHERE category = "Science and technology";
SELECT count(*) FROM books WHERE category = "Animation";
SELECT count(*) FROM books WHERE category = "Fairytales";
SELECT count(*) FROM books WHERE category = "Fantasy";
SELECT count(*) FROM books WHERE category = "Folklore. Myths";
    
SELECT MIN(price) FROM books;
    
SELECT * FROM books WHERE price = (SELECT MIN(price) FROM books);

SELECT book_name, round(price, 4), description, date_of_publication, isbn, pages, author_name, author_surname, author_email, author_age, author_date_of_birth, author_awards FROM books  ORDER BY book_name ASC;
    
SELECT * FROM books ORDER BY date_of_publication ASC LIMIT 5, 5;
SELECT * FROM books ORDER BY date_of_publication ASC LIMIT 10, 6;

SELECT * FROM books WHERE book_name LIKE "%oo%";
SELECT * FROM books WHERE book_name LIKE "c%";
SELECT * FROM books WHERE book_name LIKE "%arry Potter and the Philosopher's Stone";

SELECT * FROM books WHERE price BETWEEN 50 and 120;
SELECT * FROM books WHERE price NOT BETWEEN 200 and 600;

SELECT * FROM books WHERE id = 25;
DELETE FROM books where id = 25;

SELECT * FROM books WHERE isbn = '0-545-01022-5';
DELETE FROM books where isbn = '0-545-01022-5';

SET SQL_SAFE_UPDATES = 0;
SELECT * FROM books WHERE book_name = "Английский для дебилов";
DELETE FROM books where book_name = "Английский для дебилов";
SET SQL_SAFE_UPDATES = 1;
    