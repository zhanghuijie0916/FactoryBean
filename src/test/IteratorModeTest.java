package test;

import iteratorMode.ConcreteAggregate;
import iteratorMode.ConcreteIterator;
import iteratorMode.IAggregate;
import iteratorMode.User;

public class IteratorModeTest {
    public static void main(String[] args){
        User u1 = new User("zhangsan",23);
        User u2 = new User("lisi",34);
        User u3 = new User("wangwu",21);
        User u4 = new User("zhaoliu",56);
        User u5 = new User("qiansun",80);
        User[] users = new User[]{u1,u2,u3,u4,u5};

        IAggregate aggregate = new ConcreteAggregate(users);
        ConcreteIterator iterator = (ConcreteIterator) aggregate.createIterator();
        while (iterator.hasNext()){
            User u = (User) iterator.next();
            System.out.println(u.toString());
        }

        /*if(iterator.first() instanceof User){
            User u = (User)iterator.first();
            System.out.println(u.toString());
        }*/
    }
}
