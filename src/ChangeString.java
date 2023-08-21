public class ChangeString {

    public static void main(String[] args) {
        System.out.println( ChangeString.modifyString("Shell Recharge"));
    //output should be Shell Point

    }

    public static String modifyString(String str) {

        String[] words = str.split(" ");
        StringBuilder output = new StringBuilder();

        System.out.println(words);// it will print hashcode of array object
        for (int i=0;i<words.length;i++) {
            System.out.println(words[i]);
            if (words[i].equalsIgnoreCase("Recharge")) {
                output.append("Point");
            } else {
                output.append(words[i]);
            }
        if(i<words.length-1){
            output.append(" ");
        }
        }

        return output.toString();


    }
}
