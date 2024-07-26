import java.util.Arrays;
import java.util.Scanner;

public class Session3DP {
    public static void elePair(int arr[], int brr[]){
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp, 0);
        dp[0] =Math.max(arr[0], brr[0]);
        dp[1] = Math.max(arr[0], Math.max( arr[1],brr[1]));
        int i=2;
        while(i<n){
            dp[i] = Math.max(dp[i-1],Math.max(arr[i]+dp[i-2], brr[i]+dp[i-2]));
            System.out.println( i + " : "+ dp[i]);
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = scr.nextInt();
        int arr[] = new int[n+1];
        int brr[] = new int[n+1];
        int i=0;
        System.out.println("Enter elements: ");
        while(i<n){
            arr[i] = scr.nextInt();
            i++;
        }
        int j =0;
        System.out.println("Enter elements: ");
        while(j<n){
            brr[j] = scr.nextInt();
            j++;
        }
        elePair(arr,brr);
    }
}
