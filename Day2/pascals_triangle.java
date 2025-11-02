import java.util.Scanner;

public class PascalsTriangle {
    // Function to calculate factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    // Function to calculate combination nCr
    static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows for Pascal's Triangle: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            // Print spaces for alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print combination values
            for (int j = 0; j <= i; j++) {
                System.out.print(combination(i, j) + " ");
            }

            System.out.println(); // Move to next row
        }

        sc.close();
    }
}
