import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("How many numbers do you want to push into stack? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();
            stack.push(num);
        }

        System.out.println("\nStack contents: " + stack);

        if (!stack.isEmpty()) {
            System.out.println("Top element using peek(): " + stack.peek());
        }

        if (!stack.isEmpty()) {
            System.out.println("Popping top element: " + stack.pop());
        }

        System.out.println("Stack after pop: " + stack);
        sc.close();
    }
}
