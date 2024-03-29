//      Урок 29: Полиморфизм

package lessons21_30.polymorphism29;

public class Test {
    public static void main(String[] args) {
        Animal animal2 = new Dog(); // так тоже можно (одно из проявлений полиморфизма)
        animal2.eat(); // Здесь мы рассматриваем собаку как животное и не имеет доступ к специфичным "собачьим" методам типа bark()

        /*
        К объекту наследника класса можно обращаться через переменную родительского типа, но это имеет ограничения:
            - такой объект может вызывать только методы родительского класса (animal2.bark не сработает)(Если мы
              общаемся к объекту через родителя, то такой объект имеет только методы родителя)
        НО если этот метод переопределен в классе наследника, то будет вызываться именно метод наследника - это
        называется ПОЗДНЕЕ СВЯЗЫВАНИЕ (Несмотря на то, что эта собака воспринимается как животное, вызовется
        метод наследника если таковой имеется)

        ПОЛИФОРФИЗМ - один интерфейс(test), множество реализаций(eat)

        С помощью полиморфизма можно:
            - уменьшить количество кода
            - сделать его многоразовым

        */

        Dog dog2 = new Dog();
        dog2.bark(); // Здесь мы рассматриваем собаку как собаку

        System.out.println("");

        Animal newAnimal = new Animal();
        Dog newDog = new Dog();
        Cat newCat = new Cat();

        test(newAnimal); // если бы полиморфизма не было, то для каждого типа пришлось бы делать свой метод
        test(newDog);
        test(newCat);

    }

    public static void test (Animal animal) {
        animal.eat();
    }
}
