package test;

import decorateBean.*;

public class DecoratorModeTest {
    public static void main(String[] args){
        Person p1 = new ChinesePerson();
        p1.setName("张三");
        Decorator d1 = new DressDecorator();
        Decorator d2 = new TshirtDecorator();
        d1.setPerson(p1);
        d2.setPerson(d1);
        d2.show();


    }
}
