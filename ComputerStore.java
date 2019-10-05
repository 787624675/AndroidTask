package cn.sxt.AndroidTaskComputerStore;

import java.util.ArrayList;

public class ComputerStore {
    public static void main(String[] args) {


        ComputerA computerA = new ComputerA("computerA", new Cpu("Intel", 9),
                new Had("Seagate",1024),
                new Mbo("Asus",64),
                new Stg("Samsung",32));
        ArrayList<Object> Cart = new ArrayList<Object>();      //This is a shopping cart.
        Cart.add(computerA);
        computerA.show();
        computerA.work();
        computerA.cpu.work();
        computerA.mbo.work();
        computerA.stg.work();
        computerA.had.work();
    }

}
