package com.jdc.entities;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String phone;
    private String email;

    public enum Role {
        MANAGER, STAFF
    }
    @ManyToOne
    @JoinColumn(name = "id",referencedColumnName = "id", updatable = false, insertable = false)
    private Account account;

}
