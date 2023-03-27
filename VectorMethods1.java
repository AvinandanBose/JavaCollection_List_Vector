
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Vector;

public class VectorMethods1 extends Vector<Integer>{

    
public static void main(String[] args){

        Vector<Integer> v = new Vector<>();
        //add
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        System.out.println("Vector: " + v);

        // add(int index, E element)

        v.add(2, 10);

        System.out.println("Vector: " + v);

        //addaddAll(Collection c)

        Vector<Integer> v1 = new Vector<>();
        v1.add(6);
        v1.add(7);
        v1.add(8);
        v1.add(9);

        v.addAll(v1);

        System.out.println("Vector: " + v);

        //clone
        System.out.println(" ");
        Vector<Integer> v2 = (Vector<Integer>) v.clone();

        System.out.println("Vector: " + v2);


        //contains(Object o)
        System.out.println(" ");
        Boolean b = v.contains(10);

        System.out.println("Vector: " + b);


        // containsAll(Collection c)
        System.out.println(" ");
        Boolean b1 = v.containsAll(v1);

        System.out.println("Vector: " + b1);

        // ensureCapacity(int minCapacity)
        System.out.println(" ");
        v.ensureCapacity(20);

        // equals(Object o)
        System.out.println(" ");
        Boolean b2 = v.equals(v1);

        System.out.println("Vector: " + b2);

        //forEach(Consumer action)
        System.out.println(" ");
        v.forEach(System.out::println);
        v.forEach((i) -> System.out.println(i));


        // get(int index)
        System.out.println(" ");
        Integer i = v.get(2);

        System.out.println("Vector: " + i);

        // hashCode()
        System.out.println(" ");
        Integer i1 = v.hashCode();

        System.out.println("Vector: " + i1);

        // indexOf(Object o)
        System.out.println(" ");
        Integer i2 = v.indexOf(10);

        System.out.println("Vector: " + i2);

        // isEmpty()
        System.out.println(" ");
        Boolean b3 = v.isEmpty();
        System.out.println("Vector: " + b3);

        //iterator()
        System.out.println(" ");
        Iterator<Integer> it = v.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        // lastIndexOf(Object o)
        System.out.println(" ");
        Integer i3 = v.lastIndexOf(1);

        System.out.println("Vector: " + i3);


        //listIterator()
        System.out.println(" ");
        Iterator<Integer> it1 = v.listIterator();

        while(it1.hasNext()){
            System.out.println(it1.next());
        }

        // listIterator(int index)
        System.out.println(" ");
        Iterator<Integer> it2 = v.listIterator(2);

        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        // remove(int index)
        System.out.println(" ");
        Integer l = v.remove(2);
        System.out.println( l + "is removed");

        //remove(Object o)

        System.out.println(" ");
        Integer i4 = v.get(1);
        Boolean b4 = v.remove((Integer) 1);
        System.out.println( i4+ "is removed ="+b4 +"from index 1");

        // removeAll(Collection<?> c)

        System.out.println(" ");
        System.out.println("Vector: " + v1);
        System.out.println("Vector: " + v);

        Boolean b5 = v.removeAll(v1);

        System.out.println("All element is removed from vector v which are in v1: " + b5);
        System.out.println("Vector v1: " + v1);
        System.out.println("Vector v: " + v);


        //removeIf(Predicate<? super E> filter)

        System.out.println(" ");
        System.out.println("Vector: " + v);

        Boolean b6 = v.removeIf((i5) -> i5 == 2);

        System.out.println("All element is removed from vector v which are equal to 2: " + b6);

        System.out.println("Vector: " + v);

        //removeRange(int fromIndex,int toIndex)

        VectorMethods1 v3 = new VectorMethods1();
        v3.add(1);
        v3.add(2);
        v3.add(3);
        v3.add(4);

        System.out.println(" ");

        System.out.println("Vector: " + v3);

        v3.removeRange(1, 2);

        System.out.println("Vector: " + v3);

        //retainAll(Collection<?> c)

        System.out.println(" ");
        v.addAll(v2);
        System.out.println("Vector v1: " + v1);
        System.out.println("Vector v: " + v);

        Boolean b7 = v.retainAll(v1);

        System.out.println("All element is removed from vector v which are not in v1: " + b7);

        System.out.println("Vector v1: " + v);


        //set(int index, E element)

        System.out.println(" ");

        System.out.println("Vector: " + v);

        Integer i5 = v.set(1, 10); // i5 will contain the earlier value of index 1
        System.out.println(i5 +"is replaced with 10 at index 1");
        System.out.println("Vector: " + v);



        // size()

        System.out.println(" ");

        Integer i6 = v.size();

        System.out.println("Size of Vector v: " + i6);



        // sort(Comparator<? super E> c)


        System.out.println(" ");

        System.out.println("Vector: " + v);

        v.sort((i7, i8) -> (i7 < i8) ? 1 : (i7 > i8) ? -1 : 0);

        System.out.println("Vector: " + v);

        v.sort(Comparator.naturalOrder());

        System.out.println("Vector: " + v);

        v.sort(Comparator.reverseOrder());

        System.out.println("Vector: " + v);

        v.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("Vector: " + v);


        // spliterator() 

        System.out.println(" ");

        Spliterator<Integer> sp = v.spliterator();

        sp.trySplit().forEachRemaining(System.out::println);
        System.out.println(" ");
        sp.tryAdvance(System.out::println);


        // subList(int fromIndex, int toIndex)

        System.out.println(" ");

        System.out.println("Vector: " + v);

        List<Integer> l1 = v.subList(1, 3);

        System.out.println("Sublist: " + l1);


        // toArray()

        System.out.println(" ");

        Object[] arr = v.toArray();

        for (Object o : arr) {
            System.out.println(o);
        }
        

        // toArray(T[] a)

        System.out.println(" ");

        Integer[] arr1 = new Integer[v.size()];

        arr1 = v.toArray(arr1);

        for (Integer o : arr1) {
            System.out.println(o);
        }


        // toString()

        System.out.println(" ");

        String s = v.toString();

        System.out.println("Vector: " + s);


        // trimToSize()

        System.out.println(" ");

        System.out.println("Vector: " + v);

        v.trimToSize();

        for (Integer in : v) {
            System.out.println(in);
        }






       






        

      



}

    
}
