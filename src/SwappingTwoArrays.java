import java.util.Scanner;

public class SwappingTwoArrays {

    public static void main(String[] args) {
        int a[]=new int[10];
        int b[]=new int[10];
        int c[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A's array element");
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("Enter B's Array element");
        for(int i=0;i<10;i++){
            b[i]=sc.nextInt();

        }

        System.out.println("A array elements");
        for(int i=0;i<10;i++){
            System.out.println(a[i]);

        }
        System.out.println("B array elements");
        for(int i=0;i<10;i++){
            System.out.println(b[i]);

        }

        for(int i=0;i<10;i++){
            c[i]=a[i];
            a[i]=b[i];
            b[i]=c[i];

        }

        System.out.println("After swapping- A array elements");
        for(int i=0;i<10;i++){
            System.out.println(a[i]);

        }
        System.out.println("After swapping -B array elements");
        for(int i=0;i<10;i++){
            System.out.println(b[i]);

        }

    }
}
