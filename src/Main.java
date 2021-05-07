import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String input = bf.readLine(); 
    int A =0;//고정비용(임대료+제산세+보험료....)
    int B=0;//가변비용(재료비+인건비..)
    int C=0;//노트북 가격

    //총수입(판매 비용)> 총비용(고정비용+가변비용) -> 손익분기점
    //C*k > A+B*k
    //  A/(C-B)
    StringTokenizer st =new StringTokenizer(input);
    A=Integer.parseInt(st.nextToken());
    B=Integer.parseInt(st.nextToken());
    C=Integer.parseInt(st.nextToken());

    int ans;

    if((C-B)<=0){
      ans=-1;
    }else{
      ans = A/(C-B)+1;
    }
    System.out.println(ans);
  }
    
}