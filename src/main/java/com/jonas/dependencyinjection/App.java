/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonas.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author John
 */
public class App {
    public static void main(String [] args ){
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
    
}
