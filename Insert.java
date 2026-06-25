import java.util.Scanner;

public class Insert {
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
        System.out.println("Enter a Position :");
        int pos=sc.nextInt();
        System.out.println("Enter an element");
        int ele=sc.nextInt();
        for(int i=n;i>=pos-1;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1]=ele;
        System.out.println("After insertion:");
        for(int i=0;i<=n;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }
}
