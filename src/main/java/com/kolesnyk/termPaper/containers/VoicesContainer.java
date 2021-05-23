package com.kolesnyk.termPaper.containers;

import java.util.HashMap;
import java.util.HashSet;

public class VoicesContainer {
        static HashMap<String, HashSet<String>> voters = new HashMap<>();

    public static void setVoters(HashMap<String, HashSet<String>> voters) {
        VoicesContainer.voters = voters;
    }

    public static HashMap<String, HashSet<String>> getVoters() {
        return voters;
    }

    public static void addVoterPetition(String petitionLogin, String votedUserLogin) {
        voters.get(petitionLogin).add(votedUserLogin);
    }
}
