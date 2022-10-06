package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class StudentTest {
    Student student1;

    @BeforeEach
    void setUp() {
        student1 = new Student("Robyn", 22, 1,  DateTime.parse("2000-06-01T00:00:00.000Z"));

    }

    @Test
    @Order(1)
    @DisplayName("Check correct username is generated")
    void testUsernameGeneration() {
        assertEquals("Robyn22", student1.getsUsername());
    }

    @Test
    @Order(2)
    @DisplayName("Test getters and setters for student name")
    void testStudentNameGettersAndSetters() {
        student1.setsName("Niamh");
        assertEquals("Niamh", student1.getsName());
    }
}