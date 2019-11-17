//      Урок 30: Модификаторы доступа

package lessons21_30.accessmodifiers28;

import lessons21_30.accessmodifiers28.packet1.Person;

public class Test {
    public static void main(String[] args) {
//        Модификаторы по строгости доступа: private -> default -> protected -> public
       /*
         * public, private, default, protected.
         * private - разрешает доступ только внутри класса, где это поле декларировано.
         * default - разрешает доступ только в пределах пакета.
         * protected - разрешает доступ в пределах одного пакета и наследникам.
        */

       /*

       Modifier   |  Class  |  Package  |  Subclass  |  World  |
       ---------------------------------------------------------
       public     |    Y    |     Y     |     Y      |    Y    |
       protected  |    Y    |     Y     |     Y      |    N    |
       default    |    Y    |     Y     |     N      |    N    |
       private    |    Y    |     N     |     N      |    N    |

       */

       /*
       * Класс может быть только public и default.
       * Класс который имеет такое же название, как и java файл, должен быть public.
       * В одном java-файле не может быть больше одного public класса.
       *
       * Поля не рекомендуется декларировать с модификатором public
       * Единственный случай, когда можно так делать, это при декларировании констант (public final static String)
       * */


       Person person1 = new Person();

    }
    public final static String CONSTANT = "Const";
}
