package lessons21_30.interfaces26;

public class Test {
    public static void main(String[] args){
        Info info1 = new Animal(1); // так можно делать потому что классы Animal и Person реализуют интерфейс Info
        Info info2 = new Person("Bob");
//        info1.showInfo();
//        info2.showInfo();
        outputInfo(info1);
        outputInfo(info2);

        Animal animal1 = new Animal(2);
        Person person1 = new Person("Andrei");
        outputInfo(animal1);
        outputInfo(person1);

//   Тут мы рассматриваем info1 не как объект класса Animal, а как нечто, что реализует интерфейса Info
    }

    public static void outputInfo(Info info){ // метод принимает на вход нечто, что реализует интерфейс Info
        info.showInfo(); // этому объекту не важно, какой это объект, ему важно, чтобы те объекты, которые подаются на вход,
                        // реализовывали интерфейс Info
    }
}