import java.io.*;
import java.util.*;


public class dalpang {
	public static void main(String[] args) throws IOException{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(buffer.readLine());
		int A = Integer.parseInt(token.nextToken());
		int B = Integer.parseInt(token.nextToken());
		int V = Integer.parseInt(token.nextToken());
		
		
		int day_cnt = 1;
		int h = 0;
		int x = V-A;
		int y = A-B;
		while(h < x) {
			h += y;
			++day_cnt;
		}
		System.out.println(day_cnt);
		
		buffer.close();
	}
}
