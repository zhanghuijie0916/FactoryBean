package test;

import commandMode2.*;

public class CommandModeTest2 {

    public static void main(String[] args){
        Radio radio = new Radio();
        ICommand c1 = new PlayCommand(radio);
        ICommand c2 = new ReviewCommand(radio);
        ICommand c3 = new ForwardCommand(radio);
        IMacroCommand commands = new MacroCommand();
        commands.add(c1);
        commands.add(c2);
        commands.add(c3);

        Invoker invoker = new Invoker(commands);
        invoker.invoke();
    }
}
