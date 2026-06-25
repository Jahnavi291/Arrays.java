
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("Enter an elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("sum of elements :"+sum);
    }
}
