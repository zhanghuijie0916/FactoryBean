package dutyChainMode.controller;

import dutyChainMode.request.IRequest;
import dutyChainMode.request.RaiseSalaryRequest;
import dutyChainMode.request.SickLeaveRequest;

public class Manager extends IController {
    @Override
    public void sickLeaveRequestExecute(IRequest request) {
        SickLeaveRequest sr = (SickLeaveRequest)request;
        if(sr.getNum()<3){
            System.out.println(sr.toString()+"\n-----批复结果：同意");
        }
        else {
           this.getSuperController().execute(request);
        }
    }

    @Override
    public void raiseSalaryRequestExecute(IRequest request) {
        RaiseSalaryRequest rr = (RaiseSalaryRequest)request;
        if(rr.getExpectedSalary()<20000){
            System.out.println(rr.toString()+"\n-----批复结果：同意");
        }
        else {
            this.getSuperController().execute(request);
        }
    }
}
