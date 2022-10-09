import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = {1,1,2,2,2,8};
        int[] input = new int[6]; // 배열의 길이가 6인 int형 배열 생성
        for(int i=0; i<a.length; i++){
            input[i] = sc.nextInt(); // 형변환
            System.out.print(a[i]-input[i]+" ");
        }
    }
}