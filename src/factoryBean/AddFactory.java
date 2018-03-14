package factoryBean;

import DAO.AddOperation;
import DAO.Operation;

public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}
