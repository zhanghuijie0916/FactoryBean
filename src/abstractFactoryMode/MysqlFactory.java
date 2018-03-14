package abstractFactoryMode;

public class MysqlFactory implements IFactory {
    @Override
    public IUser createUserFactory() {
        return new MysqlToUser();
    }

    @Override
    public IDepartment createDepartmentFactory() {
        return new MysqlToDepartment();
    }
}
