import java.util.Vector;
public class VectorMethods15 {

    // setElementAt(E obj, int index)

    public static void main(String[] args){

        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);
        System.out.println(vector);
        vector.setElementAt(5, 2);

        System.out.println(vector);

    }

    
}
