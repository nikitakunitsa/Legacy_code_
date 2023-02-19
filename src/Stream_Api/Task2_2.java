package Stream_Api;

import java.util.List;
import java.util.stream.Collectors;

public class Task2_2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 15, 17, 18, 30, 35);
        System.out.println("Коллекция до изменений:" + list);
        List<Integer> list1 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 100)
                .collect(Collectors.toList());
        System.out.println("Коллекция c четными числами умножеными на 100: " + list1);
        List<Integer> list2 = list.stream()
                .filter(x -> x % 2 == 1)
                .map(x -> x - 100)
                .collect(Collectors.toList());
        System.out.println("Коллекция c нечетными числами минус 100: " + list2);
    }
}
