import java.util.LinkedList;
public class LinkedListMethods9 {

    public static void main(String[] args) {
        // offerLast(E e)
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.offerLast(6);
        System.out.println(list);

    }
    
}
