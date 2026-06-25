import java.util.Scanner;

public class Interchange {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size: ");
        int n=sc.nextInt();

        int arr[][]=new int[n][n];

        System.out.println("Enter matrix:");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();

        for(int i=0;i<n;i++){
            int temp=arr[i][i];
            arr[i][i]=arr[i][n-1-i];
            arr[i][n-1-i]=temp;
        }

        System.out.println("Result Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }

}
