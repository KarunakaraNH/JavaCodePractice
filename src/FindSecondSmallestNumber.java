import java.util.Arrays;

public class FindSecondSmallestNumber {

    public static void main(String[] args) {
        int[] number={1,20,9999,200101,91};
        System.out.println( "second smallest number is "+findSmallest(number));
    //    System.out.println("second largest number is "+finsSeconsHighest(number));
    }

    public static int findSmallest(int[] array){
      int secondSmallestNumber=  Arrays.stream(array).distinct().sorted().skip(1).findFirst().orElseThrow(()->new IllegalArgumentException());
        return secondSmallestNumber;
    }

   /* public static int finsSeconsHighest(int[] array){
       return Arrays.stream(array).distinct().sorted((a,b)->Integer.compare(b,a)).skip(1).findFirst().orElseThrow(()->new IllegalArgumentException("Array is empty"));


    }*/
}
