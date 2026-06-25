
import java.util.Scanner;

public class LargestEleMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.err.println("Enter an elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Largest:");
        int max=arr[0][0];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
        }
        System.out.println("big number is:"+max);


    }
}
