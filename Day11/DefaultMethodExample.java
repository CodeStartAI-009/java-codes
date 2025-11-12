interface MyInterface {
    default void show() {
        System.out.println("This is a default method");
    }
}

class Demo implements MyInterface {}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
