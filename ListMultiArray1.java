import java.util.ArrayList;
import java.util.List;

public class ListMultiArray1 {

    public static void main(String[] args){

        List<List<Integer>> list1 = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);


        List<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(5);
        list3.add(6);

        list1.add(list2);
        list1.add(list3);

        System.out.println(list1);
        System.out.println(list1.get(0).get(0));
        System.out.println(list1.get(0).get(1));
        System.out.println(list1.get(0).get(2));
        System.out.println(list1.get(1).get(0));
        System.out.println(list1.get(1).get(1));
        System.out.println(list1.get(1).get(2));

        for (List<Integer> list : list1) {
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }

        for(int i = 0; i < list1.size(); i++){
            for(int j = 0; j < list1.get(i).size(); j++){
                System.out.println(list1.get(i).get(j));
            }
        }
    }
    
}
