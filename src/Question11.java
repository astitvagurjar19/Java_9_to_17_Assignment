record Student(String name,int id,int age){
    static int counter =0;
    Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        counter++;
    }
}

public class Question11 {
    public static void main(String[] args) {
        Student student1 = new Student("Akash",1001,22);
        Student student2 = new Student("Akash",1001,22);
        System.out.println(student1.equals(student2));
    }
}