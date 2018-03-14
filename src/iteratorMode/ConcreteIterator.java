package iteratorMode;

import java.util.Iterator;

public class ConcreteIterator implements Iterator{

    private IAggregate aggregate;
    private int size; //容量
    private int index; //当前便利的下标

    public ConcreteIterator(IAggregate aggregate){
        this.aggregate = aggregate;
        this.size = aggregate.size();
        index = -1;
    }

    @Override
    public boolean hasNext() {
        if((this.index+1) < size){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Object next() {
        index ++;
        return aggregate.getElement(index);
    }

    /**
     * 取出第一个元素
     * @return
     */
   public Object first(){
        if(size>0){
            return aggregate.getElement(0);
        }
        else {
            return null;
        }
   }

    /**
     * 取出最后一个元素
     * @return
     */
   public Object last(){
       if(size > 0){
           return aggregate.getElement(size-1);
       }
       else {
           return null;
       }
   }


}
