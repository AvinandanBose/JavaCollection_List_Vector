import java.util.ArrayList;
public class ArrayList14 {

    public static void main(String[] args) {
        // indexOf()
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");

        int i = arrayList.indexOf("World");
        System.out.println(i);
    }
    
}
