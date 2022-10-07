import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Question5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.stream().
                filter(i -> i % 2 == 0).
                findFirst().
                or(()-> Optional.of(-1)).
                ifPresentOrElse(System.out::println, () -> System.out.println("No value present"));
        numbers.stream().filter(i->i<5).findFirst().orElseThrow(ArithmeticException::new);
    }
}