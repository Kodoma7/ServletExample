/**
Показать количество контаков каждого пользователя
 */
DELIMITER /
DROP PROCEDURE IF EXISTS showCountContactsOfUsers /
CREATE PROCEDURE showCountContactsOfUsers()
  BEGIN
    SELECT u.user_id, COUNT(c.id) FROM contact_book.users u
      LEFT JOIN contact_book.contacts c
        ON u.user_id = c.user_id
    GROUP BY u.user_id;
  END;
/
DELIMITER ;

CALL showCountContactsOfUsers();




