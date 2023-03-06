import java.util.LinkedList;
public class LinkedListMethods7 {

    public static void main(String[] args) {
        // offer(E e)
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.offer(6);
        System.out.println(list);

    }
    
}
