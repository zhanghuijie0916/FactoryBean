package TemplateBean;

/**
 * 模版模式在于将不变的行为转移到超类，去除子类中共性的代码。
 * 数据库访问是也会有JDBCTemplate，不同的是将数据库的链接地址、用户名、密码
 * 等特殊性的东西添加进去，像连接数据库、关闭数据库等共性的问题复用。
 */
public abstract class Template {
    public abstract void concreteMethod1();

    public abstract void concreteMethod2();

    public void solveProblemTemplate(){
        concreteMethod1();
        concreteMethod2();
    }
}
