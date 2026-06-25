import java.util.Scanner;

public class Delete {
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
        System.out.println("Enter Position");
        int pos=sc.nextInt();
        System.out.println("Enter an element");
        int ele=sc.nextInt();
        for(int i=pos-1;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        System.out.println("After deletion");
        for(int i=0;i<n-1;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
