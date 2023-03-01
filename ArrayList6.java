import java.util.ArrayList;

public class ArrayList6 {

    // addAll(Collection C)

    public static void main(String[] args) {

        //Raw type
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        ArrayList arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);


        //Generic type

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Hello");
        arrayList2.add("World");
        arrayList2.add("!");

        ArrayList<String> arrayList3 = new ArrayList<>();

        arrayList3.add("Hello");
        arrayList3.add("World");
        arrayList3.add("!");

        arrayList2.addAll(arrayList3);

        System.out.println(arrayList2);

    }

    
}
