import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class SynchronizationofLinkedList {

    public static void main(String[] args) {

        List<String> list = Collections.synchronizedList(new LinkedList<>());
        List<Integer> list1 = Collections.synchronizedList(new LinkedList<>());
        synchronized (list) {

            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            list.add("E");
            list.add("F");

            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(4);
            list1.add(5);

            System.out.println("List: " + list);
            System.out.println("List1: " + list1);

            list.remove("A");
            list.remove("B");

            list1.remove(1);
            list1.remove(2);

            System.out.println("List: " + list);
            System.out.println("List1: " + list1);

            Iterable<String> iterable = list;
            for (String s : iterable) {
                System.out.println(s);
            }

            Iterator<Integer> iterator = list1.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        }
    }
    
}
