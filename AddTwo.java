
import java.util.Scanner;

public class AddTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] a=new int[r][c];
        int [][] b=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sum Matrix:");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print((a[i][j]+b[i][j])+" ");
            }
            System.out.println();
        }

    }
}
