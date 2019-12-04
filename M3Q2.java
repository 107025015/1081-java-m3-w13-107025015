import java.util.Random;
import java.util.Scanner;

public class M3Q2
{
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int input=scn.nextInt();
        Random rand=new Random();
        rand.setSeed(input);
        for (int i=0;i<6;i++)
        {
            System.out.print(rand.nextInt(42)+1+"   ");
        }
        System.out.println();
    }
}
