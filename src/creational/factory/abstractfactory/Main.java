package creational.factory.abstractfactory;

import creational.factory.abstractfactory.animal.Dog;
import creational.factory.abstractfactory.color.Black;

public class Main {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProvider.getFactory("animal");
        Dog dog = (Dog)abstractFactory.create("dog");
        System.out.println(dog.getType());

        AbstractFactory abstractFactory2 = FactoryProvider.getFactory("color");
        Black black =(Black) abstractFactory2.create("black");
        System.out.println(black.getType());
    }
}
