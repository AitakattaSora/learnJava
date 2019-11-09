package lessonsAfter20;

public class StaticKeywordRealUsageExample {
    public static void main(String[] args) {
        Employee e1 = new Employee("Olya", 22);
        Employee e2 = new Employee("Anton", 31);
        e1.printNumberOfPeople();
        e2.printNumberOfPeople();
        Employee e3 = new Employee("Nastya", 30);
        e1.printNumberOfPeople(); // теперь 3 сотрудника
        e2.printNumberOfPeople();
        e3.printNumberOfPeople();
    }
}

class Employee {
    private String name;
    private int age;

    public static int peopleCount; // переменная, которая будет хранить в себе инфу о количестве сотрудников

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
        peopleCount++; // после каждого создания сотрудника, будет добавляются +1 к каунтеру
    }

    public void printNumberOfPeople() {
        System.out.println("Number of people: " + peopleCount);
    }
}