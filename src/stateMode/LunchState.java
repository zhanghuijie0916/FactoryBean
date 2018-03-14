package stateMode;

public class LunchState implements IState {
    @Override
    public void perform(DailyLife dl) {
        if (dl.getTime()<14){
            System.out.println("time:"+dl.getTime()+"——state：吃午饭");
        }
        else {
            dl.setState(new AfternoonWorkState());
            dl.perform();
        }
    }
}
