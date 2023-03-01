import java.util.ArrayList;

public class ArrayList21 {
    public static void main(String[] args) {
        // removeIf?(Predicate filter)
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        System.out.println(arrayList);
        arrayList.removeIf(s -> s.length() >= 4);
        System.out.println(arrayList);
    }
}
