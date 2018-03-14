package decorateBean;

public class DressDecorator extends Decorator implements Cloneable{
    @Override
    public void show() {
        super.show();  //相当于执行原来的核心功能
        System.out.print("穿上裙子");
    }

}
