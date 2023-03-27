import java.util.Vector;

public class VectorMethods14 {
    
    // replaceAll(UnaryOperator<E> operator)

    public static void main(String[] args){
        
        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);
        System.out.println(vector);
        vector.replaceAll(i -> i * 2);
        System.out.println(vector);

    }
}
