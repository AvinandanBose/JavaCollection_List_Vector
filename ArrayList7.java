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

        //if Raw Type
        ArrayList arrayList2 = new ArrayList<>();
        arrayList2.add("Hello");
        arrayList2.add("World");
        arrayList2.add("!");
        ArrayList arrayList3 = new ArrayList<>();
        arrayList3.add(1);
        arrayList3.add(2);
        arrayList3.add(3);
        arrayList2.addAll(1,arrayList3);

        System.out.println(arrayList2);



    }
    
}
