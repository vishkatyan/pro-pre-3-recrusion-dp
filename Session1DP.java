public class Session1DP {
    public static void sumUsingDP(int arr[], int queries[]){
        int n = arr.length;
        int dp[] = new int[n+1];
        int i=0;
        while(i<=n-1){
            if(i==0){
                dp[i]= arr[i];
            }
            else{
                dp[i] = dp[i-1] + arr[i];
            }
            i++;
        }

        for (int j = 0; j<queries.length; j++){
            int q = queries[j];
            System.out.println(dp[q]);
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,2,1,1,4};
        int queries[] = {3,2,4,1};
        sumUsingDP(arr, queries);

    }
}
