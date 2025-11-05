public class SwapPrimitiveDemo {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap(), a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before swap(), x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println("After swap(), x = " + x + ", y = " + y);
    }
}
