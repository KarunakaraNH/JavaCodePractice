import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {

        //Print the elements using streams1.10


        IntStream
                .range(1,10)
                .forEach(System.out::println);
        System.out.println();
    //Integer stream with skip
        IntStream.range(2,11)
                .skip(5)//first 5 values will get skipped
                .forEach(x-> System.out.println(x));

        //Integer stream with sum
        System.out.println( IntStream.range(1,5)//1 will be included and 5 will be excluded
                .sum());
        System.out.println();

        //Stream.of ,sorted and findfirst
        Stream.of("Ravan","Reven","Jeevan")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("Stream from array");

        //Stream from array, sort,filter
        String arr[]={"Rocky","Garuda","Mustafa","Rahul","Mehabob","Galaxy"};
        Arrays.stream(arr)
                .filter(e->e.startsWith("R"))
                .sorted()
                .forEach(System.out::println);
        //Average of square of int array
        int[] number={1,4};
        Arrays.stream(number)
                .map(x->x*x)
                .average()
                .ifPresent(System.out::println);


    }
};
