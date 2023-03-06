import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
public class LinkedListConstructor2 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        collection.add("Hello");
        collection.add("World");
        collection.add("!");
        LinkedList<String> list = new LinkedList<String>(collection);
        System.out.println(list);
    
    }
    
}
