
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("Enter a size: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=+arr[i];
        }
        Double avg=(double )sum/n;
        System.out.println("Avg of elements is :" +avg);
    }
}
