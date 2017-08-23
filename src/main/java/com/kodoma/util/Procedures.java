package com.kodoma.util;

public class Procedures {
    public static final String VALIDATE = "SELECT validate(?, ?)";
    public static final String ADD_NEW_CONTACT = "SELECT addNewContact(?, ?, ?, ?, ?, ?)";
    public static final String EDIT_CONTACT = "SELECT labelContact(?, ?, ?)";
    public static final String LABEL_CONTACT = "CALL labelContact(?, ?, ?)";
    public static final String REMOVE_CONTACT = "CALL removeContact(?, ?)";
    public static final String SHOW_CONTACT_BY_ID = "CALL showContactByID(?, ?)";
    public static final String SHOW_ALL_CONTACTS = "CALL showAllContacts(?)";
    public static final String SHOW_CONTACT_BY_NAME = "CALL showContactByName(?, ?)";
    public static final String SHOW_CONTACTS_OF_GROUP = "CALL showContactsOfGroup(?, ?)";
    public static final String SHOW_ALL_GROUPS_NAMES = "CALL showAllGroupsNames(?)";
    public static final String DELETE_LABEL = "CALL deleteLabel(?, ?)";
    public static final String EDIT_GROUP = "CALL editGroup(?, ?)";
    public static final String REMOVE_GROUP = "CALL deleteGroup(?)";
}
