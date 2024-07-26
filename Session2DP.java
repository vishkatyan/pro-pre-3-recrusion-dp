import java.util.Scanner;

public class Session2DP {
    public static void elePair(int arr[]){
        int n = arr.length;
        int []dp = new int[n+1];
        int l = 0;
        dp[1] =Math.max(arr[1], l);
        dp[2] = Math.max(arr[1], Math.max( arr[2],l));
        int i=3;
        while(i<n){
            dp[i] = Math.max(dp[i-1],arr[i]+dp[i-2]);
            i++;
        }
        System.out.println(dp[n]);
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = scr.nextInt();
        int arr[] = new int[n+1];
        int i=1;
        System.out.println("Enter elements: ");
        while(i<=n){
            arr[i] = scr.nextInt();
            i++;
        }
        elePair(arr);

    }
}
