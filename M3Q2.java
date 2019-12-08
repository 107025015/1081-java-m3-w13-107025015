import java.util.Random;
import java.util.Scanner;

public class M3Q2
{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        Random randum=new Random();
        long input=scn.nextLong();
        randum.setSeed(input);
        for (int i=0;i<6;i++){
            int output=randum.nextInt(42)+1;
            System.out.print(output+"\t");
        }
        System.out.println();
    }
}
