import java.util.*;

public class ArrayInsertion {
    public static void hash(){
        String str = "apple banana apple";

        String[] words = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }

        System.out.println(map);

    }

        public static void ANA() {
            String[] arr = {"eat", "tea", "ale", "lea"};
            HashMap<String, ArrayList<String>> map = new HashMap<>();

            for (String word : arr) {
                char ch[] = word.toCharArray();
                Arrays.sort(ch);
                String key = new String(ch);

                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }

                map.get(key).add(word);
            }

            System.out.println(map.values());
        }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i])) {
                result.add(b[i]);
            }
        }
        System.out.println(result);
        hash();
    }
}
