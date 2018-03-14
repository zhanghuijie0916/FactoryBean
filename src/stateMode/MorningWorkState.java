package stateMode;

public class MorningWorkState implements IState {
    @Override
    public void perform(DailyLife dl) {
        if (dl.getTime()<12){
            System.out.println("time:"+dl.getTime()+"——state：上午工作");
        }
        else {
            dl.setState(new LunchState());
            dl.perform();
        }
    }
}
