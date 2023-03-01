import java.util.ArrayList;
public class ArrayList22 extends ArrayList<Integer>{
    public static void main(String[] args) {
        // removeRange()
        ArrayList22 arrayList = new ArrayList22();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println(arrayList);

        arrayList.removeRange(1, 3);

        System.out.println(arrayList);
        
    }
    
}
