import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparisonDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println("ArrayList elements: " + arrayList);
        System.out.println("LinkedList elements: " + linkedList);

        arrayList.add(1, "X");
        linkedList.add(1, "X");

        System.out.println("After inserting at index 1:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}
