package com.nam.abstract_factory_pattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args){

        Abstract_Factory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("CIRCLE");

        if (shape1 != null) {
            shape1.draw();
        }

        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");

        shape3.draw();

        Abstract_Factory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");

        color1.fill();

        Color color2 = colorFactory.getColor("GREEN");

        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");

        color3.fill();

    }
}
