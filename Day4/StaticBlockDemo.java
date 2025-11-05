public class StaticBlockDemo {
    static int value;
    static {
        // Static block - runs once when the class is loaded
        value = 10;
        System.out.println("Static block executed. Value initialized to " + value);
    }

    public StaticBlockDemo() {
        System.out.println("Constructor called.");
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");
        StaticBlockDemo obj1 = new StaticBlockDemo();
        StaticBlockDemo obj2 = new StaticBlockDemo();
        System.out.println("Static value is: " + StaticBlockDemo.value);
    }
}
