import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

 int id;
 String name;
 double price;
 public FilterDemo(int id,String name,double price)
 {
   this.id=id;
   this.name=name;
   this.price=price;
 }
 @Override
 public String toString(){
     return "ID: " + id + ", Name: " + name + ", Price: " + price;

 }
    public static void main(String[] args) {

        List<FilterDemo> productList=new ArrayList<FilterDemo>();
        productList.add(new FilterDemo(21,"Dell",43500));
        productList.add(new FilterDemo(22,"Dell",33500));
        productList.add(new FilterDemo(23,"Dell",53500));
        productList.add(new FilterDemo(24,"Dell",3500));
        productList.add(new FilterDemo(25,"Dell",93500));
       // System.out.println(productList);
       productList
                .stream().filter(p->p.price>25000)
                        .forEach(pr-> System.out.println(pr));



    }
}
