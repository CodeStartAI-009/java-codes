class AgeValidator {
    void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is below 18");
        }
    }
}

public class ThrowThrowsExample {
    public static void main(String[] args) {
        AgeValidator obj = new AgeValidator();
        try {
            obj.checkAge(16);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
