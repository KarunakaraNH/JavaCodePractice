import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

public class FindSecondHighestNumber {

    public static void main(String[] args) {
    int[] numbers={12,3,34};
        System.out.println("second largest number in the array is "+ findSeconsLargestNumber(numbers));
        System.out.println("Given strings is anagaram -"+ findAnagram("LISiTEN", "SILENT"));
        System.out.println(findCharCount("   common"));

    }
    //Find secons largest number in an array
    public static int findSeconsLargestNumber(int[] array){
        int largestnumber=0;
        int secondlargestnumber=0;

        for(int i=0;i<array.length;i++){
            if(array[i]>largestnumber){
                secondlargestnumber=largestnumber;
                largestnumber=array[i];
            }else if(array[i]>secondlargestnumber){
                secondlargestnumber=array[i];
            }

        }
        return secondlargestnumber;
     //   System.out.println("Second Largest number is " + secondlargestnumber);
    }

    // Find given strings are anagram
    public static boolean findAnagram(String str1,String str2){
// St1= "LISTEN" str2="SILENT "
        String s1=str1.replaceAll("\\s", "");
        String s2=str2.replaceAll("\\s", "");

       if(s1.length()!=s2.length()){
           System.out.println("These strings are not anagram");
           return false;
       }else{
           char[] c1= s1.toCharArray();
           char[] c2=s2.toCharArray();
           Arrays.sort(c1);
           Arrays.sort(c2);
          return  Arrays.equals(c1, c2);

       }
    }
//Find character counts in given string
    public static HashMap<Character, Integer> findCharCount(String s){
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
          char c=  s.charAt(i);
          if(!String.valueOf(c).isBlank()){
          if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }}
        return map;
        //System.out.println(map);
    }
}
