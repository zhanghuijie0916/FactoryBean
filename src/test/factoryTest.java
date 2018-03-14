package test;

import DAO.Operation;
import factoryBean.AddFactory;
import factoryBean.IFactory;

public class factoryTest {
    public static void main(String[] args){
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNumber1(10);
        operation.setNumber2(20);
        double result = operation.getResult();
        System.out.print("result="+result);
    }
}
