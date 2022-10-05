package org.example;
import java.util.ArrayList;

import org.joda.time.DateTime;

public class Programme {

    public String courseName;
    public ArrayList<Student> studentList;
    public DateTime startDate;
    public DateTime endDate;

    public Programme(String courseName, ArrayList<Student> studentList, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.studentList = studentList;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    public DateTime getStartDate() {
        return startDate;
    }
    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }
    public DateTime getEndDate() {
        return endDate;
    }
    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }


}
