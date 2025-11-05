public class StringPassDemo {
    public static void modifyString(String s) {
        s = s + " world";
        System.out.println("Inside modifyString(), s = " + s);
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Before modifyString(), str = " + str);
        modifyString(str);
        System.out.println("After modifyString(), str = " + str);
    }
}
