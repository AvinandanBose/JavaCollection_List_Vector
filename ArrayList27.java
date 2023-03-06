import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
public class ArrayList27 {

    public static void main(String[] args) {
        // subList?(int fromIndex, int toIndex)
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        System.out.println(arrayList);
        List<String> arr = arrayList.subList(0, 2);
         System.out.println(arr);

         AbstractList<String> arr1 = (AbstractList<String>) arrayList.subList(0, 2);

            System.out.println(arr1);


            ArrayList  arrayList1 = new ArrayList();

            arrayList1.add("Hello");
            arrayList1.add(28.9f);

            System.out.println(arrayList1);
            List arr2 =  arrayList1.subList(0, 1);

            System.out.println(arr2);

            AbstractList arr3 = (AbstractList) arrayList1.subList(0, 1);

            System.out.println(arr3);
    }
    
}
