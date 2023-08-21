import java.util.Locale;
import java.util.SplittableRandom;

public class StringManupulation {

    public static void main(String[] args) {
       String mod= StringManupulation.toggle("go beyond travel");
        System.out.println(mod);
    }

    public static String toggle(String sentence){

        String[] words=sentence.split(" ");
        // go beyond travel-- [go,beyond,travel]
         String toggle = "";
        for(String str:words){
            String first= str.substring(0,1);
            String last=str.substring(1);
            toggle+=first.toLowerCase()+last.toUpperCase()+" ";
        }
        return toggle.trim();
    }
}
