/**
Показать все контакты
 */
USE contact_book;
DELIMITER /
DROP PROCEDURE IF EXISTS showAllContacts /
CREATE PROCEDURE showAllContacts(IN userId INT)
  BEGIN
    SELECT c.id, first_name, last_name, address, phone_number, group_name FROM contact_book.contacts AS c
      LEFT JOIN contact_book.groups AS g
        ON c.group_id = g.group_id
    WHERE user_id = userId;
  END;
/
DELIMITER ;
