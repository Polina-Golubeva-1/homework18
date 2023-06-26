import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Создать коллекцию класса ArrayList наполнить ее элементами типа
        // Integer. С помощью Stream'ов:
        //- Удалить дубликаты
        //- Оставить только четные элементы
        //- Вывести сумму оставшихся элементов в стриме
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(8);
        list.add(15);
        list.add(10);
        list.add(18);
        list.add(10);
        System.out.println(list);
        List<Integer> result = Collections.singletonList(list.stream()
                .distinct()
                .filter((x) -> (x % 2) == 0)
                .reduce((a, b) -> a + b).orElse(0));
        System.out.println(result);
    }
}