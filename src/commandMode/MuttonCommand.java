package commandMode;

public class MuttonCommand extends ICommand {

    public MuttonCommand(Barbecure receiver,double price){
        super(receiver,price);
    }

    @Override
    public void execute() {
        receiver.bakeMuttonAction();
    }
}
