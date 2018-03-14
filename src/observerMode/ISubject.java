package observerMode;

import java.util.ArrayList;
import java.util.List;

public abstract class ISubject {
    private String notice;  //将要发布的主题
    private List<IObserver> observers = new ArrayList<>();

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public void attachObservers(IObserver observer){
        observers.add(observer);
    }

    public void detachObservers(IObserver observer){
        observers.remove(observer);
    }

    public void notifySubject(){
        for (IObserver observer:observers) {
            observer.update();
        }
    }


}
