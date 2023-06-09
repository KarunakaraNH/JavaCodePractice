import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string here");
        String input=sc.nextLine();

        boolean status=false;
        sc.close();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        int count=1;
        for(int i=0;i<input.length();i++){
            Character ch=input.charAt(i);
            if(map.get(ch)==null){
                map.put(ch,count);
            }
            else{
                map.put(ch,count+1);
            }
        }

        for(int j=0;j<input.length();j++)
        {
             Character ch=input.charAt(j);
             if(map.get(ch)==1){
                 System.out.println("1st non repeating char is "+ch);
                 status=true;
                 break;
             }

        }
        if(!status){
            System.out.println("No char is unique");
        }

    }
}
