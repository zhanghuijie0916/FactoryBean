package stateMode;

public class SleepState implements IState {
    @Override
    public void perform(DailyLife dl) {
        if(dl.getTime()>23 || dl.getTime()<=8){
            System.out.println("time:"+dl.getTime()+"——state：晚上睡觉休息");
        }
        else {
            dl.setState(new BreakfastState());
            dl.perform();
        }
    }
}
