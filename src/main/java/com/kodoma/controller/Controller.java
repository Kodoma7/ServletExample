package com.kodoma.controller;


import com.kodoma.datasource.User;
import com.kodoma.services.Service;
import com.kodoma.services.UserService;

import java.util.Observer;

/**
 * Created by Кодома on 26.07.2017.
 */
public class Controller {
    private Service service = UserService.getInstance();

    public void validate(String userName, String userPassword) throws Exception {
        service.validate(userName, userPassword);
    }

    public void add(User user) throws Exception {
        service.add(user);
    }

    public void label(User user) throws Exception {
        service.label(user);
    }

    public void editContact(User user) throws Exception {
        service.editContact(user);
    }

    public void removeContact(User user) throws Exception {
        service.removeContact(user);
    }

    public void showContactByID(User user) throws Exception {
        service.showContactByID(user);
    }

    public void showAllContacts() throws Exception {
        service.showAllContacts();
    }

    public void showContactByName(User user) throws Exception {
        service.showContactByName(user);
    }

    public void showContactsOfGroup(String groupName) throws Exception {
        service.showContactsOfGroup(groupName);
    }

    public void showAllGroupsNames() throws Exception {
        service.showAllGroupsNames();
    }

    public void deleteLabel(User user) throws Exception {
        service.deleteLabel(user);
    }

    public void editGroup(String name, String newName) throws Exception {
        service.editGroup(name, newName);
    }

    public void removeGroup(String name) throws Exception {
        service.removeGroup(name);
    }

    public void setObserver(Observer o) {
        service.setObserver(o);
    }

}
