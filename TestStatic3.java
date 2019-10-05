package cn.sxt.AndroidNationalFestivalTask;
import cn.sxt.AndroidNationalFestivalTask.TestStatic;   //导入了TestStatic
import static cn.sxt.AndroidNationalFestivalTask.TestStatic2.*;  //静态地导入了TastStatic2
public class TestStatic3 {
    public static void main(String[] args) {
        TestStatic.test();
        TestStatic2.TestInnerStatic.test1();    //但是依然不能直接调用内部类里的方法
        test3();                                 //可以直接调用类里的static方法


    }
}
