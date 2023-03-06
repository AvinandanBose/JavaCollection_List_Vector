import java.util.LinkedList;

public class LinkedListConstructor1 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Hello");
        list.add("World");
        list.add("!");
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
