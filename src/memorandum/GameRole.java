package memorandum;

import java.util.Date;

public class GameRole {
    private String name;
    private int vitality;  //生命力
    private int aggressivity;  //攻击力
    private int defense;  //抵抗力

    private void initStates(){
        this.vitality = 90;
        this.aggressivity = 100;
        this.defense = 70;
    }

    public GameRole(String name){
        this.name = name;
        initStates();  //根据用户名查询状态信息
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAggressivity() {
        return aggressivity;
    }

    public void setAggressivity(int aggressivity) {
        this.aggressivity = aggressivity;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "name='" + name + '\'' +
                ", vitality=" + vitality +
                ", aggressivity=" + aggressivity +
                ", defense=" + defense +
                '}';
    }

    /**
     * 战斗之后
     */
    public void fight(){
        this.vitality -= 10;
        this.aggressivity -= 10;
        this.defense -= 10;
    }

    /**
     * 创建存储的备忘录
     * @return
     */
    public IMemory createMemory(){
        return new Memory(this.vitality,this.aggressivity,this.defense);
    }

    /**
     * 从备忘录中恢复所有的状态
     * @param imemory
     */
    public void retrieveMemory(IMemory imemory){
        if (imemory instanceof Memory) {
            Memory memory = (Memory)imemory;
            this.vitality = memory.getVitality();
            this.aggressivity = memory.getAggressivity();
            this.defense = memory.getDefense();
        }
    }

    /**
     * 内部类，用于存储状态
     */
    private class Memory implements IMemory{
        private int vitality;
        private int aggressivity;
        private int defense;

        private Memory(int vitality,int aggressivity,int defense){
            this.vitality = vitality;
            this.aggressivity = aggressivity;
            this.defense = defense;
        }

        private int getVitality() {
            return vitality;
        }

        private void setVitality(int vitality) {
            this.vitality = vitality;
        }

        private int getAggressivity() {
            return aggressivity;
        }

        private void setAggressivity(int aggressivity) {
            this.aggressivity = aggressivity;
        }

        private int getDefense() {
            return defense;
        }

        private void setDefense(int defense) {
            this.defense = defense;
        }
    }
}
