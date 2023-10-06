public class FebinociSeries {

    public int numTerms;

    public static void main(String[] args) {
        FebinociSeries.findFebinocciNum(10);

    }

    public static void findFebinocciNum(int numTerms) {
        int firstTerm = 0;
        int seconsTerm = 1;
        System.out.print(firstTerm+","+seconsTerm);

/*        for (int i = 2; i <numTerms;i++){
            int nextTerm=firstTerm+seconsTerm;//0,1,1,2,3
            System.out.print(","+nextTerm);//2
            firstTerm=seconsTerm;//1
            seconsTerm=nextTerm;//1,2
        }*/

        for(int i=2; i<numTerms;i++){
            int nextTerm=firstTerm+seconsTerm;
            System.out.println(","+nextTerm);
            firstTerm=seconsTerm;
            seconsTerm=nextTerm;
        }


    }

}
