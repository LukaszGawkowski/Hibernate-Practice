package com.homeworks.HibernatePractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernatePracticeApplication {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

        Client client1 = new Client();
        client1.setName("Janusz");
        client1.setName("Zdupski");

        Client client2 = new Client();
        client2.setName("Edzio");
        client2.setName("Pedzio");

        Client client3 = new Client();
        client3.setName("Marian");
        client3.setName("Kielbasa");


        Shop shop1 = new Shop();
        shop1.setName("Biedronka");
        shop1.setCity("Warszawa");

        Shop shop2 = new Shop();
        shop2.setName("Lidl");
        shop2.setCity("Warszawa");

        Shop shop3 = new Shop();
        shop3.setName("Biedronka");
        shop3.setCity("Warszawa");


        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(client1);
        entityManager.persist(client2);
        entityManager.persist(client3);
        entityManager.persist(shop1);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
    }

}
