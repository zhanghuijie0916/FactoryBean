package commandMode;


import java.util.ArrayList;
import java.util.List;

/**
 * 请求者
 */
public class Invoker {
    private List<ICommand> commands = new ArrayList<>();


    public void setCommand(ICommand command){
        commands.add(command);
    }

    public void invoke(){
        for(ICommand command : commands){
            command.execute();
        }
    }

    /**
     * 删除某一个命令
     * @param command
     */
    public void deleteCommand(ICommand command){
        commands.remove(command);
    }

    public double getSpending(){
        double price_sum = 0;
        for (ICommand c : commands){
            price_sum += c.getPrice();
        }
        return price_sum;
    }
}
