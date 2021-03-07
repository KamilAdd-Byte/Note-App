package com.responsywnie.noteapp.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import javax.validation.Validator;

@Component
@Configuration
public class NoteValidation {
//    @Bean
//    Validator validator(){
//        return new LocalValidatorFactoryBean();
//    }
}
