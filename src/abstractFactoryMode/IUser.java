package abstractFactoryMode;

/**
 * 访问一个数据库的user表的方法
 */
public interface IUser {
    public abstract void insert();

    public abstract void delete();
}
