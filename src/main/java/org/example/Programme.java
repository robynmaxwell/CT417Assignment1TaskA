package org.example;
import java.util.ArrayList;

import org.joda.time.DateTime;

public class Programme {

    public String courseName;
    public ArrayList<Student> studentList;

    public ArrayList<Module> moduleList;
    public DateTime startDate;
    public DateTime endDate;

    public Programme(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
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
    public ArrayList<Module> getModuleList() {
        return moduleList;
    }
    public void setModuleList(ArrayList<Module> moduleList) {
        this.moduleList = moduleList;
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
