package commandMode2;

import commandMode.ChickenCommand;

/**
 * 负责调用命令对象执行请求
 */
public class Invoker {
    private ICommand command;
    public Invoker(ICommand command){
        this.command = command;
    }

    public void invoke(){

        command.execute();
    }
}
