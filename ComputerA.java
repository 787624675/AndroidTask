package cn.sxt.AndroidTaskComputerStore;

public class ComputerA extends Computer implements Work,WorkShow {
    public ComputerA(String name ,Cpu cpu,Had had,Mbo mbo,Stg stg ){
        this.name = name;
        this.cpu = cpu ;
        this.had = had ;
        this.mbo = mbo ;
        this.stg = stg ;

    }

    @Override
    public void work() {
        System.out.println("ComputerA works");
    }

    @Override
    public void show() {
        System.out.println("name:"+name+"\n"
                +"Cpu Info:\n"+cpu.brand+"\ni"+cpu.coreNum+"\n"+cpu.price+"元"+"\n"
                +"Had Info\n"+had.brand+"\n"+had.volume+"\n"+had.price+"元"+"\n"
                +"Stg Info\n"+stg.brand+"\n"+stg.volume+"\n"+stg.price+"元"+"\n"
                +"Mbo Info\n"+mbo.brand+"\n"+mbo.speed+"\n"+mbo.price+"元"+"\n"
                );
        System.out.println("Total price:"+(cpu.price+had.price+stg.price+mbo.price));
        System.out.println("This is Computer A");
    }
}
