/**
Найти контакт по имени(first name)
 */
DELIMITER /
DROP PROCEDURE IF EXISTS showContactByName /
CREATE PROCEDURE showContactByName(IN contactName VARCHAR(20), IN userId INT)
  BEGIN
    SELECT id, first_name, last_name, address, phone_number, group_name
    FROM contact_book.contacts AS c
      LEFT JOIN contact_book.groups AS g
        ON c.group_id = g.group_id
    WHERE c.first_name = contactName AND c.user_id = userId;
  END;
/
DELIMITER ;


