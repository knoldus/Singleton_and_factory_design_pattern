package singleton_design_pattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //SingleObject object = new SingleObject();
        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}