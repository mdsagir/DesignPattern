package creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee=new Employee();
        employee.loadData();
        System.out.println(employee);
        Employee employee1= (Employee) employee.clone();
        System.out.println(employee1);
    }
}
