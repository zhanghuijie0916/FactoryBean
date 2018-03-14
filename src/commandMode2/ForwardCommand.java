package commandMode2;

public class ForwardCommand implements ICommand{
    private Radio radio;

    public ForwardCommand(Radio radio){
        this.radio = radio;
    }
    @Override
    public void execute() {
        radio.forward();
    }
}
