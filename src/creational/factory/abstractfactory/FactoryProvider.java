package creational.factory.abstractfactory;

import creational.factory.abstractfactory.animal.AnimalFactory;
import creational.factory.abstractfactory.color.ColorFactory;

public class FactoryProvider {

    public static  AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("animal")) {
            return new AnimalFactory();
        }
        if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
