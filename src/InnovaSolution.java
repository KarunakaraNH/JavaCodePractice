public class InnovaSolution {


    public static void main(String[] args) {


        int num=12321;

        int newNumber=0;
        while(num!=0){

            newNumber=num/10;
            num=num%10;
        }
       /* if(num==newNumber){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();

        }
       */
        System.out.println("new number "+newNumber );

    }

}
