
import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Size:");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        System.out.println("Enter an Elements: ");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=arr1[i];
        }
        System.out.println("Copied Elements: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr2[i]+" ");
        }
        
    }
}
