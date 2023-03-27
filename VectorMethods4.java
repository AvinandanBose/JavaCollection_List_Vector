import java.util.Vector;
public class VectorMethods4 {

    public static void main(String[] args){
        // copyInto(Object[] anArray)

        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);

        Integer[] array = new Integer[vector.size()];

        vector.copyInto(array);

        for (Integer i : array) {
            System.out.println(i);
        }

    }
    
}
