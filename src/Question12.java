sealed class Class1 permits Class2,Class4{} // Permitted classes can only inherit sealed classes, and they should  be final also.

final class Class2 extends Class1 {}

// final class Class3 extends Class1{} // Cannot inherit sealed class because Class3 is not permitted


non-sealed class Class4 extends Class1{}

public class Question12 {
    public static void main(String[] args) {
        Class2 sealedObject = new Class2();
    }
}