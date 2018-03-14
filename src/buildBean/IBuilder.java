package buildBean;



/**
 * 定义
 */
public interface IBuilder {


    /*
    准备原材料
     */
    public abstract void prepareRawMaterial();

    /*
    放置佐料
     */
    public abstract void putSeasonings();

    /*
    后续加工
     */
    public abstract void machineings();

    /*
    得到产品
     */
    public abstract Product getProduct();

}
