package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9465 {

    static Integer[][] dp;
    static Integer[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int k =0; k < t; k++){
            int N = Integer.parseInt(br.readLine());

            arr = new Integer[N+1][2];
            dp = new Integer[N+1][2];


            for (int i = 0; i < 2; i++){
                st = new StringTokenizer(br.readLine()," ");
                for (int j = 1; j <= N; j++){
                    arr[j][i] = Integer.parseInt(st.nextToken());
                }
            }

            dp[1][0] = arr [1][0];
            dp[1][1] = arr [1][1];
            dp[2][0] = arr[1][1] + arr[2][0];
            dp[2][1] = arr[1][0] + arr[2][1];


            sb.append(Math.max(recur(N,0),recur(N,1))).append('\n');
        }

        System.out.println(sb);

    }

    static int recur(int n, int val){
        if (dp[n][val] == null){
            if (val == 0){
                dp[n][val] = Math.max(recur(n-1,1),Math.max(recur(n-2,0),recur(n-2,1)))+arr[n][val];
            }else{
                dp[n][val] = Math.max(recur(n-1,0),Math.max(recur(n-2,0),recur(n-2,1)))+arr[n][val];
            }

        }
        return dp[n][val];
    }

}
