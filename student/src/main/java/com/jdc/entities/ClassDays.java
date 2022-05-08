package com.jdc.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ClassDays {

    @Id
    private String daysOfWeek;
    @ManyToOne@JoinColumn(name = "class_id")
    private Class aClass;
}
