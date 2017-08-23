package com.kodoma.services;

import com.kodoma.dao.DAO;
import com.kodoma.dao.FactoryDAO;
import com.kodoma.datasource.User;

import java.util.Observer;

/**
 * Created by Кодома on 26.07.2017.
 */
public class UserService implements Service<User> {
    private DAO contactDAO = FactoryDAO.getDAO(User.class);
    public static UserService instance;

    private UserService() {
    }

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    @Override
    public void setObserver(Observer o) {
        contactDAO.setObserver(o);
    }

    @Override
    public void validate(String userName, String userPassword) throws Exception {
        contactDAO.validate(userName, userPassword);
    }

    public void add(User user) throws Exception {
        contactDAO.add(user);
    }

    public void label(User user) throws Exception {
        contactDAO.label(user);
    }

    @Override
    public void editContact(User obj) throws Exception {
        contactDAO.editContact(obj);
    }

    @Override
    public void removeContact(User obj) throws Exception {
        contactDAO.removeContact(obj);
    }

    @Override
    public void showContactByID(User user) throws Exception {
        contactDAO.showContactByID(user);
    }

    @Override
    public void showAllContacts() throws Exception {
        contactDAO.showAllContacts();
    }

    @Override
    public void showContactByName(User user) throws Exception {
        contactDAO.showContactByName(user);
    }

    @Override
    public void showContactsOfGroup(String groupName) throws Exception {
        contactDAO.showContactsOfGroup(groupName);
    }

    @Override
    public void showAllGroupsNames() throws Exception {
        contactDAO.showAllGroupsNames();
    }

    @Override
    public void deleteLabel(User user) throws Exception {
        contactDAO.deleteLabel(user);
    }

    @Override
    public void editGroup(String name, String newName) throws Exception {
        contactDAO.editGroup(name, newName);
    }

    @Override
    public void removeGroup(String name) throws Exception {
        contactDAO.removeGroup(name);
    }

}
