import java.util.ArrayList;

class Product {
    int code;
    String name;
    int price;

    public Product(int code, String name, int price){
        this.code=code;
        this.name=name;
        this.price=price;
    }
}

public class StreamFilter {


    public static void main(String[] args) {
        ArrayList<Product> al=new ArrayList<Product>();
        al.add(new Product(1,"Dell",34000));
        al.add(new Product(2,"HP",10000));
        al.add(new Product(3,"lenovo",92000));
        al.add(new Product(4,"uno",10200));

        al.stream().filter(obj->obj.price<25000).forEach(sr-> System.out.println(sr.price));

    }

}
