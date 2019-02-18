class MyStaticClass{
    static int val = 0;
    int temp = 10;
    static void PrintHello(){
       System.out.println("Hello World");
    }
    static void Increment(){
        System.out.println(val);
        val += 1;
    }
}

public class StaticUsage {
    public static void main(String[] args) {
        MyStaticClass msc = new MyStaticClass();
        msc.Increment();
        new MyStaticClass().PrintHello();
        new MyStaticClass().Increment();


    }
}
