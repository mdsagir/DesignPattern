package creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee implements Cloneable{

    private final List<String> names;

    public Employee() {
        this.names=new ArrayList<>();
    }

    public Employee(List<String> names) {
        this.names = names;
    }
    public void loadData() {
        names.add("A");
        names.add("B");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "names=" + names +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> strings = new ArrayList<>(this.names);
        return new Employee(strings);
    }
}
