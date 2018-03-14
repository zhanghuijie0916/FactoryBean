package stateMode;

public class StopMoonWorkState implements IState {
    @Override
    public void perform(DailyLife dl) {
        if(dl.getTime()<23) {
            System.out.println("time:" + dl.getTime() + "——state：强制停止加班");
            dl.setState(new EnjoyState());
        }
        else {
            dl.setState(new SleepState());
        }
        dl.perform();

    }
}
