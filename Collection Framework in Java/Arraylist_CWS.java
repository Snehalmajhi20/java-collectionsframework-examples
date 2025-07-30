import java.util.ArrayList;
import java.util.List;

public class Arraylist_CWS {
    public static void main(String[] args) {

//        ArrayList al = new ArrayList();

        // -------   OR --------

        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(26);
        al.add(29);
        al.add(35);
        al.add(17);
        System.out.println(al);
        al.add(1,44);
        System.out.println(al);
        System.out.println("Get 4th number of index value: "+al.get(4));
        System.out.println("removed 4th number of index value: "+al.remove(4));
        System.out.println("After the removed the 4th element"+al);
        al.clear();
        System.out.println("All cleared! "+al);

//     ------for each loop-----
//        for(Object i : al){
//            System.out.println(i);
//        }
//        ----new list add on arraylist-----
        List<Integer> newal = new ArrayList<>();
        newal.add(150);
        newal.add(200);
        al.addAll(newal);
        System.out.println("After adding new list in arraylist: "+al);
    }
}
