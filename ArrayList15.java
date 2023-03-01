import java.util.ArrayList;

public class ArrayList15 {

    // isEmpty()

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.isEmpty());
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        Boolean b = arrayList.isEmpty();
        System.out.println(b);
    }
    
}
