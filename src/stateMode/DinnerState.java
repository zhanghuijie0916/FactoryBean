package stateMode;

public class DinnerState implements IState {
    @Override
    public void perform(DailyLife dl) {
        if (dl.getTime()<20){
            System.out.println("time:"+dl.getTime()+"——state：吃晚饭");
        }
        else {
            if(dl.isWorkDone()){
                dl.setState(new EnjoyState());
            }
            else {
                dl.setState(new MoonWorkState());
            }
            dl.perform();
        }
    }
}
