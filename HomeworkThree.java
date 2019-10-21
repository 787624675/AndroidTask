package cn.tju.HB;

import java.util.*;

public class HomeworkThree {

    public List<String> startWithA(List<String> list){  //这是能够返回“以A开头的字符串 组成的list”的函数
        ArrayList<String> allTheA = new ArrayList<>();   //新建一个ArrayList
        for(String sample : list){
            char judge = sample.charAt(0);
            if(judge == 'A'){                           //把判断是A开头的字符串加入到新的ArryList中
                allTheA.add(sample);
            }
        }
        list.removeAll(list);
        list.addAll(allTheA);

        return list;                                //返回新的字符串
    }



    public <T> List<T> mapToList(T... ts){             //这是能够将“变长参数”转化为list的函数
        ArrayList<T> longable = new ArrayList<>();

        for (T sample1 : ts){
            longable.add(sample1);
        }

        return longable;
    }



    public List<String> dataProcessing(List<String> list){
        ArrayList<String> newList = new ArrayList<>();

        for (String sample2 : list){
            if (newList.isEmpty()){
               //newList为空，直接插入
                newList.add(sample2);

            }else if (sample2.length()>=newList.get(0).length()){
                // 如果被检测字符串长于第一个字符串，则将该字符串插入到最前面
                newList.add(0,sample2);

            }else if (sample2.length()<=newList.get(newList.size()-1).length()){
                  //不长于最后一个字符串，直接插入
                newList.add(sample2);


            }else {
                //处于二者中间，找一个正确的位置插入
                for (int i = newList.size()-1;i >=0 ;i--){
                    if (newList.get(i).length() >= sample2.length()){

                        newList.add(i+1,sample2);
                        break;
                        //这个break如果没有，就会导致sample2重复插入，每个比它长的字符串后面都插入一个它
                         //这个break很重要！
                    }
                }
            }

        }


        ArrayList<String> newList3 = new ArrayList();
        for (String sample4 : newList){
            newList3.add(sample4);
            newList3.add(sample4.length()+"");
        }          //补上字符串长度
        for (String sample5 : newList3){
            list.add(sample5);
        }

        for (String sample4 : newList3){
            list.add(sample4);
        }

        list.removeAll(list);
        list.addAll(newList3);

        return list;
    }


    //这是一个能去重的函数
    public <T> List<T> deduplicate(List<T> list){
        ArrayList<T> newList = new ArrayList<>();
        for (T sample3 : list){
            if (newList.contains(sample3)){
                continue;
            }else {
                newList.add(sample3);
            }
        }

        list.removeAll(list);
        list.addAll(newList);

        return list;

    }


    public static void main(String[] args) {          //这是一个用于测试上述函数功能的主函数
        List<String> test = new ArrayList<>();
        test.add("Agency");
        test.add("accurate");
        test.add("Although");
        test.add("pepper");
        test.add("Culture");
        test.add("nation");

        HomeworkThree homeworkThree = new HomeworkThree();
        System.out.println(homeworkThree.startWithA(test));    // 测试startWithA

        System.out.println(homeworkThree.mapToList(1,2,3,4,5).toString());    //测试mapToList

        test.add("kindergarten");
        test.add("sympathetic");
        System.out.println(homeworkThree.dataProcessing(test));         //测试dataProcessing
        test.add("nation");
        System.out.println(homeworkThree.deduplicate(test));             //测试deduplicate

        /*输出结果：
        *[Agency, Although]
        *[1, 2, 3, 4, 5]
        *[kindergarten, 12, sympathetic, 11, Although, 8, accurate, 8, Culture, 7, Agency, 6, pepper, 6, nation, 6]
        *[Agency, accurate, Although, pepper, Culture, nation, kindergarten, sympathetic]
        * */

        //修正后输出：
//        [Agency, Although]
//[1, 2, 3, 4, 5]
//[kindergarten, 12, sympathetic, 11, Although, 8, Agency, 6]
//[kindergarten, 12, sympathetic, 11, Although, 8, Agency, 6, nation]
//
//        Process finished with exit code 0
    }
}
