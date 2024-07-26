import java.util.Scanner;

public class Session4DPPart1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scr.nextInt();
        int arr[] = new int[n];
        int size = arr.length-1;
        System.out.println("Element: ");
        int i=0;
        while(i<n){
            arr[i] = scr.nextInt();
            i++;
        }
        int dp[] = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(arr[0] - arr[1]);
        int j = 2;
        while(j<n){
            int x = Math.abs(arr[j-1] - arr[j]) + dp[j-1];
            int y = Math.abs(arr[j-2] - arr[j]) + dp[j-2];
            dp[j] = Math.min(x, y);
            System.out.println(j + " : " + dp[j]);
            j++;
        }
        System.out.println(dp[size]);
    }
}
