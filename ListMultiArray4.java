import java.util.ArrayList;
import java.util.List;
public class ListMultiArray4 {

    public static void main(String[] args) {

        List<List<List<Integer>>> list1 = new ArrayList<>();

        list1.add(new ArrayList<>() {
            {
                add(new ArrayList<>() {
                    {
                        add(1);
                        add(2);
                        add(3);
                    }
                });
                add(new ArrayList<>() {
                    {
                        add(4);
                        add(5);
                        add(6);
                    }
                });
            }
        });

        list1.add(new ArrayList<>() {
            {
                add(new ArrayList<>() {
                    {
                        add(7);
                        add(8);
                        add(9);
                    }
                });
                add(new ArrayList<>() {
                    {
                        add(10);
                        add(11);
                        add(12);
                    }
                });
            }
        });

        System.out.println(list1);

        System.out.println(list1.get(0).get(0).get(0));
        System.out.println(list1.get(0).get(0).get(1));
        System.out.println(list1.get(0).get(0).get(2));
        System.out.println(list1.get(0).get(1).get(0));
        System.out.println(list1.get(0).get(1).get(1));
        System.out.println(list1.get(0).get(1).get(2));
        System.out.println(list1.get(1).get(0).get(0));
        System.out.println(list1.get(1).get(0).get(1));
        System.out.println(list1.get(1).get(0).get(2));
        System.out.println(list1.get(1).get(1).get(0));
        System.out.println(list1.get(1).get(1).get(1));
        System.out.println(list1.get(1).get(1).get(2));
    }
    
}
