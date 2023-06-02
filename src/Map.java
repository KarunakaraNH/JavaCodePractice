import java.util.*;
public class Map {

    public static void main(String[] args) {
        HashMap<Integer,String> m=new HashMap<Integer,String>();
        m.put(101,"Dwarak");
        m.put(102,"pavan");
        m.put(103,"sathya");
        m.put(104,"Manju");
        m.put(105,"Manju");
        m.remove(103);
        System.out.println(m.containsValue("kae"));
        System.out.println(m.containsKey(102));
        //if we duplicate key then latest value will be replaced
        System.out.println(m);//{101=Dwarak, 102=pavan, 104=Manju, 105=Manju}
        System.out.println(m.get(101));
        m.remove(103);
        System.out.println(m.isEmpty());
        //to retirve only keys
        System.out.println(m.keySet());//its in set format which are not duplicate
        //to get all the values in form of collection, because value may contain duplicate
        System.out.println(m.values());
        System.out.println(m.entrySet());//result in set

        //to print key and values one by one we need to use loop statement
        for(int e:m.keySet()){
            System.out.println(e);
        }
        for(String f:m.values()){
            System.out.println(f);
        }

        for(int i:m.keySet()){
            System.out.println(i+" values " + m.get(i));
        }
    }
}
