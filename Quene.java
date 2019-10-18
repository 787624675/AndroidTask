package cn.tju.HB;

import java.lang.reflect.Type;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;


public class Quene<T> extends AbstractQueue{

    LinkedList<T> list = new LinkedList();

    public Quene(LinkedList list) {
        this.list = list;
    }




    public void clearQuene(){

        list.clear();
    }

    public boolean isEmpty(){
        if (list.isEmpty()){
            return true;
        }else {return false;}
    }

    public int length(){
        return list.size();
    }

    public Object poll() {
        if(list.isEmpty()){
            return null;
        }else {
            return list.get(0);
        }
    }

    public void enQuene(T t){

        list.add(t);

    }
    public T deQuene(){
        T temp = list.get(0);
        list.removeFirst();
        return temp;
    }

    protected interface Visit<T>{
        void operate(T t);
    }

    public void traverse(Visit visit){
        for (T e :list){
            visit.operate(e);

        }

    }




    @Override
    public Iterator iterator() {
        list.iterator();
        return null;
    }

    @Override
    public int size() {
        int size = list.size();
        return size;
    }

    @Override
    public boolean offer(Object o) {
        list.offer((T) o);
        return false;
    }


    @Override
    public Object peek() {
        list.peek();
        return null;
    }
}
