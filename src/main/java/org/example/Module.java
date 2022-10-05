package org.example;
import java.util.ArrayList;

public class Module {

    public String modName;
    public String modID;
    public ArrayList<Student> studentList;
    public Lecturer lecturer;

    public Module(String modName, String modID, ArrayList<Student> studentList, Lecturer lecturer) {
        this.lecturer=lecturer;
        this.modID=modID;
        this.modName=modName;
        this.studentList=studentList;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public String getModID() {
        return modID;
    }

    public void setModID(String modID) {
        this.modID = modID;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }



}
