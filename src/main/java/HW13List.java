import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW13List {
    public static void main(String[] args) {
        /**
         * Задача №1
         * Создать лист и добавить в него следующие слова:
         * White.
         * Tan.
         * Yellow.
         * Orange.
         * Red.
         * Pink.
         * Purple.
         * Blue.
         * Затем удалить из этого списка все цвета в которых встречается буква “L”
         */
        List<String> list2 = new ArrayList<>();
                list2.add("White");
                list2.add("Tan.");
                list2.add("Yellow.");
                list2.add("Orange.");
                list2.add("Red.");
                list2.add("Pink.");
                list2.add("Purple.");
                list2.add("Blue.");
        //Первый способ
//        for (int i = list2.size(); i-- > 0;){
//            if (list2.get(i).contains("l")){
//                list2.remove(i);
//            }
//        }

        Iterator<String> iterator = list2.iterator();
        //Второй способ
        while (iterator.hasNext()){
            if (iterator.next().contains("l")){
                iterator.remove();
            }
        }
        System.out.println("task 1");
        System.out.println(list2);

//        System.out.println();
//        System.out.println("ITERATOR.next()");
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

//        System.out.println();
//        System.out.println("WHILE-Iterator");
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


        /**
         * Задача №2
         * Создать лист со значениями от 100 до 1000.
         */
        List<Integer> list = new ArrayList<>();
        for (int i = 100; i <= 1000; i++) {
            list.add(i);
        }
        System.out.println();
        System.out.println("task 2");
        System.out.println(list);

        /**
         * Задача №3
         * Удалить из листа, созданного в предыдущей задаче, все четные элементы.
         */
        for (int i = list.size(); i-- > 0;){
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        System.out.println();
        System.out.println("task 3");
        System.out.println(list);

        /**
         * Экстра задача
         * Попробуйте изменить тип итерационной переменной из цикла, в третьей задаче,
         * на Integer (не int, а Integer) и добиться такого же результата как и с типом int.
         */
        for (Integer i = list.size(); i-- > 0;){
            if (list.get(i) % 2 == 0){
                list.remove(i.intValue());
            }
        }
        System.out.println();
        System.out.println("task 4");
        System.out.println(list);

    }
}
