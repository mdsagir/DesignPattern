package creational.builder;

public class Employee {
    private String id; // require
    private String name; // require
    private String email; //optional
    private int mobile; // optional

    public Employee(EmployeeBuilder employeeBuilder) {
        this.id = employeeBuilder.id;
        this.name = employeeBuilder.name;
        this.email = employeeBuilder.email;
        this.mobile = employeeBuilder.mobile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public static class EmployeeBuilder {
        private String id;
        private String name;
        private String email;
        private int mobile;


        public EmployeeBuilder(String id, String name) {
            this.id = id;
            this.name = name;
        }
        public EmployeeBuilder email(String email) {
            this.email=email;
            return this;
        }
        public EmployeeBuilder mobile(int mobile) {
            this.mobile=mobile;
            return this;
        }
        public Employee build() {
            return new Employee(this);
        }
    }
}
