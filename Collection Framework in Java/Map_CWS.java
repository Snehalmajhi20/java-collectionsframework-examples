import java.util.HashMap;
import java.util.Map;

//Map is store for key-values and also unique values

public class Map_CWS {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Snehal",101);
        mp.put("Saroj",102);
//        mp.put("Saroj",102); // duplicate key value doest support on hashmap
        mp.put("Jagannath",103);
        mp.put("Chandan",104);
        mp.put("Amlan",105);
        System.out.println(mp);
        mp.putIfAbsent("Snehal",101);
    }
}
