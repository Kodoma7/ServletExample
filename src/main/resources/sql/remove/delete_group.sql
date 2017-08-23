/**
Удаление группы
 */
/**
Удаление группы у контакта
 */
DELIMITER /
DROP PROCEDURE IF EXISTS deleteGroup /
CREATE PROCEDURE deleteGroup(IN nameGroup VARCHAR(20))
  BEGIN
    DELETE FROM contact_book.groups
    WHERE group_name = nameGroup;
  END;
/
DELIMITER ;

CALL deleteGroup('C')