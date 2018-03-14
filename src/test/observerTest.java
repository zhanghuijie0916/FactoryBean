package test;

import observerMode.*;
import utilObserverMode.CommunitySubject;
import utilObserverMode.HousePriceSubject;
import utilObserverMode.PriceObserver;

import java.util.Observer;

public class observerTest {
    public static void main(String[] args){
        ISubject bossSubject = new BossSubject();
        IObserver observer1 = new StockObserver("zhangsan",bossSubject);
        IObserver observer2 = new NBAObserver("lisi",bossSubject);
        bossSubject.attachObservers(observer1);
        bossSubject.attachObservers(observer2);
        bossSubject.setNotice("boss come in!");
        bossSubject.notifySubject();

        Observer ob1 = new PriceObserver("张三");
        Observer ob2 = new PriceObserver("李四");
        Observer ob3 = new PriceObserver("王五");
        Observer ob4 = new PriceObserver("钱六");

        CommunitySubject cs = new CommunitySubject();
        cs.addObserver(ob1);
        cs.addObserver(ob2);
        cs.addObserver(ob3);

        HousePriceSubject hs = new HousePriceSubject(20000);
        hs.addObserver(ob2);
        hs.addObserver(ob4);

        cs.setTips("明天全小区检查卫生");
        hs.setPrice(30000);
    }
}
