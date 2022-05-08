package com.jdc.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Registeration implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private RegisterationPK id;
    @Column(name = "regist_date")
    private Date registDate;
    private String status;
    private int fees;
    private int discount;
    private short paid;

    public Registeration() {
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public short getPaid() {
        return paid;
    }

    public void setPaid(short paid) {
        this.paid = paid;
    }
}
