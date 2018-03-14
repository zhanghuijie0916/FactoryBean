package factoryBean;

import DAO.Operation;

/**
 * 对工厂方法的练习，此处抽象出一个抽象的工厂
 */
public interface IFactory {
    public Operation createOperation();
}
