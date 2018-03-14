package test;

import prototypeBean.Resume;
import prototypeBean.WorkExperience;

import java.io.Console;
import java.util.Date;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Resume resume1 = new Resume();
        resume1.setName("zhangsan");
        resume1.setAge(23);
        resume1.setPersumeSalary(20000.0);
        resume1.setDate(new Date(System.currentTimeMillis()));
        resume1.setWorkExperience(new WorkExperience("java","2017-02-24"));

        Resume resume2 = (Resume) resume1.clone();
        resume2.setName("lisi");
        resume2.setPersumeSalary(50000.0);
        resume2.setDate(new Date(System.currentTimeMillis()+100000l));
        resume2.getWorkExperience().setWork("scala");
        resume2.getWorkExperience().setDate("2017-03-25");

        System.out.println(resume1.toString());
        System.out.println(resume2.toString());

        Resume resume3 = resume1;
        resume3.setName("wangwu");
        resume3.setPersumeSalary(70000.0);
        resume3.setDate(new Date(System.currentTimeMillis()+100000l));
        resume3.setWorkExperience(new WorkExperience("python","2018-03-12"));

        System.out.println(resume1.toString());
        System.out.println(resume3.toString());

    }
}
