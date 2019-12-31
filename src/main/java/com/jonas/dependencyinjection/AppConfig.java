/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonas.dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author John
 */
@Configuration
public class AppConfig {
    
    @Bean
    public Samsung getPhone(){
        return new Samsung();
    }
    @Bean
    public MobileProcessor getProcessor(){
        return new Snapdragon();
    }
}
