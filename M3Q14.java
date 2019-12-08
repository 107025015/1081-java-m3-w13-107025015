import java.util.Scanner;

public class M3Q14
{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int A[][]=new int[n][n];
        int B[][]=new int[n][n];
        int count=1;
        for (int i=0;i<n;i++){
            if (i%2==0){
                for (int j=0;j<n;j++){
                    A[i][j]=count;
                    B[j][i]=count;
                    count=count+1;
                }
            }
            else {
                for (int j=n-1;j>=0;j--){
                    A[i][j]=count;
                    B[j][i]=count;
                    count=count+1;
                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
