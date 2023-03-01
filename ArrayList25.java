import java.util.ArrayList;
public class ArrayList25 {
    public static void main(String[] args) {
        // size?()
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        System.out.println(arrayList);
        int s = arrayList.size();
        System.out.println("Size of the Array:" + s);
    }
    
}
