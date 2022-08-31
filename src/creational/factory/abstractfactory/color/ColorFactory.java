package creational.factory.abstractfactory.color;

import creational.factory.abstractfactory.AbstractFactory;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String type) {
        if (type.equalsIgnoreCase("black")) {
            return new Black();
        }
        if (type.equalsIgnoreCase("white")) {
            return new White();
        }
        return null;
    }
}
