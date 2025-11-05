public class StaticPassDemo {
    static int staticValue = 50;

    public static void modifyStatic(int newValue) {
        staticValue = newValue;
        System.out.println("Inside modifyStatic(), staticValue = " + staticValue);
    }

    public static void main(String[] args) {
        System.out.println("Before modifyStatic(), staticValue = " + staticValue);
        modifyStatic(100);
        System.out.println("After modifyStatic(), staticValue = " + staticValue);
    }
}
