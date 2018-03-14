package stateMode;

/**
 * 根据时间以及工作是否完成来判断是否应该改变状态，不同状态需要完成的工作
 * 在状态类中操纵，在状态类中判断状态改变了之后返回工作类要完成当前
 * 工作的方法，这个方法只起到一个导向的作用，实际上导向了状态改变之
 * 后的状态类。
 */
public class DailyLife {
    private IState state;


    //设置状态什么时候发生改变

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    private double time;
    private boolean workDone=false;

    public DailyLife(double time){
        this.time = time;
        state = new SleepState();
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public boolean isWorkDone() {
        return workDone;
    }

    public void setWorkDone(boolean workDone) {
        this.workDone = workDone;
    }


    /**
     * 状态导向方法，实际上根据自身的状态去指定的状态类执行具体的操作。
     * 所以改变状态类之后，要回到这个方法，再去找改变状态之后的方法。
     */
    public void perform(){
        state.perform(this);
    }
}
