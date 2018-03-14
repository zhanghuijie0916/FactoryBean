package dutyChainMode.test;

import dutyChainMode.controller.Director;
import dutyChainMode.controller.GeneralManager;
import dutyChainMode.controller.IController;
import dutyChainMode.controller.Manager;
import dutyChainMode.request.IRequest;
import dutyChainMode.request.RaiseSalaryRequest;
import dutyChainMode.request.SickLeaveRequest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    private List<String> list ;
    private static Map<String,IController> map;

    public static void main(String[] args){
        IRequest sick_request = new SickLeaveRequest("zhangsan","生病了",11);
        IRequest raiseSalary_request =  new RaiseSalaryRequest("李四","业务能力很强，我想涨工资",26000);
        try {
            IController manager = new Manager();
            IController director = new Director();
            IController generalManager = new GeneralManager();
            manager.setSuperController(director);
            director.setSuperController(generalManager);
            manager.execute(sick_request);
            manager.execute(raiseSalary_request);

            Type t = Test.class.getDeclaredField("list").getGenericType();
            if (ParameterizedType.class.isAssignableFrom(t.getClass())) {
                for (Type t1 : ((ParameterizedType) t).getActualTypeArguments()) {
                    System.out.println(t1.getTypeName());
                }

                map = new HashMap<>();

                //怎么获取范型信息
                //获取成员变量Field
                Field map_field = Test.class.getDeclaredField("map");
                Type type = map_field.getType(); //只能获得普通类型的成员变量
                System.out.println("getType():"+type.getTypeName());
                Type type1 = map_field.getGenericType(); //获取带范型信息的成员变量
                if(type1 instanceof ParameterizedType){
                    ParameterizedType param_type = (ParameterizedType)type1;
                    Type raw_type = param_type.getRawType(); //返回没有范型信息的原始类型
                    System.out.println("rew type:"+raw_type.getTypeName());
                    Type[] param_types = param_type.getActualTypeArguments();
                    for (Type t1 : param_types){
                        System.out.print(t1.getTypeName()+"----");
                    }
                }


                /*System.out.println(list.getClass().getCanonicalName());
                System.out.println(list.getClass().getName());
                System.out.println(list.getClass().getSimpleName());
                System.out.println(list.getClass().getTypeName());*/
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
