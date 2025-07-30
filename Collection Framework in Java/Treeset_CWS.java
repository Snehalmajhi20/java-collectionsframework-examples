import java.util.Set;
import java.util.TreeSet;

// All property are same like hashset but order of the elements are Sorted!

public class Treeset_CWS {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        ts.add(100);
        ts.add(105);
        ts.add(108);
        ts.add(102);
        ts.add(104);
        System.out.println(ts);
    }
}
