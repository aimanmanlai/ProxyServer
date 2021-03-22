public class ProxyDemo {
    public static void main(String[] args) {

        //creating rules
        Rules rule_employee = new Rules();
        Rules rule_manager = new Rules();
        Rules rule_boss = new Rules();

        //adding webs in rules
        rule_employee.addfilter("www.deepmind.com");
        rule_employee.addfilter("www.ipcv.com");
        rule_manager.addfilter("www.ipcv.com");

        //creating rule prototypes
        Worker employee_prototype = new Worker("employee",rule_employee);
        Worker manager_prototype = new Worker("manager",rule_manager);
        Worker boss_prototype = new Worker("boss",rule_boss);

        //using prototype to initialize workers
        Worker employee1 = employee_prototype.clone();
        Worker manager1 = manager_prototype.clone();
        Worker boss1 = boss_prototype.clone();

        Internet internet = new ProxyInternet();

        internet.connectTo(employee1, "www.deepmind.com");
        internet.connectTo(manager1, "www.ipcv.com");
        internet.connectTo(boss1, "www.deepmind.com");

        employee1.rule_x.addfilter("www.dmml.com");
        employee1.rule_x.addfilter("www.ai.com");
        manager1.rule_x.addfilter("www.ai.com");

        internet.connectTo(employee1, "www.dmml.com");
        internet.connectTo(employee1, "www.ai.com");
        internet.connectTo(manager1, "www.ai.com");
        internet.connectTo(boss1, "www.ipcv.com");
    }
}
