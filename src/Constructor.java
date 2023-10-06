public class Constructor {

    //its special method in java which is called when obj of class is created
    //it has same name as class name and it return no values
    private String name;
    Constructor(){
        super(); // super method is first sentence inside constructor even if we dont mention it
        System.out.println("in constuctor");
    }
    public static void main(String[] args){

        String sentence="This is an automation testing company";
        StringBuffer reverse=new StringBuffer();
        String[] word=sentence.split(" ");
        System.out.println(word.length);


        for(int i=word.length-1;i>=0;i--){
           // System.out.println(word[i]);
            reverse.append(word[i]+" ");


        }

        System.out.println(" reverse is "+reverse);
        Constructor obj=new Constructor();
        obj.name="your name";

      //  Constructor.fincharoccurence('a');
    }

 /*   public static int fincharoccurence(Char char){
        String name="Java";
        int count=0;
        for(char ch:name){
            if(ch==char){
                count++;
            }
        }
        return count;

    }*/
}
