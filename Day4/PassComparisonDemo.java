public class PassComparisonDemo {
    public static void main(String[] args) {
        // Demonstrate primitive pass by value
        int x = 5;
        int y = 10;
        System.out.println("Before swapPrimitive(), x = " + x + ", y = " + y);
        SwapPrimitiveDemo.swap(x, y);
        System.out.println("After swapPrimitive(), x = " + x + ", y = " + y);
        System.out.println();

        // Demonstrate object (array) pass by value of reference
        int[] array = {1, 2, 3};
        System.out.println("Before modifyArray(), array[0] = " + array[0]);
        ArrayPassDemo.modifyArray(array);
        System.out.println("After modifyArray(), array[0] = " + array[0]);
        System.out.println();

        // Demonstrate immutable object (String) pass by value
        String str = "hello";
        System.out.println("Before modifyString(), str = " + str);
        StringPassDemo.modifyString(str);
        System.out.println("After modifyString(), str = " + str);
        System.out.println();

        // Demonstrate swapping objects' internal state
        SwapObjectDemo.Box box1 = new SwapObjectDemo.Box(10);
        SwapObjectDemo.Box box2 = new SwapObjectDemo.Box(20);
        System.out.println("Before swapObject(), box1.value = " + box1.value + ", box2.value = " + box2.value);
        SwapObjectDemo.swap(box1, box2);
        System.out.println("After swapObject(), box1.value = " + box1.value + ", box2.value = " + box2.value);
    }
}
