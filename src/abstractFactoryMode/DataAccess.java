package abstractFactoryMode;

import java.io.FileInputStream;
import java.util.Properties;

public class DataAccess {
    public static String db_style = "Mysql";

    //静态代码块，根据配置文件修改数据库的使用
    static {
        Properties props = new Properties();
        try {
            //读取配置文件
            String dbpath = System.getProperty("user.dir")+"/src/abstractFactoryMode/dbchoose.properties";
            System.out.println("配置文件的路径是："+dbpath);
            FileInputStream in = new FileInputStream(dbpath);
            props.load(in);
            String db = props.getProperty("db_type");
            System.out.println(db_style+"_"+db);
            if(db != null){
                db_style = db;

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 获取使用访问某一个数据库（mysql、access）的user表的session
     * @return
     */
    public static IUser createUserSession(){
        String usertable_access = "abstractFactoryMode."+db_style+"ToUser";
        IUser userSession = null;
        try {
            Class<?> clazz = Class.forName(usertable_access);
             userSession = (IUser)clazz.newInstance();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return userSession;
    }

    /**
     * 获取使用某一种方式访问department表的session
     * @return
     */
    public static IDepartment createDepartmentSession(){
        String depttable_access = "abstractFactoryMode."+db_style+"ToDepartment";
        IDepartment deptSession = null;
        try {
            Class<?> clazz = Class.forName(depttable_access);
            deptSession = (IDepartment)clazz.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return deptSession;
    }

}
