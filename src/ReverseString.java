public class ReverseString {

    public static void main(String[] args) {
        ReverseString.reverseString("Hello World!");
    }

    public static StringBuilder reverseString(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
            //System.out.println(sb);
        }
        System.out.println("In last "+sb);
        System.out.println("In last "+sb.toString());

        return sb;
    }
}
