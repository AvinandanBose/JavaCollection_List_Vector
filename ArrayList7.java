import java.util.ArrayList;
public class ArrayList7 {

    public static void main(String[] args) {

        // addAll(int index, Collection C)
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");

        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("hello");
        arrayList1.add("world");
        arrayList1.add("!");

        arrayList.addAll(1, arrayList1);

        System.out.println(arrayList);


    }
    
}
