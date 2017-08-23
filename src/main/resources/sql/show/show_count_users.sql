/**
Показать количество пользователей
 */
DELIMITER /
DROP PROCEDURE IF EXISTS showCountUsers /
CREATE PROCEDURE showCountUsers()
  BEGIN
    SELECT COUNT(user_id) FROM contact_book.users;
  END;
/
DELIMITER ;

CALL showCountUsers();



