package org.example;


import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModuleTest {

    Module module1;
    Lecturer l1;
    ArrayList<Student> sList;

    @BeforeEach
    void setUp() {
        module1= new Module("Software Engineering", "CT417", null, null);
    }

    @Test
    @DisplayName("Test module name getter and setter")
    void testModuleNameGettersAndSetters(){
        module1.setModName("Embedded Systems Application Programming");
        assertEquals("Embedded Systems Application Programming", module1.getModName());
    }

    @Test
    @DisplayName("Test module ID getter and setter")
    void testModuleIDGettersAndSetters(){
        module1.setModID("EE123");
        assertEquals("EE123", module1.getModID());
    }

    @Test
    @DisplayName("Test module list of students getter and setter")
    void testModuleStudentListGettersAndSetters(){
        module1.setStudentList(sList);
        assertEquals(sList, module1.getStudentList());
    }

    @Test
    @DisplayName("Test module lecturer getter and setter")
    void testModuleLecturerListGettersAndSetters(){
        module1.setLecturer(l1);
        assertEquals(l1, module1.getLecturer());
    }


}
