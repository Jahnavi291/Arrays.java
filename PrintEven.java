import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int even = 0;
        System.out.println("Enter an elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (a[i] % 2 == 0) {
                even++;
            } 
        }
        System.out.println("even numbers: " + even);
    }
    
}
