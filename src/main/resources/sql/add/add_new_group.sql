/**
Добавление новой группы
 */
DELIMITER /
DROP PROCEDURE IF EXISTS addNewGroup /
CREATE PROCEDURE addNewGroup(IN groupName VARCHAR(20))
  BEGIN
    INSERT INTO contact_book.groups
    VALUES (NULL, groupName);
  END;
/
DELIMITER ;

CALL addNewGroup('D')

