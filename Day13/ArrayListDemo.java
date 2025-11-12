import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        list.add("Mark");
        list.add("Sara");
        list.add("Nina");
        list.add("Alex");

        for (String name : list) {
            System.out.println(name);
        }
    }
}
