package com.kodoma.view;


import com.kodoma.controller.Controller;
import com.kodoma.datasource.User;
import com.kodoma.exceptions.WrongPhoneFormat;
import com.kodoma.util.Commands;
import com.kodoma.util.ConsoleHelper;
import com.kodoma.util.Messages;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Кодома on 26.07.2017.
 */
public class View implements Observer {
    private Controller controller;

    protected void validate() throws Exception {
        update(Messages.VALIDATE);
        update(Messages.ENTERUSERNAME);
        String userName = ConsoleHelper.readString();
        update(Messages.ENTERUSERPASSWORD);
        String userPassword = ConsoleHelper.readString();
        controller.validate(userName, userPassword);
    }

    public void select() {
        try {
            validate();

            while (true) {
            ConsoleHelper.initMenu();
            update("Выберите команду:");

                int command = ConsoleHelper.readInt();
                if (command == 0) break;

                switch (Commands.values()[command - 1]) {
                    case ADDUSER: {
                        update(Messages.CREATEUSER);
                        update(Messages.ENTERFIRSTNAME);
                        String firstName = ConsoleHelper.readString();
                        update(Messages.ENTERLASTTNAME);
                        String lastName = ConsoleHelper.readString();
                        update(Messages.ENTERADDRESS);
                        String address = ConsoleHelper.readString();
                        update(Messages.ENTERPHONENUMBER);

                        boolean wrongPhone = true;
                        int phoneNumber = 0;

                        while (wrongPhone) {
                            try {
                                phoneNumber = ConsoleHelper.readPhoneNumber();
                            } catch (WrongPhoneFormat e) {
                                update(e.getMessage());
                                continue;
                            }
                            wrongPhone = false;
                        }

                        User user = new User(0, firstName, lastName, address, phoneNumber, null);
                        controller.add(user);
                        break;
                    }
                    case EDITUSER: {
                        update(Messages.EDITCONTACT);
                        update(Messages.ENTERID);
                        int id = ConsoleHelper.readInt();
                        update(Messages.ENTERFIRSTNAME);
                        String fname = ConsoleHelper.readString();
                        update(Messages.ENTERLASTTNAME);
                        String lname = ConsoleHelper.readString();
                        update(Messages.ENTERADDRESS);
                        String address = ConsoleHelper.readString();
                        update(Messages.ENTERPHONENUMBER);

                        boolean wrongPhone = true;
                        int phoneNumber = 0;

                        while (wrongPhone) {
                            try {
                                phoneNumber = ConsoleHelper.readPhoneNumber();
                            } catch (WrongPhoneFormat e) {
                                ConsoleHelper.writeMessage(e.getMessage());
                                continue;
                            }
                            wrongPhone = false;
                        }

                        User user = new User(id, fname, lname, address, phoneNumber, null);
                        controller.editContact(user);
                        break;
                    }
                    case REMOVEUSER: {
                        update(Messages.REMOVECONTACT);
                        update(Messages.ENTERID);
                        int id = ConsoleHelper.readInt();

                        User user = new User();
                        user.setId(id);
                        controller.removeContact(user);
                        break;
                    }
                    case LABELUSER: {
                        update(Messages.LABELCONTACT);
                        update(Messages.ENTERID);
                        int id = ConsoleHelper.readInt();
                        update(Messages.ENTERGROUP);
                        String name = ConsoleHelper.readString();

                        User user = new User();
                        user.setId(id);
                        user.setGroupName(name);

                        controller.label(user);
                        break;
                    }
                    case SHOWUSERBYID: {
                        update(Messages.SHOWCONTACTBYID);
                        update(Messages.ENTERID);
                        int id = ConsoleHelper.readInt();

                        User user = new User();
                        user.setId(id);
                        controller.showContactByID(user);
                        break;
                    }
                    case SHOWUSERBYNAME: {
                        update(Messages.SHOWCONTACTBYNAME);
                        update(Messages.ENTERFIRSTNAME);
                        String name = ConsoleHelper.readString();

                        User user = new User();
                        user.setFname(name);
                        controller.showContactByName(user);
                        break;
                    }
                    case SHOWUSERS: {
                        update(Messages.SHOWALLCONTACTS);
                        controller.showAllContacts();
                        break;
                    }

                    case DELETELABEL: {
                        update(Messages.DELETELABELCONTACT);
                        update(Messages.ENTERID);
                        int id = ConsoleHelper.readInt();

                        User user = new User();
                        user.setId(id);
                        controller.deleteLabel(user);
                        break;
                    }
                    case EDITGROUP: {
                        update(Messages.EDITGROUPCONTACT);
                        update(Messages.ENTERGROUP);
                        String name = ConsoleHelper.readString();
                        update(Messages.ENTERNEWGROUP);
                        String newName = ConsoleHelper.readString();

                        controller.editGroup(name, newName);
                        break;
                    }
                    case REMOVEGROUP: {
                        update(Messages.REMOVEGROUPCONTACT);
                        update(Messages.ENTERGROUP);
                        String name = ConsoleHelper.readString();

                        controller.removeGroup(name);
                        break;
                    }
                    case SHOWUSERSOFGROUP: {
                        update(Messages.SHOWUSERSGROUP);
                        update(Messages.ENTERGROUP);
                        String name = ConsoleHelper.readString();

                        controller.showContactsOfGroup(name);
                        break;
                    }
                    case SHOWGROUPS: {
                        update("Просмотр всех групп...");
                        controller.showAllGroupsNames();
                        break;
                    }
                }
            }
        } catch (Exception e) {
            update(e.getMessage());
        }
    }

    public void update(String info) {
        ConsoleHelper.writeMessage(info);
    }

    @Override
    public void update(Observable o, Object arg) {
        String message = (String)arg;
        update(message);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
