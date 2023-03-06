import java.util.LinkedList;
public class LinkedListMethods22 {

    public static void main(String[] args) {
        // removeLastOccurrence(Object o)
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(6);

        System.out.println(list);

        list.removeLastOccurrence(3);

        System.out.println(list);

       

    }
    
}
