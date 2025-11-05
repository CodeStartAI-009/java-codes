public class ObjectCounter {
    private static int count = 0;

    public ObjectCounter() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            new ObjectCounter();
        }
        System.out.println("Number of objects created: " + ObjectCounter.getCount());
        s.close();
    }
}
