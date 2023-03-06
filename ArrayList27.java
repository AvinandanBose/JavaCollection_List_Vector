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
    }
    
}
