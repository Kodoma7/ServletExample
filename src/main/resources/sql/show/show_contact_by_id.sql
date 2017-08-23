/**
Найти контакт по его ид
 */
DELIMITER /
DROP PROCEDURE IF EXISTS showContactByID /
CREATE PROCEDURE showContactByID(IN contactID INT, IN userId INT)
  BEGIN
    SELECT id, first_name, last_name, address, phone_number, group_name
    FROM contact_book.contacts AS c
      LEFT JOIN contact_book.groups AS g
        ON c.group_id = g.group_id
    WHERE c.id = contactID AND user_id = userId;
  END;
/
DELIMITER ;

CALL showContactByID(3, 1)


