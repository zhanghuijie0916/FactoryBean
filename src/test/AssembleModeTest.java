package test;

import assembleMode.CompanyComponent;
import assembleMode.FinanceComponent;
import assembleMode.HrComponent;
import assembleMode.IComponent;

public class AssembleModeTest {
    public static void main(String[] args) {
        //声明子部件并组装
        IComponent root = new CompanyComponent("总公司");
        IComponent root_fin = new FinanceComponent("总公司财务部", 100);
        IComponent root_hr = new HrComponent("总公司人力资源部", 50);

        IComponent shanghai_company = new CompanyComponent("上海分公司");
        IComponent shanghai_company_fin = new FinanceComponent("上海财务部", 40);
        IComponent shanghai_company_hr = new HrComponent("上海人力资源部", 60);

        IComponent shanghai_offic = new CompanyComponent("上海区域办事处");
        IComponent shanghai_offic_hr = new HrComponent("上海区域办事处人力资源部", 10);

        //组装树结构
        shanghai_offic.add(shanghai_offic_hr);
        shanghai_company.add(shanghai_company_fin);
        shanghai_company.add(shanghai_company_hr);
        shanghai_company.add(shanghai_offic);
        root.add(root_fin);
        root.add(root_hr);
        root.add(shanghai_company);

        //得到结构
        root.getContruct(1);
        //得到人数统计
        root.getPeopleNumber();
        //得到职能安排
        root.getduty();
    }
}
