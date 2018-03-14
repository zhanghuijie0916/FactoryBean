package stateMode;

public class AfternoonWorkState implements IState {
    @Override
    public void perform(DailyLife dl) {
        if(dl.getTime()<18){
            System.out.println("time:"+dl.getTime()+"——state：下午工作");
        }
        else {
            dl.setState(new DinnerState());
            dl.perform();
        }
    }
}
