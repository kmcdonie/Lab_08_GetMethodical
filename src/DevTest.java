import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test Part A
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("Your name is: " + name);

        // Test Part B
        int age = SafeInput.getInt(in, "Enter your age");
        System.out.println("Your age is: " + age);

        // Testing Part C
        double amount = SafeInput.getDouble(in, "Enter the amount in your bank");
        System.out.println("The amount in your bank is: $" + amount);

        // Testing Part D
        int score = SafeInput.getRangedInt(in, "Enter your test score", 0, 100);
        System.out.println("Your test score is: " + score);

        // Testing Part E
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double within the range", 1.0, 10.0);
        System.out.println("You entered: " + rangedDouble);

        // Testing Part F
        boolean confirm = SafeInput.getYNConfirm(in, "Do you want to play again?");
        System.out.println("Your choice: " + (confirm ? "True" : "False"));

        // Testing Part G
        String regExString = SafeInput.getRegExString(in, "Enter your phone number (ex. 123-456-7890): ", "^\\d{3}-\\d{3}-\\d{4}$");
        System.out.println("Your phone number: " +regExString);
    }
}