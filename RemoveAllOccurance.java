
import java.util.Scanner;

public class RemoveAllOccurance {
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
        System.out.println("Enter element to remove : ");
        int key=sc.nextInt();
        System.out.println("After remove");
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=key)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
