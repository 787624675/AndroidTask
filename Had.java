package cn.sxt.AndroidTaskComputerStore;

public class Had implements Work{
    String brand;
    int volume;
    double price;

    public Had(String brand, int volume) {
        this.brand = brand;
        this.volume = volume;
        this.price = volume*3;
    }

    @Override
    public void work() {
        System.out.println("hard disk works");
    }
}
