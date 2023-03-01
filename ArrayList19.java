import java.util.ArrayList;

public class ArrayList19 {

    //remove?(int index)

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
        
    }
    
}
