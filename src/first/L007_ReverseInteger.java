package first;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * @author codeAC
 */
public class L007_ReverseInteger {
    public static int reverse(int x) {
        // write your code here
        List<Integer> listNum=new ArrayList<>();
        int i;
        while(x!=0){
            i=x%10;
            x/=10;
            listNum.add(i);
        }
        int temp;
        for(i=0;i<listNum.size();i++){
           temp = listNum.get(i);
           if (x>(Integer.MAX_VALUE)/10|x<(Integer.MIN_VALUE)/10){
               return 0;
           }
           x*=10;
           x+=temp;
        }
        return x;
    }
    /**优化后
    public static int reverse(int x) {
        long result =0;
        int temp = Math.abs(x);
        while(temp>0){
            result *= 10;
            result += temp%10;
            if(result>Integer.MAX_VALUE){
                return 0;
            }
            temp /=10 ;
        }
        return (int)(x>=0?result:-result);
    }
   */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        int reNum=reverse(num);
        System.out.println(reNum);
    }
}
