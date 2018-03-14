package abstractFactoryMode;

public class AccessToUser implements IUser {
    @Override
    public void insert() {
        System.out.println("向Access数据库中user表插入一条数据");
    }

    @Override
    public void delete() {
        System.out.println("从Access数据库中user表删除一条数据");
    }
}
