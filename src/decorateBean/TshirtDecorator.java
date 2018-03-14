package decorateBean;

public class TshirtDecorator extends Decorator {
    @Override
    public void show() {
        super.show();
        System.out.println("穿上t-shirt");
    }
}
