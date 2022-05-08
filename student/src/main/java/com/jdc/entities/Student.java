package com.jdc.entities;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    private Integer id;
    private String name;
    private String phone;
    private String gmail;

    @ManyToOne
    @JoinColumn(name = "account",referencedColumnName = "id", updatable = false, insertable = false)
    private Account account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
