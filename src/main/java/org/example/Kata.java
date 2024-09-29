package org.example;

public class Kata {
    public static String rps(String p1, String p2) {

        if (p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 wins!";
        }
        return p1;
    }
}
