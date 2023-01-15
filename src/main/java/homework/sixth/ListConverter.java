package homework.sixth;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListConverter {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");

        System.out.println(stringList);

        List<Integer> integersList = stringList.stream().map(Integer::parseInt).collect(Collectors.toList());

        for (Integer integerNumber : integersList) {
            System.out.println(integerNumber);
        }
    }
}
