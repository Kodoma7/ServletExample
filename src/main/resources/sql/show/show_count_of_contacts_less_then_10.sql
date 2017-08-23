/**
Покать пользователей, у которых количество контактов меньше 10
 */
DELIMITER /
DROP PROCEDURE IF EXISTS showUsersWhichContactsLessThen10 /
CREATE PROCEDURE showUsersWhichContactsLessThen10()
  BEGIN
    SELECT u.* FROM contact_book.users u
      LEFT JOIN contact_book.contacts c
        ON u.user_id = c.user_id
    GROUP BY u.user_id
    HAVING COUNT(u.user_id) < 10;
  END;
/
DELIMITER ;

CALL showUsersWhichContactsLessThen10()
