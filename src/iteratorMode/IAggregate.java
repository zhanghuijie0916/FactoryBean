package iteratorMode;

import java.util.Iterator;

public interface IAggregate {
    public abstract Iterator createIterator();

    public abstract int size();

    public abstract Object getElement(int index);
}
