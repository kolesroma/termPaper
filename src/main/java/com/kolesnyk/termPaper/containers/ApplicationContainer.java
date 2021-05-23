package com.kolesnyk.termPaper.containers;

import java.util.HashMap;

public class ApplicationContainer {
    static HashMap<String, String[]> users = new HashMap<>();

    static HashMap<String, String[]> petitions = new HashMap<>();

    public static HashMap<String, String[]> getPetitions() {
        return petitions;
    }

    public static void addPetition(String login, String[] sar) {
        petitions.put(login, sar);
    }

    public static HashMap<String, String[]> getUsers() {
        return users;
    }

    public static void addUser(String login, String[] sar) {
        users.put(login, sar);
    }
}
