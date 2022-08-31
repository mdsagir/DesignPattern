package creational.builder;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder("1", "sagir")
                .email("tech.sagir@gmail.com")
                .mobile(905270811)
                .build();
        System.out.println(employee.getEmail());
        System.out.println(employee.getMobile());

        Student student = Student.builder().id(1).city("Muzaffarpur").name("sagir").email("email").build();
        System.out.println(student);


    }
}
