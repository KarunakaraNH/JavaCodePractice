import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StreamMain {
        //we have created list of places
      static List<String> places=new ArrayList<String>();

      public static List getplaces(){
          places.add("Nepal,Katmandu");
          places.add("Nepal,pokara");
          places.add("Boothan,gudde");
          places.add("Boothen,isss");
          places.add("Lanka,lanka");
          return places;

      }

    public static void main(String[] args) {

          List<String> myplaces=places;
          System.out.println("Places from Nepal");
        //Filter places from Nepala
//        myplaces.stream().filter((p)->p.startsWith("Nepal"))
//                .map((p)->p.toUpperCase())
//                .sorted()
//                .forEach((p)-> System.out.println(p));

        myplaces.stream()
                .filter((p) -> p.startsWith("Nepal"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));

    }
}
