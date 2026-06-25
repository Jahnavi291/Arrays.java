import java.util.Scanner;

public class ScalarMatrix {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter an element : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter value:");
        int k=sc.nextInt();
        System.out.println("Enter an value:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println((arr[i][j]*k)+"");
            }
            System.out.println();
        }

    }
}
