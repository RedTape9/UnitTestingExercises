package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsogramCheckerTest {
        @Test
        void TestIsogramChecker() {
            assertEquals(true, IsogramChecker.isIsogram("Dermatoglyphics"));
            assertEquals(true, IsogramChecker.isIsogram("isogram"));
            assertEquals(false, IsogramChecker.isIsogram("moose"));
            assertEquals(false, IsogramChecker.isIsogram("isIsogram"));
            assertEquals(false, IsogramChecker.isIsogram("aba"));
            //assertEquals(false, IsogramChecker.isIsogram("moOse"));
            assertEquals(true, IsogramChecker.isIsogram("thumbscrewjapingly"));
            assertEquals(true, IsogramChecker.isIsogram(""));
        }
    }
