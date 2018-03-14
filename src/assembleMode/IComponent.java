package assembleMode;

/**
 * 定义一个管理的子部件
 */
public interface IComponent {
    /**
     * 添加自节点（可以是分支节点或子节点）
     * @param c
     */
    public abstract void add(IComponent c);

    /**
     * 删除子节点
     * @param c
     */
    public abstract void remove(IComponent c);

    /**
     * 得到树形结构
     * @param depth
     */
    public abstract void getContruct(int depth);

    /**
     * 得到此节点和下属所有节点的职能列表
     */
    public abstract void getduty();

    /**
     * 得到此节点和下属节点的人员数目
     * @return
     */
    public Integer getPeopleNumber();

    /**
     * 得到此节点的名字
     * @return
     */
    public String getName();
}
