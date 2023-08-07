import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String,String> PhoneBook=new HashMap<>();
        PhoneBook.put("Manj","9912738293");
        PhoneBook.put("dwarak","9916728390");
        PhoneBook.put("Sathya","9343140406");



        //iterating and printing all values from key
      Set<String> keys= PhoneBook.keySet();
      for(String v:keys){
          System.out.println(v+" "+PhoneBook.get(v));

      }
        System.out.println("---------------------------");
      //to print key value pair or entry(key and value)
        //we have Entryset interface which is child of Hashmap
        Set<Map.Entry<String,String>> entry= PhoneBook.entrySet();

      for(Map.Entry<String,String> e:entry){
          System.out.println(" entries are "+e);
      }


    }
}
