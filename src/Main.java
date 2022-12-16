import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer [] num={1,2,3,4,5,6,7,8,9,10};
        Stream<Integer>integerStream = Stream.of(num);
        Stream<Integer> integerStream1 = integerStream.filter(x->x % 2 == 0).map(x -> x * x);
        integerStream1.max(Comparator.comparing(x->x)).stream().toList().forEach(System.out::println);



    }
}