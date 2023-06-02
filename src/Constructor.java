public class Constructor {

    //its special method in java which is called when obj of class is created
    //it has same name as class name and it return no values
    private String name;
    Constructor(){
        System.out.println("in constuctor");
    }
    public static void main(String[] args){

        Constructor obj=new Constructor();
        obj.name="your name";
    }
}
