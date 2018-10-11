package com.nam.composite_entity_pattern;

public class CompositeEntityPatternDemo {
    public static void main(String[] args){

        Client client = new Client();

        client.setData("Test", "Data");
        client.printData();
        client.setData("SecondTest", "Data1");
        client.printData();
    }
}
