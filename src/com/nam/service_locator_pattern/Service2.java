package com.nam.service_locator_pattern;

public class Service2 implements Service {
    @Override
    public void execute(){
        System.out.println("Execute Service2");
    }

    @Override
    public String getName(){
        return "Service2";
    }
}
