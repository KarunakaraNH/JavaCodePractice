import javax.sound.midi.Soundbank;
//in earlier version of java to implements interface we have to implements through another call
//which will make to maintance more files
@FunctionalInterface
interface lambda{
    public void getSumValue();

//before Java 8
public class B implements lambda{


    @Override
    public void getSumValue() {
        System.out.println("We are in class B which implements A");

    }
}

}
public class LambdaExpression2 {

    public static void main(String[] args) {
        // Concept of Anonymous inner class(class inside class)
       /* lambda obj=new lambda() {
            @Override
            public void getSumValue() {
                System.out.println("hello we are in anonymous inner class");
            }
        };*/

         lambda obj=()-> System.out.println("hello we are in anonymous inner class lambda");//we removed curl braces since we ha e one line of code



       obj.getSumValue();
    }
}
