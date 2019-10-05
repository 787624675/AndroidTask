package cn.sxt.Array;

public class TestArray {
    public static void main(String[] args){
        String[] s1 = {"aa" , "bb" , "cc" , "dd","ee"};
        String[] s2 = new String[10] ;
        //Copy s1 to s2
        System.arraycopy(s1,2,s2,6,2);
        for(int i = 0 ; i < s2.length ; i++) {
            System.out.println(i + "--" + s2[i]);
        }
        //Delete "cc" from s1 and load it with s3
        String[] s3 = new String[10];
        System.arraycopy(s1,3,s3,3-1,s1.length-3);
        for(int i = 0 ; i < s3.length ; i++) {
            System.out.println(i + "--" + s3[i]);
        }
        //Delete "cc" from s1,but mantain the original elements
        System.arraycopy(s1,3,s1,3-1,s1.length-3);
        for(int i = 0 ; i < s1.length ; i++) {
            System.out.println(i + "--" + s1[i]);
        }

        TestArray.extendRange();





    }

//Capusulate the fuction "delete"
    public static String[] delete( String[] s ,int index){
        System.arraycopy(s,index + 1,s,index,s.length-index-1);
        s[s.length-1] = null ;
        for(int i = 0 ; i < s.length ; i++) {
            System.out.println(i + "--" + s[i]);

    }
        return s ;

}
//Write a function to extend the range of a array
public static void extendRange(){
        String s1[] = {"aa","bb","cc"};
        String[] s2 = new String[s1.length+10] ;

        System.arraycopy(s1,0,s2,0,s1.length);
        for(String temp :s2){
            System.out.println(s2);
        }

}
}