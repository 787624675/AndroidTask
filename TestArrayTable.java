package cn.sxt.Array;

import java.util.Arrays;

public class TestArrayTable {
    /*
    *
    * To test how the Arrays form a Table
    *
    * */
    public static void main(String[] args) {
        Object[] emp0 = {1000,"Miku",16,"Vocaloid","2006.6.6"};
        Object[] emp1 = {1001,"Luka",18,"Vocaloid","2007.6.6"};
        Object[] emp2 = {1002,"Gumi",18,"Vocaloid","2009.6.6"};

        Object[][] tableData = new Object[3][] ;

        tableData[0] = emp0;
        tableData[1] = emp1;
        tableData[2] = emp2;

        for(Object[] temp:tableData){                //Export all informations
            System.out.println(Arrays.toString(temp));

        }
    }


}
