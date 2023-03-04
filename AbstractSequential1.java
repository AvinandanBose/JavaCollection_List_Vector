import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class AbstractSequential1{
    public static void main(String[] args) {
        AbstractSequentialList<String> list = new LinkedList<String>();

        list.add("Hello");
        list.add("World");
        list.add("!");
        System.out.println(list);
    }
    
}