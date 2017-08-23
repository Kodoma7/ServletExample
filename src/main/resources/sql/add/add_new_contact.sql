/**
Добавление нового контакта
 */
USE contact_book;
DELIMITER /
DROP PROCEDURE IF EXISTS addNewContact /
CREATE PROCEDURE addNewContact(IN firstName VARCHAR(20), IN lastName VARCHAR(20),
IN address VARCHAR(30), IN phoneNumber INT, IN groupId INT, IN userId INT)
  BEGIN
    INSERT INTO contact_book.contacts
    VALUES (NULL, firstName, lastName, address, phoneNumber, groupId, userId);
  END;
/
DELIMITER ;