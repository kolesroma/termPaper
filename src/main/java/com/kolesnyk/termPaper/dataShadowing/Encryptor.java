package com.kolesnyk.termPaper.dataShadowing;

public class Encryptor {
    public static String hidePassword(String password) {
        StringBuilder sb = new StringBuilder();
        int n = password.length();
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }
        return sb.toString();
    }
}
