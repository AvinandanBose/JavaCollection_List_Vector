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
        
        Collection collection1 = new ArrayList();
        collection1.add("Hello");
        collection1.add(2.9);
        collection1.add(3.98f);
        LinkedList list1 = new LinkedList(collection1);
        System.out.println(list1);
    
    }
    
}
