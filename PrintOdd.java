import java.util.Scanner;

public class PrintOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int odd = 0;
        System.out.println("Enter an elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (a[i] % 2 != 0) {
                odd++;
            } 
        }
        System.out.println("odd numbers: " + odd);
    }
}
