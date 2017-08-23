package com.kodoma.datasource;

import java.util.HashMap;
import java.util.Map;

public class UsersList {
    private static Map<Integer, User> map = new HashMap<>();

    public Map<Integer, User> getMap() {
        return map;
    }

    public void setMap(Map<Integer, User> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (User user : map.values()) {
            result.append(user);
        }
        return result.toString();
    }
}
