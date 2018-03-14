package commandMode2;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements IMacroCommand {
    private List<ICommand> commands;

    public MacroCommand(){
        super();
        commands = new ArrayList<>();
    }

    @Override
    public void add(ICommand command) {
        commands.add(command);
    }

    @Override
    public void remove(ICommand command) {
        commands.remove(command);
    }

    @Override
    public void execute() {
        System.out.println("--------组合命令开始-------");
        for (ICommand c : commands){
            c.execute();
        }
        System.out.println("--------组合命令结束-------");
    }
}
