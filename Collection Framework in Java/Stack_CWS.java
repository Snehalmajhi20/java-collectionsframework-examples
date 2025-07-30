import java.util.Stack;

public class Stack_CWS {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // we can add or push like s.add(); or a.push();
        s.add(12);
        s.add(34);
        s.add(78);
        s.add(67);
        s.add(68);
        System.out.println(s);
        System.out.println("LIFO FOLLOWED BY STACK in java: "+s.peek());
        System.out.println(s.pop());
        System.out.println("After the POP the elements : "+s);
        s.clear();
        System.out.println("After cleared!: "+s);
    }
}
