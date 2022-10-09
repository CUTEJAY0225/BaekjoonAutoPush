import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        
        System.out.println(a*(b.charAt(2)-'0')); // 아스키코드 51-48 // charAt() 괄호안 인덱스 자리 뽑아와줌
        System.out.println(a*(b.charAt(1)-'0'));
        System.out.println(a*(b.charAt(0)-'0'));
        System.out.println(a*Integer.parseInt(b));
    }
}