
import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter search element: ");
        int key = sc.nextInt();
        int low = 0;
        int high = n - 1;
        int pos = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == key) {
                pos = mid + 1;
                break;
            } else if(key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(pos == -1)
            System.out.println("Element Not Found");
        else
            System.out.println("Element Found at Position " + pos);
    }

}
