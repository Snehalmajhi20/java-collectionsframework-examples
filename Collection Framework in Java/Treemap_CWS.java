import java.util.Map;
import java.util.TreeMap;

// sorted the element

public class Treemap_CWS {
    public static void main(String[] args) {
        Map<String, Integer> ts = new TreeMap<>();
        ts.put("Snehal",101);
        ts.put("Saroj",103);
//        ts.put("Saroj",102); // duplicate key value doest support on hashmap
        ts.put("Jagannath",102);
        ts.put("Chandan",105);
        ts.put("Amlan",104);
        System.out.println(ts);
        ts.putIfAbsent("Snehal",101);
    }
}
