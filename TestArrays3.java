package cn.sxt.Array;

import java.util.Arrays;

public class TestArrays3 {
    public static void main(String[] args){
        int[] a = {10,20,30,0};
        System.out.println(a[0]);     //Export 10
        System.out.println(a);      //Export the hashcode of a
        System.out.println(a.toString());   //Export hashcode
        System.out.println(Arrays.toString(a)); //Export all elements in a within a pair of []
        //System.out.println(a.toString(a));   //Error
        Arrays.sort(a);             //The function "Arrays.sort()" is capacity to lay sequence from small to big
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.binarySearch(a,30));//To find whether 30 is in a and export its index

    }
}
