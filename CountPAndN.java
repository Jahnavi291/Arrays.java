import java.util.Scanner;

public class CountPAndN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr= new int[n];
        int Positive = 0;
        int Negative= 0;
        System.out.println("Enter an elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > 0) {
                Positive++;
            } else {
                Negative++;
            }
        }

        System.out.println("even numbers: " + Positive);
        System.out.println("odd numbers are : " + Negative);

    }
}
