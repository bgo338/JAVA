import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String input = bf.readLine(); 
    int A =0;//�������(�Ӵ��+���꼼+�����....)
    int B=0;//�������(����+�ΰǺ�..)
    int C=0;//��Ʈ�� ����

    //�Ѽ���(�Ǹ� ���)> �Ѻ��(�������+�������) -> ���ͺб���
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