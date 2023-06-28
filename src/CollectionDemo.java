import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {

        List<Integer> al=new ArrayList<Integer>();
        al.add(122);
        al.add(132);
        al.add(1232);
        al.add(1282);
        al.add(132);
        al.add(1642);

        for(Integer element:al){
            System.out.println(element);
        }


    }
}
