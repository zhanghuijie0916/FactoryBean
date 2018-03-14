package commandMode2;

public class PlayCommand implements ICommand {
    private Radio radio;

    public PlayCommand(Radio radio){
        super();
        this.radio = radio;
    }
    @Override
    public void execute() {
        radio.play();
    }
}
