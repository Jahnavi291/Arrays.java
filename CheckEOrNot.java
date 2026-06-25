
import java.util.Scanner;

public class CheckEOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size : ");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        boolean equal=true;
        for(int i=0;i<n;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                equal=false;
                break;
            }
        }
        if(equal)
    
            System.out.println(" Equal");
        else
            System.out.println(" Not Equal");

    }
}
