public class Worker implements Cloneable{
    protected String title;
    protected Rules rule_x;

    public Worker(String in_title,Rules in_rules) {
        title = in_title;
        rule_x = in_rules;
    }
    /*
    public Worker clone(){
        Worker clone = null;
        try {
            clone = (Worker) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return clone;
}*/
    public Worker clone() {
        Worker clone = new Worker(title,rule_x);
        return clone;

    }
}