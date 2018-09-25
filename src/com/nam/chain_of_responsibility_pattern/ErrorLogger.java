package com.nam.chain_of_responsibility_pattern;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    public void write(String message){
        System.out.println("Error Console::Logger: " + message);
    }
}
