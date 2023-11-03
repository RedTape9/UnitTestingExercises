package org.example;

public class IsogramCheckerV2 {
    public static boolean isIsogram(String str) {
        // str.chars().forEach(ch -> System.out.println(ch));
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
    public static void main(String[] args) {

        System.out.println(isIsogram("moOse")); // false

    }
}
