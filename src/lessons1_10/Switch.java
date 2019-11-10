//      Урок 10: Оператор switch.

package lessons1_10;

import java.util.Scanner;

public class Switch {
    public static void main(String[]args){
    /*
     * Используется как lessons1_10.If в случаях, когда есть много условий, которые нужно перебрать
     * Используется не часто
     * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age) {
            case 0: // <=> case age == 0
                System.out.println("Ты родился");
                break;      // После каждого кейса нужно писать break. Иначе остальные кейсы будут выполняться
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
//            default:
//                System.out.println("Ни одно из условий не подошло");

        }

    }
}

