import java.lang.Math;
import java.util.*;
import java.io.*;

public class wine {
	public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] wine = new int[N+1]; //포도주의 양이 들어갈 배열
        int[] ans = new int[N+1]; //답이 될 배열
        int cnt=0;
        while(st.hasMoreTokens()){  //포도주의 양 입력
            cnt ++;
            wine[cnt] = Integer.parseInt(st.nextToken());           
            if(cnt == N+1) break;
        }
        ans[1] = wine[1];
        ans[2] = wine[1]+wine[2];
        for(int i=3; i<=N; i++){
            ans[i] = Math.max(ans[i-3]+wine[i-1]+wine[i],Math.max(ans[i-2]+wine[i],ans[i-1]));
        }
        System.out.println(ans[N]);
    }

} 