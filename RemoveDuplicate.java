
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter an element : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            boolean duplicate=false;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate)
            {
                System.out.println(arr[i]+" ");
            }
        }
        
    }
}
