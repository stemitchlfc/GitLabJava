package com.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void string_reversed(){
        String expected = "gnirtS desreveR";
        String actual = ReverseString.reverse("Reversed String");

        assertEquals(expected, actual);
    }

    @Test
    void single_character_string(){
        String expected = "String too short";
        String actual = ReverseString.reverse("E");

        assertEquals(expected, actual);
    }

    @Test
    void empty_character_string(){
        String expected = "String too short";
        String actual = ReverseString.reverse("");

        assertEquals(expected, actual);
    }

}