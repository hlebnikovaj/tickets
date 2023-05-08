package ru.julia.com.example.dz2_m4;

import java.io.Serializable;

public class User implements Serializable {
    private String nameSt;
    private String idPass;
    private String date;
    private String date2;
    private String time;
    private String time2;

    public User(String nameSt, String idPass, String date, String date2, String time, String time2) {
        this.nameSt = nameSt;
        this.idPass = idPass;
        this.date = date;
        this.date2 = date2;
        this.time = time;
        this.time2 = time2;
    }



    public String getNameSt() {
        return nameSt;
    }

    public void setNameSt(String nameSt) {
        this.nameSt = nameSt;
    }

    public String getIdPass() {
        return idPass;
    }

    public void setIdPass(String idPass) {
        this.idPass = idPass;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }




}
