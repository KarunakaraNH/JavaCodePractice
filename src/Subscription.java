

import java.util.Scanner;

public class Subscription
{
    static float[] TOI = {3f,3f,3f,3f,3f,5f,6f};  //total = 26
    static float[] Hindu = {2.5f,2.5f,2.5f,2.5f,2.5f,4f,4f};  //total = 20.5
    static float[] ET = {4f,4f,4f,4f,4f,4f,10f};              //total = 34
    static float[] BM = {1.5f,1.5f,1.5f,1.5f,1.5f,1.5f,1.5f}; //total = 10.5
    static float[] HT = {2f,2f,2f,2f,2f,4f,4f};               //total = 18

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Expected Budget to buy set of newspaper is: ");
        int ExpectedBudget= sc.nextInt();

        float TOIHindu = TOItotal(TOI)+Hindutotal(Hindu);
        float TOIET    = TOItotal(TOI)+ETtotal(ET);
        float TOIBM    = TOItotal(TOI)+BMtotal(BM);
        float TOIHT    = TOItotal(TOI)+HTtotal(HT);
        float HinduET  = Hindutotal(Hindu)+ETtotal(ET);
        float HinduBM  = Hindutotal(Hindu)+BMtotal(BM);
        float HinduHT  = Hindutotal(Hindu)+HTtotal(HT);
        float ETBM     = ETtotal(ET)+BMtotal(BM);
        float ETHT     = ETtotal(ET)+HTtotal(HT);
        float BMHT     = BMtotal(BM)+HTtotal(HT);

        if(ExpectedBudget>=TOIHindu)
        {

            System.out.println("("+ "\"TOI\"" + "," + "\"Hindu\"" + ")");
            System.out.print(",");
        }
        if(ExpectedBudget>=TOIET)
        {

            System.out.print("("+ "\"TOI\"" + "," + "\"ET\"" + ")");
            System.out.print(",");
        }
        if(ExpectedBudget>=TOIBM)
        {

            System.out.print("("+ "\"TOI\"" + "," + "\"BM\"" + ")");
            System.out.print(",");
        }
        if(ExpectedBudget>=TOIHT)
        {

            System.out.print("("+ "\"TOI\"" + "," + "\"HT\"" + ")");
            System.out.print(",");
        }
        if(ExpectedBudget>=BMHT)
        {

            System.out.print("("+ "\"BM\"" + "," + "\"HT\"" + ")");
            System.out.print(",");
        }
        if(ExpectedBudget>=HinduET)
        {

            System.out.print("("+ "\"Hindu\"" + "," + "\"ET\"" + ")");
            System.out.print(",");
        }
        if(ExpectedBudget>=HinduBM)
        {

            System.out.print("("+ "\"Hindu\"" + "," + "\"BM\"" + ")");
            System.out.print(",");
        }
        if(ExpectedBudget>=HinduHT)
        {

            System.out.print("("+ "\"Hindu\"" + "," + "\"HT\"" + ")");
            System.out.print(",");
        }
        if(ExpectedBudget>=ETBM)
        {

            System.out.print("("+ "\"ET\"" + "," + "\"BM\"" + ")");
            System.out.print(",");
        }
        if(ExpectedBudget>=ETHT)
        {

            System.out.print("("+ "\"ET\"" + "," + "\"HT\"" + ")");
            System.out.print(",");
        }
    }

    public static float TOItotal(float[] TOI) {

        float sum = 0;
        for (int i = 0; i < TOI.length; i++) {
            sum += TOI[i];
        }

        return sum;
    }

    public static float Hindutotal(float[] Hindu) {
        float sum = 0;
        for (int i = 0; i < Hindu.length; i++) {
            sum += Hindu[i];
        }
        return sum;
    }

    public static float ETtotal(float[] ET) {
        float sum = 0;
        for (int i = 0; i < ET.length; i++) {
            sum += ET[i];
        }
        return sum;
    }

    public static float BMtotal(float[] BM) {
        float sum = 0;
        for (int i = 0; i < BM.length; i++) {
            sum += BM[i];
        }
        return sum;
    }

    public static float HTtotal(float[] HT) {
        float sum = 0;
        for (int i = 0; i < HT.length; i++) {
            sum += HT[i];
        }
        return sum;
    }
}









