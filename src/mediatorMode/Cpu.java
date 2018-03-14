package mediatorMode;

public class Cpu extends IComponent{
    private String iniDate;
    private String videoDate;
    private String soundDate;

    public  Cpu(Mediator mediator){
        super(mediator);
    }

    public String getIniDate() {
        return iniDate;
    }

    public void setIniDate(String iniDate) {
        this.iniDate = iniDate;
    }


    public String getVideoDate() {
        return videoDate;
    }

    public void setVideoDate(String videoDate) {
        this.videoDate = videoDate;
    }

    public String getSoundDate() {
        return soundDate;
    }

    public void setSoundDate(String soundDate) {
        this.soundDate = soundDate;
    }

    @Override
    public void execute() {
        String[] str = iniDate.split(",");
        this.soundDate = str[0];
        this.videoDate = str[1];
        System.out.println("cpu将光驱数据分解为音频数据和显示图像数据");
        this.getMediator().change(this);
    }
}
