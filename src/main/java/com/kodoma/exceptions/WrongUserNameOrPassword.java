package com.kodoma.exceptions;

/**
 * Created by Кодома on 20.08.2017.
 */
public class WrongUserNameOrPassword extends Exception {
    @Override
    public String getMessage() {
        return "-неверное имя пользователя или пароль-\n";
    }
}
