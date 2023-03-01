import java.util.ArrayList;
import java.util.Comparator;
public class ArrayList30 {

    public static void main(String[] args) {
        // Sort
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        arrayList.add("Java");

        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(arrayList);

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        arrayList.sort(comparator);

        System.out.println(arrayList);
    }
    
}
