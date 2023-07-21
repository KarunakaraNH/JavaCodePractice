public class OccuranceOfCharacter {


    public static void main(String[] args) {
        OccuranceOfCharacter.findOccurenceOfCharacter("Java language");

    }
    public static void findOccurenceOfCharacter(String str){

       int initial_length=str.length();
       int new_length=str.replace("a","").length();
      int diff=initial_length-new_length;
        System.out.println("Occurance of a is "+diff);

    }
}
