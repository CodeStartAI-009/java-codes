public class PrimitivePassDemo {
    public static void increment(int n) {
        n = n + 1;
        System.out.println("Inside increment(), n = " + n);
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Before increment(), x = " + x);
        increment(x);
        System.out.println("After increment(), x = " + x);
    }
}
