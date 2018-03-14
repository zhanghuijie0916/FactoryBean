package mediatorMode;

public class VideoCard extends IComponent{
    private String videoDate;

    public  VideoCard(Mediator mediator){
        super(mediator);
    }

    public String getVideoDate() {
        return videoDate;
    }

    public void setVideoDate(String videoDate) {
        this.videoDate = videoDate;
    }


    @Override
    public void execute() {
        System.out.println("声卡获取声音数据，正常播放！");
        this.getMediator().change(this);
    }
}
