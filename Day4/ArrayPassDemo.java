public class ArrayPassDemo {
    public static void modifyArray(int[] arr) {
        arr[0] = arr[0] + 10;
        System.out.println("Inside modifyArray(), arr[0] = " + arr[0]);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println("Before modifyArray(), array[0] = " + array[0]);
        modifyArray(array);
        System.out.println("After modifyArray(), array[0] = " + array[0]);
    }
}
