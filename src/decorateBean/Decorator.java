package decorateBean;

/**
 * 装饰类的超类，里面又一个相关联的Person类的实例
 */
public abstract class Decorator extends Person{
    protected Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void show(){
        if (person != null){
           person.show();
        }
    };

}
