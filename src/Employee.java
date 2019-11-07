import java.util.Objects;

public class Employee {


    private String name;
    private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.name, employee.name) &&
                Objects.equals(this.age, employee.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void sayHello(){
        System.out.println("Hello!");

    }

    public static void main(String args[]) {

        Employee employee = new Employee("a1", 2);
        employee.setAge(2);
        System.out.println(employee);
        Employee employee2 = new Employee("a1", 2);
        System.out.println(employee2);

        if (employee == employee2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (employee.equals(employee2))
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        employee.sayHello();
        sayHello();
        Employee.sayHello();
    }


}
