import java.util.Scanner;

public class M3Q8
{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        String strdata[]=scn.nextLine().split(" ");
        int data[]=new int[strdata.length];
        for (int i=0;i<data.length;i++){
            data[i]=Integer.parseInt(strdata[i]);
        }
        square(data);
    }
    public static void square(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]*arr[i]+"\t");
        }
        System.out.println();
    }
}
