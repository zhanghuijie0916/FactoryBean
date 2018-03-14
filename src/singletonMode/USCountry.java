package singletonMode;

import java.util.List;

public class USCountry extends Country {
    private static ChinaCountry china;

    @Override
    public String describe() {
        return this.getName()+" is a big and strong country,"+"it has"+this.getPopulation()+
                " population,it's cities are "+this.getCities();
    }

    private USCountry(){}



    //类级内部类
    private static class Instance{
        private static final USCountry us = new USCountry();
    }

    /**
     * 实例化
     * @return
     */
    public static USCountry getInstance(){
        return Instance.us;
    }
}
