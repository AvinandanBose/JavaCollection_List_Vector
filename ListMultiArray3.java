import java.util.ArrayList;
import java.util.List;

public class ListMultiArray3 {

    public static void main(String[] args) {

        List<List<Integer>> list1 = new ArrayList<>();

        list1.add(new ArrayList<>() {
            {
                add(1);
                add(2);
                add(3);
            }
        });

        list1.add(new ArrayList<>() {
            {
                add(4);
                add(5);
                add(6);
            }
        });

        System.out.println(list1);

        System.out.println(list1.get(0).get(0)); 
        System.out.println(list1.get(0).get(1));
        System.out.println(list1.get(0).get(2));
        System.out.println(list1.get(1).get(0));
        System.out.println(list1.get(1).get(1));
        System.out.println(list1.get(1).get(2));                                                                  
    }

}
