import javax.sound.midi.Soundbank;

@FunctionalInterface
interface MyInterface {
    //single abstract method
    double getpiValue();
}
@FunctionalInterface
interface MyInterface2{
    //with parameter
    String reverseString(String n);

}

public class LambdaExpressionExample {

    public static void main(String[] args) {

        MyInterface ref;
        ref=()-> 3.142;// no return type,method name and access modifier -> its lambda operator
        System.out.println(ref.getpiValue());

        MyInterface2 ref2;
        ref2=(str)-> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result=result + str.charAt(i);
                return result;
        };
        System.out.println("Lambda reversed "+ ref2.reverseString("Karunakara"));

    }
}
