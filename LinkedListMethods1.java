import java.util.LinkedList;


public class LinkedListMethods1 {

    public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //addFirst(E e)

        list.addFirst(0);
        System.out.println(list);

        // add(int index, E element)

        list.add(2, 10);
        System.out.println(list);

        // addAll(int index, Collection<E> c)

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);

        list.addAll(2, list1);

        System.out.println(list);

        // addAll(Collection<E> c)

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(11);
        list2.add(12);
        list2.add(13);

        list.addAll(list2);

        System.out.println(list);
    }
    
}
