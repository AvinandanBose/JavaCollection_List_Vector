import java.util.ArrayList;

public class ArrayList24 {
    // set(int index, E element)

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        System.out.println(arrayList);
        arrayList.set(0, "hello");
        System.out.println(arrayList);
    }
}
