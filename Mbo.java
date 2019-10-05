package cn.sxt.AndroidTaskComputerStore;

public class Mbo implements Work{
    String brand;
    int speed;
    double price;

    public Mbo(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        this.price = speed*20;
    }

    @Override
    public void work() {
        System.out.println("Mainboard works");
    }
}
