import java.util.ArrayList;
import java.util.Spliterator;

public class ArrayList26 {

    public static void main(String[] args) {
        // spliterator()
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        System.out.println(arrayList);
        boolean b = arrayList.spliterator().hasCharacteristics(1);
        System.out.println(b);

        arrayList.spliterator().forEachRemaining(System.out::println);
        arrayList.spliterator().forEachRemaining(s -> System.out.println(s));

        Spliterator<String> spliterator = arrayList.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        spliterator.forEachRemaining(System.out::println);
        spliterator1.forEachRemaining(System.out::println);

        Spliterator<String> spliterator2 = arrayList.spliterator();

        System.out.println(spliterator2.estimateSize());

        Spliterator<String> spliterator3 = arrayList.spliterator();

        System.out.println(spliterator3.getExactSizeIfKnown());

    }

}
