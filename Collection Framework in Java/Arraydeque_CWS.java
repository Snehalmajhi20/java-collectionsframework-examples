import java.util.ArrayDeque;

public class Arraydeque_CWS {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        // Example usage
        ad.add(10);
        ad.add(20);
        ad.addFirst(5);  // adds at the front
        ad.addLast(25);  // adds at the end
        ad.add(22);

        System.out.println(ad);  // Output: [5, 10, 20, 25]
        ad.peekFirst();
        System.out.println("After peek: "+ad);
        ad.poll();
        System.out.println("After poll: "+ad);

        // Remove elements
        ad.removeFirst();  // removes 5
        ad.removeLast();   // removes 25

        System.out.println(ad);  // Output: [10, 20]
    }
}
