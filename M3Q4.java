import java.util.Scanner;

public class M3Q4
{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int w=scn.nextInt();
        int h=scn.nextInt();
        F(w,h);
    }
    public static void F(int w,int h){
        for (int i=1;i<=h;i++){
            for (int j=1;j<=w;j++){
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}
