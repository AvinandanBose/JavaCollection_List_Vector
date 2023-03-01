import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList17 {

    public static void main(String[] args) {
        // listIterator()
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
    }
    
}
