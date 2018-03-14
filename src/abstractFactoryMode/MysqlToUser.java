package abstractFactoryMode;

public class MysqlToUser implements IUser {
    @Override
    public void insert() {
        System.out.println("向mysql数据库中user表插入一条数据");
    }

    @Override
    public void delete() {
        System.out.println("从mysql数据库中user表删除一条数据");
    }
}
