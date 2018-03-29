package first;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 罗马数字七个基本符号：I（1）、V（5）、X（10）、L（50）、C（100）、D（500）、 M（1000）
 * @author codeAC
 * @date 2018/3/29 19:10
 */
public class L013_Roman_To_Inteager {
    public int romanToInt(String s) {
        //定义两个临时变量分别存储这次的罗马数字值和下次的
        int num = 0,temp=0,temp2=0;
        char[] arr = s.trim().toUpperCase().toCharArray();
        for(int i =0 ;i<arr.length;i++){
            switch (arr[i]){
                case 'I': temp=1;break;
                case 'V': temp=5;break;
                case 'X': temp=10;break;
                case 'L': temp=50;break;
                case 'C': temp=100;break;
                case 'D': temp=500;break;
                case 'M': temp=1000;break;
                default:break;
            }
            //当此时的罗马数字值小于上次的时，组合数的值为大数减去小数
            if(temp>temp2){
                num+=(temp-2*temp2);
            }
            else{
                num+=temp;
            }
            temp2 =  temp;

        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        L013_Roman_To_Inteager test = new L013_Roman_To_Inteager();
        System.out.println(test.romanToInt(str));
    }
}
