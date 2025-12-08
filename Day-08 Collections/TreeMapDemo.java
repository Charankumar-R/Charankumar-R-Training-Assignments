import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> map = new TreeMap<>();

        System.out.print("How many key-value pairs you want to enter? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key (integer): ");
            int key = sc.nextInt();
            sc.nextLine(); // clear buffer
            System.out.print("Enter value (String): ");
            String value = sc.nextLine();
            map.put(key, value);
        }

        System.out.println("\n--- TreeMap in Ascending Order (by key) ---");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "  Value: " + entry.getValue());
        }

        System.out.println("\n--- TreeMap in Descending Order (by key) ---");
        for (Map.Entry<Integer, String> entry : map.descendingMap().entrySet()) {
            System.out.println("Key: " + entry.getKey() + "  Value: " + entry.getValue());
        }

        sc.close();
    }
}
