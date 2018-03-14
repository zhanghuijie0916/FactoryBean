package commandMode2;

public class ReviewCommand implements ICommand{
    private Radio radio;

    public ReviewCommand(Radio radio){
        super();
        this.radio = radio;
    }
    @Override
    public void execute() {
        radio.review();
    }
}
