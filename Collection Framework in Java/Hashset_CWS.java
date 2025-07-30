import java.util.HashSet;
import java.util.Set;

public class Hashset_CWS {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();

        hs.add(100);
        hs.add(101);
        hs.add(102);
        hs.add(103);
        hs.add(104);
        System.out.println(hs);
        hs.contains(100);
        System.out.println(hs);
        hs.remove(104);
        System.out.println("Removed!: "+hs);
        hs.clear();
        System.out.println("Cleared!"+hs);
    }
}
