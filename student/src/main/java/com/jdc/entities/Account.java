package com.jdc.entities;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_name")
    private String userName;
    private String password;
    private short activated;
    @Column(name = "start_at")
    private LocalTime startAt;
    @Column(name = "retire_at")
    private LocalTime retireAt;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public short getActivated() {
        return activated;
    }

    public void setActivated(short activated) {
        this.activated = activated;
    }

    public LocalTime getStartAt() {
        return startAt;
    }

    public void setStartAt(LocalTime startAt) {
        this.startAt = startAt;
    }

    public LocalTime getRetireAt() {
        return retireAt;
    }

    public void setRetireAt(LocalTime retireAt) {
        this.retireAt = retireAt;
    }
}
