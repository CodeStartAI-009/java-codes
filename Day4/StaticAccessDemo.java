public class StaticAccessDemo {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int product = StaticAccessDemo.multiply(x, y);
        System.out.println(product);
        s.close();
    }
}
