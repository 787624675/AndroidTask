package cn.sxt.AndroidTaskComputerStore;

public class Cpu implements Work{
    String brand;
    int coreNum ;
    double price ;

    public Cpu(String brand, int coreNum) {
        this.brand = brand;
        this.coreNum = coreNum;
        this.price = coreNum*300;
    }

    @Override
    public void work() {
        System.out.println("Cpu works");
    }
}
