import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue_CWS {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        //       llq.add(14); or llq.offer(15);

        pq.offer(100);
        pq.offer(101);
        pq.offer(102);
        pq.offer(103);
        pq.offer(104);
        System.out.println("Priority Queue: "+pq);
        pq.peek();
        System.out.println("After Peek used(FIFO): "+pq);
        pq.poll();
        System.out.println("After POP used(FIFO): "+pq);
    }
}
