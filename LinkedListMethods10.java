import java.util.LinkedList;
public class LinkedListMethods10 {
    public static void main(String[] args) {
        // peekFirst()
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        Integer i = list.peek();

        System.out.println(i);
        System.out.println(list);

    }
    
}
