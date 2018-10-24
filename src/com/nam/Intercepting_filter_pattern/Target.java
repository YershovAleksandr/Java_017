package com.nam.Intercepting_filter_pattern;

public class Target {
    public void execute(String request){
        System.out.println("Execute request : " + request);
    }
}
