public class MathUtility {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int num = s.nextInt();
        try {
            int result = MathUtility.factorial(num);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
        s.close();
    }
}
