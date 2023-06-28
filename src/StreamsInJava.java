import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsInJava {
    public static void main(String[] args) {
        //introduced in java8
        /* to store group of obj we go with collection
        * to process data we can stream
        * 1.Filter and 2.Map are 2 methods*/
        //Filter -collection--<filter> --put into some other collection
        //Map: get element and do some operation/ wont create new collection

        List<Integer> numberList=Arrays.asList(100,40,10);
       // List<Integer> evenNumberList=new ArrayList<Integer>();

        //without stream how we are filtering
       /* for(Integer n:numberList){
            if(n%2==0){
                evenal.add(n);
            }
        }
        System.out.println(evenal);
*/
        //filtering the data with stream concept

      // evenNumberList= numberList.stream().filter(n->n%2==0).collect((Collectors.toList())); or

      //  numberList.stream().filter(n->n%2==0).forEach((n-> System.out.println(n)));

        //sum of all element
        Optional<Integer> sum=numberList.stream().reduce((a, b)->a+b);
        System.out.println(sum);

        //Average of numbers
        double num=numberList.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(num);
    }
}
