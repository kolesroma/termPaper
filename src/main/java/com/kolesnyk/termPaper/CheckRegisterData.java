package com.kolesnyk.termPaper;

import java.util.HashMap;

public class CheckRegisterData {
    boolean hasEmptyField(String... strings) {
        for (String string : strings) {
            if ("".equals(string))
                return true;
        }
        return false;
    }

    boolean isLoginUniqKey(HashMap<String, String[]> users, String login) {
        return !users.containsKey(login);
    }
}
