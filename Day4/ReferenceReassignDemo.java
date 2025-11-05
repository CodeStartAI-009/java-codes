public class ReferenceReassignDemo {
    static class Holder {
        int data;
        Holder(int data) {
            this.data = data;
        }
    }

    public static void reassign(Holder h) {
        h = new Holder(99); // h points to a new object
        h.data = 100;
        System.out.println("Inside reassign(), h.data = " + h.data);
    }

    public static void main(String[] args) {
        Holder holder = new Holder(10);
        System.out.println("Before reassign(), holder.data = " + holder.data);
        reassign(holder);
        System.out.println("After reassign(), holder.data = " + holder.data);
    }
}
