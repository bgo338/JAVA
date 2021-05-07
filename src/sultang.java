import java.io.*;
import java.util.*;

public class sultang {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer to = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(to.nextToken());
        int ans = -1;
        int max_5 = N/5;

        for(int i = max_5; i>=0; i--){
            if ((N-i*5)%3 == 0) {
            	ans = i+(N-i*5)/3; 
            	break;
            }              
        }
        System.out.println(ans);
    }
} 

// BEST ANSWER
//public class Main {
//
//    public static void main(String[] args) throws Exception {
//
//        int X, N = 0;
//        while ((X = System.in.read()) > 13) N = 10 * N + X - 48;
//
//        if (N == 4 || N == 7) X = -1;
//        else switch (N % 5) {
//            case 0: X = N / 5; break;
//            case 1: case 3: X = N / 5 + 1; break;
//            case 2: case 4: X = N / 5 + 2; break;
//        }
//
//        System.out.print(X);
//
//    }
//
//}