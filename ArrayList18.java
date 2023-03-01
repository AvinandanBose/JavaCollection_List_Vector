import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList18 {

    public static void main(String[] args) {
        // listIterator( int index )
        ArrayList<String> arrayList = new ArrayList<>();


        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");

        Iterator<String> iterator = arrayList.listIterator(0);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator<String> iterator1 = arrayList.listIterator(1);

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        
    }
    
}
