//      Урок 32: Восходящее и нисходящее преобразование

package lessons31_40.upcastingAndDowncasting32;

public class Test {
    public static void main(String[] args){
        Dog dog = new Dog();

        // Upcasting - Восходящее преобразование
        Animal animal = dog;

        // Downcasting - Нисходящее преобразование
        Dog dog2 = (Dog) animal;
        dog2.bark();

        /*
        * Восходящее преобразование всегда безопасно т.к мы знаем, что Dog является Animal, а нисходящее нет, т.к.
        * Animal может быть Dog и может не быть Dog
        * */

        Animal animal1 = new Animal();
        Dog d = (Dog) animal1; // Java делает проверку типов и видит, что animal1 не является Dog
        d.bark(); // - не сработает, т.к Animal не всегда является Dog
    }
}
