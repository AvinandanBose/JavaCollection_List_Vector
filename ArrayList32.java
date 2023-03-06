import java.util.ArrayList;
public class ArrayList32 {

    public static void main(String[] args) {
        // remove(Object o)
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        arrayList.add("Java");
        arrayList.add("Hello");

        System.out.println(arrayList);

        arrayList.remove("Hello");

        System.out.println(arrayList);
    }
    
}
