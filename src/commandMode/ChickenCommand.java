package commandMode;

public class ChickenCommand extends ICommand {

    public ChickenCommand(Barbecure receiver,double price){
        super(receiver,price);
    }

    @Override
    public void execute() {
        receiver.bakeChickenAction();
    }
}
