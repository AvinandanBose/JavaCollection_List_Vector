import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList33 {

    public static void main(String[] args) {
        // iterator()
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        arrayList.add("Java");
        arrayList.add("Hello");

        System.out.println(arrayList);

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }

        
    }
    
}
