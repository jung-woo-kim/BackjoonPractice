import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        dp = new Integer[1000001];

        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        System.out.println(dp(N));


    }

    static int dp(int n){
        if (dp[n] == null){

            if (n % 6 == 0){

                dp[n] = Math.min(dp(n - 1), Math.min(dp(n / 3), dp(n / 2))) + 1;

            }else if(n % 3 == 0){

                dp[n] = Math.min(dp(n/3) + 1,dp(n-1) + 1);

            }else if(n % 2 == 0){

                dp[n] = Math.min(dp(n/2) + 1,dp(n-1) + 1);

            }else{

                dp[n] = dp(n-1) + 1;

            }

        }
        return dp[n];
    }
}
