package com.nam.proxy;

public class ProxyPatternDemo {
    public static void main(String... str){
        Image image = new ProxyImage("test_10mb.jpg");

        //image will loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
