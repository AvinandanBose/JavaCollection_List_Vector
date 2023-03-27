import java.util.Vector;
public class VectorMethods8 {

    // indexOf(Object o, int index)

    public static void main(String[] args){
        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);

        Integer i = vector.indexOf(3, 2);

        System.out.println(i);

    }
    
}
