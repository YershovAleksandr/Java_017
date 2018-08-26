package com.nam;

public class App {

    private int mFlag;

    private void init(){
        System.out.println("App::int()");

        mFlag = 42243576;
    }

    public void run(){
        System.out.println("App::run()");

        init();

        System.out.println("App::mFlag = " + mFlag);

    }
}
