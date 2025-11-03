public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";

        // Compare strings for case-sensitive equality
        boolean isEqual = str1.equals(str2);
        System.out.println("Case-sensitive comparison: " + isEqual);

        // Compare strings for case-insensitive equality
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Case-insensitive comparison: " + isEqualIgnoreCase);

        // Lexicographical comparison
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println(str1 + " is equal to " + str2);
        } else if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else {
            System.out.println(str1 + " comes after " + str2);
        }
    }
}
