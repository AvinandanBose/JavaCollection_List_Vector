import java.util.LinkedList;
public class LinkedListMethods8 {
    public static void main(String[] args) {
         // offerFirst(E e)
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.offerFirst(0);
        System.out.println(list);

    }
    
}
