import java.util.Vector;
public class VectorMethods13 {

    public static void main(String[] args){
        // removeElementAt(int index)
        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);

        System.out.println(vector);

        vector.removeElementAt(2);

        System.out.println(vector);

    }
    
}
