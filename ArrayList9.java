import java.util.ArrayList;
public class ArrayList9 {

    public static void main(String[] args) {
        // clone()
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");

        ArrayList<String> arrayList1 = (ArrayList<String>) arrayList.clone();
        System.out.println(arrayList1);
    }
    
}
