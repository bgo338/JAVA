import java.util.*;
import java.io.*;


public class mine {
	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(buffer.readLine());
		
		int a = Integer.parseInt(token.nextToken());
		int b = Integer.parseInt(token.nextToken());
		int c = Integer.parseInt(token.nextToken());
		
		int ans;
		
		if(b>=c) ans = -1;
		else {
			ans = (a/(c-b))+1;
		}
		
		System.out.println(ans);
		
		buffer.close();
	}
	
}
