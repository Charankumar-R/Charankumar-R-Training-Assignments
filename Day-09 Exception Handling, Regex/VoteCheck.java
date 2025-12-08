import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class VoteCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
            System.out.println("Candidate is eligible to vote");
        } catch (InvalidAgeException e) {
            System.out.println("Candidate is not eligible to vote");
        }

        sc.close();
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18");
        }
    }
}
