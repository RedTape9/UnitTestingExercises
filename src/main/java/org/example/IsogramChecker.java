package org.example;

import java.util.Set;
import java.util.HashSet;

public class IsogramChecker {
    public static boolean isIsogram(String str) {
        char[] charArray = str.toCharArray();
        Set<Character> seenChars = new HashSet<>();
        for (char c : charArray) {
            if (seenChars.contains(c)) return false;
            else seenChars.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("isogram"));
        System.out.println(isIsogram("moose"));
        System.out.println(isIsogram("isIsogram"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("moOse"));
        System.out.println(isIsogram("thumbscrewjapingly"));
        System.out.println(isIsogram(""));

    }
}
