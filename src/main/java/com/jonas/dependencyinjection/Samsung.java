/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonas.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author John
 */
public class Samsung {
    
    @Autowired
    MobileProcessor cpu;
    
    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }
    
    
    public void config(){
        System.out.println("Octa core, 4 gb RAM, 8MP camera");
        cpu.process();
    }
}
