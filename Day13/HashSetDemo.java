import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("India");
        set.add("USA");
        set.add("India"); // duplicate ignored

        System.out.println(set);
    }
}
