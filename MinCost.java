import java.util.Arrays;
import java.util.Scanner;
public class MinCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMin(arr, n));
        sc.close();
    }

    static int findMin(int[] arr,int n) {
        int cost = 0;
        Arrays.sort(arr);
        int j =0;
        for(int i=n-1;i>=0;i--) {
            cost += arr[i] * (j+1);
            j++;
        }
        return cost;
    }
}