
import java.util.ArrayList;

public class ArrayList4 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0,"Hello");
        arrayList.add(1,"World");
        arrayList.add(2,"!");

        System.out.println(arrayList);
        
        for (int i = 0; i < arrayList.size(); i++) {
            if(i==1){
                arrayList.add(i,"world");
            }
            
        }
        System.out.println(arrayList);
    }
    
}
