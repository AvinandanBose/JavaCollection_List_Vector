import java.util.Vector;

public class VectorMethods11 {

    public static void main(String[] args){
        // removeAllElements()

        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);

        vector.removeAllElements();

        System.out.println(vector);

    }
    
}
