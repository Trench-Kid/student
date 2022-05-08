package com.jdc.entities;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "class_type")
    private String classType;
    @Column(name = "start_date")
    private String startDate;
    private String months;
    @Column(name = "time_from")
    private LocalTime timeFrom;
    @Column(name = "time_to")
    private LocalTime timeTo;

    @OneToOne
    @JoinColumn(name = "teacher_id",updatable = false,insertable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "course_code", updatable = false, insertable = false)
    private Course course;

    public Class() {
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public LocalTime getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(LocalTime timeFrom) {
        this.timeFrom = timeFrom;
    }

    public LocalTime getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(LocalTime timeTo) {
        this.timeTo = timeTo;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
