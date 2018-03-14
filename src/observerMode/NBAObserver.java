package observerMode;


public class NBAObserver implements IObserver {
    private String name;
    private ISubject subject;

    public NBAObserver(String name, ISubject subject){
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ISubject getSubject() {
        return subject;
    }

    public void setSubject(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println(name+", "+subject.getNotice()+",quickly close NBA!");
    }
}
