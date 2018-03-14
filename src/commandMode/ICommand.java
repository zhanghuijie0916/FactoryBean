package commandMode;

public abstract class ICommand {
    /**
     * 执行命令
     */
    private double price;
    protected Barbecure receiver;

    public double getPrice() {
        return price;
    }

    public ICommand(Barbecure receiver, double price){
        this.receiver = receiver;
        this.price = price;
    }



    public abstract void execute();
}
