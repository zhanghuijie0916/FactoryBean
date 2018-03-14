package singletonMode;

import java.util.List;

public class ChinaCountry extends Country {
    private static ChinaCountry china;

    @Override
    public String describe() {
        return this.getName()+" is a big and strong country,"+"it has"+this.getPopulation()+
                " population,it's cities are "+this.getCities();
    }

    private ChinaCountry(){}

    /**
     * 饿汉式
     * @return
     */
    /*public static Country getInstance(){
        return china;
    }*/


    /**
     * 懒汉式
     * @return
     */
    public static Country getInstance(){
        if (china==null){
            synchronized (ChinaCountry.class){
                if (china == null){
                    china =  new ChinaCountry();
                }
            }
        }
        return china;
    }


}
