import java.util.Scanner;

public class M3Q1
{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        String x=scn.next();
        for (int i=0;i<x.length();i++){
            System.out.print(x.charAt(x.length()-i-1));
        }
        System.out.println();
    }
}
