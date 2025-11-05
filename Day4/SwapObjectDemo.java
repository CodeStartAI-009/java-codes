public class SwapObjectDemo {
    static class Box {
        int value;
        Box(int value) {
            this.value = value;
        }
    }

    public static void swap(Box a, Box b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
        System.out.println("Inside swap(), a.value = " + a.value + ", b.value = " + b.value);
    }

    public static void main(String[] args) {
        Box box1 = new Box(100);
        Box box2 = new Box(200);
        System.out.println("Before swap(), box1.value = " + box1.value + ", box2.value = " + box2.value);
        swap(box1, box2);
        System.out.println("After swap(), box1.value = " + box1.value + ", box2.value = " + box2.value);
    }
}
