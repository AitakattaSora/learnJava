package lessons21_30.accessmodifiers28.packet1;


import lessons21_30.Animal;

public class Test extends Animal {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
    }

    public Test(){
        name = "Tom";
    }
}
