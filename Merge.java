
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st size: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter 1st array:");
        for(int i=0;i<n1;i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter 2nd size: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter 2nd array:");
        for(int i=0;i<n2;i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n1+n2];
        for(int i=0;i<n1;i++)
            c[i]=a[i];
        for(int i=0;i<n2;i++)
            c[n1+i]=b[i];
        System.out.println(" merge Array:");
        for(int i=0;i<c.length;i++)
            System.out.print(c[i]+" ");
    }

}
