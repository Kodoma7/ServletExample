/**
Удаление группы у контакта
 */
DELIMITER /
DROP PROCEDURE IF EXISTS deleteLabel /
CREATE PROCEDURE deleteLabel(IN idContact INT, IN userId INT)
  BEGIN
    UPDATE contact_book.contacts
    SET group_id = NULL
    WHERE id = idContact AND user_id = userId;
  END;
/
DELIMITER ;

