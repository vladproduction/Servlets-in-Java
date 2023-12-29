package com.app03;

import com.app02.CompSettings;
import com.app02.Computer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main03 {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Unit01");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        Phone phone = new Phone();
        phone.setName("ApplePhone");
        phone.setColor("WHITE");
        PhoneData phoneData = new PhoneData();
        phoneData.setPrice(1);
        phoneData.setYear(2023);
        phone.setPhoneData(phoneData);
        em.persist(phone);
        em.getTransaction().commit();

        /*em.getTransaction().begin();
        Computer computer1 = em.find(Computer.class, 1);
        System.out.println(computer1);
        em.getTransaction().commit();*/



    }


}
