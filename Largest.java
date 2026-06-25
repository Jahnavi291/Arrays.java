
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int max=0;
        System.out.println("Enter an elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("largest element is:"+max);
    }
}
