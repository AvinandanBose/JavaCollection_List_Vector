import java.util.Vector;

public class VectorMethods10 {

    // lastElement

    public static void main(String[] args){

        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);

        Integer i = vector.lastElement();

        System.out.println(i);

    }
    
}
