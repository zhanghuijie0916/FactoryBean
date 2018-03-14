package utilObserverMode;

import java.util.Observable;

public class CommunitySubject extends Observable {
    private String tips="";

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        if (!this.tips.equals(tips)){
            this.tips = tips;
            setChanged();
            notifyObservers(tips);
            clearChanged();
        }

    }

    public CommunitySubject(){}

    public CommunitySubject(String tips){
        this.tips = tips;
    }

}
