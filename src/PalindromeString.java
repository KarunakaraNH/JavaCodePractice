public class PalindromeString {

    public static void main(String[] args) {

        String s="madam";
        String reverse="";

        for(int i=s.length()-1;i>=0;i--){

           reverse= String.valueOf(s.charAt(i));
         //   reverse= s.charAt(i);


        }
        if(s.equals(reverse)){
            System.out.println("string is palindorm");
        }
        else{
            System.out.println("string is not palindrome");
        }
    }
}
