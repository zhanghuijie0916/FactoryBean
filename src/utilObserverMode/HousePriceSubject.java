package utilObserverMode;

import java.util.Observable;

/**
 * 发布消息的类：被观察者类
 */
public class HousePriceSubject extends Observable {
    private double price = 0;

    public HousePriceSubject(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (this.price < price){
            this.price = price;
            setChanged();
            notifyObservers("the house price is higher!");
            clearChanged();
        }
        else if(this.price > price){
            this.price = price;
            setChanged();
            notifyObservers("the house price is lower");
            clearChanged();
        }
    }

    @Override
    public String toString() {
        return "当前价格是："+ price;
    }

    public void show(){
        System.out.println(toString());
    }


}

