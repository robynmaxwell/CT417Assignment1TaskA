package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class LecturerTest {

    Lecturer lecturer1;


    @BeforeEach
    void setUp() {
        lecturer1 = new Lecturer("Ronan", 54, 1, null, null);

    }

    @Test
    @Order(1)
    @DisplayName("Check correct username is generated")
    void testUsernameGeneration() {
        assertEquals("Ronan54", lecturer1.getLectUsername());
    }

    @Test
    @Order(2)
    @DisplayName("Test getters and setters for lecturer name")
    void testlecturerNameGettersAndSetters() {
        lecturer1.setLectName("Patrick");
        assertEquals("Patrick", lecturer1.getLectName());
    }

    @Test
    @Order(3)
    @DisplayName("Test getters and setters for lecturer ID")
    void testLecturerIDGettersAndSetters() {
        lecturer1.setLectID(2);
        assertEquals(2, lecturer1.getLectID());
    }

    @Test
    @DisplayName("Test getters and setters for lecturer DOB")
    void testLecturerDOBGettersAndSetters() {
        lecturer1.setLectDOB(new DateTime("26-08-22"));
        assertEquals(DateTime.parse("26-08-22"), lecturer1.getLectDOB());
    }

    @Test
    @DisplayName("Test getters and setters for lecturer modules")
    void testLecturerModulesGettersAndSetters() {
        Modules mod1 = new Modules("Fluid Mechanics", "1");
        Modules mod2 = new Modules("Thermodynamics", "2");

        ArrayList<Modules> testModules= new ArrayList<>();
        testModules.add(mod1);
        testModules.add(mod2);

        lecturer1.setModuleList(testModules);
        assertEquals(testModules, lecturer1.getModuleList());

    }



}
