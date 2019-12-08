import java.util.Scanner;

public class M3Q10
{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int input[]=new int[n];
        for (int i=0;i<n;i++){
            input[i]=scn.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            int multiply=input[i];
            for (int j=i+1;j<n;j++){
                multiply=multiply*input[j];
                if (multiply>max){
                    max=multiply;
                }
            }
        }
        System.out.println(max);
    }
}
