package buildBean;

/**
 * 指挥者类，用来指挥构建过程
 */
public class Director {
    public static void construct(IBuilder build){
        build.prepareRawMaterial();
        build.putSeasonings();
        build.machineings();
    }
}
