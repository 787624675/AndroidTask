package cn.sxt.AndroidTaskComputerStore;

public class Stg implements Work{
    String brand;
    int volume;
    double price;

    public Stg(String brand, int volume) {
        this.brand = brand;
        this.volume = volume;
        this.price = volume*50+60;
    }

    @Override
    public void work() {
        System.out.println("Storage works");
    }
}
