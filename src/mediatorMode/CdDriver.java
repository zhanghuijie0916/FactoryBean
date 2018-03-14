package mediatorMode;

public class CdDriver extends IComponent {

    private  String date;

    public  CdDriver(Mediator mediator){
        super(mediator);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public void execute() {
        System.out.println("光驱正在读取数据...");
        System.out.println("读取数据完成");
        date = "穿prada的女魔头声音数据,穿prada的女魔头显示图像数据";  //模拟得到的数据
        this.getMediator().change(this);

    }
}
