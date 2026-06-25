import java.util.Scanner;

public class SmallestEleMatrix {
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
        System.out.println("smallest:");
        int min=arr[0][0];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                }
            }
        }
        System.out.println("small number is:"+min);


    }
}
