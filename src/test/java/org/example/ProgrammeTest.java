package org.example;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgrammeTest {
    Programme course;
    Student s1;
    Student s2;
    Modules m2;
    Modules m1;
    ArrayList<Student> studentList;
    ArrayList<Modules> modList;

    @BeforeEach
    void setUp() {
        course =  new Programme("ECE", null, null);
    }

    @Test
    @DisplayName("Test getters and setters for course name")
    void testCourseNameGetterAndSetter() {
        course.setCourseName("Electronic and Computer Engineering");
        assertEquals("Electronic and Computer Engineering", course.getCourseName());
    }

    @Test
    @DisplayName("Test getters and setters for student list")
    void testStudentListGetterAndSetter() {
        s1= new Student("Robyn", 0, 0, null);
        s2= new Student("Roisin", 0, 0, null);

        studentList= new ArrayList<Student>();


        studentList.add(s1);
        studentList.add(s2);

        course.setStudentList(studentList);
        assertEquals(studentList, course.getStudentList());
    }
    @Test
    @DisplayName("Test getters and setters for student list")
    void testModuleListGetterAndSetter() {
        m1= new Modules("Software engineering","CT417" );
        m2= new Modules("Object Oriented Programming", "CT222");

        modList= new ArrayList<Modules>();


        modList.add(m1);
        modList.add(m2);

        course.setModuleList(modList);
        assertEquals(modList, course.getModuleList());
    }

    @Test
    @DisplayName("Test getters and setters for start date")
    void testCourseStartDateGetterAndSetter() {
        course.setStartDate(DateTime.parse("05-09-22"));
        assertEquals(DateTime.parse("05-09-22"), course.getStartDate());
    }

    @Test
    @DisplayName("Test getters and setters for end date")
    void testCourseEndDateGetterAndSetter() {
        course.setEndDate(DateTime.parse("05-05-23"));
        assertEquals(DateTime.parse("05-05-23"), course.getEndDate());
    }
}
