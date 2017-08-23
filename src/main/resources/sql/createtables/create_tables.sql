/**
Создание таблиц
 */
START TRANSACTION;

DROP TABLE IF EXISTS contact_book.contacts;
DROP TABLE IF EXISTS contact_book.users;
DROP TABLE IF EXISTS contact_book.groups;

/**
Создание таблицы users
 */
CREATE TABLE contact_book.users (
  user_id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  password VARCHAR(400),
  PRIMARY KEY (user_id));

/**
Создание таблицы groups
 */
CREATE TABLE contact_book.groups (
  group_id INT NOT NULL AUTO_INCREMENT,
  group_name VARCHAR(20),
  PRIMARY KEY (group_id));

/**
Создание таблицы contacts
 */
CREATE TABLE contact_book.contacts (
  id INT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(20),
  last_name VARCHAR(20),
  address VARCHAR(30),
  phone_number INT(20),
  group_id INT,
  user_id INT,
  PRIMARY KEY (id),
  FOREIGN KEY (group_id) REFERENCES contact_book.groups (group_id),
  FOREIGN KEY (user_id) REFERENCES contact_book.users (user_id));

COMMIT;
# ROLLBACK