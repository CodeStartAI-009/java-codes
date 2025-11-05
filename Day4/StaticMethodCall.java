public class StaticMethodCall {
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int num = s.nextInt();
        int result = StaticMethodCall.square(num);
        System.out.println(result);
        s.close();
    }
}
