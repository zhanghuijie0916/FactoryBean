package test;

import mediatorMode.*;

public class MediatorModeTest {
    public static void main(String[] args){
        Mediator mediator = new Mediator();

        CdDriver cdDriver = new CdDriver(mediator);
        Cpu cpu = new Cpu(mediator);
        VideoCard videoCard = new VideoCard(mediator);
        SoundCard soundCard = new SoundCard(mediator);

        mediator.setCdDriver(cdDriver);
        mediator.setCpu(cpu);
        mediator.setSoundCard(soundCard);
        mediator.setVideoCard(videoCard);
        cdDriver.execute();
    }
}
