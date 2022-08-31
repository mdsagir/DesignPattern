package creational.builder;

public class Student {

    private int id;
    private String name;
    private String city;
    private String email;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class StudentBuilder {
        private int id;
        private String name;
        private String city;
        private String email;

        public StudentBuilder id(int id) {
            this.id=id;
            return this;
        }
        public StudentBuilder name(String name) {
            this.name=name;
            return this;
        }
        public StudentBuilder city(String city) {
            this.city=city;
            return this;
        }
        public StudentBuilder email(String email) {
            this.email=email;
            return this;
        }
        public Student build(){
            Student student=new Student();
            student.setId(id);
            student.setName(name);
            student.setCity(city);
            student.setEmail(email);
            return student;
        }
    }
}
