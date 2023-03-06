import java.util.LinkedList;
public class LinkedListMethods13 {

    public static void main(String[] args) {

        // poll()
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        Integer i = list.poll();
        System.out.println(i);
        System.out.println(list);
    }
    
}
