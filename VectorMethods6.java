
import java.util.Vector;

import java.util.Enumeration;
public class VectorMethods6 {

    //elements()

    public static void main(String[] args){

        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);

        Enumeration<Integer> e = vector.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }


    
}
