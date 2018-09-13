package com.nam.abstract_factory_pattern;

public class FactoryProducer {
    public static Abstract_Factory getFactory(String choice){

        if (choice.equalsIgnoreCase("SHAPE")){

            return new ShapeFactory();

        } else if (choice.equalsIgnoreCase("COLOR")){

            return new ColorFactory();

        }

        return null;
    }
}
