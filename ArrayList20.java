import java.util.ArrayList;

public class ArrayList20 {

    public static void main(String[] args) {
        // removeAll
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        System.out.println(arrayList);
        arrayList.removeAll(arrayList);
        System.out.println(arrayList);
    }
    
}
