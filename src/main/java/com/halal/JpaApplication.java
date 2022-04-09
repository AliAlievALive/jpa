package com.halal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@EnableCaching
@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

    }
//    public static void main(String[] args) {
//        SpringApplication.run(JpaApplication.class, args);
//    }

}
