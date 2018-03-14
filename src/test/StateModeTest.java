package test;

import stateMode.DailyLife;

public class StateModeTest {
    public static void main(String[] args){
        DailyLife dl = new DailyLife(8);
        for(double i =1;i<=24;i=i+0.5){
            dl.setTime(i);
            dl.perform();

        }
    }
}
