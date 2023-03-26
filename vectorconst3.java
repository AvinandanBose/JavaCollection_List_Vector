
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class vectorconst3 {

    public static void main(String[] args) {


        Collection<String> collection = new ArrayList<>();
        collection.add("Hello");
        collection.add("World");
        collection.add("!");
        Vector<String> vector = new Vector<>(collection);
        System.out.println(vector);
    }
    
}
