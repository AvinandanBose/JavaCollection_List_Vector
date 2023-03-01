import java.util.ArrayList;
public class ArrayList23{

    public static void main(String[] args) {
        // retainAll(Collection c)
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        System.out.println(arrayList);
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Hello");
        arrayList1.add("World");

        arrayList.retainAll(arrayList1);

        System.out.println(arrayList);
    }

}