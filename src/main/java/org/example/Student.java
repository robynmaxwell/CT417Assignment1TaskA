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
    public ArrayList<Module> sModuleList;
    public ArrayList<Programme> sCourses;


    public Student(String sName, int sAge, int sID, DateTime sDOB) {
        this.sName= sName;
        this.sID=sID;
        this.sAge=sAge;
        this.sDOB=sDOB;
        this.sModuleList=sModuleList;
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


    public ArrayList<Module> getModuleList() {
        return sModuleList;
    }


    public void setModuleList(ArrayList<Module> sModuleList) {
        this.sModuleList = sModuleList;
    }

}


