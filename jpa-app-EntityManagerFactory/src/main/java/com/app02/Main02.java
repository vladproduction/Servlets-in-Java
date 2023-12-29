package com.app02;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main02 {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Unit01");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        Computer computer = new Computer();
        computer.setName("Comp1");
        CompSettings compSettings = new CompSettings();
        compSettings.setColor("Red");
        compSettings.setPrice(10);
        compSettings.setTitle("AsusComp");
        computer.setCompSettings(compSettings);
        em.persist(computer);
        em.getTransaction().commit();

        em.getTransaction().begin();
        Computer computer1 = em.find(Computer.class, 1);
        System.out.println(computer1);
        em.getTransaction().commit();



    }


}
