package cn.sxt.AndroidNationalFestivalTask;

public class TestStatic2 {
    static void test3(){
        System.out.println("test3");
    }
    static class TestInnerStatic{   //这是一个静态的内部类
        int temp0 = 1 ;
        static int temp1 = 2 ;

        void test0(){
            System.out.println("test0");
        }
        static void test1(){
            System.out.println("test1");
        }

    }
    class TestInnerStetic2{
        int temp0 = 1;          //这是一个非静态内部类
       // static int temp1 = 2;   //报错：内部类不能进行静态声明
       void test0(){
           System.out.println("test0");
       }
//        static void test1(){
//            System.out.println("test1");   //报错：内部类不能进行静态声明
//        }
//
//    }
    public void main(String[] args) {
        System.out.println(TestStatic.name);
        TestInnerStatic.test1();           //静态内部类可以被直接调用
        //非静态内部类的下拉选项中没有test0（）方法，必须先用new来生成对象才能使用



    }


    }
}
