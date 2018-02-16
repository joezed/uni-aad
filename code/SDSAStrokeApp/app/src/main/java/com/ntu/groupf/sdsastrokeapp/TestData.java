package com.ntu.groupf.sdsastrokeapp;

import java.io.Serializable;

public class TestData implements Serializable{
    String clinicianEmail = "";
    Boolean hasPassed = false;
    String patientID = "";
    int dcErrors = 0;
    int dcTimeTaken = 0;
    int rsrScore = 0;
    int smcScore = 0;
    int smdScore = 0;
    int tmtErrors = 0;
    int tmtTimeTaken = 0;
    double failScore = 0;
    double passScore = 0;

    public void setClinicianEmail(String email) {
        this.clinicianEmail = email;
    }

    public String getClinicianEmail() {
        return this.clinicianEmail;
    }

    public void setPassed(boolean passed) {
        this.hasPassed = passed;
    }

    public boolean hasPassed() {
        return this.hasPassed;
    }

    public void setPatientID(String id) {
        this.patientID = id;
    }

    public String getPatientID() {
        return this.patientID;
    }

    public void setDcErrors(int errors) {
        this.dcErrors = errors;
    }

    public int getDcErrors() {
        return this.dcErrors;
    }

    public void setDcTimeTaken(int time) {
        this.dcTimeTaken = time;
    }

    public int getDcTimeTaken() {
        return this.dcTimeTaken;
    }

    public void setRsrScore(int score) {
        this.rsrScore = score;
    }

    public int getRsrScore() {
        return this.rsrScore;
    }

    public void setSmcScore(int score) {
        this.smcScore = score;
    }

    public int getSmcScore() {
        return this.smcScore;
    }

    public void setSmdScore(int score) {
        this.smdScore = score;
    }

    public int getSmdScore() {
        return this.smdScore;
    }

    public void setTmtErrors(int errors) {
        this.tmtErrors = errors;
    }

    public int getTmtErrors() {
        return this.tmtErrors;
    }

    public void setTmtTimeTaken(int time) {
        this.tmtTimeTaken = time;
    }

    public int getTmtTimeTaken() {
        return this.tmtTimeTaken;
    }

    public void setFailScore(double score) {
        this.failScore = score;
    }

    public double getFailScore() {
        return this.failScore;
    }

    public void setPassScore(double score) {
        this.passScore = score;
    }

    public double getPassScore() {
        return this.passScore;
    }

}
