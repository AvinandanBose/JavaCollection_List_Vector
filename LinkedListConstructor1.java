import java.util.LinkedList;

public class LinkedListConstructor1 {

    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Hello");
        list1.add("World");
        list1.add("!");

        System.out.println(list1);



        LinkedList list = new LinkedList();

        list.add("Hello");
        list.add(2);
        list.add(23.89F);
        System.out.println(list);

        list.add(1, "world");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
            
        }
    }
    
}
