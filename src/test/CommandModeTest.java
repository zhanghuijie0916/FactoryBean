package test;

import commandMode.*;

public class CommandModeTest {
    public static void main(String[] args){
        Barbecure reveiver = new Barbecure();

        ICommand c1 = new ChickenCommand(reveiver,5);
        ICommand c2 = new MuttonCommand(reveiver,6);
        ICommand c3 = new ChickenCommand(reveiver,5);
        Invoker voker = new Invoker();
        voker.setCommand(c1);
        voker.setCommand(c2);
        voker.setCommand(c3);
        voker.deleteCommand(c2);

        voker.invoke();
        double spending = voker.getSpending();
        System.out.println("all spending:"+spending);


    }
}
