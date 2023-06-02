public class Arrays {
    public static void main(String[] args){
        int[] student_array=new int[10];
        student_array[0]=101;
        student_array[1]=102;
        student_array[2]=103;
        student_array[3]=104;
        student_array[4]=105;
        student_array[5]=106;
        student_array[6]=107;
        student_array[7]=108;
        student_array[8]=109;
        student_array[9]=110;

        String[] std_name={"Karun","Varun"};//declaring and instantiating array in same line
        //for loop method to retrieve the array elements
        for(int i=0;i<student_array.length;i++)
        {
            System.out.println("Array element at index "+ i + " is "+student_array[i]);
        }
        //for each or enhanced for loop to retrive the data
        for(String ele:std_name){
            System.out.println(ele);
        }
        //MultiDimentional array
        int[][] multiarray=new int[2][3];
        multiarray[0][0]=10;
        multiarray[0][1]=30;
        multiarray[0][2]=20;
        multiarray[1][0]=42;
        multiarray[1][1]=84;
        multiarray[1][2]=645;
        System.out.println("1st row length "+multiarray[0].length);
        for(int i=0;i<multiarray.length;i++){
            for(int j=0;j<multiarray[i].length;j++){
                System.out.println(multiarray[i][j]);
            }
        }

        //retrieving data using for each loop from multi d array
        for(int[] innerArray:multiarray){
            for(int ele:innerArray){
                System.out.println("using for loop "+ ele);
            }
        }
    }
}
