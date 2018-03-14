package test;

import buildBean.*;

public class BuilderModeTest {
    public static void main(String[] args){
        IBuilder build1 = new HamburgerBuilder("汉堡");
        Director.construct(build1);
        Product product1 = build1.getProduct();
        product1.showProduct();

        IBuilder build2 = new BeafRiceBuilder("牛肉饭");
        Director.construct(build2);
        Product product2 = build2.getProduct();
        product2.showProduct();
    }
}
