package com.kodoma.dao;

import com.kodoma.datasource.User;

/**
 * Created by Кодома on 26.07.2017.
 */
public class FactoryDAO {
    public static FactoryDAO instance;

    private FactoryDAO() {
    }

    public static FactoryDAO getInstance() {
        if (instance == null) {
            instance = new FactoryDAO();
        }
        return instance;
    }

    public static DAO getDAO(Object obj) {
        DAO dao = null;
        if (obj.equals(User.class)) dao = ContactDAO.getInstance();
        return dao;
    }
}
