package utilObserverMode;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者类
 */
public class PriceObserver implements Observer {
    private String name;

    public PriceObserver(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof HousePriceSubject){
            System.out.println("亲爱的"+this.name+":"+((HousePriceSubject) o).toString()+"——"+arg);
        }
        if(o instanceof CommunitySubject){
            System.out.println("亲爱的"+this.name+":"+"社区通知："+arg);
        }

    }
}
