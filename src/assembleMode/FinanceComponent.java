package assembleMode;

public class FinanceComponent implements IComponent {
    private String name;
    private Integer peopleNumber;

    public FinanceComponent(String name){
        this.name = name;
        peopleNumber = 0;
    }

    public FinanceComponent(String name,Integer peopleNumber){
        this.name = name;
        this.peopleNumber = peopleNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    @Override
    public void add(IComponent c){
        throw new UnsupportedOperationException("不能添加下属部门");
    }

    @Override
    public void remove(IComponent c) {
        throw new UnsupportedOperationException("无下属部门可删除");
    }

    @Override
    public void getContruct(int depth) {
        for(int i=0;i<depth;i++){
            System.out.print("-");
        }
        System.out.println(this.name);
    }

    @Override
    public void getduty() {
        System.out.println(this.name+"负责公司财务");

    }

    @Override
    public Integer getPeopleNumber() {
        System.out.println(this.name+"人数为："+this.peopleNumber);
        return this.peopleNumber;
    }
}
