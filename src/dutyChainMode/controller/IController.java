package dutyChainMode.controller;

import dutyChainMode.request.IRequest;

import java.lang.reflect.Method;

public abstract class IController {

    private IController superController;

    public IController(){}

    public IController(IController superController) {
        this.superController = superController;
    }

    public IController getSuperController() {
        return superController;
    }

    public void setSuperController(IController superController) {
        this.superController = superController;
    }

    public void execute(IRequest request) {
        Class<?> request_clazz = request.getClass();
        String request_method = request_clazz.getSimpleName();
        //得到方法的名称
        request_method = request_method.substring(0,1).toLowerCase()+request_method.substring(1)+"Execute";
        System.out.println(request_method);
        try {
            Class<?> this_clazz = this.getClass();
            Method method = this_clazz.getMethod(request_method,IRequest.class);
            method.invoke(this,request);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    protected abstract void sickLeaveRequestExecute(IRequest request);

    protected abstract void raiseSalaryRequestExecute(IRequest request);
}
