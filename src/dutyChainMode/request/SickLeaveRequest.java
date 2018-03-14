package dutyChainMode.request;

import dutyChainMode.request.IRequest;

public class SickLeaveRequest extends IRequest {
    private int num;

    public SickLeaveRequest(String name,String requestDescribe,int num){
        super(name,requestDescribe);
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return super.toString()+"，请假天数为"+this.num;
    }
}
