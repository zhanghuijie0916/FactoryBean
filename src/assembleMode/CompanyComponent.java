package assembleMode;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点
 */
public class CompanyComponent implements IComponent {
    private String name;
    private Integer peopleNumber; //总人数
    private List<IComponent> components; //子部件

    public void setName(String name) {
        this.name = name;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public List<IComponent> getComponents() {
        return components;
    }

    public void setComponents(List<IComponent> components) {
        this.components = components;
    }

    public CompanyComponent(String name){
        this.name = name;
        components = new ArrayList<>();
        peopleNumber = 0;
    }

    @Override
    public void add(IComponent c) {
        components.add(c);

    }

    @Override
    public void remove(IComponent c) {
        components.remove(c);
    }

    @Override
    public void getContruct(int depth) {
        for (int i=0;i<depth;i++){
            System.out.print("-");
        }
        System.out.println(this.name);
        for(IComponent c:components){
            c.getContruct(depth+2);
        }
    }

    @Override
    public void getduty() {
        System.out.println(this.name+"：管理公司");
        for (IComponent c : components){
            c.getduty();
        }
    }

    @Override
    public Integer getPeopleNumber() {
        for(IComponent c : components){
            this.peopleNumber += c.getPeopleNumber();
        }
        System.out.println(this.name+"人数为："+this.peopleNumber);
        return this.peopleNumber;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
