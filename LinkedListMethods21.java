import java.util.LinkedList;

public class LinkedListMethods21 {

    public static void main(String[] args) {
        // removeFirstOccurrence(Object o)
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.removeFirstOccurrence(3);

        System.out.println(list);

    }

}
