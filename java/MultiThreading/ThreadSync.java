class MyTable{
    synchronized void PrintTable(int val){
        //synchronized method if Synchronized is replaced with public then thee order of printing will be random
        for(int i = 0; i < 5; i++){
            System.out.println(val*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }
    }
}

class MyThread extends Thread{
    int val;
    MyTable t ;
    MyThread(int val, MyTable t){
        this.val = val;
        this.t = t;
    }
    @Override
    public void run() {

        t.PrintTable(val);
    }
}

public class ThreadSync {
    public static void main(String[] args) {
        MyTable t = new MyTable();
        MyThread t1 = new MyThread(5,t);
        MyThread t2 = new MyThread(500,t);

        t1.start();
        t2.start();
    }
}
