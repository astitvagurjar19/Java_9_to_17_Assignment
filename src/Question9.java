import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        List<Integer> unmodifiableList = List.copyOf(list);
    //    unmodifiableList.add(50);
        it=unmodifiableList.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}