package TemplateBean;

public class ConcreteTemplate1 extends Template{


    @Override
    public void concreteMethod1() {
        System.out.println("步骤1解决方案1");
    }

    @Override
    public void concreteMethod2() {
        System.out.println("步骤2解决方案2");
    }
}
