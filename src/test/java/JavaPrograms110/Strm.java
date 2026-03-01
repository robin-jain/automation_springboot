package JavaPrograms110;

import java.util.Arrays;
import java.util.List;

public class Strm {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,7,9,10,11);

        int [] intArray={1, 2, 3, 4, 5,7,9,10,11};

        list.stream().filter(n->n%2==0).map(n->n*2).forEach(System.out::println);
        System.out.println(list.stream().filter(n->n%2==0).map(n->n*2).count());

        Arrays.stream(intArray).sorted().forEach(System.out::println);
        Arrays.stream(intArray).sorted().distinct().forEach(System.out::print);
    }
}
