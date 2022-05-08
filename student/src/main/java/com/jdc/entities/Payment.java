package com.jdc.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer date;
    private int toPaid;
    private int paindAmount;

    @ManyToOne
    private Registeration registeration;


}
