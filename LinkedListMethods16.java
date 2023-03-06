import java.util.LinkedList;
public class LinkedListMethods16 {

    //push()

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.push(6);
        System.out.println(list);

    }
    
}
