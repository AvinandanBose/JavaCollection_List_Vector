
import java.util.Vector;
public class VectorMethods12 {

    public static void main(String[] args){

        // removeElement(Object obj)

        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);

        System.out.println(vector);
        
        vector.removeElement(3);

        System.out.println(vector);

    }
    
}
