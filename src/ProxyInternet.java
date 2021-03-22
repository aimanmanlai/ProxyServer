public class ProxyInternet implements Internet{
    private Internet internet = new RealInternet();

    public ProxyInternet() {

    }
    @Override
    public void connectTo(Worker worker,String web){

        if(worker.rule_x.get_rules().contains(web)) {
            System.out.println("Access to " + web + " blocked!");
        }else {
            internet.connectTo(worker, web);
        }
    }
}
