package abstractFactoryMode;

public class AccessToDepartment implements IDepartment {
    @Override
    public void insert() {
        System.out.println("向Access数据库中department表插入一条数据");
    }

    @Override
    public void delete() {
        System.out.println("从Access数据库中department表删除一条数据");
    }
}
