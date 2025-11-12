public class CalculatorOverloading {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        CalculatorOverloading c = new CalculatorOverloading();
        System.out.println(c.add(5, 10));
        System.out.println(c.add(5.5, 2.5));
        System.out.println(c.add(1, 2, 3));
    }
}
