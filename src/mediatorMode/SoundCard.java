package mediatorMode;

public class SoundCard extends IComponent{
    private String soundDate;

    public  SoundCard(Mediator mediator){
        super(mediator);
    }

    public String getSoundDate() {
        return soundDate;
    }

    public void setSoundDate(String soundDate) {
        this.soundDate = soundDate;
    }



    @Override
    public void execute() {
        System.out.println("显卡获取图像数据，正常显示！");
        this.getMediator().change(this);
    }
}
