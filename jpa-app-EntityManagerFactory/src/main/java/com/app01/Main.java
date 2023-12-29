package com.app01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Unit01");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

        //create
        Person p = new Person();
        p.setAge(25);
        p.setName("Jack");
        em.persist(p);

        //read
        Person pFromDB = em.find(Person.class, 1);
        System.out.println("pFromDB = " + pFromDB);

        //update
        Person pUpdated = em.find(Person.class, 1);
        p.setName("Jack Strong");
        em.persist(p);
        System.out.println("pUpdated = " + pUpdated);

        //remove
//        Person p1 = em.find(Person.class, 1);
//        em.remove(p1);

        em.getTransaction().commit();

    }


}
