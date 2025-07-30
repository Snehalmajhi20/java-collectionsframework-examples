import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Linkedlist_CWS {
    public static void main(String[] args) {
//        ---------- LINKEDLIST DEQUE ---------
        Queue<Integer> llq = new LinkedList<>();
//       llq.add(14); or llq.offer(15);

        llq.add(100);
        llq.add(101);
        llq.add(102);
        llq.add(103);
        llq.add(104);
        System.out.println(llq);
        llq.peek();
        System.out.println("After Peek used(FIFO): "+llq);
        llq.poll();
        System.out.println("After POP used(FIFO): "+llq);

//        ------------ LINKEDLIST ---------------
        List<String> ll = new LinkedList<>();
        ll.add("Snehal");
        ll.add("Jagannath");
        ll.add("Saroj");
        ll.add("Chandan");
        ll.add("Amlan");
        System.out.println(ll);
        ll.clear();
        System.out.println("After cleared1 "+ll);
    }
}
