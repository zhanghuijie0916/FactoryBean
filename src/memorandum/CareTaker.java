package memorandum;


import java.util.ArrayList;
import java.util.List;

/**
 * 这个类是记录历史状态的类，可以记录下希望观察节点的状态信息，内部封装了Memory类，而Memory类又是
 * GameRole不对外公开的内部类，所以，外面的类不能获取到记录日志的内部信息，这个类可以做的是给每一个
 * 观察点（Memory）一个标签，使得可以按照标签恢复日志。
 */
public class CareTaker {
    private List<IMemory> memories;

    private GameRole role;  //因为需要通过CareTaker这个类创建备忘录节点

    public CareTaker(GameRole role){
        this.role = role;
        memories = new ArrayList<>();
    }

    /**
     * 创建一个检查点
     */
    public void createMemory(){
        IMemory memory = role.createMemory();
        memories.add(memory);
    }

    /**
     * 添加一个检查点
     * @param index
     * @return
     */
    public void retrieveMemory(int index) {
        //根据标签获取到需要恢复的状态信息
        IMemory iMemory = memories.get(index);
        role.retrieveMemory(iMemory);
    }


    /**
     * 删除某一个检查点
     * @param index
     */
    public void deleteMemory(int index){
        memories.remove(index);
    }
}
