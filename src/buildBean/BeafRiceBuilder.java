package buildBean;

public class BeafRiceBuilder implements IBuilder {
    private Product product = new Product();

    public BeafRiceBuilder(){
        super();
    }

    public BeafRiceBuilder(String produceName){
        super();
        this.product.setProductName(produceName);
    }

    @Override
    public void prepareRawMaterial() {
        this.product.add("原材料[牛肉,米饭，蔬菜]");
    }

    @Override
    public void putSeasonings() {
        this.product.add("添加佐料[5g盐，2g大料]");
    }

    @Override
    public void machineings() {
        this.product.add("大火10分钟，小火5分钟");
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}
