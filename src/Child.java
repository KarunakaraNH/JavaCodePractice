public class Child extends Parent{

    public static void main(String[] args){
        Parent.getUserName("krishna");
        System.out.println("helo");

        Parent obj=new Parent();
        int result=obj.addNumber(4,92);
        System.out.println(result);

    }


}
