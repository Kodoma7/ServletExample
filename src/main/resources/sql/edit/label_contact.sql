/**
Добавление контакта в группу
 */
DELIMITER /
DROP PROCEDURE IF EXISTS labelContact /
CREATE PROCEDURE labelContact(IN idContact INT, IN nameGroup VARCHAR(45), IN userId INT)
  BEGIN
    UPDATE contact_book.contacts
    SET group_id = (SELECT group_id FROM contact_book.groups WHERE group_name = nameGroup)
    WHERE id = idContact AND user_id = userId;
  END;
/
DELIMITER ;


