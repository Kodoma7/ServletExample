/**
Показать контакты определенной группы
 */
DELIMITER /
DROP PROCEDURE IF EXISTS showContactsOfGroup /
CREATE PROCEDURE showContactsOfGroup(IN groupName VARCHAR(20), IN userId INT)
  BEGIN
    SELECT id, first_name, last_name, address, phone_number, group_name
    FROM contact_book.contacts AS c
      LEFT JOIN contact_book.groups AS g
        ON c.group_id = g.group_id
    WHERE g.group_name = groupName AND c.user_id = userId;
  END;
/
DELIMITER ;

CALL showContactsOfGroup('A', 1);