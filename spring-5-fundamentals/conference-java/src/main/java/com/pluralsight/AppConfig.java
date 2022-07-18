package com.pluralsight;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.pluralsight"}) // this tells this is where we want it start scan for autowiring
public class AppConfig {

    /*
    @Bean(name = "speakerService")
    @Scope(BeanDefinition.SCOPE_SINGLETON) // by default (so if you don't provide a scope) it's singleton
//    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService() {
//        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        SpeakerServiceImpl service = new SpeakerServiceImpl();
//        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
    */
}
