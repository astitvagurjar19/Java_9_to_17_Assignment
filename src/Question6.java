import java.util.Optional;

public class Question6 {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(12345);

        System.out.println("Optional is : "+optional);

        optional.stream().forEach(System.out::println);
    }
}