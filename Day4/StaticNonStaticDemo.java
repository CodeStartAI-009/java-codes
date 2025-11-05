public class StaticNonStaticDemo {
    public int add(int a, int b) {
        // non-static method to add two numbers
        return a + b;
    }

    public static int subtract(int a, int b) {
        // static method to subtract two numbers
        return a - b;
    }

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        StaticNonStaticDemo obj = new StaticNonStaticDemo();

        int sum = obj.add(x, y); // calling non-static method
        int difference = StaticNonStaticDemo.subtract(x, y); // calling static method

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        s.close();
    }
}
