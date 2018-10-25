package com.nam.service_locator_pattern;

public class Service1 implements Service {
    @Override
    public void execute(){
        System.out.println("Execute Service1");
    }

    @Override
    public String getName(){
        return "Service1";
    }
}
