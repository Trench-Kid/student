package com.jdc;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    static EntityManagerFactory emf;
    public static void main(String[] args) {
       emf = Persistence.createEntityManagerFactory("persistence");
       var em = emf.createEntityManager();

       em.close();
       emf.close();
    }
}
