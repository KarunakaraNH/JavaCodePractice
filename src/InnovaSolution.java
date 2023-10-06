public class InnovaSolution {


    public static void main(String[] args) {


        int num=12328;

        int reversedNumber = 0;

        while (num != 0) {
            int remainder = num % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            num = num / 10;
        }

       
       /* if(num==newNumber){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();

        }
       */
        System.out.println("new number "+reversedNumber );

    }

}
