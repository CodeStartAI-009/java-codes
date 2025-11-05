public class StaticVariableShare {
    private static int sharedValue = 0;

    public StaticVariableShare() {
        sharedValue++;
    }

    public static int getSharedValue() {
        return sharedValue;
    }

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            new StaticVariableShare();
        }

        System.out.println("Shared static variable value: " + StaticVariableShare.getSharedValue());
        s.close();
    }
}
