import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListMultiArray6 {

    public static void main(String[] args) {
        List<List<List<Integer>>> list = new ArrayList<>();   
        
        list.add(new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(1,2,3)),
            new ArrayList<>(Arrays.asList(4,5,6))
        )));
        list.add(new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(7,8,9)),
            new ArrayList<>(Arrays.asList(10,11,12))
        )));

        System.out.println(list);

        System.out.println(list.get(0).get(0).get(0));
        System.out.println(list.get(0).get(0).get(1));
        System.out.println(list.get(0).get(0).get(2));
        System.out.println(list.get(0).get(1).get(0));
        System.out.println(list.get(0).get(1).get(1));
        System.out.println(list.get(0).get(1).get(2));
        System.out.println(list.get(1).get(0).get(0));
        System.out.println(list.get(1).get(0).get(1));
        System.out.println(list.get(1).get(0).get(2));
        System.out.println(list.get(1).get(1).get(0));
        System.out.println(list.get(1).get(1).get(1));
        System.out.println(list.get(1).get(1).get(2));

        

    }
    
}
