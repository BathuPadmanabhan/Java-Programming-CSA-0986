import java.util.ArrayList;
import java.util.Collections;

    public class Arraylist {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();

            list.add(10);
            list.add(20);
            list.add(30);

            list.remove(1);

            System.out.println("Element at index 1: " + list.get(1));
            System.out.println("Size: " + list.size());
            System.out.println("Contains 10: " + list.contains(10));

            Collections.sort(list);
            System.out.println("Final List: " + list);
        }
    }

