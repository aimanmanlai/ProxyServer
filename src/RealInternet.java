public class RealInternet implements Internet {
    @Override
    public void connectTo(Worker worker, String web){
        System.out.println(web+" loaded");
    }
}