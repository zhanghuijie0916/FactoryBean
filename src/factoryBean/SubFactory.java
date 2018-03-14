package factoryBean;

import DAO.Operation;
import DAO.SubOperation;

public class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new SubOperation();
    }
}
