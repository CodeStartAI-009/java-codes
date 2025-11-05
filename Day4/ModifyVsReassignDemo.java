public class ModifyVsReassignDemo {
    public static void main(String[] args) {
        // Reassigning a primitive
        int num = 10;
        System.out.println("Original num: " + num);
        num = 20; // reassigns variable 'num' to a new value
        System.out.println("Reassigned num: " + num);

        // Modifying the contents of a mutable object (array)
        int[] arr = {1, 2, 3};
        System.out.print("Original array: ");
        printArray(arr);

        // Modifying an element
        arr[0] = 10;
        System.out.print("Modified array: ");
        printArray(arr);

        // Reassigning the reference
        arr = new int[]{7, 8, 9};
        System.out.print("Reassigned array: ");
        printArray(arr);

        // Modifying a String (immutable)
        String str = "hello";
        System.out.println("Original string: " + str);

        // The following does NOT modify the string itself, but creates a new one
        str = str.toUpperCase();
        System.out.println("After toUpperCase() reassigned: " + str);
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
