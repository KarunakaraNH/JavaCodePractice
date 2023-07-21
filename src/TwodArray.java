public class TwodArray {

    public static void main(String[] args) {
        //multid array
        int[][] marray = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                marray[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(marray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
