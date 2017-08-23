/**
Найти среднее количество контактов для каждого пользователя
 */
DELIMITER /
DROP PROCEDURE IF EXISTS showAvgOfContacts /
CREATE PROCEDURE showAvgOfContacts()
  BEGIN
    SELECT u.user_id, AVG(c.id) FROM contact_book.users u
      LEFT JOIN contact_book.contacts c
        ON u.user_id = c.user_id
    GROUP BY u.user_id;
  END;
/
DELIMITER ;

CALL showAvgOfContacts()

/*DELIMITER /
DROP FUNCTION IF EXISTS showAvgOfContacts;
CREATE FUNCTION showAvgOfContacts() RETURNS INTEGER
   BEGIN
   DECLARE
   i INTEGER;
     SELECT avg(contact_book.contacts.user_id) FROM (SELECT * FROM contact_book.users GROUP BY user_id) AS t INTO i;
     RETURN i;
   END;
DELIMITER ;

SELECT showAvgOfContacts();*/




