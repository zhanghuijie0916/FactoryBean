package dutyChainMode.request;

public class RaiseSalaryRequest extends IRequest {
    private double expectedSalary;

    public RaiseSalaryRequest(String name,String requestDescribe,double expectedSalary){
        super(name,requestDescribe);
        this.expectedSalary =expectedSalary;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(double expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    @Override
    public String toString() {
        return super.toString()+"，申请的薪资为："+this.expectedSalary;
    }
}
