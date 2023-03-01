import java.util.ArrayList;
public class ArrayList31 {

    public static void main(String[] args) {
        // trimToSize()
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        arrayList.add("Java");
        arrayList.add("Hello");

        System.out.println(arrayList.size());

        arrayList.trimToSize();

        for (String string : arrayList) {
            System.out.println(string);
        }
    }
    
}
