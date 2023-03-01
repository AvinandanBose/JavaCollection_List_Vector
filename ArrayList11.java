import java.util.ArrayList;
public class ArrayList11 {

    public static void main(String[] args) {
        // ensureCapacity()
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        System.out.println(arrayList);
         arrayList.ensureCapacity(10);
        
    }
    
}
