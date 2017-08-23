/**
Показать все группы
 */
DELIMITER /
DROP PROCEDURE IF EXISTS showAllGroupsNames /
CREATE PROCEDURE showAllGroupsNames(IN userId INT)
  BEGIN
    SELECT DISTINCT group_name FROM contact_book.groups g
      LEFT JOIN contacts c
      ON c.group_id = g.group_id
    WHERE c.user_id = userId;
  END;
/
DELIMITER ;

CALL showAllGroupsNames(1)
