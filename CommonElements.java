
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size: ");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter an 1st element : ");
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
            
        }    
        System.out.println("Enter a  2nd size: ");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter an element : ");
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
                
        }
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(arr1[n1]==arr2[n2])
                {
                    System.out.println(arr1[i]+" ");
                    break;

                }
            }
        }
        
    }
}
