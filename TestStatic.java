package cn.sxt.AndroidNationalFestivalTask;

public class TestStatic {

/*    通常情况下变量属于对象层级，每创建一个对象就要申请独立的内存空间来存放该对象独立的成员变量信息
* 若所有对象某个成员变量的数值完全一样却又单独存放会造成空间的浪费
*     为了解决上述问题，使用static关键字修饰成员变量表达静态的含义，此时该变量升级为类层级，被所有对象所共享
* 该成员变量随着类的加载准备就绪，与是否创建对象无关
*     static关键字也可以修饰成员方法，推荐使用"类名.方法"的形式访问
* */

    /*在非静态的成员方法中，既能访问静态的成员，也能访问非静态的成员（成员：成员变量和成员方法）
     * 在静态的成员方法中，只能访问静态的成员，不能访问非静态的成员，因为访问该方法时非静态的成员不一定被创建
     * */
    private int cnt = 1;   //属于对象层级，每个对象都有一份，且存储位置不同
    private static int snt = 2 ;  //属于类层级，所有对象共享一份
    public static String name = "Miku";

    //下面的方法没有static修饰，属于对象层级，所以必须先创建对象才能使用

    public void show(){
        System.out.println("cnt = " + cnt);
        System.out.println("snt = " + snt);
    }
//下面的方法被static修饰
    public static void test(){
        //System.out.println("cnt = " + cnt);//cnt报错，因为类不能访问对象（大的不能访问小的）
        System.out.println("snt = " + snt);
    }
    public static void main(String[] args){
        TestStatic test1 = new TestStatic();
        test1.show();

        TestStatic.test();

    }
    static {             //A static formulate field here,which will be done as the class initializes
        System.out.println("执行类的初始化工作");
    }

}
