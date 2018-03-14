package factoryBean;

import DAO.MulOperation;
import DAO.Operation;

public class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new MulOperation();
    }
}
