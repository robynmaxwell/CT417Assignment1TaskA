package org.example;

import java.util.ArrayList;
import java.util.Date;

import org.joda.time.DateTime;

public class Student {

    public String sName;
    public int sAge;
    public DateTime sDOB;
    public int sID;
    public String sUsername;
    public ArrayList<Modules> sModuleList;
    public Programme sCourses;


    public Student(String sName, int sAge, int sID, DateTime sDOB) {
        this.sName= sName;
        this.sID=sID;
        this.sAge=sAge;
        this.sDOB=sDOB;
        this.sUsername= sName.concat(Integer.toString(sAge));
    }


    public String getsName() {
        return sName;
    }


    public void setsName(String sName) {
        this.sName = sName;
    }


    public int getsAge() {
        return sAge;
    }


    public void setsAge(int sAge) {
        this.sAge = sAge;
    }


    public DateTime getsDOB() {
        return sDOB;
    }


    public void setsDOB(DateTime sDOB) {
        this.sDOB = sDOB;
    }


    public int getsID() {
        return sID;
    }


    public void setsID(int sID) {
        this.sID = sID;
    }


    public String getsUsername() {
        return sUsername;
    }


    public void setsUsername(String sName, int sAge) {
        String age= Integer.toString(sAge);
        this.sUsername = sName.concat(age);

    }


    public ArrayList<Modules> getModuleList() {
        return sModuleList;
    }


    public void setModuleList(ArrayList<Modules> sModuleList) {
        this.sModuleList = sModuleList;
    }


    public Programme getCourses() {
        return sCourses;
    }


    public void setCourses(Programme sCourses) {
        this.sCourses = sCourses;
    }

}


