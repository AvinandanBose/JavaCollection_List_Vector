import java.util.ArrayList;
public class ArrayList12 {

    // forEach?(Consumer<? super E> action)

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        arrayList.forEach(System.out::println);
        arrayList.forEach(i-> System.out.println(i));
    }
    
}
