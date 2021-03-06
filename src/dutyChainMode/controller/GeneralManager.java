package dutyChainMode.controller;

import dutyChainMode.request.IRequest;
import dutyChainMode.request.RaiseSalaryRequest;
import dutyChainMode.request.SickLeaveRequest;

import java.lang.reflect.Method;


public class GeneralManager extends IController{
    @Override
    public void sickLeaveRequestExecute(IRequest request) {
        SickLeaveRequest sr = (SickLeaveRequest)request;
        if(sr.getNum()<10){
            System.out.println(sr.toString()+"\n-----批复结果：同意");
        }
        else {
            System.out.println(sr.toString()+"\n-----批复结果：不同意");
        }
    }

    @Override
    public void raiseSalaryRequestExecute(IRequest request) {
        RaiseSalaryRequest rr = (RaiseSalaryRequest)request;
        if(rr.getExpectedSalary()<30000){
            System.out.println(rr.toString()+"\n-----批复结果：同意");
        }
        else {
            System.out.println(rr.toString()+"\n-----批复结果：不同意");
        }
    }
}
