import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElements {

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={3,4,5,7,8};
        findCommonElements(arr1,arr2);
        String[] names={"Vijay","Elon","zukerberg","pichai"};
        maxLengthOfString(names);

    }

    public static void findCommonElements(int[] arr1, int[] arr2){

       List<Integer> common= Arrays.stream(arr1)

                .filter(number->Arrays.stream(arr2).anyMatch(array2number->array2number==number)).boxed().collect(Collectors.toList());
        System.out.println("common elements in both the arrays are "+common);
    }

    public static void maxLengthOfString(String[] array){

        int len=Arrays.stream(array).mapToInt(str->str.length()).max().orElse(0);
        System.out.println("max length of string in the array element is "+len);

    }

}
