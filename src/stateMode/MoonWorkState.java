package stateMode;

public class MoonWorkState implements IState {
    @Override
    public void perform(DailyLife dl) {
        //不管是因为工作完成了还是因为时间到了该停止工作的时间了，都转向停止工作类。
        if(dl.isWorkDone() || dl.getTime()>21.6){
            dl.setState(new StopMoonWorkState());
        }else {
            System.out.println("time:"+dl.getTime()+"——state：晚上加班");
        }
    }
}
