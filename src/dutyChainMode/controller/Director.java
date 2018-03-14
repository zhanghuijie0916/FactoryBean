package dutyChainMode.controller;

import dutyChainMode.request.IRequest;
import dutyChainMode.request.RaiseSalaryRequest;
import dutyChainMode.request.SickLeaveRequest;

import java.lang.reflect.Method;

public class Director extends IController{

    public void sickLeaveRequestExecute(IRequest request){
        SickLeaveRequest sr = (SickLeaveRequest)request;
        if (sr.getNum()<5){
            System.out.println(sr.toString()+"\n-----批复结果：同意");
        }
        else {
            this.getSuperController().execute(request);
        }
    }

    public void raiseSalaryRequestExecute(IRequest request){
        RaiseSalaryRequest rr = (RaiseSalaryRequest)request;
        if(rr.getExpectedSalary()<22000){
            System.out.println(rr.toString()+"\n-----批复结果：同意");
        }
        else {
            this.getSuperController().execute(request);
        }
    }
}
