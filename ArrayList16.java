import java.util.ArrayList;
public class ArrayList16 {

    //lastIndexOf(Object O)

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        int i = arrayList.lastIndexOf("Hello");
        System.out.println(i);
    }
    
}
