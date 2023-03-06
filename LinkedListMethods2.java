import java.util.LinkedList;
public class LinkedListMethods2 {

    public static void main(String[] args) {
        // addLast(E e)
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.addLast(6);
        System.out.println(list);

    }
}
