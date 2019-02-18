class SingletonObject{
    private static SingletonObject instance = new SingletonObject();

    private SingletonObject(){}

    public static SingletonObject getInstance(){
        return instance;
    }

    public void printMessage(){
        System.out.println("Printing message");
    }
}


public class SingletonImp {
    public static void main(String[] args) {
        SingletonObject obj = SingletonObject.getInstance();
        obj.printMessage();
        //SingletonObject.printMessage();

    }
}
