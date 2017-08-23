/**
Удаление контакта
 */
DELIMITER /
DROP PROCEDURE IF EXISTS removeContact /
CREATE PROCEDURE removeContact(IN contactId INT, IN userId INT)
  BEGIN
    DELETE FROM contacts
      WHERE id = contactId AND user_id = userId;
  END;
/
DELIMITER ;
