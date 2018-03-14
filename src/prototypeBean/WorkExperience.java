package prototypeBean;

public class WorkExperience implements Cloneable{
    private String work;
    private String date;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "work='" + work + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public WorkExperience(String work, String date){
        this.work = work;
        this.date = date;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
