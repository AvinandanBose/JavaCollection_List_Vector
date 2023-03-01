import java.util.ArrayList;
public class ArrayList8 {

    public static void main(String[] args) {
      // clear()
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
    }
    
}
