package com.homeworks.HibernatePractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernatePracticeApplication {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

        Client client = new Client();
        client.setName("Janusz");
        client.setName("Zdupski");

        Shop shop = new Shop();
        shop.setName("Biedronka");
        shop.setCity("Warszawa");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(client);
        entityManager.persist(shop);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
    }

}
