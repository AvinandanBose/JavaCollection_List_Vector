import java.util.ArrayList;

public class ArrayList29 {

    public static void main(String[] args) {
        // <T> T[] toArray(T[] a)
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        String[] array = arrayList.toArray(new String[0]);
        for (String string : array) {
            System.out.println(string);
        }

        System.out.println(" ");

        String[] array1 = arrayList.toArray(new String[arrayList.size()]);

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println(" ");
    }
    
}
