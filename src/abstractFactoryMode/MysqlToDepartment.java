package abstractFactoryMode;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class MysqlToDepartment implements IDepartment{
    @Override
    public void insert() {
        System.out.println("向mysql数据库中department表插入一条数据"+System.getProperty("user.dir"));

        /*Properties props = new Properties();
        try {
            //1.获取当前工程路径的方法
            String projectPath = System.getProperty("user.dir");
            //2.获取当权类路径的方法
            String class_path = this.getClass().getResource("").getPath();
            System.out.println("获取当前类的路径："+class_path);
            //3.获取当前工程路径的方法
            File file = new File("");
            System.out.println("使用file获取工程路径："+file.getAbsolutePath());

            System.out.println(projectPath);
            FileInputStream in = new FileInputStream(projectPath+"/src/abstractFactoryMode/dbchoose.properties");
            props.load(in);
            System.out.println(props.getProperty("db_type"));


        }catch (Exception e){
            e.printStackTrace();
        }
*/
    }

    @Override
    public void delete() {
        System.out.println("从mysql数据库中department表删除一条数据");
    }
}



