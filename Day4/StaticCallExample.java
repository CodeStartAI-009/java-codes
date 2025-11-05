public class StaticCallExample {
    public static int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int num = s.nextInt();
        int result = StaticCallExample.cube(num);
        System.out.println(result);
        s.close();
    }
}
