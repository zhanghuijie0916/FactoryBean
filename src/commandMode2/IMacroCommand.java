package commandMode2;

public interface IMacroCommand extends ICommand {

    public abstract void add(ICommand command);

    public abstract void remove(ICommand command);

}
