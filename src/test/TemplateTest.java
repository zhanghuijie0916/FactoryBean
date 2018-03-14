package test;

import TemplateBean.ConcreteTemplate1;
import TemplateBean.ConcreteTemplate2;

public class TemplateTest {
    public static void main(String[] args){
        System.out.println("方案设计1");
        ConcreteTemplate1 ct1 = new ConcreteTemplate1();
        ct1.solveProblemTemplate();

        System.out.println("方案设计2");
        ConcreteTemplate2 ct2 = new ConcreteTemplate2();
        ct2.solveProblemTemplate();
    }
}
