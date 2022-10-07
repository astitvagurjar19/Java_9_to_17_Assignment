import java.util.stream.IntStream;

public class Question4 {
    public static void main(String[] args) {
        IntStream  stream = IntStream.iterate(0,i->i<=10,i->i+1);
        stream.forEach(System.out::println);
    }
}