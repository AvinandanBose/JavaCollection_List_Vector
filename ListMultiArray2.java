import java.util.ArrayList;
import java.util.List;

public class ListMultiArray2 {

    public static void main(String[] args){

        List<List<List<Integer>>> list1 = new ArrayList<>();

        List<List<Integer>> list2 = new ArrayList<>();

        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);

        list2.add(list3);

        list4.add(4);
        list4.add(5);
        list4.add(6);

        list2.add(list4);
        list1.add(list2);

       
        

  

        System.out.println(list1);

        System.out.println(list1.get(0).get(0).get(0));
        System.out.println(list1.get(0).get(0).get(1));
        System.out.println(list1.get(0).get(0).get(2));
        System.out.println(list1.get(0).get(1).get(0));
        System.out.println(list1.get(0).get(1).get(1));
        System.out.println(list1.get(0).get(1).get(2));

        //Similarly

        List<List<Integer>> list5 = new ArrayList<>();
        List<Integer> list6 = new ArrayList<>();
        List<Integer> list7 = new ArrayList<>();

        list6.add(7);
        list6.add(8);
        list6.add(9);

        list7.add(10);
        list7.add(11);
        list7.add(12);


        list5.add(list6);
        list5.add(list7);

        list1.add(list5);

        System.out.println(list1);

        System.out.println(list1.get(1).get(0).get(0));
        System.out.println(list1.get(1).get(0).get(1));
        System.out.println(list1.get(1).get(0).get(2));
        System.out.println(list1.get(1).get(1).get(0));
        System.out.println(list1.get(1).get(1).get(1));
        System.out.println(list1.get(1).get(1).get(2));


        for (List<List<Integer>> list : list1) {
            for (List<Integer> list11 : list) {
                for (Integer integer : list11) {
                    System.out.println(integer);
                }
            }
        }

        for(int i = 0; i < list1.size(); i++){
            for(int j = 0; j < list1.get(i).size(); j++){
                for(int k = 0; k < list1.get(i).get(j).size(); k++){
                    System.out.println(list1.get(i).get(j).get(k));
                }
            }
        }




    }
    
}
