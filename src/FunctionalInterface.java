import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalInterface {

    public static void main(String[] args) {

        //FUnction example
        Function<String,Integer> fun1=x->x.length();//input type, output type
        int length=fun1.apply("This is an example of java function");
        System.out.println(length);

        //Binary operation-- operand of same type and producing res of same type
        BinaryOperator<Integer> fun2=(x1,x2)->x1+x2;
       int sum= fun2.apply(12,12);
        System.out.println(sum);

        ////Unary Operator -taking single argument
        UnaryOperator<Integer> fun3=x->x/12;
        int devision=fun3.apply(36);
        System.out.println(devision);

        List<String> al= Arrays.asList("Ruby","Python","Java");
        al.replaceAll(ele->ele+"Test");
        System.out.println(al);

        //Predicate --one argument , producing boolean output
        Predicate<Integer> fun5=x->x>100;
        List<Integer> intList=Arrays.asList(1,2,18,100,103,109);
        List<Integer> resultlist=new ArrayList<>();
       resultlist= intList.stream().filter(fun5).collect(Collectors.toList());
        System.out.println(resultlist);

        //Predicate with 2 argument
        Predicate<Integer> fun6=(x->x>10 &&x<20);
        resultlist=intList.stream().filter(fun6).collect(Collectors.toList());
        System.out.println(resultlist);

        //Predicate with Negate
        List<String> nameList=Arrays.asList("Naveen","Navee","Na","Java");
        Predicate<String> fun7=x->x.startsWith("Na");
        List<String> newlist=nameList.stream().filter(fun7).collect(Collectors.toList());

        //Consumer-takes single input and provides no results
        Consumer<String> fun8=x-> System.out.println(x);
        fun8.accept("Hey");

        //Supplier


    }
}
