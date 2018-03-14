package mediatorMode;

/**
 * 主板
 */
public class Mediator  {
   private Cpu cpu;
   private CdDriver cdDriver;
   private SoundCard soundCard;
   private VideoCard videoCard;

   public void change(IComponent component){
        if(component instanceof CdDriver){
            driverDateToCpu((CdDriver)component);
        }
        else if (component instanceof Cpu){
            cpuToShowDate((Cpu)component);
        }
        else {
            System.out.println("操作完成");
        }
   }

   private void driverDateToCpu(CdDriver cdDriver){
       String date = cdDriver.getDate();
       cpu.setIniDate(date);
       cpu.execute();
   }

   private void cpuToShowDate(Cpu cpu){
        String videoDate = cpu.getVideoDate();
        String soundDate = cpu.getSoundDate();
        videoCard.setVideoDate(videoDate);
        soundCard.setSoundDate(soundDate);
        videoCard.execute();
        soundCard.execute();
   }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public CdDriver getCdDriver() {
        return cdDriver;
    }

    public void setCdDriver(CdDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public SoundCard getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }
}
