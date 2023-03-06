import java.util.AbstractList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;
public class LinkedListMethods {

    //Methods in LinkedList and ArrayList

    public static void main(String[] args){

        //add
       LinkedList<Integer> list = new LinkedList<>();
         list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

        System.out.println(list);

        // add(int index, E element)

        list.add(2, 10);
        System.out.println(list);

        // addAll(int index, Collection<E> c)

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);

        list.addAll(2, list1);

        System.out.println(list);

        // addAll(Collection<E> c)

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(11);
        list2.add(12);
        list2.add(13);

        list.addAll(list2);

        System.out.println(list);


        // clone()

        LinkedList<Integer> list3 = (LinkedList<Integer>)list.clone();
        System.out.println(list3);

        // contains(Object o)

        Boolean b = list.contains(10);

        System.out.println(b);

        // forEach?(Consumer < ? super E > action) 

        list.forEach(System.out::println);
        list.forEach(e -> System.out.println(e));

        // get ( int index ) 

        Integer a = list.get(2);
        System.out.println(a);

        //indexOf ( Object O) 

        Integer i = list.indexOf(10);
        System.out.println(i);

        //clear()

        list.clear();
        System.out.println(list);

        //isEmpty()

        Boolean b1 = list.isEmpty();
        System.out.println(b1);

        // lastIndexOf ( Object O ) 

        int lastindexof = list1.lastIndexOf(6);
        System.out.println(lastindexof);

        //listIterator ( ) 

        Iterator<Integer> iterator = list1.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //listIterator( int index) 

        Iterator<Integer> iterator1 = list1.listIterator(2);            

        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        //remove ( Object o )

        LinkedList<String> list9 = new LinkedList<>();
        list9.add("a");
        list9.add("b");
        list9.add("c");
        list9.add("d");
        System.out.println(list9);
        list9.remove("b");
        System.out.println(list9);

        // remove ( int index ) 

        list1.remove(2);
        System.out.println(list1);

        // removeAll ( Collection c ) 

        LinkedList<Integer> list4 = new LinkedList<>();
        list4.add(6);
        list4.add(7);
        list1.removeAll(list4);

        System.out.println(list1);

        //removeIf ( Predicate filter ) 

        list2.removeIf(e -> e == 10);
        System.out.println(list2);

        // retainAll ( Collection c ) 

        LinkedList<Integer> list5 = new LinkedList<>();
        list5.add(11);
        list5.add(12);

        list2.retainAll(list5);
        System.out.println(list2);

        // set (int index, E element) 

        list2.set(0, 10);
        System.out.println(list2);

        // size() 

        int size = list2.size();
        System.out.println(size);

        // spliterator() 

        boolean b2 = list2.spliterator().hasCharacteristics(10);
        System.out.println(b2);

        list2.spliterator().forEachRemaining(System.out::println);
        list2.spliterator().forEachRemaining(s -> System.out.println(s));

        Spliterator<Integer> spliterator = list2.spliterator();
        Spliterator<Integer> spliterator1 = spliterator.trySplit();
        spliterator.forEachRemaining(System.out::println);
        spliterator1.forEachRemaining(System.out::println);

        Spliterator<Integer> spliterator2 = list2.spliterator();
        System.out.println(spliterator2.estimateSize());

        Spliterator<Integer> spliterator3 = list2.spliterator();
        System.out.println(spliterator3.getExactSizeIfKnown());

        // subList(int fromIndex, int toIndex) 

        LinkedList<Integer> list6 = new LinkedList<>();
        list6.add(1);
        list6.add(2);
        list6.add(3);

        AbstractList<Integer> list7 = (AbstractList<Integer>) list6.subList(0, 2);
        List<Integer> list8 = list6.subList(0, 2);
        System.out.println(list7);
        System.out.println(list8);


        // Object[] toArray() 

        Object[] array = list6.toArray();
        for(Object o : array){
            System.out.println(o);
        }
        for(int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }

        // toArray(T[] a)

        Integer[] array1 = new Integer[list6.size()];

        array1 = list6.toArray(array1);
        for(Integer o : array1){
            System.out.println(o);
        }
        for(int j = 0; j < array1.length; j++){
            System.out.println(array1[j]);
        }


      


    }
    
}
//ensureCapacity ( int minCapacity ) is available in ArrayList but not in Linked List.
// removeRange ( int fromIndex, int toIndex ) is available in ArrayList but not in Linked List.
// sort( Comparator < ? super E > c ) is available in ArrayList but not in Linked List.
// trimToSize ( ) is available in ArrayList but not in Linked List.
