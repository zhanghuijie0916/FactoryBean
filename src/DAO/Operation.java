package DAO;

/**
 * DAO+FactoryBean类是对工厂方法的练习
 */
public class Operation {
    //定义参与运算的数字
    private double number1;
    private double number2;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    //得到结果
    public double getResult(){
        return 0;
    };

}
