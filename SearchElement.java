import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter an elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter search element: ");
        int key = sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println("Element found ");
        }
        else
        {
            System.out.println("Element not found ");
        }
         

    }
    
}
