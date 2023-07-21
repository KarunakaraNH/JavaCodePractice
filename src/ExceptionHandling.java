public class ExceptionHandling {

    public static void main(String[] args) {

       // System.out.println("entry");
     //   Thread.sleep(402);//checked expception-- identfied by java compiler ex:Interrupted exception,IOException

        //Product for unchecked exception
        try {
            int i = 120;
            int sum = i / 0;
            System.out.println("exit");
        }
            catch(ArithmeticException e){
                System.out.println(e.getMessage());


        }
        System.out.println("Nullpointer exception");
      /*  try{
            String s=null;
            s.length();
        }
        catch (Exception e){
            e.getMessage();

        }
        finally {
            System.out.println("message");
        }*/
    }
}
