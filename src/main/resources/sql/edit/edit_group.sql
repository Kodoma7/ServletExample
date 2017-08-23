/**
Редактирование группы
 */
DELIMITER /
DROP PROCEDURE IF EXISTS editGroup /
CREATE PROCEDURE editGroup(IN groupName VARCHAR(20), IN newGroupName VARCHAR(20))
  BEGIN
    UPDATE contact_book.groups g
    SET group_name = newGroupName
    WHERE group_name = groupName;
  END;
/
DELIMITER ;

CALL editGroup('A', 'H')

