import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static Integer[] dp = new Integer[10001];
    public static Integer[] alchol = new Integer[10001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++){
            int t = Integer.parseInt(br.readLine());
            alchol[i] = t;
        }

        dp[0] = 0;
        dp[1] = alchol[1];

        if (N > 1){
            dp[2] = alchol[1] + alchol[2];
        }

        System.out.println(grape(N));


    }

    public static int grape(int n){

        if (dp[n] == null){
            dp[n] = Math.max(Math.max(grape(n-2),grape(n-3) + alchol[n -1]) + alchol[n],grape(n-1));

        }
        return dp[n];
    }
}
