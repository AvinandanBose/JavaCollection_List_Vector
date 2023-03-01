import java.util.ArrayList;
public class ArrayList10 {

    public static void main(String[] args) {
        // contains?(Object o)
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        Boolean b = arrayList.contains("Hello");
        System.out.println(b);
    }
    
}
