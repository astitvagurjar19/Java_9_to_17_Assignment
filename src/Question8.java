class FirstClass implements AutoCloseable{

    void printSomething(){
        System.out.println("First Class display.");
    }
    @Override
    public void close() throws Exception {
        System.out.println("first Class Closed");
    }
}

class SecondClass implements AutoCloseable{

    void printSomething(){
        System.out.println("Second Class Display.");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Second Class closed");
    }
}

public class Question8 {
    public static void main(String[] args) throws Exception {
        FirstClass first = new FirstClass();
        SecondClass second =new SecondClass();
        try(first;second){
            first.printSomething();
            second.printSomething();
        }
    }
}