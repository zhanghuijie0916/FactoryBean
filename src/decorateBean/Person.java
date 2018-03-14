package decorateBean;

/**
 * 装饰模式的练习
 */
public abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.print("name="+this.name);
    }
}
