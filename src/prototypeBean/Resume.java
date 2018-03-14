package prototypeBean;

import java.util.Date;

/**
 * 浅复制与深复制
 */
public class Resume implements Cloneable{
    private String name;
    private Integer age;
    private double persumeSalary;
    private Date date;
    private WorkExperience workExperience;

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getPersumeSalary() {
        return persumeSalary;
    }

    public void setPersumeSalary(double persumeSalary) {
        this.persumeSalary = persumeSalary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", persumeSalary=" + persumeSalary +
                ", date=" + date +
                ", workExperience=" + workExperience +
                '}';
    }



    @Override
    public Object clone() throws CloneNotSupportedException{
        Resume rs = (Resume) super.clone();
        rs.workExperience = (WorkExperience) rs.getWorkExperience().clone();
        return rs;
    }


}
