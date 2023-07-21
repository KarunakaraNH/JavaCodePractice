import java.util.Scanner;

public class FindPerfectNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i=1,sum=0;
        System.out.println("Enter any number");
        n=sc.nextInt();
        while (i<n){
            if (n%i==0) {
                sum = sum + i;
            }
            i++;
        }
        if(sum==n){
            System.out.println("This is perfect number");
        }else {
            System.out.println("not a perfect number");
        }

    }
}
