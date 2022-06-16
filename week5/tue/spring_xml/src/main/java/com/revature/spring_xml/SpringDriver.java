package com.revature.spring_xml;

import com.revature.spring_xml.models.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDriver {
    public static void main(String[] args) {
        System.out.println("Creating a bean container...");

        try (ClassPathXmlApplicationContext beanContainer = new ClassPathXmlApplicationContext("beans.xml")) {
            Coach myCoach = beanContainer.getBean("compSciCoach", Coach.class);

            System.out.println(myCoach.getMotivation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
