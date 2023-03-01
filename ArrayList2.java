import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ArrayList2 {

    public static void main(String[] args) {
        Collection<String> collection =  new HashSet<>();
        collection.add("Hello");
        collection.add("World");
        collection.add("!");
        ArrayList<String> arrayList = new ArrayList<>(collection);
        System.out.println(arrayList);

        Collection<String> collection1 = new ArrayList<>();
        collection1.add("Hello");
        collection1.add("World");
        collection1.add("!");
        ArrayList<String> arrayList1 = new ArrayList<>(collection1);
        System.out.println(arrayList1); 

    }

}
