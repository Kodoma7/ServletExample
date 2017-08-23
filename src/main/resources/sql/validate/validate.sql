/**
Добавление нового контакта
 */
DELIMITER /
DROP FUNCTION IF EXISTS validate /
CREATE FUNCTION validate(userName VARCHAR(20), userPassword VARCHAR(400))
  RETURNS INT
  BEGIN
    DECLARE result INT DEFAULT 0;
    SELECT user_id INTO result FROM users u
      WHERE u.name = userName AND u.password = userPassword;
    RETURN result;
  END;
/
DELIMITER ;