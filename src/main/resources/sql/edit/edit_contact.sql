/**
Редактирование контакта
 */
DELIMITER /
DROP PROCEDURE IF EXISTS editContact /
CREATE PROCEDURE editContact(IN idContact INT, IN firstName VARCHAR(20), IN lastName VARCHAR(20),
  IN address VARCHAR(30), IN phoneNumber INT, IN groupId INT, IN userId INT)
  BEGIN
    UPDATE contact_book.contacts c
    SET
      first_name = firstName,
      last_name = lastName,
      address = address,
      phone_number = phoneNumber,
      group_id = groupId,
      user_id = userId
    WHERE c.id = idContact;
  END;
/
DELIMITER ;

#CALL editContact(1, 'Mort', 'Doloev', 'Julina, 43', 2457746, 2, 2);


