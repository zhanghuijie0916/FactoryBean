package buildBean;

public class HamburgerBuilder implements IBuilder {
    private Product product = new Product();

    public HamburgerBuilder(){}

    public HamburgerBuilder(String productName){
        this.product.setProductName(productName);
    }

    @Override
    public void prepareRawMaterial() {
        this.product.add("原材料[面包片,蔬菜]");
    }

    @Override
    public void putSeasonings() {
        this.product.add("添加佐料[5g盐，10g沙拉酱]");
    }

    @Override
    public void machineings() {
        this.product.add("温火加工5分钟");
    }

    @Override
    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
