package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String args[]) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

//        SpeakerService service = new SpeakerServiceImpl(); // we don't need this anymore because using bean factory to create instances in AppConfig file
        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service);
        SpeakerService service2 = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service2); //service2 is same instance as service

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
