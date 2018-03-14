package abstractFactoryMode;


public interface IFactory {

    public abstract IUser createUserFactory();

    public abstract IDepartment createDepartmentFactory();
}
