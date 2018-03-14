package mediatorMode;

public abstract class IComponent {

    private Mediator mediator;
    public IComponent(Mediator mediator){
        this.mediator = mediator;
    }


    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void execute();
}
