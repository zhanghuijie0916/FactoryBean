package abstractFactoryMode;

public class AccessFactory implements IFactory {
    @Override
    public IUser createUserFactory() {
        return new AccessToUser();
    }

    @Override
    public IDepartment createDepartmentFactory() {
        return new AccessToDepartment();
    }
}
