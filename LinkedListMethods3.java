import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListMethods3 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // Descending Iterator
        Iterator<Integer> iterator = list.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
    
}
