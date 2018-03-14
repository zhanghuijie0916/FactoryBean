package iteratorMode;

import java.util.Iterator;

public class ConcreteAggregate implements IAggregate {
    private Object[] array = null;

    public ConcreteAggregate(Object[] array){
        this.array = array;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    /**
     * size
     * @return
     */
    public int size(){
        return array.length;
    }

    /**
     * 取出一个元素
     * @param index
     * @return
     */
    public Object getElement(int index) {
        return array[index];
    }


    public void setArray(Object[] array) {
        this.array = array;
    }


}
