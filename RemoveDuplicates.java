
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter an elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("After removing:");
        for(int i=0;i<n;i++)
        {
            boolean Duplicatefound=false;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    Duplicatefound=true;
                    break;
                }
            }
            if(!Duplicatefound)
            {
                System.out.println(arr[i]+" ");
            }
        }
       
    }
}
