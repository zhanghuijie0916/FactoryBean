package stateMode;

public class BreakfastState implements IState {
    @Override
    public void perform(DailyLife dl) {
        if (dl.getTime()<9 && dl.getTime()>8){
            System.out.println("time:"+dl.getTime()+"——state：吃早饭");
        }
        else {
            dl.setState(new MorningWorkState());
            dl.perform();
        }
    }
}
