import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Hashcode_Equals_CWS {
    int rollno;
    String name;
    public Hashcode_Equals_CWS(int rollno, String name){
        this.name = name;
        this.rollno = rollno;
    }

    public String toString() {
        return "Hashcode_Equals_CWS{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hashcode_Equals_CWS that = (Hashcode_Equals_CWS) o;
        return rollno == that.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollno);
    }

    public static void main(String[] args) {
        Set<Hashcode_Equals_CWS> stuset = new HashSet<>();
        stuset.add(new Hashcode_Equals_CWS(101,"Snehal"));
        stuset.add(new Hashcode_Equals_CWS(102,"Saroj"));
        stuset.add(new Hashcode_Equals_CWS(103,"Jagannath"));
        stuset.add(new Hashcode_Equals_CWS(104,"Chandan"));
        System.out.println(stuset);
  }
}
