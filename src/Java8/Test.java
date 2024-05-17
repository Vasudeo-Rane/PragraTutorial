package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> myStream = list.stream();

        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect.stream().
                map(x -> x / 2).
                collect(Collectors.toList()));
        System.out.println(collect);

        String[] array = {"apple", "banana", "cheery"};
        Stream<String> stream = Arrays.stream(array);

        System.out.println(Stream.iterate(0, n -> n + 1).limit(100));
    }
}
//* commented