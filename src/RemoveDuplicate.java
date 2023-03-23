import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("be", "be", "is", "not", "or", "question", "that", "the", "to", "to"));
        System.out.println(list);
        System.out.println("After removing duplicates");

        removeDuplicates(list);
        System.out.println(list);
    }

    public static void removeDuplicates(ArrayList<String> list) {
        HashSet<String> str = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            String current = list.get(i);
            if (str.contains(current)) {
                list.remove(i);
                i--;
            } else {
                str.add(current);
            }
        }
    }
}