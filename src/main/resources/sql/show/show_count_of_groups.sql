/**
Показать количество групп у каждого пользователя
 */
DELIMITER /
DROP PROCEDURE IF EXISTS showCountOfGroupsFromUsers /
CREATE PROCEDURE showCountOfGroupsFromUsers()
  BEGIN
    SELECT group_id, user_id AS t FROM contact_book.contacts GROUP BY user_id ;
    #SELECT COUNT(t) FROM (SELECT DISTINCT COUNT(group_id) AS t FROM contact_book.contacts GROUP BY user_id) AS a;
  END;
/
DELIMITER ;

CALL showCountOfGroupsFromUsers()

/*DELIMITER /
DROP PROCEDURE IF EXISTS showCountOfGroupsFromUsers /
CREATE PROCEDURE showCountOfGroupsFromUsers()
  BEGIN
    SELECT DISTINCT u.user_id, COUNT(c.group_id) 'count of groups' FROM contact_book.users u
      LEFT JOIN contact_book.contacts c
        ON u.user_id = c.user_id
      LEFT JOIN contact_book.groups g
        ON c.group_id = g.group_id
    GROUP BY u.user_id;
  END;
/
DELIMITER ;

CALL showCountOfGroupsFromUsers()*/

