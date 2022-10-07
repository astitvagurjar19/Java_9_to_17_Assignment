//Creating interface named sample
interface Sample{
    //defining default method and calling private method form it
    default void defaultMethod(){
        System.out.println("Default Method.");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("Private Method.");
    }
}

public class Question1 implements Sample{
    public static void main(String[] args) {
        //object of class question1 which implements interface sample
        Question1 question1=new Question1();
        question1.defaultMethod();
    }
}