import java.util.Vector;
public class VectorMethods5 {

    public static void main(String[] args){
        // elementAt(int index)

        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);

        Integer i = vector.elementAt(2);

        System.out.println(i);

    }
    
}
