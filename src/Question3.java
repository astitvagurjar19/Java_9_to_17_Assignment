import java.util.stream.IntStream;

public class Question3 {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(-10,10);
        stream.forEach(System.out::println);
    }
}