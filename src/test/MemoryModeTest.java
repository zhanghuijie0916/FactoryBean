package test;

import memorandum.CareTaker;
import memorandum.GameRole;

public class MemoryModeTest {
    public static void main(String[] args){
        GameRole role1 = new GameRole("zhansan");
        /*CareTaker careTaker1 = new CareTaker();
        careTaker1.saveMemory(role1.createMemory());
        System.out.println("当前的用户初始状态"+role1.toString());
        role1.fight();
        System.out.println("当前的用户战斗后的状态"+role1.toString());
        System.out.println("用户不满意，读取战斗之前的状态信息");
        role1.retrieveMemory(careTaker1.retrieveMemory());
        System.out.println("用户恢复历史记录"+role1.toString());*/

        CareTaker careTaker = new CareTaker(role1);
        for(int i=0;i<5;i++){
            role1.fight();
            System.out.println("当前的用户初始状态"+role1.toString());
            careTaker.createMemory();
        }

        careTaker.retrieveMemory(2);
        System.out.println("恢复过后的状态是："+role1.toString());


    }
}
