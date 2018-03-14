package test;

import abstractFactoryMode.*;
import abstractFactoryMode.IUser;

public class AbstractFactoryTest {
    public static void main(String[] args){
//        IFactory factory = new AccessFactory();
//        IUser userSession = factory.createUserFactory();
//        IDepartment deptSession = factory.createDepartmentFactory();
//        userSession.insert();
//        userSession.delete();
//        deptSession.insert();
//        deptSession.delete();

        IUser userSession2 = DataAccess.createUserSession();
        System.out.println(userSession2);
        userSession2.insert();
        userSession2.delete();

        IDepartment deptSession2 = DataAccess.createDepartmentSession();
        System.out.println(deptSession2);
        deptSession2.insert();
        deptSession2.delete();

    }
}
