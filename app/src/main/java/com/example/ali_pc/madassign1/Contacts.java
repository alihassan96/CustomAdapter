package com.example.ali_pc.madassign1;

/**
 * Created by Ali-pc on 10/2/2017.
 */

public class Contacts {
    private int id;
    private String fname;
    private String fphone;
    private String fgender;

    public Contacts(int id, String fname, String fphone, String fgender) {

        this.id = id;
        this.fname = fname;
        this.fphone = fphone;
        this.fgender = fgender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFphone() {
        return fphone;
    }

    public void setFphone(String fphone) {
        this.fphone = fphone;
    }

    public String getFgender() {
        return fgender;
    }

    public void setFgender(String fgender) {
        this.fgender = fgender;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", fphone='" + fphone + '\'' +
                ", fgender='" + fgender + '\'' +
                '}';
    }
}
