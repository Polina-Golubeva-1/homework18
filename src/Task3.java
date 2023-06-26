import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        //Задача 3:
        //При помощи стримов из списка, содержащего объекты Developer,
        // вывести только те, id> 10 и name начинается с ‘An’.
        //ArrayList<Developer> list = new ArrayList<>();
      List<Developer> devel = new ArrayList<>();
        devel.add(new Developer(14, "Anna"));
        devel.add(new Developer(5, "Anton"));
        devel.add(new Developer(11, "Tom"));
        devel.add(new Developer(18, "Anfisa"));
        devel.add(new Developer(3, "Kira"));

       List <Developer> result = devel.stream().filter(developer -> developer.getId() >= 10).toList();

System.out.println(result);
    }
}
