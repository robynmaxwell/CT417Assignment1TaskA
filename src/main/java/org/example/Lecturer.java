package org.example;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Lecturer {

    public String lectName;
    public int lectAge;
    public DateTime lectDOB;
    public int lectID;
    public String lectUsername;
    public ArrayList<Modules> moduleList;


    public Lecturer(String lectName, int lectAge, int lectID, DateTime lectDOB) {
        this.lectName= lectName;
        this.lectAge=lectAge;
        this.lectID=lectID;
        this.lectDOB=lectDOB;
        this.lectUsername= lectName.concat(Integer.toString(lectAge));
    }


    public String getLectName() {
        return lectName;
    }


    public void setLectName(String lectName) {
        this.lectName = lectName;
    }


    public int getLectAge() {
        return lectAge;
    }


    public void setLectAge(int lectAge) {
        this.lectAge = lectAge;
    }


    public DateTime getLectDOB() {
        return lectDOB;
    }


    public void setLectDOB(DateTime lectDOB) {
        this.lectDOB = lectDOB;
    }


    public int getLectID() {
        return lectID;
    }


    public void setLectID(int lectID) {
        this.lectID = lectID;
    }


    public String getLectUsername() {
        return lectUsername;
    }


    public void setLectUsername(String lectName, int lectAge) {
        String age= Integer.toString(lectAge);
        this.lectUsername = lectName.concat(age);
    }


    public ArrayList<Modules> getModuleList() {
        return moduleList;
    }


    public void setModuleList(ArrayList<Modules> moduleList) {
        this.moduleList = moduleList;
    }




}
