package com.app04;

import com.app03.Phone;
import com.app03.PhoneData;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main04 {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Unit01");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        Car car = new Car();
        car.setColor("black");
        car.setName("Car1");
        car.setPrice(1);
        car.setYear(2023);
        em.persist(car);
        em.getTransaction().commit();

        /*em.getTransaction().begin();
        Computer computer1 = em.find(Computer.class, 1);
        System.out.println(computer1);
        em.getTransaction().commit();*/



    }


}
