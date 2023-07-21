import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CountWord {

    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=1;
        System.out.println( s.length());
        for (int i=0;i<s.length()-1;i++){
            if((s.charAt(i)==' ')&&s.charAt(i+1)!=' '){
            count++;

            }
        }
        System.out.println("Total words count "+count);
    }
}
