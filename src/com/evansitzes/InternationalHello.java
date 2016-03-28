package com.evansitzes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by evan on 3/28/16.
 */
public class InternationalHello {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        final HelloInternational obj1 = (HelloInternational) context.getBean("helloInternational");
		obj1.getMessage1();
        obj1.getMessage2();

        final HelloJapan obj2 = (HelloJapan) context.getBean("helloJapan");
        obj2.getMessage1();
        obj2.getMessage2();
        obj2.getMessage3();

    }
}
