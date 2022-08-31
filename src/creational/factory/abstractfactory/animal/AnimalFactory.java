package creational.factory.abstractfactory.animal;

import creational.factory.abstractfactory.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        }
        if (type.equalsIgnoreCase("tiger")) {
            return new Tiger();
        }
        return null;
    }
}
