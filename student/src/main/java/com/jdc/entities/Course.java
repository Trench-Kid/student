package com.jdc.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course {

    @Id
    private String code;
    private String name;
    private int hours;
    private String level;
    private int onlineFees;
    private int offlineFees;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getOnlineFees() {
        return onlineFees;
    }

    public void setOnlineFees(int onlineFees) {
        this.onlineFees = onlineFees;
    }

    public int getOfflineFees() {
        return offlineFees;
    }

    public void setOfflineFees(int offlineFees) {
        this.offlineFees = offlineFees;
    }
    @ManyToOne
    private Account account;
}
