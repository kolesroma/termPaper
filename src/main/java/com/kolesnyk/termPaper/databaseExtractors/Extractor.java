package com.kolesnyk.termPaper.databaseExtractors;

import com.kolesnyk.termPaper.containers.ApplicationContainer;

public class Extractor {
    public static String getName(String login) {
        if (!ApplicationContainer.getPetitions().containsKey(login))
            return "";
        return ApplicationContainer.getPetitions().get(login)[0];
    }

    public static String getDescription(String login) {
        if (!ApplicationContainer.getPetitions().containsKey(login))
            return "";
        return ApplicationContainer.getPetitions().get(login)[1];
    }

    public static String getVoices(String login) {
        if (!ApplicationContainer.getPetitions().containsKey(login))
            return "";
        return ApplicationContainer.getPetitions().get(login)[2];
    }
}
