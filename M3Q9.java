import java.util.Scanner;

public class M3Q9
{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        String strdata[]=scn.nextLine().split(" ");
        int data[]=new int[strdata.length];
        for (int i=0;i<data.length;i++){
            data[i]=Integer.parseInt(strdata[i]);
        }
        bubble(data,data.length);
    }
    public static void bubble(int data[],int n){
        for (int i=0;i<data.length;i++){
            for (int j=i+1;j<data.length;j++){
                if (data[j]<data[i]){
                    int k=data[i];
                    data[i]=data[j];
                    data[j]=k;
                }
            }
        }
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+"\t");
        }
        System.out.println();
    }
}
