package cn.sxt.AndroidNationalFestivalTask;

import java.util.ArrayList;
import java.util.Scanner;

public class TestFibonacci<a> {
    //用递归实现
    public static int fibonacci(int i){
        int x = 1;
        if (i == 1)
            return 1 ;
        if(i == 2){
            return 1 ;

        }

        if (i >= 3) {
            x = fibonacci(i-2) + fibonacci(i - 1) ;
            return x ;
        }
        return 0 ;
    }
    //用Arraylist实现（原因：不能定义长度不定的数组）
    public static int fibonacci2(int i) {

        ArrayList<Integer> list = new ArrayList<Integer>() ;
        list.add(0);
        list.add(1);
        list.add(1);
        if ( i == 1 )
            return list.get(1) ;
        if ( i == 2 )
            return list.get(2) ;
        if ( i >= 3)
        {
            for (int k = 3 ; k <= i ; k++)
            {
                list.add(list.get(k - 2) + list.get(k - 1));
            }
            return list.get(i);
        }


        return 0 ;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入i的值");
        int loop1 = 1 ;
        while(loop1 == 1) {
            int i = scanner.nextInt();
            int num = fibonacci(i);
            System.out.println("第"+i+"个斐波那契数是"+num);

        }
    }

}
