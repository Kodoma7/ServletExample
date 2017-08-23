package com.kodoma.dao;



import com.kodoma.datasource.User;

import java.sql.SQLException;
import java.util.Observer;

/**
 * Created by Кодома on 26.07.2017.
 */
public interface DAO<T> {
    void setObserver(Observer o);
    void validate(String userName, String userPassword) throws Exception;
    void add(T obj) throws Exception;
    void label(T obj) throws Exception;
    void editContact(T obj) throws Exception;
    void removeContact(T obj) throws Exception;
    void showContactByID(T obj) throws Exception;
    void showAllContacts() throws Exception;
    void showContactByName(T obj) throws Exception;
    void showContactsOfGroup(String groupName) throws Exception;
    void showAllGroupsNames() throws Exception;
    void deleteLabel(User user) throws Exception;
    void editGroup(String name, String newName) throws SQLException;
    void removeGroup(String name) throws Exception;
}