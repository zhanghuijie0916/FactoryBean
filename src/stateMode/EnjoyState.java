package stateMode;

public class EnjoyState implements IState {
    @Override
    public void perform(DailyLife dl) {
        if(dl.getTime()<23){
            System.out.println("time:"+dl.getTime()+"——state：娱乐时间");
        }
        else {
            dl.setState(new SleepState());
            dl.perform();
        }
    }
}
