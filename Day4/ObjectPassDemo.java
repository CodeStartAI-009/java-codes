public class ObjectPassDemo {
    static class Counter {
        int value;
        Counter(int value) {
            this.value = value;
        }
    }

    public static void increment(Counter c) {
        c.value = c.value + 1;
        System.out.println("Inside increment(), c.value = " + c.value);
    }

    public static void main(String[] args) {
        Counter myCounter = new Counter(5);
        System.out.println("Before increment(), myCounter.value = " + myCounter.value);
        increment(myCounter);
        System.out.println("After increment(), myCounter.value = " + myCounter.value);
    }
}
