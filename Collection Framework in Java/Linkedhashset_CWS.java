import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset_CWS {
    public static void main(String[] args) {
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(24);
//        lhs.add(24); // duplicate value are not allowed thus hash set only unique value are allowed
        lhs.add(30);
        lhs.add(34);
        lhs.add(56);
        lhs.add(89);
        System.out.println(lhs);

        // same property contain like HASHSET(all FUN())
    }
}
