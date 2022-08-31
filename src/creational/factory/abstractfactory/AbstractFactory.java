package creational.factory.abstractfactory;

public interface AbstractFactory<T> {
    T create(String type);
}
