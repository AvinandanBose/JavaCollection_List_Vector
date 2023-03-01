import java.util.ArrayList;
public class ArrayList28 {

    public static void main(String[] args) {
        // toArray()
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        System.out.println(arrayList);
        Object[] arr = arrayList.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }

        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(" ");



    }
    
}
